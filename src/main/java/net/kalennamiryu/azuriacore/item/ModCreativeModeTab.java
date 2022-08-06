package net.kalennamiryu.azuriacore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CORE_TAB = new CreativeModeTab("core_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AZURIA_TOKEN.get()); // tab icon
        }
    };

    public static final CreativeModeTab ECONOMY_TAB = new CreativeModeTab("economy_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER_COIN.get()); // tab icon
        }
    };
}
