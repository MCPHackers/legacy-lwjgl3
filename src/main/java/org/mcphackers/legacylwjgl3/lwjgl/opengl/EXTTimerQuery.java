package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.LongBuffer;

public class EXTTimerQuery {
    public static void glGetQueryObjectEXT(int id, int pname, LongBuffer params) {
        org.lwjgl.opengl.EXTTimerQuery.glGetQueryObjecti64vEXT(id, pname, params);
    }

    public static long glGetQueryObjectEXT(int id, int pname) {
        return org.lwjgl.opengl.EXTTimerQuery.glGetQueryObjecti64EXT(id, pname);
    }

    public static void glGetQueryObjectuEXT(int id, int pname, LongBuffer params) {
        org.lwjgl.opengl.EXTTimerQuery.glGetQueryObjectui64vEXT(id, pname, params);
    }

    public static long glGetQueryObjectuEXT(int id, int pname) {
        return org.lwjgl.opengl.EXTTimerQuery.glGetQueryObjectui64EXT(id, pname);
    }
}
