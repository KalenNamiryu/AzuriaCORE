package net.kalennamiryu.azuriacore.datagen;

import net.kalennamiryu.azuriacore.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_LEATHER.get())
                .define('L', Items.LEATHER)
                .pattern("LLL")
                .unlockedBy("has_leather",
                        inventoryTrigger(ItemPredicate.Builder.item().of(Items.LEATHER).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LEATHER_PURSE.get())
                .define('L', Items.LEATHER)
                .define('S', Items.STRING)
                .pattern(" S ")
                .pattern("L L")
                .pattern(" L ")
                .unlockedBy("has_leather",
                        inventoryTrigger(ItemPredicate.Builder.item().of(Items.LEATHER).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.GREAT_LEATHER_PURSE.get())
                .define('L', ModItems.REINFORCED_LEATHER.get())
                .define('S', Items.STRING)
                .pattern("SSS")
                .pattern("L L")
                .pattern("LLL")
                .unlockedBy("has_leather_purse",
                        inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.LEATHER_PURSE.get()).build()))
                .save(pFinishedRecipeConsumer);


    }
}
