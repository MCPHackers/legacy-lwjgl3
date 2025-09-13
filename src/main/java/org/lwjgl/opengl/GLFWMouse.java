package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import org.lwjgl.glfw.*;
import org.lwjgl.input.Mouse;

public class GLFWMouse {
	private GLFWMouseButtonCallbackI buttonCallback;
	private GLFWCursorPosCallbackI posCallback;
	private GLFWScrollCallbackI scrollCallback;
	private GLFWCursorEnterCallbackI cursorEnterCallback;
	private GLFWDisplay display;
	private boolean isInsideWindow;
	private static final int WHEEL_SCALE = 120;

	private final EventQueue event_queue = new EventQueue(Mouse.EVENT_SIZE);

	private final ByteBuffer tmp_event = ByteBuffer.allocate(Mouse.EVENT_SIZE);

	private int last_x;
	private int last_y;
	private int accum_dx;
	private int accum_dy;
	private int accum_dz;
	private boolean grab;
	private byte[] button_states = new byte[this.getButtonCount()];
	private double[] x_coord = new double[1];
	private double[] y_coord = new double[1];

	public GLFWMouse(GLFWDisplay display) {
		this.display = display;
	}

	public void createMouse() {
		long handle = display.getHandle();
		if (GLFW.glfwRawMouseMotionSupported() && !Boolean.getBoolean("org.lwjgl.input.Mouse.disableRawInput"))
			GLFW.glfwSetInputMode(handle, GLFW.GLFW_RAW_MOUSE_MOTION, GLFW.GLFW_TRUE);

		this.buttonCallback = new GLFWMouseButtonCallbackI() {
			public void invoke(long window, int button, int action, int mods) {
				byte state = action == GLFW.GLFW_PRESS ? (byte)1 : (byte)0;
				putMouseEvent((byte)button, state, 0, System.nanoTime());
				if (button < button_states.length)
					button_states[button] = state;
			}
		};
		this.posCallback = new GLFWCursorPosCallbackI() {
			public void invoke(long window, double xpos, double ypos) {
				int x = (int)scaledWidth(xpos);
				int y = transformY((int)scaledHeight(ypos));
				long nanos = System.nanoTime();
				int dx = x - last_x;
				int dy = y - last_y;
				if (grab && isInsideWindow()) {
					accum_dx += dx;
					accum_dy += dy;
				}
				if (grab) {
					putMouseEventWithCoords((byte)-1, (byte)0, dx, dy, 0, nanos);
				} else {
					putMouseEventWithCoords((byte)-1, (byte)0, x, y, 0, nanos);
				}

				last_x = x;
				last_y = y;
			}
		};
		this.scrollCallback = GLFWScrollCallback.create((window, xoffset, yoffset) -> {
			accum_dz += yoffset * WHEEL_SCALE;
			putMouseEvent((byte)-1, (byte)0, (int)(yoffset * WHEEL_SCALE), System.nanoTime());
		});
		this.cursorEnterCallback = GLFWCursorEnterCallback.create((window, entered) -> this.isInsideWindow = entered);

		GLFW.glfwSetMouseButtonCallback(handle, this.buttonCallback);
		GLFW.glfwSetCursorPosCallback(handle, this.posCallback);
		GLFW.glfwSetScrollCallback(handle, this.scrollCallback);
		GLFW.glfwSetCursorEnterCallback(handle, this.cursorEnterCallback);
	}

	private double scaledWidth(double mouseX) {
		return grab ? mouseX : mouseX * display.getWidth() / display.getWindowWidth();
	}

	private double scaledHeight(double mouseY) {
		return grab ? mouseY : mouseY * display.getHeight() / display.getWindowHeight();
	}

	private void putMouseEvent(byte button, byte state, int dz, long nanos) {
		if (grab)
			putMouseEventWithCoords(button, state, 0, 0, dz, nanos);
		else
			putMouseEventWithCoords(button, state, last_x, last_y, dz, nanos);
	}

	private void putMouseEventWithCoords(byte button, byte state, int x, int y, int dz, long nanos) {
		tmp_event.clear();
		tmp_event.put(button).put(state).putInt(x).putInt(y).putInt(dz).putLong(nanos);
		tmp_event.flip();
		event_queue.putEvent(tmp_event);
	}

	public void destroyMouse() {
		this.buttonCallback = null;
		this.posCallback = null;
		this.scrollCallback = null;
		this.cursorEnterCallback = null;
	}

	private void reset() {
		this.event_queue.clearEvents();
		accum_dx = accum_dy = 0;
	}

	public void pollMouse(IntBuffer coord_buffer, ByteBuffer buttons_buffer) {
		if (grab) {
			coord_buffer.put(0, accum_dx);
			coord_buffer.put(1, accum_dy);
		} else {
			coord_buffer.put(0, last_x);
			coord_buffer.put(1, last_y);
		}
		coord_buffer.put(2, accum_dz);
		accum_dx = accum_dy = accum_dz = 0;
		for (int i = 0; i < button_states.length; i++)
			buttons_buffer.put(i, button_states[i]);
	}

	public void readMouse(ByteBuffer readBuffer) {
		event_queue.copyEvents(readBuffer);
	}

	private int transformY(int y) {
		return Display.getHeight() - 1 - y;
	}

	public void setCursorPosition(int x, int y) {
		long handle = display.getHandle();
		GLFW.glfwSetCursorPos(handle, x * display.getWindowWidth() / display.getWidth(), y * display.getWindowHeight() / display.getHeight());
		// Implementations (like wayland) may choose to set coordinates somewhere else or ignore
		GLFW.glfwGetCursorPos(handle, x_coord, y_coord);
		this.last_x = (int)scaledWidth(x_coord[0]);
		this.last_y = transformY((int)scaledHeight(y_coord[0]));
	}

	public void grabMouse(boolean grab) {
		this.grab = grab;
		GLFW.glfwSetInputMode(display.getHandle(), GLFW.GLFW_CURSOR, grab ? GLFW.GLFW_CURSOR_DISABLED : GLFW.GLFW_CURSOR_NORMAL);
		this.reset();
	}

	public boolean hasWheel() {
		return true;
	}

	public int getButtonCount() {
		return GLFW.GLFW_MOUSE_BUTTON_LAST + 1;
	}

	public boolean isInsideWindow() {
		return this.isInsideWindow;
	}

	public int getNativeCursorCapabilities() {
		return 0;
	}
}
