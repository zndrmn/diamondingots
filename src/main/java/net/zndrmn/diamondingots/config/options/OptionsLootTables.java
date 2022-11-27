package net.zndrmn.diamondingots.config.options;

import io.wispforest.owo.config.annotation.RangeConstraint;
import io.wispforest.owo.config.annotation.RestartRequired;

public class OptionsLootTables {

    @RangeConstraint(min = 0.0, max = 1.00)
    @RestartRequired
    public float rndPercentage;

    @RangeConstraint(min = 0, max = 64)
    @RestartRequired
    public int minStackSize;

    @RangeConstraint(min = 0, max = 64)
    @RestartRequired
    public int maxStackSize;

    public OptionsLootTables(float rndPercentage, int minStackSize, int maxStackSize) {
        this.rndPercentage = rndPercentage;
        this.minStackSize = minStackSize;
        this.maxStackSize = maxStackSize;

    }

}
