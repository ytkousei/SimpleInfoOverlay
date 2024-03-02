package io.github.ytkousei.sio.renderer;

import io.github.ytkousei.sio.info.InfoData;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.PlayerListEntry;

public class InfoRenderer {
    MinecraftClient mc;
    InfoData info;

    boolean a = false;

    public InfoRenderer() {
        mc = MinecraftClient.getInstance();
        info = new InfoData();
    }

    public void render(DrawContext drawContext) {
        var infoList = info.GetInfo(mc);

        TextRenderer renderer = mc.textRenderer;

        if(!infoList.isEmpty()) {
            for (var i = 0; i < infoList.size(); i++ ){
                drawContext.drawText(renderer, infoList.get(i), 2, 2+i*10, 0xffffff, false);
            }

            a = !a;
        }
    }
}
