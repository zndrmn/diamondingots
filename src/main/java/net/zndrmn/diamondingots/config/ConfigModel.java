package net.zndrmn.diamondingots.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.ExcludeFromScreen;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Nest;
import net.zndrmn.diamondingots.DiamondIngots;
import net.zndrmn.diamondingots.config.options.OptionsLootTables;

@Modmenu(modId = "diamondingots")
@Config(name = "diamondingots", wrapperName = "ConfigBuilder")
public class ConfigModel {

        @ExcludeFromScreen
        public int config_version = DiamondIngots.CONFIG_VERSION;
        @Nest
        @Comment("──────────────\ndefault values\nrnd: 0.78\nmin: 1\nmax: 3")
        public OptionsLootTables diamond_ore = new OptionsLootTables(0.78f, 1, 3);

        @Nest
        @Comment("──────────────\ndefault values\nrnd: 0.52\nmin: 1\nmax: 5")
        public OptionsLootTables deepslate_diamond_ore = new OptionsLootTables(0.52f, 1, 5);


}
