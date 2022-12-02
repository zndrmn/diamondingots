package net.zndrmn.diamondingots.config;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.zndrmn.diamondingots.DiamondIngots;
import net.zndrmn.diamondingots.registry.Items;

import static net.minecraft.enchantment.Enchantments.FORTUNE;

public class ConfigLootTables {

    /*  Minecraft Loot-Tables
        This class is used for modifying "minecraft" loot-tables

        Block Loot Tables
        minecraft loot_tables/blocks/

        Chest Loot Tables
        minecraft loot_tables/chests/

        Village Loot Tables
        minecraft loot_tables/chests/village/

        Gameplay Loot Tables
        minecraft loot_tables/gameplay/
     */

    private static final Identifier DIAMOND_ORE = new Identifier("minecraft", "blocks/diamond_ore");
    private static final Identifier DEEPSLATE_DIAMOND_ORE = new Identifier("minecraft", "blocks/deepslate_diamond_ore");

    private static final Identifier ABANDONED_MINESHAFT = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BASTION_TREASURE = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier JUNGLE_TEMPLE = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier SHIPWRECK_TREASURE = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier STRONGHOLD_CORRIDOR = new Identifier("minecraft", "chests/stronghold_corridor");

    private static final Identifier VILLAGE_TOOLSMITH = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH = new Identifier("minecraft", "chests/village/village_weaponsmith");

    private static final Identifier CAT_MORNING_GIFT = new Identifier("minecraft", "gameplay/cat_morning_gift");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if (DIAMOND_ORE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(DiamondIngots.CONFIG.diamond_ore.rndPercentage()))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(DiamondIngots.CONFIG.diamond_ore.minStackSize(), DiamondIngots.CONFIG.diamond_ore.maxStackSize())).build())
                        .apply(ApplyBonusLootFunction.uniformBonusCount(FORTUNE, DiamondIngots.CONFIG.diamond_ore.fortuneBonus()));
                tableBuilder.pool(poolBuilder.build());
            }
            if (DEEPSLATE_DIAMOND_ORE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(DiamondIngots.CONFIG.deepslate_diamond_ore.rndPercentage()))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(DiamondIngots.CONFIG.deepslate_diamond_ore.minStackSize(), DiamondIngots.CONFIG.deepslate_diamond_ore.maxStackSize())).build())
                        .apply(ApplyBonusLootFunction.uniformBonusCount(FORTUNE, DiamondIngots.CONFIG.diamond_ore.fortuneBonus()));
                tableBuilder.pool(poolBuilder.build());
            }



            if (ABANDONED_MINESHAFT.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (ABANDONED_MINESHAFT.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,2)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,11)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (BASTION_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2,6)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (BURIED_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.54f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (BURIED_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.60f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,2)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_PYRAMID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.04f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (DESERT_PYRAMID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.06f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.16f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,11)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (END_CITY_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.21f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2,7)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNGLE_TEMPLE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (JUNGLE_TEMPLE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (NETHER_BRIDGE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.19f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,2)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (SHIPWRECK_TREASURE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.04f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (STRONGHOLD_CORRIDOR.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }



            if (VILLAGE_TOOLSMITH.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,5)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (VILLAGE_WEAPONSMITH.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(ItemEntry.builder(Items.DIAMOND_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,3)).build());
                tableBuilder.pool(poolBuilder.build());
            }



            if (CAT_MORNING_GIFT.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(Items.DIAMOND_SHARD))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
