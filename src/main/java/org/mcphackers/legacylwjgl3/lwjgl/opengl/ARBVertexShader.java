package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import static org.lwjgl.opengl.GL11.*;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class ARBVertexShader {
	public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, FloatBuffer buffer) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, GL_FLOAT, normalized, stride, buffer);
    }

	// public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) {
    //     org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, GL_DOUBLE, normalized, stride, buffer);
    // }

	public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, unsigned ? GL_UNSIGNED_BYTE : GL_BYTE, normalized, stride, buffer);
    }

	public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, unsigned ? GL_UNSIGNED_INT : GL_INT, normalized, stride, buffer);
    }

	public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) {
        org.lwjgl.opengl.ARBVertexShader.glVertexAttribPointerARB(index, size, unsigned ? GL_UNSIGNED_SHORT : GL_SHORT, normalized, stride, buffer);
    }

    public static void glGetVertexAttribARB(int index, int pname, FloatBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    public static void glGetVertexAttribARB(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

    public static void glGetVertexAttribARB(int index, int pname, DoubleBuffer params) {
        org.lwjgl.opengl.ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }
}
