package net.zndrmn.diamondingots.config;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.zndrmn.diamondingots.DiamondIngots;
import net.zndrmn.diamondingots.registry.Items;

public class ConfigLootTables {

    private static final Identifier DIAMOND_ORE = new Identifier("minecraft", "blocks/diamond_ore");
    private static final Identifier DEEPSLATE_DIAMOND_ORE = new Identifier("minecraft", "blocks/deepslate_diamond_ore");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // Adds new loot-table on-top of what already exists

            if (DIAMOND_ORE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(DiamondIngots.CONFIG.rndDiamondOre()))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(DiamondIngots.CONFIG.minDiamondOre(), DiamondIngots.CONFIG.maxDiamondOre())).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if (DEEPSLATE_DIAMOND_ORE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(DiamondIngots.CONFIG.rndDeepslateDiamondOre()))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(DiamondIngots.CONFIG.minDeepslateDiamondOre(), DiamondIngots.CONFIG.maxDeepslateDiamondOre())).build());
                tableBuilder.pool(poolBuilder.build());
            }



        });



    }
}
