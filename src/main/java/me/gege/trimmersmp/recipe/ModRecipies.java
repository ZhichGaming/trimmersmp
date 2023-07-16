package me.gege.trimmersmp.recipe;

import me.gege.trimmersmp.TrimmerSmp;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipies {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TrimmerSmp.MOD_ID, CrystalCompressorRecipe.Serializer.ID),
                CrystalCompressorRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(TrimmerSmp.MOD_ID, CrystalCompressorRecipe.Type.ID),
                CrystalCompressorRecipe.Type.INSTANCE);
    }
}
