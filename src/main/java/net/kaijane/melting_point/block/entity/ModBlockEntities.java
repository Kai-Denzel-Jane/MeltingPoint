package net.kaijane.melting_point.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.kaijane.melting_point.MeltingPoint;
import net.kaijane.melting_point.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SmelteryBlockEntity> SMELTERY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MeltingPoint.MOD_ID, "smeltery_be"),
                    FabricBlockEntityTypeBuilder.create(SmelteryBlockEntity::new, ModBlocks.SMELTERY).build());


    public static void registerModBlockEntities() {
        MeltingPoint.LOGGER.info("Registering ModBlockEntities for " + MeltingPoint.MOD_ID);
    }
}
