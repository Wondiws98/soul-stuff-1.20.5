package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

import java.util.concurrent.CompletableFuture;

public class SoulStuffLootTableProvider extends FabricBlockLootTableProvider {

    public SoulStuffLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
                // GLASS
                addDrop(SoulStuffBlocks.SOUL_GLASS, dropsWithSilkTouch(SoulStuffBlocks.SOUL_GLASS));
                addDrop(SoulStuffBlocks.TINTED_SOUL_GLASS, dropsWithSilkTouch(SoulStuffBlocks.TINTED_SOUL_GLASS));
                addDrop(SoulStuffBlocks.SOUL_GLASS_PANE, dropsWithSilkTouch(SoulStuffBlocks.SOUL_GLASS_PANE));
                // STONE
                addDrop(SoulStuffBlocks.SOUL_STONE);
                addDrop(SoulStuffBlocks.SOUL_STONE_SLAB);
                addDrop(SoulStuffBlocks.SOUL_STONE_STAIRS);
                addDrop(SoulStuffBlocks.SOUL_STONE_WALL);
                addDrop(SoulStuffBlocks.SOUL_STONE_BRICKS);
                addDrop(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB);
                addDrop(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS);
                addDrop(SoulStuffBlocks.SOUL_STONE_BRICK_WALL);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON);
                addDrop(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE);
                addDrop(SoulStuffBlocks.CHISELED_SOUL_STONE);
                // DARK STONE
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_SLAB);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_WALL);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS);
                addDrop(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON);
                addDrop(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE);
                addDrop(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE);
                // LIGHT
                addDrop(SoulStuffBlocks.SOULLIGHT);
                addDrop(SoulStuffBlocks.NICK_O_LANTERN);
    }
}
