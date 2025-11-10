package net.kawws.kawwsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kawws.kawwsmod.KawwsMod;
import net.kawws.kawwsmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KAWWS_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KawwsMod.MOD_ID, "kawws_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.kawwsmod.kawws_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PINK_GARNET);
                    }).build());


        public static final ItemGroup KAWWS_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(KawwsMod.MOD_ID, "kawws_mod_blocks"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                        .displayName(Text.translatable("itemgroup.kawwsmod.kawws_mod_blocks"))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                            entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        }).build());

    public static void registerItemGroups() {
        KawwsMod.LOGGER.info("Registering Item Groups for " + KawwsMod.MOD_ID);
    }


    }

