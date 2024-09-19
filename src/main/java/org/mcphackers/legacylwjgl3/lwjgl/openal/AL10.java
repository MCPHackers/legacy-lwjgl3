package org.mcphackers.legacylwjgl3.lwjgl.openal;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class AL10 {
    public static void alGetInteger(int paramName, IntBuffer dest) {
        org.lwjgl.openal.AL10.alGetIntegerv(paramName, dest);
    }

    public static void alGetFloat(int paramName, FloatBuffer dest) {
        org.lwjgl.openal.AL10.alGetFloatv(paramName, dest);
    }

    public static void alGetDouble(int paramName, DoubleBuffer dest) {
        org.lwjgl.openal.AL10.alGetDoublev(paramName, dest);
    }

    public static boolean alIsExtensionPresent(String extension) {
        return org.lwjgl.openal.AL10.alIsExtensionPresent(extension);
    }

    public static int alGetEnumValue(String enumName) {
        return org.lwjgl.openal.AL10.alGetEnumValue(enumName);
    }

    public static void alListener(int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alListenerfv(paramName, values);
    }

    public static void alGetListener(int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alGetListenerfv(paramName, values);
    }

    public static void alSource(int source, int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alSourcefv(source, paramName, values);
    }

    public static void alGetSource(int source, int paramName, FloatBuffer values) {
        org.lwjgl.openal.AL10.alGetSourcefv(source, paramName, values);
    }

    public static void alSourcePlay(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePlayv(sources);
    }

    public static void alSourcePause(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePausev(sources);
    }

    public static void alSourceStop(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceStopv(sources);
    }

    public static void alSourceRewind(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceRewindv(sources);
    }
}
