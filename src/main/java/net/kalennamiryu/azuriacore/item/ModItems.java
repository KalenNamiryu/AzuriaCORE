package net.kalennamiryu.azuriacore.item;

import net.kalennamiryu.azuriacore.AzuriaCore;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AzuriaCore.MOD_ID);

    // ---------- ITEMS ----------

    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(100)
                    .tab(ModCreativeModeTab.ECONOMY_TAB)
            ));

    public static final RegistryObject<Item> AZURIA_TOKEN = ITEMS.register("azuria_token",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .tab(ModCreativeModeTab.CORE_TAB)
            ));

    public static final RegistryObject<Item> REINFORCED_LEATHER = ITEMS.register("reinforced_leather",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .tab(ModCreativeModeTab.CORE_TAB)
            ));


    // ---------- CUSTOM ITEMS ----------

    public static final RegistryObject<Item> LEATHER_PURSE = ITEMS.register("leather_purse",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.COMMON)
                    .stacksTo(1)
                    .tab(ModCreativeModeTab.ECONOMY_TAB)
            ));

    public static final RegistryObject<Item> GREAT_LEATHER_PURSE = ITEMS.register("great_leather_purse",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(1)
                    .tab(ModCreativeModeTab.ECONOMY_TAB)
            ));

    public static final RegistryObject<Item> ENCHANTDED_LEATHER_PURSE = ITEMS.register("enchanted_leather_purse",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
                    .tab(ModCreativeModeTab.ECONOMY_TAB)
            ));

    public static final RegistryObject<Item> BOTTOMLESS_PURSE = ITEMS.register("bottomless_purse",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(1)
                    .tab(ModCreativeModeTab.ECONOMY_TAB)
            ));


    // ---------- METHODS ----------

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
