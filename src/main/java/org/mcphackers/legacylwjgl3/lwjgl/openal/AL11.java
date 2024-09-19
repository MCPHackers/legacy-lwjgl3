package org.mcphackers.legacylwjgl3.lwjgl.openal;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class AL11 {
    public static void alSource(int source, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL11.alSourceiv(source, paramName, value);
    }

    public static void alBuffer(int source, int paramName, FloatBuffer value) {
        org.lwjgl.openal.AL11.alBufferfv(source, paramName, value);
    }

    public static void alBuffer(int source, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL11.alBufferiv(source, paramName, value);
    }

    public static void alGetBuffer(int bufferName, int paramName, FloatBuffer value) {
        org.lwjgl.openal.AL11.alGetBufferf(bufferName, paramName, value);
    }

    public static void alGetBuffer(int bufferName, int paramName, IntBuffer value) {
        org.lwjgl.openal.AL11.alGetBufferi(bufferName, paramName, value);
    }
}
