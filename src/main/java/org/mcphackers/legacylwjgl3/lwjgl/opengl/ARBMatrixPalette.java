package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class ARBMatrixPalette {
    public static void glMatrixIndexuARB(IntBuffer indices) {
       org.lwjgl.opengl.ARBMatrixPalette.glMatrixIndexuivARB(indices);
    }

    public static void glMatrixIndexuARB(ByteBuffer indices) {
        org.lwjgl.opengl.ARBMatrixPalette.glMatrixIndexubvARB(indices);
    }

    public static void glMatrixIndexuARB(ShortBuffer indices) {
        org.lwjgl.opengl.ARBMatrixPalette.glMatrixIndexusvARB(indices);
    }
}
