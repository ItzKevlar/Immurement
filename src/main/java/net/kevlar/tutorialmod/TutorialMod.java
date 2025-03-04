package net.kevlar.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.kevlar.tutorialmod.block.ModBlocks;
import net.kevlar.tutorialmod.item.ModItemGroups;
import net.kevlar.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("I KNOW WHAT YOU ARE !!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}