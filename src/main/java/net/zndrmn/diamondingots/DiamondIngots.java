package net.zndrmn.diamondingots;

import net.fabricmc.api.ModInitializer;
import net.zndrmn.diamondingots.config.ConfigBuilder;
import net.zndrmn.diamondingots.config.ConfigLootTables;
import net.zndrmn.diamondingots.registry.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiamondIngots implements ModInitializer {

	public static final String MOD_ID = "diamondingots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ConfigBuilder CONFIG = ConfigBuilder.createAndLoad();



	@Override
	public void onInitialize() {

		Items.registerItems();
		ConfigLootTables.modifyLootTables();

	}
}
