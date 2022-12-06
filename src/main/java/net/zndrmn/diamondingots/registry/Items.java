package net.zndrmn.diamondingots.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zndrmn.diamondingots.DiamondIngots;

public class Items {


    // public static final Item DIAMOND_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Item DIAMOND_INGOT = registerItem("diamond_ingot", new Item((new Item.Settings())));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item((new Item.Settings())));



    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(DiamondIngots.MOD_ID, name), item);

    }

    public static void registerItems() {

    }
}
