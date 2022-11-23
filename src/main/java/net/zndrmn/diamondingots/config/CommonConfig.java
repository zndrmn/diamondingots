package net.zndrmn.diamondingots.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_ORE_SHARD_DROPS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPLSATE_DIAMOND_ORE_SHARD_DROPS;

    static  {
        BUILDER.push("Config for Diamond Ingots");

        DIAMOND_ORE_SHARD_DROPS = BUILDER.comment("How Many Drops")
                .defineInRange("Drops Per Diamond Ore", 1-3, 1, 3);
        DEEPLSATE_DIAMOND_ORE_SHARD_DROPS = BUILDER.comment("How Many Drops")
                .defineInRange("Drops Per Deepslate Diamond Ore", 0-4, 0, 4);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
