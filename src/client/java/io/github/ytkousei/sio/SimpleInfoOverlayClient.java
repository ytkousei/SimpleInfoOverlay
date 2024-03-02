package io.github.ytkousei.sio;

import io.github.ytkousei.sio.config.Config;
import io.github.ytkousei.sio.event.Renderer;
import net.fabricmc.api.ClientModInitializer;


public class SimpleInfoOverlayClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Config.GetConfig();
		new Renderer().InitEvent();
	}
}