package net.kaijane.melting_point;

import net.fabricmc.api.ClientModInitializer;
import net.kaijane.melting_point.screen.ModScreenHandlers;
import net.kaijane.melting_point.screen.SmelteryScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class MeltingPointClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.SMELTERY_SCREEN_HANDLER, SmelteryScreen::new);

    }
}
