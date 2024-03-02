package io.github.ytkousei.sio.info;

import io.github.ytkousei.sio.config.Config;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class InfoData {
    public List<String> GetInfo(MinecraftClient mc) {
        List<String> infoList = new ArrayList<String>();

        if(mc.player != null ) {
            PlayerListEntry info = mc.player.networkHandler.getPlayerListEntry(mc.player.getUuid());
            DecimalFormat fmt = new DecimalFormat();
            fmt.setMaximumFractionDigits(2);

            String x = String.format("%.02f", mc.player.getX());
            String y = String.format("%.02f", mc.player.getY());
            String z = String.format("%.02f", mc.player.getZ());
            String ping = info.getLatency() + "";
            String fps = mc.getCurrentFps() + "";

            for (String s : Config.infoFmt) {
                s = s.replace("%x", x);
                s = s.replace("%y", y);
                s = s.replace("%z", z);
                s = s.replace("%ping", ping);
                s = s.replace("%fps", fps);
                infoList.add(s);
            }
        }

        return infoList;
    }
}
