package net.kaijane.melting_point.recipe;

import net.kaijane.melting_point.MeltingPoint;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MeltingPoint.MOD_ID, SmelteryRecipe.Serializer.ID),
                SmelteryRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MeltingPoint.MOD_ID, SmelteryRecipe.Type.ID),
                SmelteryRecipe.Type.INSTANCE);
    }
}