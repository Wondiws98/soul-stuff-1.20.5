package net.wondiws98.soulstuff.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wondiws98.soulstuff.SoulStuffMain;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class SoulStuffBlocks {
    // BUILDING BLOCKS
        // GLASS
    public static final Block SOUL_GLASS = registerBlock("soul_glass", new TransparentBlock(AbstractBlock.Settings.copy(Blocks.GLASS).mapColor(MapColor.BROWN)));
    public static final Block TINTED_SOUL_GLASS = registerBlock("tinted_soul_glass", new TintedGlassBlock(AbstractBlock.Settings.copy(SOUL_GLASS).mapColor(MapColor.BLACK)));
    public static final Block SOUL_GLASS_PANE = registerBlock("soul_glass_pane", new PaneBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE).mapColor(MapColor.BROWN)));
        // STONE
            // ROUGH
    public static final Block SOUL_STONE = registerBlock("soul_stone", copy(Blocks.COBBLESTONE).mapColor(MapColor.BROWN));
    public static final Block SOUL_STONE_SLAB = registerSlab(SOUL_STONE);
    public static final Block SOUL_STONE_STAIRS = registerStairs(SOUL_STONE);
    public static final Block SOUL_STONE_WALL = registerWall(SOUL_STONE);
            // BRICKS
    public static final Block SOUL_STONE_BRICKS = registerBlock("soul_stone_bricks", copy(SOUL_STONE));
    public static final Block SOUL_STONE_BRICK_SLAB = registerSlab("soul_stone_brick_slab", SOUL_STONE_BRICKS);
    public static final Block SOUL_STONE_BRICK_STAIRS = registerStairs("soul_stone_brick_stairs", SOUL_STONE_BRICKS);
    public static final Block SOUL_STONE_BRICK_WALL = registerWall("soul_stone_brick_wall", SOUL_STONE_BRICKS);
            // POLISHED
    public static final Block POLISHED_SOUL_STONE = registerBlock("polished_soul_stone", copy(SOUL_STONE));
    public static final Block POLISHED_SOUL_STONE_SLAB = registerSlab(POLISHED_SOUL_STONE);
    public static final Block POLISHED_SOUL_STONE_STAIRS = registerStairs(POLISHED_SOUL_STONE);
    public static final Block POLISHED_SOUL_STONE_WALL = registerWall(POLISHED_SOUL_STONE);
    public static final Block POLISHED_SOUL_STONE_BUTTON = registerButton(POLISHED_SOUL_STONE);
    public static final Block POLISHED_SOUL_STONE_PRESSURE_PLATE = registerPressurePlate(POLISHED_SOUL_STONE);
    public static final Block CHISELED_SOUL_STONE = registerBlock("chiseled_soul_stone", copy(SOUL_STONE));
        // DARK STONE
            // ROUGH
    public static final Block DARK_SOUL_STONE = registerBlock("dark_soul_stone", copy(SOUL_STONE).mapColor(MapColor.BLACK));
    public static final Block DARK_SOUL_STONE_SLAB = registerSlab(DARK_SOUL_STONE);
    public static final Block DARK_SOUL_STONE_STAIRS = registerStairs(DARK_SOUL_STONE);
    public static final Block DARK_SOUL_STONE_WALL = registerWall(DARK_SOUL_STONE);
            // BRICKS
    public static final Block DARK_SOUL_STONE_BRICKS = registerBlock("dark_soul_stone_bricks", copy(DARK_SOUL_STONE));
    public static final Block DARK_SOUL_STONE_BRICK_SLAB = registerSlab("dark_soul_stone_brick_slab", DARK_SOUL_STONE_BRICKS);
    public static final Block DARK_SOUL_STONE_BRICK_STAIRS = registerStairs("dark_soul_stone_brick_stairs", DARK_SOUL_STONE_BRICKS);
    public static final Block DARK_SOUL_STONE_BRICK_WALL = registerWall("dark_soul_stone_brick_wall", DARK_SOUL_STONE_BRICKS);
            // POLISHED
    public static final Block POLISHED_DARK_SOUL_STONE = registerBlock("polished_dark_soul_stone", copy(DARK_SOUL_STONE));
    public static final Block POLISHED_DARK_SOUL_STONE_SLAB = registerSlab(POLISHED_DARK_SOUL_STONE);
    public static final Block POLISHED_DARK_SOUL_STONE_STAIRS = registerStairs(POLISHED_DARK_SOUL_STONE);
    public static final Block POLISHED_DARK_SOUL_STONE_WALL = registerWall(POLISHED_DARK_SOUL_STONE);
    public static final Block POLISHED_DARK_SOUL_STONE_BUTTON = registerButton(POLISHED_DARK_SOUL_STONE);
    public static final Block POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE = registerPressurePlate(POLISHED_DARK_SOUL_STONE);
    public static final Block CHISELED_DARK_SOUL_STONE = registerBlock("chiseled_dark_soul_stone", copy(DARK_SOUL_STONE));
    // LIGHT
    public static final Block SOULLIGHT = registerBlock("soullight", new Block(AbstractBlock.Settings.copy(Blocks.GLOWSTONE).luminance(value -> 12).mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block NICK_O_LANTERN = registerBlock("nick_o_lantern", new CarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.JACK_O_LANTERN).luminance(value -> 12).mapColor(MapColor.PURPLE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                new Identifier(SoulStuffMain.MOD_ID, name),
                block
        );
    }

    private static Block registerBlock(String name, AbstractBlock.Settings settings) {
        return registerBlock(name, new Block(settings));
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(SoulStuffMain.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    private static Block registerStairs(String id, @NotNull Block base) {
        return registerBlock(id, new StairsBlock(base.getDefaultState(), copy(base)));
    }

    private static Block registerStairs(Block base) {
        return registerStairs(getBlockName(base)+"_stairs", base);
    }

    private static Block registerSlab(String id, Block base) {
        return registerBlock(id, new SlabBlock(copy(base)));
    }

    private static Block registerSlab(Block base) {
        return registerSlab(getBlockName(base)+"_slab", base);
    }

    private static Block registerWall(String id, Block base) {
        return registerBlock(id, new WallBlock(copy(base)));
    }

    private static Block registerWall(Block base) {
        return registerWall(getBlockName(base)+"_wall", base);
    }

    private static Block registerButton(Block base) {
        return registerBlock(getBlockName(base)+"_button", Blocks.createStoneButtonBlock());
    }

    private static Block registerPressurePlate(Block base) {
        return registerBlock(getBlockName(base)+"_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, copy(base)));
    }

    @Contract(value = "_ -> new", pure = true)
    private static AbstractBlock.@NotNull Settings copy(Block base) {
        return AbstractBlock.Settings.copy(base);
    }
    
    private static String getBlockName(Block block) {
        return Registries.BLOCK.getId(block).getPath();
    }

    public static void registerSoulStuffBlocks() {
    }
}
