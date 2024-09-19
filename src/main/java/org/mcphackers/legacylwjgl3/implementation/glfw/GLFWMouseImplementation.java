package org.mcphackers.legacylwjgl3.implementation.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.EventQueue;
import org.mcphackers.legacylwjgl3.implementation.MouseImplementation;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * @author Zarzelcow
 * @created 28/09/2022 - 8:58 PM
 */
public class GLFWMouseImplementation implements MouseImplementation {
    private GLFWMouseButtonCallback buttonCallback;
    private GLFWCursorPosCallback posCallback;
    private GLFWScrollCallback scrollCallback;
    private GLFWCursorEnterCallback cursorEnterCallback;
    private long windowHandle;
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
    private boolean ignoreFirstMove = true;
    private boolean ignoreNext;
    private byte[] button_states = new byte[this.getButtonCount()];

    @Override
    public void createMouse() {
        this.windowHandle = Display.getHandle();

        if (GLFW.glfwRawMouseMotionSupported() && !Mouse.getPrivilegedBoolean("org.lwjgl.input.Mouse.disableRawInput"))
            GLFW.glfwSetInputMode(this.windowHandle, GLFW.GLFW_RAW_MOUSE_MOTION, GLFW.GLFW_TRUE);

        this.buttonCallback = GLFWMouseButtonCallback.create(
        new GLFWMouseButtonCallbackI() {
            public void invoke(long window, int button, int action, int mods) {
                byte state = action == GLFW.GLFW_PRESS ? (byte)1 : (byte)0;
                putMouseEvent((byte) button, state, 0, System.nanoTime());
                if (button < button_states.length)
                    button_states[button] = state;
            }
        });
        this.posCallback = GLFWCursorPosCallback.create(new GLFWCursorPosCallbackI() {
            public void invoke(long window, double xpos, double ypos) {
                if(ignoreNext) {
                    ignoreNext = false;
                    return;
                }
                int x = (int)xpos;
                int y = transformY((int)ypos);
                long nanos = System.nanoTime();
                if (ignoreFirstMove) {
                    last_x = x;
                    last_y = y;
                    ignoreFirstMove = false;
                }
                int dx = x - last_x;
                int dy = y - last_y;
                if (grab && isInsideWindow()) {
                    accum_dx += dx;
                    accum_dy += dy;
                }
                // System.err.println("X: " + last_x + " DeltaX: " + accum_dx);
                if (grab) {
                    putMouseEventWithCoords((byte)-1, (byte)0, dx, dy, 0, nanos);
                } else {
                    putMouseEventWithCoords((byte)-1, (byte)0, x, y, 0, nanos);
                }

                last_x = x;
                last_y = y;
            }
        });
        this.scrollCallback = GLFWScrollCallback.create((window, xoffset, yoffset) -> {
            accum_dz += yoffset * WHEEL_SCALE;
            putMouseEvent((byte)-1, (byte)0, (int)(yoffset * WHEEL_SCALE), System.nanoTime());
        });
        this.cursorEnterCallback = GLFWCursorEnterCallback.create((window, entered) -> this.isInsideWindow = entered);

        GLFW.glfwSetMouseButtonCallback(this.windowHandle, this.buttonCallback);
        GLFW.glfwSetCursorPosCallback(this.windowHandle, this.posCallback);
        GLFW.glfwSetScrollCallback(this.windowHandle, this.scrollCallback);
        GLFW.glfwSetCursorEnterCallback(this.windowHandle, this.cursorEnterCallback);
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

    @Override
    public void destroyMouse() {
        if(this.buttonCallback != null) {
            this.buttonCallback.free();
            this.buttonCallback = null;
        }
        if(this.posCallback != null) {
            this.posCallback.free();
            this.posCallback = null;
        }
        if(this.scrollCallback != null) {
            this.scrollCallback.free();
            this.scrollCallback = null;
        }
        if(this.cursorEnterCallback != null) {
            this.cursorEnterCallback.free();
            this.cursorEnterCallback = null;
        }
    }

    private void reset() {
        this.event_queue.clearEvents();
        accum_dx = accum_dy = 0;
    }
    @Override
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

    @Override
    public void readMouse(ByteBuffer readBuffer) {
        event_queue.copyEvents(readBuffer);
    }

	private int transformY(int y) {
		return Display.getHeight() - 1 - y;
	}

    @Override
    public void setCursorPosition(int x, int y) {
        GLFW.glfwSetCursorPos(this.windowHandle, x, y);
        this.last_x = x;
        this.last_y = y;
        ignoreNext = true;
        ignoreFirstMove = true;
    }

    @Override
    public void grabMouse(boolean grab) {
        if(grab && !this.grab) {
            ignoreFirstMove = true;
        }
        this.grab = grab;
        GLFW.glfwSetInputMode(this.windowHandle, GLFW.GLFW_CURSOR, grab ? GLFW.GLFW_CURSOR_DISABLED : GLFW.GLFW_CURSOR_NORMAL);
        this.reset();
    }

    @Override
    public boolean hasWheel() {
        return true;
    }

    @Override
    public int getButtonCount() {
        return GLFW.GLFW_MOUSE_BUTTON_LAST + 1;
    }

    @Override
    public boolean isInsideWindow() {
        return this.isInsideWindow;
    }

    @Override
    public int getNativeCursorCapabilities() {
        return 0;
    }
}
