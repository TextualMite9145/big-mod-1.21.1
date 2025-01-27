package net.alex.bigmod;

import net.alex.bigmod.block.ModBlocks;
import net.alex.bigmod.item.ModItems;
import net.alex.bigmod.item.Moditemgroups;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigMod implements ModInitializer {
	public static final String MOD_ID = "bigmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<PlacedFeature> CUSTOM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("bigmod","ore_pink_garnet_ore"));

	@Override
	public void onInitialize() {
		Moditemgroups.registeringItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, CUSTOM_ORE_PLACED_KEY);

	}
}