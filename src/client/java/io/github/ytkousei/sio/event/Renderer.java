package io.github.ytkousei.sio.event;

import io.github.ytkousei.sio.renderer.InfoRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class Renderer {
    InfoRenderer infoRenderer = new InfoRenderer();

    public void InitEvent() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            infoRenderer.render(drawContext);
        });
    }
}
