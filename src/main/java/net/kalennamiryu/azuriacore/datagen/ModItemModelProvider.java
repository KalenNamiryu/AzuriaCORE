package net.kalennamiryu.azuriacore.datagen;

import net.kalennamiryu.azuriacore.AzuriaCore;
import net.kalennamiryu.azuriacore.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

// This class come from Kaupenjoe 1.18 tutorial under MIT License, link in the CREDITS.txt
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AzuriaCore.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SILVER_COIN.get());
        simpleItem(ModItems.AZURIA_TOKEN.get());
        simpleItem(ModItems.REINFORCED_LEATHER.get());

        simpleItem(ModItems.LEATHER_PURSE.get());
        simpleItem(ModItems.GREAT_LEATHER_PURSE.get());
        simpleItem(ModItems.ENCHANTDED_LEATHER_PURSE.get());
        simpleItem(ModItems.BOTTOMLESS_PURSE.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AzuriaCore.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(AzuriaCore.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}
