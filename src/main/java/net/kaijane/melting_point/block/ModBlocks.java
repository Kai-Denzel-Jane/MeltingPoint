package net.kaijane.melting_point.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kaijane.melting_point.MeltingPoint;
import net.kaijane.melting_point.block.custom.Smeltery;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Register Blocks

    public static final Block SMELTERY = registerBlock("smeltery",
            new Smeltery(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));


    // Block register methods
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MeltingPoint.MOD_ID, name), block);

    }

    // BlockItem register methods
    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MeltingPoint.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Initialize blocks

    public static void registerModBlocks() {

        MeltingPoint.LOGGER.info("Registering ModBlocks for " + MeltingPoint.MOD_ID);

    }



}
