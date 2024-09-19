package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.opengl.GL41C;
import org.lwjgl.system.NativeType;

public class ARBViewportArray {
    public static void glViewportArray(int first, FloatBuffer v) {
        org.lwjgl.opengl.ARBViewportArray.glViewportArrayv(first, v);
    }

    public static void glViewportIndexed(int first, FloatBuffer v) {
        org.lwjgl.opengl.ARBViewportArray.glViewportIndexedfv(first, v);
    }

    public static void glScissorArray(int first, IntBuffer v) {
        org.lwjgl.opengl.ARBViewportArray.glScissorArrayv(first, v);
    }

    public static void glScissorIndexed(int first, IntBuffer v) {
        org.lwjgl.opengl.ARBViewportArray.glScissorIndexedv(first, v);
    }
    
    public static void glDepthRangeArray(int first, DoubleBuffer v) {
        org.lwjgl.opengl.ARBViewportArray.glDepthRangeArrayv(first, v);
    }
    
    public static void glGetFloat(int target, int index, FloatBuffer data) {
        org.lwjgl.opengl.ARBViewportArray.glGetFloati_v(target, index, data);
    }
    
    public static float glGetFloat(int target, int index) {
        return org.lwjgl.opengl.ARBViewportArray.glGetFloati(target, index);
    }
    
    public static void glGetDouble(int target, int index, DoubleBuffer data) {
        org.lwjgl.opengl.ARBViewportArray.glGetDoublei_v(target, index, data);
    }
    
    public static double glGetDouble(int target, int index) {
        return org.lwjgl.opengl.ARBViewportArray.glGetDoublei(target, index);
    }
}
