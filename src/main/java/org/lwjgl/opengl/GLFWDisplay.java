package org.lwjgl.opengl;

import static org.lwjgl.glfw.GLFW.*;

import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWFramebufferSizeCallback;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.glfw.GLFWWindowPosCallback;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.system.MemoryUtil;

public class GLFWDisplay implements DisplayImplementation {

	private static final DisplayMode desktop_mode;

	private DisplayMode current_mode;

	private String title;

	private long handle = MemoryUtil.NULL;

	private boolean resizable;

	private int width = 0;

	private int height = 0;

	private int frameBufferWidth = 0;

	private int frameBufferHeight = 0;

	private int x = -1;

	private int y = -1;

	private boolean fullscreen;

	private boolean window_resized;

	private boolean window_created;

	private GLFWFramebufferSizeCallback frameBufferSizeCallback;

	private GLFWWindowSizeCallback sizeCallback;

	private GLFWWindowPosCallback moveCallback;

	private GLFWWindowCloseCallback closeCallback;

	private IntBuffer buffX = BufferUtils.createIntBuffer(1);
	private IntBuffer buffY = BufferUtils.createIntBuffer(1);

	GLFWMouse mouse;
	GLFWKeyboard keyboard;

	static {
		// GLFWErrorCallback.createPrint(System.err).set();
		if (!GLFW.glfwInit()) {
			new ExceptionInInitializerError("Unable to initialize GLFW");
		}
		GLFWVidMode vidMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		if (vidMode == null) {
			desktop_mode = null;
		} else {
			desktop_mode = new DisplayMode(vidMode.width(), vidMode.height(), vidMode.redBits() + vidMode.greenBits() + vidMode.blueBits(), vidMode.refreshRate());
		}
	}

	public GLFWDisplay() {
		mouse = new GLFWMouse(this);
		keyboard = new GLFWKeyboard(this);
	}

	private static GLFWImage.Buffer iconsToGLFWBuffer(ByteBuffer[] icons) {
		GLFWImage.Buffer buffer = GLFWImage.create(icons.length);
		for (ByteBuffer icon : icons) {
			int size = icon.limit() / 4;
			int dimension = (int)Math.sqrt(size);
			GLFWImage image = GLFWImage.malloc();
			buffer.put(image.set(dimension, dimension, icon));
		}
		buffer.flip();
		return buffer;
	}

	public void closeCallback(long window) {
		if (window == handle && parent != null) {
			Container rootParent = parent.getParent();
			if (rootParent == null) { // Unexpected
				return;
			}
			while (rootParent.getParent() != null) {
				rootParent = rootParent.getParent();
			}
			if (rootParent instanceof Frame) {
				Frame f = (Frame)rootParent;
				f.dispose();
			}
		}
	}

	public void moveCallback(long window, int x, int y) {
		if (isFullscreen())
			return;
		if (window == handle) {
			this.x = x;
			this.y = y;
		}
	}

	public long getHandle() {
		return handle;
	}

	private Canvas parent;

	private void refreshSizes() {
		GLFW.glfwPollEvents();
		int[] w = new int[1];
		int[] h = new int[1];
		GLFW.glfwGetFramebufferSize(handle, w, h);
		frameBufferWidth = w[0];
		frameBufferHeight = h[0];
		GLFW.glfwGetWindowSize(handle, w, h);
		width = w[0];
		height = h[0];
	}

	private void frameBufferResizeCallback(long window, int width, int height) {
		if (window == handle) {
			window_resized = true;
			this.frameBufferWidth = width;
			this.frameBufferHeight = height;
			if (parent != null) {
				parent.setSize(width, height);
			}
		}
	}

	private void resizeCallback(long window, int width, int height) {
		if (window == handle) {
			window_resized = true;
			this.width = width;
			this.height = height;
			if (parent != null) {
				parent.setSize(width, height);
			}
		}
	}

	private int getWindowX() {
		if (!isFullscreen()) {
			// if no display location set, center window
			if (x == -1) {
				return Math.max(0, (desktop_mode.getWidth() - current_mode.getWidth()) / 2);
			} else {
				return x;
			}
		} else {
			return 0;
		}
	}

	private int getWindowY() {
		if (!isFullscreen()) {
			// if no display location set, center window
			if (y == -1) {
				return Math.max(0, (desktop_mode.getHeight() - current_mode.getHeight()) / 2);
			} else {
				return y;
			}
		} else {
			return 0;
		}
	}
	public int getX() {
		if (isFullscreen()) {
			return 0;
		}
		return x;
	}

	public int getY() {
		if (isFullscreen()) {
			return 0;
		}
		return y;
	}

	public int getWindowWidth() {
		return width;
	}

	public int getWindowHeight() {
		return height;
	}

	public boolean isFullscreen() {
		return fullscreen;
	}

	public boolean wasResized() {
		return window_resized;
	}

	@Override
	public boolean hasWheel() {
		return mouse.hasWheel();
	}

	@Override
	public int getButtonCount() {
		return mouse.getButtonCount();
	}

	@Override
	public void createMouse() throws LWJGLException {
		mouse.createMouse();
	}

	@Override
	public void destroyMouse() {
		mouse.destroyMouse();
	}

	@Override
	public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons) {
		mouse.pollMouse(coord_buffer, buttons);
	}

	@Override
	public void readMouse(ByteBuffer buffer) {
		mouse.readMouse(buffer);
	}

	@Override
	public void grabMouse(boolean grab) {
		mouse.grabMouse(grab);
	}

	@Override
	public int getNativeCursorCapabilities() {
		return mouse.getNativeCursorCapabilities();
	}

	@Override
	public void setCursorPosition(int x, int y) {
		mouse.setCursorPosition(x, y);
	}

	@Override
	public void setNativeCursor(Object handle) throws LWJGLException {
		// mouse.setNativeCursor(handle);
	}

	@Override
	public int getMinCursorSize() {
		// return mouse.getMinCursorSize();
		return 0;
	}

	@Override
	public int getMaxCursorSize() {
		// return mouse.getMaxCursorSize();
		return 0;
	}

	@Override
	public void createKeyboard() throws LWJGLException {
		keyboard.createKeyboard();
	}

	@Override
	public void destroyKeyboard() {
		keyboard.destroyKeyboard();
	}

	@Override
	public void pollKeyboard(ByteBuffer keyDownBuffer) {
		keyboard.pollKeyboard(keyDownBuffer);
	}

	@Override
	public void readKeyboard(ByteBuffer buffer) {
		keyboard.readKeyboard(buffer);
	}

	@Override
	public Object createCursor(int width, int height, int xHotspot, int yHotspot, int numImages, IntBuffer images, IntBuffer delays) throws LWJGLException {
		return null;
	}

	@Override
	public void destroyCursor(Object cursor_handle) {
	}

	@Override
	public boolean isInsideWindow() {
		return mouse.isInsideWindow();
	}

	@Override
	public void createWindow(DisplayMode mode, Canvas parent, int x, int y) throws LWJGLException {
		GLFW.glfwDefaultWindowHints();
		// Configure GLFW
        // GLFW.glfwWindowHint(GLFW.GLFW_ACCUM_ALPHA_BITS, pixelFormat.getAccumulationBitsPerPixel());
        // GLFW.glfwWindowHint(GLFW.GLFW_ALPHA_BITS, pixelFormat.getAlphaBits());
        // GLFW.glfwWindowHint(GLFW.GLFW_AUX_BUFFERS, pixelFormat.getAuxBuffers());
        // GLFW.glfwWindowHint(GLFW.GLFW_DEPTH_BITS, pixelFormat.getDepthBits());
        // GLFW.glfwWindowHint(GLFW.GLFW_SAMPLES, pixelFormat.getSamples());
        // GLFW.glfwWindowHint(GLFW.GLFW_STENCIL_BITS, pixelFormat.getStencilBits());
		// GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
		// GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 2);
		// GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
		GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, resizable ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
		long monitor = MemoryUtil.NULL;
		if (mode.isFullscreenCapable()) {
			monitor = GLFW.glfwGetPrimaryMonitor();
		}
		if(!window_created) {
			handle = GLFW.glfwCreateWindow(mode.getWidth(), mode.getHeight(), title != null ? title : "", monitor, MemoryUtil.NULL);
		} else {
			throw new LWJGLException("Display is already created");
		}
		if (handle == MemoryUtil.NULL) {
			throw new LWJGLException("Display could not be created");
		}
		frameBufferSizeCallback = GLFWFramebufferSizeCallback.create(this::frameBufferResizeCallback);
		sizeCallback = GLFWWindowSizeCallback.create(this::resizeCallback);
		moveCallback = GLFWWindowPosCallback.create(this::moveCallback);
		closeCallback = GLFWWindowCloseCallback.create(this::closeCallback);
		GLFW.glfwSetWindowCloseCallback(handle, closeCallback);
		GLFW.glfwSetWindowSizeCallback(handle, sizeCallback);
		GLFW.glfwSetFramebufferSizeCallback(handle, frameBufferSizeCallback);
		GLFW.glfwSetWindowPosCallback(handle, moveCallback);
		this.parent = parent;
		switchDisplayMode(mode);
		window_created = true;

		GLFW.glfwSetWindowPos(handle, getWindowX(), getWindowY());

		GLFW.glfwShowWindow(handle);
		GLFW.glfwFocusWindow(handle);
	}

	@Override
	public void destroyWindow() {
		GLFW.glfwDestroyWindow(handle);
		handle = MemoryUtil.NULL;
		if (sizeCallback != null) {
			sizeCallback.free();
			sizeCallback = null;
		}
		if (moveCallback != null) {
			moveCallback.free();
			moveCallback = null;
		}
		if (closeCallback != null) {
			closeCallback.free();
			closeCallback = null;
		}
		window_created = false;
	}

	@Override
	public void switchDisplayMode(DisplayMode mode) {
		current_mode = mode;
		if(handle == MemoryUtil.NULL) {
			return;
		}
		if (mode.isFullscreenCapable()) {
			long primaryMonitor = GLFW.glfwGetPrimaryMonitor();
			GLFW.glfwGetMonitorPos(primaryMonitor, buffX, buffY);
			GLFW.glfwSetWindowMonitor(handle, primaryMonitor, buffX.get(), buffY.get(), current_mode.getWidth(), current_mode.getHeight(), current_mode.getFrequency());
			buffX.flip();
			buffY.flip();
		} else {
			GLFW.glfwSetWindowMonitor(handle, MemoryUtil.NULL, getWindowX(), getWindowY(), current_mode.getWidth(), current_mode.getHeight(), current_mode.getFrequency());
			reshape(getWindowX(), getWindowY(), current_mode.getWidth(), current_mode.getHeight());
		}
		refreshSizes();
	}

	@Override
	public void resetDisplayMode() {
		switchDisplayMode(current_mode);
	}

	@Override
	public DisplayMode init() throws LWJGLException {
		return desktop_mode;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
		GLFW.glfwSetWindowTitle(handle, title);
	}

	@Override
	public boolean isCloseRequested() {
		return GLFW.glfwWindowShouldClose(handle);
	}

	@Override
	public boolean isVisible() {
		return GLFW.glfwGetWindowAttrib(handle, GLFW.GLFW_ICONIFIED) == 0;
	}

	@Override
	public boolean isActive() {
		return GLFW.glfwGetWindowAttrib(handle, GLFW.GLFW_FOCUSED) == 1;
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public void update() {
		GLFW.glfwPollEvents();
	}

	@Override
	public void reshape(int x, int y, int width, int height) {
		glfwSetWindowPos(handle, x, y);
		glfwSetWindowSize(handle, width, height);
	}

	@Override
	public DisplayMode[] getAvailableDisplayModes() throws LWJGLException {
		long primaryMonitor = GLFW.glfwGetPrimaryMonitor();
		if (primaryMonitor == MemoryUtil.NULL) {
			return new DisplayMode[0];
		}
		GLFWVidMode.Buffer videoModes = GLFW.glfwGetVideoModes(primaryMonitor);
		if (videoModes == null) {
			return new DisplayMode[0];
		}
		List<DisplayMode> modes = new ArrayList<DisplayMode>();
		videoModes.iterator().forEachRemaining(mode -> {
			modes.add(new DisplayMode(mode.width(), mode.height(), mode.redBits() + mode.blueBits() + mode.greenBits(), mode.refreshRate()));
		});
		return modes.toArray(new DisplayMode[0]);
	}
	@Override
	public int setIcon(ByteBuffer[] icons) {
		if (window_created) {
			GLFW.glfwSetWindowIcon(handle, iconsToGLFWBuffer(icons));
			return icons.length;
		} else {
			return 0;
		}
	}

	@Override
	public void setResizable(boolean isResizable) {
		resizable = isResizable;
		if (window_created) {
			GLFW.glfwSetWindowAttrib(handle, GLFW.GLFW_RESIZABLE, resizable ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE);
		}
	}

	@Override
	public int getWidth() {
		return frameBufferWidth;
	}

	@Override
	public int getHeight() {
		return frameBufferHeight;
	}

	@Override
	public float getPixelScaleFactor() {
		return getWidth() / getWindowWidth();
	}

	@Override
	public boolean isCurrent() throws LWJGLException {
		return GLFW.glfwGetCurrentContext() == handle;
	}

	@Override
	public void makeCurrent() throws LWJGLException {
		GLFW.glfwMakeContextCurrent(handle);
        GL.createCapabilities();
	}

	@Override
	public void releaseCurrent() throws LWJGLException {
		GLFW.glfwMakeContextCurrent(0);
        GL.setCapabilities(null);
	}

	@Override
	public void releaseDrawable() throws LWJGLException {
	}

	@Override
	public void setSwapInterval(int i) {
		GLFW.glfwSwapInterval(i);
	}

	@Override
	public void swapBuffers() throws LWJGLException {
		GLFW.glfwSwapBuffers(handle);
	}
}
