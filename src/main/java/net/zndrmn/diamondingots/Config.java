package net.zndrmn.diamondingots;

import com.google.common.base.CaseFormat;
import de.siphalor.tweed4.annotated.AConfigBackground;
import de.siphalor.tweed4.annotated.AConfigConstraint;
import de.siphalor.tweed4.annotated.AConfigEntry;
import de.siphalor.tweed4.annotated.ATweedConfig;
import de.siphalor.tweed4.config.ConfigEnvironment;
import de.siphalor.tweed4.config.ConfigScope;
import de.siphalor.tweed4.config.constraints.RangeConstraint;

@ATweedConfig(environment = ConfigEnvironment.UNIVERSAL, scope = ConfigScope.DEFAULT, tailors = "tweed4:coat", casing = CaseFormat.LOWER_HYPHEN)
@AConfigBackground("textures/block/diamond_block.png")
public class Config {
    @AConfigEntry(comment = "General configuration\n-------------------------------------------\nConfigs do nothing because I don't know how\n      to have it read / write to the       \n       diamond_ore.json loot-table         \n      (Im fairly new to Java coding)       \n\n You can make a pull request if you have   \n        a solution to my problem           \n https://github.com/zndrmn/diamondingots   \n-------------------------------------------")
    public static diamondore diamondOre = new diamondore();

    @AConfigBackground("textures/block/acacia_log.png")
    public static class diamondore {
        @AConfigEntry(
                comment = "Min / Max number of diamond shard drops\n---------------------------------------",
                constraints = @AConfigConstraint(value = RangeConstraint.class, param = "0..16")
        )
        public int minDiamondShards = 0;
        @AConfigEntry(
                constraints = @AConfigConstraint(value = RangeConstraint.class, param = "0..16")
        )
        public int maxDiamondShards = 3;
    }
    @AConfigEntry
    public static deepslatediamondore deepslateDiamondOre = new deepslatediamondore();

    @AConfigBackground("textures/block/acacia_log.png")
    public static class deepslatediamondore {
        @AConfigEntry(
                comment = "Min / Max number of diamond shard drops\n---------------------------------------",
                constraints = @AConfigConstraint(value = RangeConstraint.class, param = "0..16")
        )
        public int minDiamondShards = 0;
        @AConfigEntry(
                constraints = @AConfigConstraint(value = RangeConstraint.class, param = "0..16")
        )
        public int maxDiamondShards = 4;
    }
}