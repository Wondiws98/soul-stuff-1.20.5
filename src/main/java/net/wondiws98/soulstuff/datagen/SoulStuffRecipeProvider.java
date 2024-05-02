package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SoulStuffRecipeProvider extends FabricRecipeProvider {


    public SoulStuffRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        RecipeCategory building_block = RecipeCategory.BUILDING_BLOCKS;

        // SMELTING
        offerSmelting(exporter, List.of(Blocks.SOUL_SAND), building_block, SoulStuffBlocks.SOUL_GLASS, 0.1f, 200, "soul_glass");

        // STONE CUTTING
            // SOUL STONE RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_SLAB, SoulStuffBlocks.SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_STAIRS, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_WALL, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICKS, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_WALL, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB, SoulStuffBlocks.SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_WALL, SoulStuffBlocks.SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_SOUL_STONE, SoulStuffBlocks.SOUL_STONE);
                // SOUL STONE BRICKS RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.SOUL_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.SOUL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_WALL, SoulStuffBlocks.SOUL_STONE_BRICKS);
                // POLISHED SOUL STONE RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS, SoulStuffBlocks.POLISHED_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_WALL, SoulStuffBlocks.POLISHED_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_SOUL_STONE, SoulStuffBlocks.POLISHED_SOUL_STONE);
            // DARK SOUL STONE RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_SLAB, SoulStuffBlocks.DARK_SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_WALL, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.DARK_SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB, SoulStuffBlocks.DARK_SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_DARK_SOUL_STONE, SoulStuffBlocks.DARK_SOUL_STONE);
                // DARK SOUL STONE BRICKS RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
                // POLISHED DARK SOUL STONE RESULTS
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, 2);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
        offerStonecuttingRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_DARK_SOUL_STONE, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);

        // CRAFTING TABLE
            // GLASS
        ShapedRecipeJsonBuilder.create(building_block, SoulStuffBlocks.SOUL_GLASS_PANE, 16).pattern("GGG").pattern("GGG").input('G', SoulStuffBlocks.SOUL_GLASS).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).offerTo(exporter, new Identifier(getRecipeName(SoulStuffBlocks.SOUL_GLASS_PANE)));
        ShapedRecipeJsonBuilder.create(building_block, SoulStuffBlocks.TINTED_SOUL_GLASS, 2).pattern(" A ").pattern("AGA").pattern(" A ").input('A', Items.AMETHYST_SHARD).input('G', SoulStuffBlocks.SOUL_GLASS).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).offerTo(exporter, new Identifier(getRecipeName(SoulStuffBlocks.TINTED_SOUL_GLASS)));
                // GLASS SUBSTITUTES
        ShapedRecipeJsonBuilder.create(RecipeCategory.BREWING, Items.GLASS_BOTTLE, 3).pattern("G G").pattern(" G ").input('G', SoulStuffBlocks.SOUL_GLASS).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).offerTo(exporter, new Identifier("soul_glass_bottle"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BEACON, 1).pattern("GGG").pattern("GNG").pattern("OOO").input('G', SoulStuffBlocks.SOUL_GLASS).input('N', Items.NETHER_STAR).input('O', Blocks.OBSIDIAN).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR)).criterion(hasItem(Blocks.OBSIDIAN), conditionsFromItem(Blocks.OBSIDIAN)).offerTo(exporter, new Identifier("soul_beacon"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.END_CRYSTAL, 1).pattern("GGG").pattern("GEG").pattern("GTG").input('G', SoulStuffBlocks.SOUL_GLASS).input('E', Items.ENDER_EYE).input('T', Items.GHAST_TEAR).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).criterion(hasItem(Items.ENDER_EYE), conditionsFromItem(Items.ENDER_EYE)).criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR)).offerTo(exporter, new Identifier("soul_end_crystal"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.DAYLIGHT_DETECTOR, 1).pattern("GGG").pattern("QQQ").pattern("SSS").input('G', SoulStuffBlocks.SOUL_GLASS).input('Q', Items.QUARTZ).input('S', ItemTags.WOODEN_SLABS).criterion(hasItem(SoulStuffBlocks.SOUL_GLASS), conditionsFromItem(SoulStuffBlocks.SOUL_GLASS)).criterion(hasItem(Items.QUARTZ), conditionsFromItem(Items.QUARTZ)).criterion(hasItem(Blocks.OAK_SLAB), conditionsFromTag(ItemTags.WOODEN_SLABS)).offerTo(exporter, new Identifier("soul_daylight_detector"));
            // STONE BASE
        offer2x2Recipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE, Blocks.SOUL_SAND, 4);
        ShapedRecipeJsonBuilder.create(building_block, SoulStuffBlocks.DARK_SOUL_STONE, 4).pattern("CS").pattern("SC").input('C', ItemTags.COALS).input('S', Blocks.SOUL_SAND).criterion(hasItem(Items.COAL), conditionsFromTag(ItemTags.COALS)).criterion(hasItem(Blocks.SOUL_SAND), conditionsFromItem(Blocks.SOUL_SAND)).offerTo(exporter, new Identifier(getRecipeName(SoulStuffBlocks.DARK_SOUL_STONE)));
            // BRICKS
        offer2x2Recipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICKS, SoulStuffBlocks.SOUL_STONE, 4);
        offer2x2Recipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS, SoulStuffBlocks.DARK_SOUL_STONE, 4);
            // POLISHED
        offer2x2Recipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE, SoulStuffBlocks.SOUL_STONE_BRICKS, 4);
        offer2x2Recipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS, 4);
            // SLABS
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_SLAB, SoulStuffBlocks.SOUL_STONE);
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.SOUL_STONE_BRICKS);
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_SOUL_STONE);
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_SLAB, SoulStuffBlocks.DARK_SOUL_STONE);
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
        offerSlabRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
            // STAIRS
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_STAIRS, SoulStuffBlocks.SOUL_STONE);
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.SOUL_STONE_BRICKS);
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS, SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS);
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE);
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
        offerStairsRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS);
            // WALLS
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_WALL, SoulStuffBlocks.SOUL_STONE);
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.SOUL_STONE_BRICK_WALL, SoulStuffBlocks.SOUL_STONE_BRICKS);
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_SOUL_STONE_WALL, SoulStuffBlocks.POLISHED_SOUL_STONE);
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_WALL, SoulStuffBlocks.DARK_SOUL_STONE);
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL, SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
        offerWallRecipe(exporter, building_block, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
            // CHISELED
        offerChiseledBlockRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_SOUL_STONE, SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB);
        offerChiseledBlockRecipe(exporter, building_block, SoulStuffBlocks.CHISELED_DARK_SOUL_STONE, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB);
            // PRESSURE PLATES
        offerPressurePlateRecipe(exporter, SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE, SoulStuffBlocks.POLISHED_SOUL_STONE);
        offerPressurePlateRecipe(exporter, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
            // BUTTONS
        offerSingleInputRecipe(exporter, RecipeCategory.REDSTONE, SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON, SoulStuffBlocks.POLISHED_SOUL_STONE, 1);
        offerSingleInputRecipe(exporter, RecipeCategory.REDSTONE, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, 1);
            // LIGHT
        ShapedRecipeJsonBuilder.create(building_block, SoulStuffBlocks.NICK_O_LANTERN, 1).pattern("P").pattern("T").input('P', Blocks.CARVED_PUMPKIN).input('T', Blocks.SOUL_TORCH).criterion(hasItem(Blocks.CARVED_PUMPKIN), conditionsFromItem(Blocks.CARVED_PUMPKIN)).criterion(hasItem(Blocks.SOUL_TORCH), conditionsFromItem(Blocks.SOUL_TORCH)).offerTo(exporter, new Identifier(getRecipeName(SoulStuffBlocks.NICK_O_LANTERN)));
        ShapedRecipeJsonBuilder.create(building_block, SoulStuffBlocks.SOULLIGHT, 1).pattern(" G ").pattern("GSG").pattern(" G ").input('G', Items.GLOWSTONE_DUST).input('S', ItemTags.SOUL_FIRE_BASE_BLOCKS).criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST)).criterion(hasItem(Blocks.SOUL_SAND), conditionsFromTag(ItemTags.SOUL_FIRE_BASE_BLOCKS)).offerTo(exporter, new Identifier(getRecipeName(SoulStuffBlocks.SOULLIGHT)));
    }

    public void offerSingleInputRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int count) {
        ShapedRecipeJsonBuilder.create(category, output, count).pattern("I").input('I', input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter, getRecipeName(output));
    }

    public void offer2x2Recipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input, int count) {
        ShapedRecipeJsonBuilder.create(category, output, count).pattern("II").pattern("II").input('I', input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public void offerStairsRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(category, output, 4).pattern("I  ").pattern("II ").pattern("III").input('I', input).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter, new Identifier(getRecipeName(output)));
    }

}
