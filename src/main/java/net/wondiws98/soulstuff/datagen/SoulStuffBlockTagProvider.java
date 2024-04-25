package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

import java.util.concurrent.CompletableFuture;

public class SoulStuffBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public SoulStuffBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        // SOUL SPEED BLOCKS
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(SoulStuffBlocks.SOUL_GLASS)
                .add(SoulStuffBlocks.TINTED_SOUL_GLASS)
                .add(SoulStuffBlocks.SOUL_GLASS_PANE)
                .add(SoulStuffBlocks.SOUL_STONE)
                .add(SoulStuffBlocks.SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_WALL)
                .add(SoulStuffBlocks.SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE)
                .add(SoulStuffBlocks.CHISELED_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE)
                .add(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.SOULLIGHT)
                .add(SoulStuffBlocks.NICK_O_LANTERN);

        // SOUL FIRE BLOCKS
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
                .add(SoulStuffBlocks.SOUL_GLASS)
                .add(SoulStuffBlocks.TINTED_SOUL_GLASS)
                .add(SoulStuffBlocks.SOUL_GLASS_PANE)
                .add(SoulStuffBlocks.SOUL_STONE)
                .add(SoulStuffBlocks.SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_WALL)
                .add(SoulStuffBlocks.SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.CHISELED_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.SOULLIGHT)
                .add(SoulStuffBlocks.NICK_O_LANTERN);

        // WALLS
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(SoulStuffBlocks.SOUL_STONE_WALL)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL);

        // PICKAXE MINEABLES
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(SoulStuffBlocks.SOUL_GLASS)
                .add(SoulStuffBlocks.TINTED_SOUL_GLASS)
                .add(SoulStuffBlocks.SOUL_GLASS_PANE)
                .add(SoulStuffBlocks.SOUL_STONE)
                .add(SoulStuffBlocks.SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_WALL)
                .add(SoulStuffBlocks.SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE)
                .add(SoulStuffBlocks.CHISELED_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS)
                .add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE)
                .add(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE)
                .add(SoulStuffBlocks.SOULLIGHT);

        // BUTTONS
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON);

        // PRESSURE PLATES
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE)
                .add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE);

        // AXE MINEABLE
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(SoulStuffBlocks.NICK_O_LANTERN);

        // SWORD_EFFICIENT
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(SoulStuffBlocks.NICK_O_LANTERN);

        // PIGLIN SCARED
        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .add(SoulStuffBlocks.SOULLIGHT)
                .add(SoulStuffBlocks.NICK_O_LANTERN);

    }
}
