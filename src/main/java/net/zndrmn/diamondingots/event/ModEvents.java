package net.zndrmn.diamondingots.event;

import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zndrmn.diamondingots.DiamondIngots;

@Mod.EventBusSubscriber(modid = DiamondIngots.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

    }
}
