package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import static org.lwjgl.opengl.GL11.*;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GL14 {
    public static void glFogCoordPointer(int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(GL_DOUBLE, stride, pointer);
    }

    public static void glPointParameter(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }
    
    public static void glPointParameter(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }
    
    public static void glSecondaryColorPointer(int size, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, GL_FLOAT, stride, pointer);
    }
    
    public static void glSecondaryColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, unsigned ? GL_UNSIGNED_BYTE : GL_BYTE, stride, pointer);
    }
}
