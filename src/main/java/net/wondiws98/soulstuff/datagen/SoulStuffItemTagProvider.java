package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

import java.util.concurrent.CompletableFuture;

public class SoulStuffItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SoulStuffItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        // STONE CRAFTING MATERIALS
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(SoulStuffBlocks.SOUL_STONE.asItem())
                .add(SoulStuffBlocks.DARK_SOUL_STONE.asItem());

        // STONE TOOL MATERIALS
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(SoulStuffBlocks.SOUL_STONE.asItem())
                .add(SoulStuffBlocks.DARK_SOUL_STONE.asItem());
    }
}
