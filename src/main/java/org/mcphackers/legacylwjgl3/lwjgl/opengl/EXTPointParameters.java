package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.FloatBuffer;

public class EXTPointParameters {
    public static void glPointParameterEXT(int pname, FloatBuffer params) {
        org.lwjgl.opengl.EXTPointParameters.glPointParameterfvEXT(pname, params);
    }
}
