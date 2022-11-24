package net.zndrmn.diamondingots.config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "diamondingots")
@Config(name = "diamondingots", wrapperName = "ConfigBuilder")
public class ConfigModel {

        @Comment("\"diamond_ore\" loot-table\n──────────────\ndefault values\nrnd: 0.50\nmin: 1\nmax: 2")
        public float rndDiamondOre = 0.50f;
        public int minDiamondOre = 1;
        public int maxDiamondOre = 2;

        @Comment("\"deepslate_diamond_ore\" loot-table\n──────────────\ndefault values\nrnd: 0.85\nmin: 1\nmax: 4")
        public float rndDeepslateDiamondOre = 0.85f;
        public int minDeepslateDiamondOre = 1;
        public int maxDeepslateDiamondOre = 4;

}
