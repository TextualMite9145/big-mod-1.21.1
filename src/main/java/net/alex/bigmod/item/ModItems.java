package net.alex.bigmod.item;

import net.alex.bigmod.BigMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item PINK_APPLE = registerItem("pink_apple", new Item(new Item.Settings().food(ModFoodComponents.PINK_APPLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BigMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BigMod.LOGGER.info("Registering Mod Items for " + BigMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(PINK_GARNET);
           entries.add(RAW_PINK_GARNET);
        });
    }
}