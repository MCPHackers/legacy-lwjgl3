package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.KHRDebugCallback;

public final class KHRDebug {

	private KHRDebug() {
	}

	public static void glDebugMessageCallback(KHRDebugCallback callback) {
		GL43.glDebugMessageCallback(callback, 0);
	}

	public static void glObjectPtrLabel(PointerWrapper ptr, ByteBuffer label) {
		GL43.glObjectPtrLabel(ptr.getPointer(), label);
	}

	/**
	 * Overloads glObjectPtrLabel.
	 */
	public static void glObjectPtrLabel(PointerWrapper ptr, CharSequence label) {
		GL43.glObjectPtrLabel(ptr.getPointer(), label);
	}

	public static void glGetObjectPtrLabel(PointerWrapper ptr, IntBuffer length, ByteBuffer label) {
		GL43.glGetObjectPtrLabel(ptr.getPointer(), length, label);
	}

	/**
	 * Overloads glGetObjectPtrLabel.
	 */
	public static String glGetObjectPtrLabel(PointerWrapper ptr, int bufSize) {
		return GL43.glGetObjectPtrLabel(ptr.getPointer(), bufSize);
	}
}
