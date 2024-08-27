package org.lwjgl.opengl;

import org.lwjgl.LWJGLException;
import org.lwjgl.PointerBuffer;

public final class SharedDrawable implements Drawable {

	public SharedDrawable(final Drawable drawable) throws LWJGLException {
	}

	public boolean isCurrent() throws LWJGLException {
        return false;
    }

	public void makeCurrent() throws LWJGLException {}

	public void releaseContext() throws LWJGLException {}

	public void destroy() {}

	public void setCLSharingProperties(PointerBuffer properties) throws LWJGLException {}

}
