package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import org.lwjgl.opengl.KHRDebugCallback;

public class GL43 {
	public static void glDebugMessageCallback(KHRDebugCallback callback) {
		org.lwjgl.opengl.GL43.glDebugMessageCallback(callback, 0);
	}
}
