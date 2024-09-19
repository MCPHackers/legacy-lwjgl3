package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class NVPathRendering {
    public static void glPathParameterNV(int path, int pname, IntBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glPathParameterivNV(path, pname, value);
    }

    public static void glPathParameterNV(int path, int pname, FloatBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glPathParameterfvNV(path, pname, value);
    }

    public static void glGetPathParameterNV(int path, int pname, IntBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glGetPathParameterivNV(path, pname, value);
    }

    public static void glGetPathColorGenNV(int path, int pname, IntBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glGetPathColorGenivNV(path, pname, value);
    }

    public static void glGetPathColorGenNV(int path, int pname, FloatBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glGetPathColorGenfvNV(path, pname, value);
    }

    public static void glGetPathTexGenNV(int path, int pname, IntBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glGetPathTexGenivNV(path, pname, value);
    }

    public static void glGetPathTexGenNV(int path, int pname, FloatBuffer value) {
        org.lwjgl.opengl.NVPathRendering.glGetPathTexGenfvNV(path, pname, value);
    }
}
