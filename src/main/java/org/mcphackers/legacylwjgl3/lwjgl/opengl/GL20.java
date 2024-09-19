package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

// org/lwjgl/opengl/GL20.glUniform1(ILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniform2(ILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniform3(ILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniform4(ILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniform1(ILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glUniform2(ILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glUniform3(ILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glUniform4(ILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glUniformMatrix2(IZLjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniformMatrix3(IZLjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glUniformMatrix4(IZLjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glGetShader(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glGetShader(II)I
// org/lwjgl/opengl/GL20.glGetProgram(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glGetProgram(II)I
// org/lwjgl/opengl/GL20.glGetActiveUniform(IIILjava/nio/IntBuffer;)Ljava/lang/String;
// org/lwjgl/opengl/GL20.glGetActiveUniform(III)Ljava/lang/String;
// org/lwjgl/opengl/GL20.glGetActiveUniformSize(II)I
// org/lwjgl/opengl/GL20.glGetActiveUniformType(II)I
// org/lwjgl/opengl/GL20.glGetUniform(IILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glGetUniform(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glVertexAttribPointer(IIZILjava/nio/DoubleBuffer;)V
// org/lwjgl/opengl/GL20.glVertexAttribPointer(IIZILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glVertexAttribPointer(IIZZILjava/nio/ByteBuffer;)V
// org/lwjgl/opengl/GL20.glVertexAttribPointer(IIZZILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glVertexAttribPointer(IIZZILjava/nio/ShortBuffer;)V
// org/lwjgl/opengl/GL20.glGetVertexAttrib(IILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL20.glGetVertexAttrib(IILjava/nio/DoubleBuffer;)V
// org/lwjgl/opengl/GL20.glGetVertexAttrib(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL20.glGetVertexAttribPointer(IIJ)Ljava/nio/ByteBuffer;
// org/lwjgl/opengl/GL20.glGetVertexAttribPointer(IILjava/nio/ByteBuffer;)V
// org/lwjgl/opengl/GL20.glGetActiveAttrib(IIILjava/nio/IntBuffer;)Ljava/lang/String;
// org/lwjgl/opengl/GL20.glGetActiveAttrib(III)Ljava/lang/String;
// org/lwjgl/opengl/GL20.glGetActiveAttribSize(II)I
// org/lwjgl/opengl/GL20.glGetActiveAttribType(II)I

public class GL20 {
	public static void glShaderSource(int shader, ByteBuffer string) {
		byte[] b = new byte[string.remaining()];
		string.get(b);
		org.lwjgl.opengl.GL20.glShaderSource(shader, new String(b));
	}

	public static void glUniform1(int location, FloatBuffer value) {
		org.lwjgl.opengl.GL20.glUniform1fv(location, value);
	}

	public static void glUniform2(int location, FloatBuffer value) {
		org.lwjgl.opengl.GL20.glUniform2fv(location, value);
	}

	public static void glUniform3(int location, FloatBuffer value) {
		org.lwjgl.opengl.GL20.glUniform3fv(location, value);
	}

	public static void glUniform4(int location, FloatBuffer value) {
		org.lwjgl.opengl.GL20.glUniform4fv(location, value);
	}

	public static void glUniform1(int location, IntBuffer value) {
		org.lwjgl.opengl.GL20.glUniform1iv(location, value);
	}

	public static void glUniform2(int location, IntBuffer value) {
		org.lwjgl.opengl.GL20.glUniform2iv(location, value);
	}

	public static void glUniform3(int location, IntBuffer value) {
		org.lwjgl.opengl.GL20.glUniform3iv(location, value);
	}

	public static void glUniform4(int location, IntBuffer value) {
		org.lwjgl.opengl.GL20.glUniform4iv(location, value);
	}

	public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, value);
    }

	public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, value);
    }

	public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, value);
    }

	public static void glGetShader(int shader, int pname, IntBuffer params) {
		org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

	public static int glGetShader(int shader, int pname) {
		return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

	public static void glGetProgram(int shader, int pname, IntBuffer params) {
		org.lwjgl.opengl.GL20.glGetProgramiv(shader, pname, params);
    }

	public static int glGetProgram(int shader, int pname) {
		return org.lwjgl.opengl.GL20.glGetProgrami(shader, pname);
    }

	public static void glGetUniform(int program, int location, FloatBuffer params) {
		org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

	public static void glGetUniform(int program, int location, IntBuffer params) {
		org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }
}
