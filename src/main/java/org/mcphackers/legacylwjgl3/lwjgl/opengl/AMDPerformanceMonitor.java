package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.IntBuffer;

import org.lwjgl.BufferUtils;

public class AMDPerformanceMonitor {
	// public static String glGetPerfMonitorGroupStringAMD(int group, int bufSize) {
	// 	IntBuffer counterString = BufferUtils.createIntBuffer(bufSize);
    //     org.lwjgl.opengl.AMDPerformanceMonitor.nglGetPerfMonitorGroupStringAMD(group, bufSize, memAddress(counterString));
	// 	byte[] b = new byte[counterString.remaining()];
    //     return new String(b);
	// }

	// public static String glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize) {
	// 	IntBuffer counterString = BufferUtils.createIntBuffer(bufSize);
    //     org.lwjgl.opengl.AMDPerformanceMonitor.nglGetPerfMonitorCounterStringAMD(group, counter, bufSize, memAddress(counterString));
	// 	byte[] b = new byte[counterString.remaining()];
    //     return new String(b);
	// }
    
    public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int counter) {
		IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        intBuffer.put(counter);
		org.lwjgl.opengl.AMDPerformanceMonitor.glSelectPerfMonitorCountersAMD(monitor, enable, group, intBuffer);
	}
}
