/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
  Part of the Processing project - http://processing.org

  Copyright (c) 2016-19 The Processing Foundation

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation, version 2.1.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
*/

package processing.vr;

import android.view.SurfaceHolder;
import processing.android.AppComponent;
import processing.core.PSurface;

public class VRGraphicsStereo extends VRGraphics {
  @Override
  public PSurface createSurface(AppComponent component, SurfaceHolder holder, boolean reset) {  // ignore
    if (reset) pgl.resetFBOLayer();
    return new VRSurface(this, component, holder, true);
  }
}
