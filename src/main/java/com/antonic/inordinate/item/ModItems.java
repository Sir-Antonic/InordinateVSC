package com.antonic.inordinate.item;

import com.antonic.inordinate.InordinateMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OAK_STICK = registerItem("oak_stick", new Item(new FabricItemSettings()));
    public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Item(new FabricItemSettings()));
    public static final Item BIRCH_STICK = registerItem("birch_stick", new Item(new FabricItemSettings()));
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Item(new FabricItemSettings()));
    public static final Item ACACIA_STICK = registerItem("acacia_stick", new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Item(new FabricItemSettings()));
    public static final Item MANGROVE_STICK = registerItem("mangrove_stick", new Item(new FabricItemSettings()));
    public static final Item CHERRY_STICK = registerItem("cherry_stick", new Item(new FabricItemSettings()));
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Item(new FabricItemSettings()));
    public static final Item WARPED_STICK = registerItem("warped_stick", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(OAK_STICK);
        entries.add(SPRUCE_STICK);
        entries.add(BIRCH_STICK);
        entries.add(JUNGLE_STICK);
        entries.add(ACACIA_STICK);
        entries.add(DARK_OAK_STICK);
        entries.add(MANGROVE_STICK);
        entries.add(CHERRY_STICK);
        entries.add(CRIMSON_STICK);
        entries.add(WARPED_STICK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InordinateMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        InordinateMod.LOGGER.info("Registering Mod Items for " + InordinateMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
