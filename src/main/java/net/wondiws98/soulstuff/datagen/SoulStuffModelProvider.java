package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

public class SoulStuffModelProvider extends FabricModelProvider {
    public SoulStuffModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        // GLASS
        blockStateModelGenerator.registerGlassPane(SoulStuffBlocks.SOUL_GLASS, SoulStuffBlocks.SOUL_GLASS_PANE);
        blockStateModelGenerator.registerSimpleCubeAll(SoulStuffBlocks.TINTED_SOUL_GLASS);

        // STONE
            // SOUL STONE
        BlockStateModelGenerator.BlockTexturePool soulStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.SOUL_STONE);
        soulStonePool.slab(SoulStuffBlocks.SOUL_STONE_SLAB);
        soulStonePool.stairs(SoulStuffBlocks.SOUL_STONE_STAIRS);
        soulStonePool.wall(SoulStuffBlocks.SOUL_STONE_WALL);
            // SOUL STONE BRICKS
        BlockStateModelGenerator.BlockTexturePool soulStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.SOUL_STONE_BRICKS);
        soulStoneBricksPool.slab(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB);
        soulStoneBricksPool.stairs(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS);
        soulStoneBricksPool.wall(SoulStuffBlocks.SOUL_STONE_BRICK_WALL);
            // POLISHED SOUL STONE
        BlockStateModelGenerator.BlockTexturePool polishedSoulStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.POLISHED_SOUL_STONE);
        registerSideEndSlab(blockStateModelGenerator, (SlabBlock) SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_SOUL_STONE);
        polishedSoulStonePool.stairs(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS);
        polishedSoulStonePool.wall(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL);
        polishedSoulStonePool.button(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON);
        polishedSoulStonePool.pressurePlate(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE);
            // DARK SOUL STONE
        BlockStateModelGenerator.BlockTexturePool darkSoulStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.DARK_SOUL_STONE);
        darkSoulStonePool.slab(SoulStuffBlocks.DARK_SOUL_STONE_SLAB);
        darkSoulStonePool.stairs(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS);
        darkSoulStonePool.wall(SoulStuffBlocks.DARK_SOUL_STONE_WALL);
            // DARK SOUL STONE BRICKS
        BlockStateModelGenerator.BlockTexturePool darkSoulStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
        darkSoulStoneBricksPool.slab(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB);
        darkSoulStoneBricksPool.stairs(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS);
        darkSoulStoneBricksPool.wall(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL);
            // POLISHED DARK SOUL STONE
        BlockStateModelGenerator.BlockTexturePool polishedDarkSoulStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
        registerSideEndSlab(blockStateModelGenerator, (SlabBlock) SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB, SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
        polishedDarkSoulStonePool.stairs(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS);
        polishedDarkSoulStonePool.wall(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL);
        polishedDarkSoulStonePool.button(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON);
        polishedDarkSoulStonePool.pressurePlate(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE);
            // CHISELED
        blockStateModelGenerator.registerSingleton(SoulStuffBlocks.CHISELED_SOUL_STONE, simpleSideEnd(SoulStuffBlocks.POLISHED_SOUL_STONE, SoulStuffBlocks.CHISELED_SOUL_STONE), Models.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE, simpleSideEnd(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, SoulStuffBlocks.CHISELED_DARK_SOUL_STONE), Models.CUBE_COLUMN);


        // LIGHTS
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(SoulStuffBlocks.NICK_O_LANTERN, horizontalRotatable(SoulStuffBlocks.NICK_O_LANTERN, "soul_stuff","block/soul_pumpkin_side", "block/soul_pumpkin_top"));
        blockStateModelGenerator.registerSimpleCubeAll(SoulStuffBlocks.SOULLIGHT);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public void registerSideEndSlab(BlockStateModelGenerator blockStateModelGenerator, SlabBlock slabBlock, Block base) {
        Identifier sideId = TextureMap.getSubId(slabBlock, "_side");
        Identifier endId = TextureMap.getId(base);
        TextureMap textureMap2 = TextureMap.sideEnd(sideId, endId);
        Identifier identifier = Models.SLAB.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.SLAB_TOP.upload(slabBlock, textureMap2, blockStateModelGenerator.modelCollector);
        Identifier identifier3 = Models.CUBE_COLUMN.uploadWithoutVariant(slabBlock, "_side", textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier, identifier2, identifier3));
    }

    public TextureMap horizontalRotatable(Block front, String nameSpace, String sideId, String endId) {
        return new TextureMap().put(TextureKey.FRONT, TextureMap.getId(front)).put(TextureKey.SIDE, new Identifier(nameSpace, sideId)).put(TextureKey.END, new Identifier(nameSpace, endId));
    }

    public TextureMap simpleSideEnd(Block end, Block side) {
        return new TextureMap().put(TextureKey.END, TextureMap.getId(end)).put(TextureKey.SIDE, TextureMap.getId(side));
    }

}
