package org.mcphackers.legacylwjgl3.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

// org/lwjgl/opengl/GL45.glGetTransformFeedback(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetTransformFeedback(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetTransformFeedback(IIILjava/nio/LongBuffer;)V
// org/lwjgl/opengl/GL45.glNamedBufferStorage(ILjava/nio/LongBuffer;I)V
// org/lwjgl/opengl/GL45.glGetNamedBufferParameter(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetNamedBufferParameter(IILjava/nio/LongBuffer;)V
// org/lwjgl/opengl/GL45.glGetNamedBufferPointer(II)Ljava/nio/ByteBuffer;
// org/lwjgl/opengl/GL45.glClearNamedFramebuffer(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glClearNamedFramebufferu(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glClearNamedFramebuffer(IIILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL45.glClearNamedFramebufferfi(IIFI)V
// org/lwjgl/opengl/GL45.glGetNamedFramebufferParameter(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetNamedFramebufferParameter(II)I
// org/lwjgl/opengl/GL45.glGetNamedFramebufferAttachmentParameter(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetNamedFramebufferAttachmentParameter(III)I
// org/lwjgl/opengl/GL45.glGetNamedRenderbufferParameter(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetNamedRenderbufferParameter(II)I
// org/lwjgl/opengl/GL45.glCompressedTextureSubImage3D(IIIIIIIIIILjava/nio/ByteBuffer;)V
// org/lwjgl/opengl/GL45.glTextureParameter(IILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL45.glTextureParameterI(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glTextureParameterIu(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glTextureParameter(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetCompressedTextureImage(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetCompressedTextureImage(IILjava/nio/ShortBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureLevelParameter(IIILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureLevelParameter(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureParameter(IILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureParameterI(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureParameterIu(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetTextureParameter(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glVertexArrayVertexBuffers(IIILjava/nio/IntBuffer;Lorg/lwjgl/PointerBuffer;Ljava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetVertexArray(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetVertexArray(II)I
// org/lwjgl/opengl/GL45.glGetVertexArrayIndexed(IIILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetVertexArrayIndexed(III)I
// org/lwjgl/opengl/GL45.glGetVertexArrayIndexed64i(IIILjava/nio/LongBuffer;)V
// org/lwjgl/opengl/GL45.glReadnPixels(IIIIIILjava/nio/DoubleBuffer;)V
// org/lwjgl/opengl/GL45.glGetnUniform(IILjava/nio/FloatBuffer;)V
// org/lwjgl/opengl/GL45.glGetnUniform(IILjava/nio/IntBuffer;)V
// org/lwjgl/opengl/GL45.glGetnUniformu(IILjava/nio/IntBuffer;)V

public class GL45 {

    public static void glGetTransformFeedback(int xfb, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbackiv(xfb, pname, param);
    }

    public static void glGetTransformFeedback(int xfb, int pname, int index, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    public static void glGetTransformFeedback(int xfb, int pname, int index, LongBuffer param) {
        org.lwjgl.opengl.GL45.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    public static void glGetNamedBufferParameter(int buffer, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    public static void glGetNamedBufferParameter(int buffer, int pname, LongBuffer params) {
        org.lwjgl.opengl.GL45.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    public static void glClearNamedFramebuffer(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    public static void glClearNamedFramebufferu(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    public static void glClearNamedFramebufferu(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) {
        org.lwjgl.opengl.GL45.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    public static void glGetNamedFramebufferParameter(int buffer, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteriv(buffer, pname, param);
    }

    public static int glGetNamedFramebufferParameter(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferParameteri(buffer, pname);
    }

    public static void glGetNamedFramebufferAttachmentParameter(int buffer, int attachment, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteriv(buffer, attachment, pname, param);
    }

    public static int glGetNamedFramebufferAttachmentParameter(int buffer, int attachment, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedFramebufferAttachmentParameteri(buffer, attachment, pname);
    }

    public static void glGetNamedRenderbufferParameter(int buffer, int pname, IntBuffer param) {
        org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteriv(buffer, pname, param);
    }

    public static int glGetNamedRenderbufferParameter(int buffer, int pname) {
        return org.lwjgl.opengl.GL45.glGetNamedRenderbufferParameteri(buffer, pname);
    }
}
