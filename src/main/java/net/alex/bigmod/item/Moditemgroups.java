package net.alex.bigmod.item;

import net.alex.bigmod.BigMod;
import net.alex.bigmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Moditemgroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BigMod.MOD_ID,"pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.bigmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PINK_APPLE);
                        entries.add(ModItems.REFINED_PINK_GARNET);
                        entries.add(ModItems.STARLIGHT_ASHES);

                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BigMod.MOD_ID,"pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.Pink_Garnet_Block))
                    .displayName(Text.translatable("itemgroup.bigmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.Pink_Garnet_Block);
                        entries.add(ModBlocks.Raw_Pink_Garnet_Block);

                        entries.add(ModBlocks.Pink_Garnet_Ore);
                        entries.add(ModBlocks.Pink_Garnet_Deepslate_Ore);

                    }).build());




    public static void registeringItemGroups() {
        BigMod.LOGGER.info("Registering Item Groups for " + BigMod.MOD_ID);
    }
}
