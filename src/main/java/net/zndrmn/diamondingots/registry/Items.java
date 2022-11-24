package net.zndrmn.diamondingots.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zndrmn.diamondingots.DiamondIngots;

public class Items {

    public static final Item DIAMOND_INGOT = registerItem("diamond_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DiamondIngots.MOD_ID, name), item);
    }



    public static void registerItems() {
        DiamondIngots.LOGGER.info("Registering " + DiamondIngots.MOD_ID);
    }

}
