package com.cloudwebrtc.webrtc.utils;

import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public interface AnyRendererEvents extends RendererCommon.RendererEvents {
    void onFrameRendered(VideoFrame frame);
}
