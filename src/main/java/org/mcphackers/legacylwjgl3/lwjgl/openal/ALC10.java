package org.mcphackers.legacylwjgl3.lwjgl.openal;

import java.nio.IntBuffer;

import org.lwjgl.openal.ALCcontext;
import org.lwjgl.openal.ALCdevice;

public final class ALC10 {

	public static String alcGetString(ALCdevice device, int pname) {
		return org.lwjgl.openal.ALC10.alcGetString(device.device, pname);
	}

	public static void alcGetInteger(ALCdevice device, int pname, IntBuffer integerdata) {
		org.lwjgl.openal.ALC10.alcGetIntegerv(device.device, pname, integerdata);
	}

	public static ALCdevice alcOpenDevice(String devicename) {
		long device_address = org.lwjgl.openal.ALC10.alcOpenDevice(devicename);
		return new ALCdevice(device_address);
	}

	public static boolean alcCloseDevice(ALCdevice device) {
		return org.lwjgl.openal.ALC10.alcCloseDevice(device.device);
	}

	public static ALCcontext alcCreateContext(ALCdevice device, IntBuffer attrList) {
		return new ALCcontext(org.lwjgl.openal.ALC10.alcCreateContext(device.device, attrList));
	}

	public static int alcMakeContextCurrent(ALCcontext context) {
		return org.lwjgl.openal.ALC10.alcMakeContextCurrent(context.context) ? 1 : 0;
	}

	public static void alcProcessContext(ALCcontext context) {
		org.lwjgl.openal.ALC10.alcProcessContext(context.context);
	}

	public static ALCcontext alcGetCurrentContext() {
		return new ALCcontext(org.lwjgl.openal.ALC10.alcGetCurrentContext());
	}

	public static ALCdevice alcGetContextsDevice(ALCcontext context) {
		return new ALCdevice(org.lwjgl.openal.ALC10.alcGetContextsDevice(context.context));
	}

	public static void alcSuspendContext(ALCcontext context) {
		org.lwjgl.openal.ALC10.alcSuspendContext(context.context);
	}

	public static void alcDestroyContext(ALCcontext context) {
		org.lwjgl.openal.ALC10.alcDestroyContext(context.context);
	}

	public static int alcGetError(ALCdevice device) {
		return org.lwjgl.openal.ALC10.alcGetError(device.device);
	}

	public static boolean alcIsExtensionPresent(ALCdevice device, String extName) {
		return org.lwjgl.openal.ALC10.alcIsExtensionPresent(device.device, extName);
	}

	public static int alcGetEnumValue(ALCdevice device, String enumName) {
		return org.lwjgl.openal.ALC10.alcGetEnumValue(device.device, enumName);
	}
}
