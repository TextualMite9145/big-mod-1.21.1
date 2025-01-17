package net.alex.bigmod;

import net.alex.bigmod.block.ModBlocks;
import net.alex.bigmod.item.ModItems;
import net.alex.bigmod.item.Moditemgroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigMod implements ModInitializer {
	public static final String MOD_ID = "bigmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditemgroups.registeringItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}