package org.lwjgl.opengl;

import java.nio.IntBuffer;

import org.lwjgl.LWJGLException;
import org.lwjgl.glfw.GLFW;

public class GLFWContextImplementation implements ContextImplementation {

	@Override
	public long create(IntBuffer attribs, long shared_context_handle) throws LWJGLException {
		return 0/* GLFWDisplay.getHandle() */;
	}

	@Override
	public void swapBuffers() throws LWJGLException {
		GLFW.glfwSwapBuffers(0);
	}

	@Override
	public void releaseDrawable(long context_handle) throws LWJGLException {
	}

	@Override
	public void releaseCurrentContext() throws LWJGLException {
		GLFW.glfwMakeContextCurrent(0);
		GL.setCapabilities(null);
	}

	@Override
	public void update(long context_handle) {
		GLFW.glfwPollEvents();
	}

	@Override
	public void makeCurrent(long handle) throws LWJGLException {
		GLFW.glfwMakeContextCurrent(handle);
		GL.createCapabilities();
	}

	@Override
	public boolean isCurrent(long handle) throws LWJGLException {
		return GLFW.glfwGetCurrentContext() == handle;
	}

	@Override
	public void setSwapInterval(int value) {
		GLFW.glfwSwapInterval(value);
	}

	@Override
	public void destroy(long handle) throws LWJGLException {
		if (/* shared && */ handle > 0) {
			GLFW.glfwDestroyWindow(handle);
		}
	}

}
