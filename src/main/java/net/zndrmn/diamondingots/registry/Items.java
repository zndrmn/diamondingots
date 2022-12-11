package net.zndrmn.diamondingots.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zndrmn.diamondingots.DiamondIngots;



public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiamondIngots.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_INGOT = ITEMS.register("diamond_ingot",
            () -> new Item(new Item.Properties() ));
    public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));
    }

}

