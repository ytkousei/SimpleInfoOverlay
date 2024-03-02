package io.github.ytkousei.sio.config;

import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Config {
    public static List<String> infoFmt = new ArrayList<>();

    public static void GetConfig() {
        try {
            var infoFmtPath = FabricLoader.getInstance().getConfigDir().resolve("info-fmt.txt");
            infoFmt = Files.readAllLines(infoFmtPath, StandardCharsets.UTF_8);
        } catch (IOException ex) {}
    }
}
