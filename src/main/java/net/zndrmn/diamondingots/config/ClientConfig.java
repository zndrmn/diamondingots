package net.zndrmn.diamondingots.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Config for Diamond Ingots");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
