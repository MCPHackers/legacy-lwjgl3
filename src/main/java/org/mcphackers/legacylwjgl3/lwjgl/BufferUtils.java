package org.mcphackers.legacylwjgl3.lwjgl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class BufferUtils {

	/**
	 * @return n, where buffer_element_size=2^n.
	 */
	public static int getElementSizeExponent(Buffer buf) {
		if (buf instanceof ByteBuffer)
			return 0;
		else if (buf instanceof ShortBuffer || buf instanceof CharBuffer)
			return 1;
		else if (buf instanceof FloatBuffer || buf instanceof IntBuffer)
			return 2;
		else if (buf instanceof LongBuffer || buf instanceof DoubleBuffer)
			return 3;
		else
			throw new IllegalStateException("Unsupported buffer type: " + buf);
	}

	/**
	 * A helper function which is used to get the byte offset in an arbitrary buffer
	 * based on its position
	 * @return the position of the buffer, in BYTES
	 */
	public static int getOffset(Buffer buffer) {
		return buffer.position() << getElementSizeExponent(buffer);
	}
}
