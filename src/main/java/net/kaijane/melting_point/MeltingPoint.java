package net.kaijane.melting_point;

import net.fabricmc.api.ModInitializer;

import net.kaijane.melting_point.block.ModBlocks;
import net.kaijane.melting_point.block.entity.ModBlockEntities;
import net.kaijane.melting_point.recipe.ModRecipes;
import net.kaijane.melting_point.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeltingPoint implements ModInitializer {

	public static final String MOD_ID = "melting_point";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerModBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();

		LOGGER.info(MOD_ID + " initialized");
	}
}