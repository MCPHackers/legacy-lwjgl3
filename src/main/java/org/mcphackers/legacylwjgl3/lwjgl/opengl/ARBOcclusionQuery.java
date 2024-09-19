package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.IntBuffer;

public class ARBOcclusionQuery {
    /**
	 * Overloads glGetQueryivARB.
	 * <p>
	 * @deprecated Will be removed in 3.0. Use {@link #glGetQueryiARB} instead. 
	 */
	@Deprecated
	public static int glGetQueryARB(int target, int pname) {
		return org.lwjgl.opengl.ARBOcclusionQuery.glGetQueryiARB(target, pname);
	}

	public static void glGetQueryARB(int target, int pname, IntBuffer params) {
		org.lwjgl.opengl.ARBOcclusionQuery.glGetQueryivARB(target, pname, params);
	}

    public static void glGetQueryObjectARB(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.ARBOcclusionQuery.glGetQueryObjectivARB(target, pname, params);
    }

    public static void glGetQueryObjectuARB(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.ARBOcclusionQuery.glGetQueryObjectuivARB(target, pname, params);
    }
}
