package net.kaijane.melting_point.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.kaijane.melting_point.MeltingPoint;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<SmelteryScreenHandler> SMELTERY_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(MeltingPoint.MOD_ID, "smeltery"),
                    new ExtendedScreenHandlerType<>(SmelteryScreenHandler::new));

    public static void registerScreenHandlers() {
        MeltingPoint.LOGGER.info("Registering Screen Handlers for " + MeltingPoint.MOD_ID);
    }
}