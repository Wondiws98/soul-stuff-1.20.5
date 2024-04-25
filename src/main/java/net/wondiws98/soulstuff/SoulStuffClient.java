package net.wondiws98.soulstuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

public class SoulStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderLayer cutOut = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(SoulStuffBlocks.SOUL_GLASS, cutOut);
        BlockRenderLayerMap.INSTANCE.putBlock(SoulStuffBlocks.SOUL_GLASS_PANE, cutOut);
        BlockRenderLayerMap.INSTANCE.putBlock(SoulStuffBlocks.TINTED_SOUL_GLASS, RenderLayer.getTranslucent());
    }
}
