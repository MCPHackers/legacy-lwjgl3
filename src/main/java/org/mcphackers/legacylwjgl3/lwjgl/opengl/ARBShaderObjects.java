package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class ARBShaderObjects {

    public static void glShaderSourceARB(int shader, ByteBuffer string) {
		byte[] b = new byte[string.remaining()];
		string.get(b);
		org.lwjgl.opengl.ARBShaderObjects.glShaderSourceARB(shader, new String(b));
    }

	public static void glUniform1ARB(int location, FloatBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform1fvARB(location, value);
	}

	public static void glUniform2ARB(int location, FloatBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform2fvARB(location, value);
	}

	public static void glUniform3ARB(int location, FloatBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform3fvARB(location, value);
	}

	public static void glUniform4ARB(int location, FloatBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform4fvARB(location, value);
	}

	public static void glUniform1ARB(int location, IntBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform1ivARB(location, value);
	}

	public static void glUniform2ARB(int location, IntBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform2ivARB(location, value);
	}

	public static void glUniform3ARB(int location, IntBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform3ivARB(location, value);
	}

	public static void glUniform4ARB(int location, IntBuffer value) {
		org.lwjgl.opengl.ARBShaderObjects.glUniform4ivARB(location, value);
	}

	public static void glUniformMatrix2ARB(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix2fvARB(location, transpose, value);
    }

	public static void glUniformMatrix3ARB(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix3fvARB(location, transpose, value);
    }

	public static void glUniformMatrix4ARB(int location, boolean transpose, FloatBuffer value) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix4fvARB(location, transpose, value);
    }
    
    public static void glGetObjectParameterARB(int obj, int pname, FloatBuffer params) {
        org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameterfvARB(obj, pname, params);
    }
    
    // public static float glGetObjectParameterARB(int obj, int pname) {
    //     FloatBuffer params = BufferUtils.createFloatBuffer(1);
    //     org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameterfvARB(obj, pname, params);
    //     return params.get(0);
    // }

    public static void glGetObjectParameterARB(int obj, int pname, IntBuffer params) {
        org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameterivARB(obj, pname, params);
    }

	public static void glGetUniformARB(int program, int location, FloatBuffer params) {
		org.lwjgl.opengl.ARBShaderObjects.glGetUniformfvARB(program, location, params);
    }

	public static void glGetUniformARB(int program, int location, IntBuffer params) {
		org.lwjgl.opengl.ARBShaderObjects.glGetUniformivARB(program, location, params);
    }
}
