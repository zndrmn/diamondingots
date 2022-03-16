package net.zndrmn.diamondingots;

import net.fabricmc.api.ModInitializer;
import net.zndrmn.diamondingots.registry.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondIngots implements ModInitializer {

	public static final String MOD_ID = "diamondingots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Items.registerItems();

	}
}
