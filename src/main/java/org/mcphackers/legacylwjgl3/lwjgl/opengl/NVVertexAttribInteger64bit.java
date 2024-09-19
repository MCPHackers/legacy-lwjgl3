package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.LongBuffer;

import org.lwjgl.system.NativeType;

public class NVVertexAttribInteger64bit {
    public static void glVertexAttribL1NV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL1i64vNV(index, v);
    }

    public static void glVertexAttribL2NV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL2i64vNV(index, v);
    }
    
    public static void glVertexAttribL3NV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL3i64vNV(index, v);
    }
    
    public static void glVertexAttribL4NV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL4i64vNV(index, v);
    }

    public static void glVertexAttribL1uNV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL1ui64vNV(index, v);
    }

    public static void glVertexAttribL2uNV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL2ui64vNV(index, v);
    }
    
    public static void glVertexAttribL3uNV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL3ui64vNV(index, v);
    }
    
    public static void glVertexAttribL4uNV(int index, LongBuffer v) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glVertexAttribL4ui64vNV(index, v);
    }

    public static void glGetVertexAttribLNV(int index, int pname, LongBuffer params) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glGetVertexAttribLi64vNV(index, pname, params);
    }

    public static void glGetVertexAttribLuNV(int index, int pname, LongBuffer params) {
        org.lwjgl.opengl.NVVertexAttribInteger64bit.glGetVertexAttribLui64vNV(index, pname, params);
    }
}
