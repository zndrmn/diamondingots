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

	public static final int CONFIG_VERSION = 1;
	public static final ConfigBuilder CONFIG = ConfigBuilder.createAndLoad();

	@Override
	public void onInitialize() {

		Items.registerItems();
		ConfigLootTables.modifyLootTables();

		if (CONFIG.config_version() < CONFIG_VERSION) {
			LOGGER.error("The config version is outdated! Please delete or change the config version.");
		}
	}
}
