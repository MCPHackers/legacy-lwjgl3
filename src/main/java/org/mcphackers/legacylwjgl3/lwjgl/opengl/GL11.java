package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.opengl.GL11.*;
// All methods using memAddress are suspicious
// Why aren't there methods in LWJGL 3 which accept DoubleBuffer?
// import static org.lwjgl.system.MemoryUtil.memAddress;

public class GL11 {
    public static void glColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, unsigned ? GL_UNSIGNED_BYTE : GL_BYTE, stride, pointer);
    }
    
    public static void glColorPointer(int size, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glColorPointer(size, GL_FLOAT, stride, pointer);
    }
    
    // public static void glColorPointer(int size, int stride, DoubleBuffer pointer) {
    //     org.lwjgl.opengl.GL11.glColorPointer(size, GL_DOUBLE, stride, memAddress(pointer));
    // }
    
    public static void glFog(int p1, FloatBuffer p2) {
        org.lwjgl.opengl.GL11.glFogfv(p1, p2);
    }

    public static void glFog(int p1, IntBuffer p2) {
        org.lwjgl.opengl.GL11.glFogiv(p1, p2);
    }

    public static void glGetBoolean(int p1, ByteBuffer p2) {
        org.lwjgl.opengl.GL11.glGetBooleanv(p1, p2);
    }

    public static void glGetDouble(int p1, DoubleBuffer p2) {
        org.lwjgl.opengl.GL11.glGetDoublev(p1, p2);
    }

    public static void glGetFloat(int p1, FloatBuffer p2) {
        org.lwjgl.opengl.GL11.glGetFloatv(p1, p2);
    }

    public static void glGetInteger(int p1, IntBuffer p2) {
        org.lwjgl.opengl.GL11.glGetIntegerv(p1, p2);
    }

    public static void glGetLight(int p1, int p2, FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glGetLightfv(p1, p2, p3);
    }

    public static void glGetLight(int p1, int p2, IntBuffer p3) {
        org.lwjgl.opengl.GL11.glGetLightiv(p1, p2, p3);
    }

    public static void glGetMap(int p1, int p2, DoubleBuffer p3) {
        org.lwjgl.opengl.GL11.glGetMapdv(p1, p2, p3);
    }

    public static void glGetMap(int p1, int p2, FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glGetMapfv(p1, p2, p3);
    }

    public static void glGetMap(int p1, int p2, IntBuffer p3) {
        org.lwjgl.opengl.GL11.glGetMapiv(p1, p2, p3);
    }

    public static void glGetMaterial(int p1, int p2, FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glGetMaterialfv(p1, p2, p3);
    }

    public static void glGetMaterial(int p1, int p2, IntBuffer p3) {
        org.lwjgl.opengl.GL11.glGetMaterialiv(p1, p2, p3);
    }

    public static void glGetPixelMap(int p1, FloatBuffer p2) {
        org.lwjgl.opengl.GL11.glGetPixelMapfv(p1, p2);
    }

    public static void glGetPixelMapu(int p1, IntBuffer p2) {
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(p1, p2);
    }

    public static void glGetPixelMapu(int p1, ShortBuffer p2) {
        org.lwjgl.opengl.GL11.glGetPixelMapusv(p1, p2);
    }

    public static void glGetTexEnv(int p1, int p2, FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glGetTexEnvfv(p1, p2, p3);
    }

    public static void glGetTexEnv(int p1, int p2, IntBuffer p3) {
        org.lwjgl.opengl.GL11.glGetTexEnviv(p1, p2, p3);
    }

    public static void glGetTexGen(int p1, int p2, DoubleBuffer p3) {
        org.lwjgl.opengl.GL11.glGetTexGendv(p1, p2, p3);
    }

    public static void glGetTexGen(int p1, int p2, FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glGetTexGenfv(p1, p2, p3);
    }

    public static void glGetTexGen(int p1, int p2, IntBuffer p3) {
        org.lwjgl.opengl.GL11.glGetTexGeniv(p1, p2, p3);
    }

    public static void glGetTexLevelParameter(int target, int level, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    public static void glGetTexLevelParameter(int target, int level, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    public static void glGetTexParameter(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    public static void glGetTexParameter(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    public static void glLight(int light, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    public static void glLight(int light, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    public static void glLightModel(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    public static void glLightModel(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }
    
    public static void glLoadMatrix(DoubleBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }
    
    public static void glLoadMatrix(FloatBuffer m) {
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }
    
    public static void glMaterial(int p1, int p2, java.nio.FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glMaterialfv(p1, p2, p3);
    }

    public static void glMaterial(int p1, int p2, java.nio.IntBuffer p3) {
        org.lwjgl.opengl.GL11.glMaterialiv(p1, p2, p3);
    }
    
    public static void glMultMatrix(java.nio.DoubleBuffer p1) {
        org.lwjgl.opengl.GL11.glMultMatrixd(p1);
    }

    public static void glMultMatrix(java.nio.FloatBuffer p1) {
        org.lwjgl.opengl.GL11.glMultMatrixf(p1);
    }

    public static void glNormalPointer(int stride, ByteBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(GL_BYTE, stride, pointer);
    }
    
    public static void glNormalPointer(int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(GL_FLOAT, stride, pointer);
    }
    
    public static void glNormalPointer(int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(GL_INT, stride, pointer);
    }
    
    public static void glNormalPointer(int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glNormalPointer(GL_SHORT, stride, pointer);
    }
    
    // public static void glNormalPointer(int stride, DoubleBuffer pointer) {
    //     org.lwjgl.opengl.GL11.glNormalPointer(GL_DOUBLE, stride, memAddress(pointer));
    // }
    
    public static void glPixelMap(int p1, java.nio.FloatBuffer p2) {
        org.lwjgl.opengl.GL11.glPixelMapfv(p1, p2);
    }

    public static void glPixelMapu(int p1, java.nio.IntBuffer p2) {
        org.lwjgl.opengl.GL11.glPixelMapuiv(p1, p2);
    }

    public static void glPixelMapu(int p1, java.nio.ShortBuffer p2) {
        org.lwjgl.opengl.GL11.glPixelMapusv(p1, p2);
    }
    
    // todo texcoordptr bytebuffer
    public static void glTexCoordPointer(int size, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_FLOAT, stride, pointer);
    }
    
    public static void glTexCoordPointer(int size, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_INT, stride, pointer);
    }
    
    public static void glTexCoordPointer(int size, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_SHORT, stride, pointer);
    }
    
    public static void glTexEnv(int p1, int p2, java.nio.FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glTexEnvfv(p1, p2, p3);
    }

    public static void glTexEnv(int p1, int p2, java.nio.IntBuffer p3) {
        org.lwjgl.opengl.GL11.glTexEnviv(p1, p2, p3);
    }

    public static void glTexGen(int p1, int p2, java.nio.DoubleBuffer p3) {
        org.lwjgl.opengl.GL11.glTexGendv(p1, p2, p3);
    }

    public static void glTexGen(int p1, int p2, java.nio.FloatBuffer p3) {
        org.lwjgl.opengl.GL11.glTexGenfv(p1, p2, p3);
    }

    public static void glTexGen(int p1, int p2, java.nio.IntBuffer p3) {
        org.lwjgl.opengl.GL11.glTexGeniv(p1, p2, p3);
    }

    public static void glVertexPointer(int size, int stride, FloatBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_FLOAT, stride, pointer);
    }
    
    public static void glVertexPointer(int size, int stride, IntBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_INT, stride, pointer);
    }
    
    public static void glVertexPointer(int size, int stride, ShortBuffer pointer) {
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_SHORT, stride, pointer);
    }

    // public static void glVertexPointer(int size, int stride, DoubleBuffer pointer) {
    //     org.lwjgl.opengl.GL11.glVertexPointer(size, GL_DOUBLE, stride, memAddress(pointer));
    // }

    // public static void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
    //     org.lwjgl.opengl.GL11.glDrawElements(mode, count, type, memAddress(indices));
    // }

    public static void glGetPointer(int pname, long params) {
        org.lwjgl.opengl.GL11.nglGetPointerv(pname, params);
    }

    // public static void glReadPixels(int x, int y, int width, int height, int format, int type, DoubleBuffer pixels) {
    //     org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, memAddress(pixels));
    // }

    public static void glTexParameter(int target, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, params);
    }

    public static void glTexParameter(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, params);
    }

    // public static void glTexCoordPointer(int size, int stride, DoubleBuffer params) {
    //     org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_DOUBLE, stride, memAddress(params));
    // }
}
