package net.zndrmn.diamondingots.registry;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class Events {
    public static void registerEvents() {
        villagerTrades();
    }

    private static void villagerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(net.zndrmn.diamondingots.registry.Items.DIAMOND_INGOT, 1),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            12,2,0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(net.zndrmn.diamondingots.registry.Items.DIAMOND_INGOT, 1),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            12,2,0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(net.zndrmn.diamondingots.registry.Items.DIAMOND_INGOT, 1),
                            new ItemStack(net.minecraft.item.Items.EMERALD, 1),
                            12,2,0.05f));
                });
    }
}
