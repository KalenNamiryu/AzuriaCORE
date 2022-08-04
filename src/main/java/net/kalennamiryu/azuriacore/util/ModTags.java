package net.kalennamiryu.azuriacore.util;

import net.kalennamiryu.azuriacore.AzuriaCore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

// This class come from Kaupenjoe 1.18 tutorial under MIT License, link in the CREDITS.txt
public class ModTags {
    public static class Blocks {

        // ADD BLOCKS TAGS HERE

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AzuriaCore.MOD_ID, name));
        }

        public static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }
    public static class Items {

        // ADD ITEMS TAGS HERE

        public static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AzuriaCore.MOD_ID, name));
        }

        public static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
