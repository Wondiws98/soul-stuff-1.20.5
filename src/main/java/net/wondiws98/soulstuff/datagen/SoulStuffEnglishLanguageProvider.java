package net.wondiws98.soulstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

import java.util.concurrent.CompletableFuture;

public class SoulStuffEnglishLanguageProvider extends FabricLanguageProvider {


    public SoulStuffEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(SoulStuffBlocks.SOUL_GLASS, "Soul Glass");
        translationBuilder.add(SoulStuffBlocks.TINTED_SOUL_GLASS, "Tinted Soul Glass");
        translationBuilder.add(SoulStuffBlocks.SOUL_GLASS_PANE, "Soul Glass Pane");

        // STONE
        System.out.println("prob here 1");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE, "Soul Stone");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_SLAB, "Soul Stone Slab");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_STAIRS, "Soul Stone Stairs");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_WALL, "Soul Stone Wall");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_BRICKS, "Soul Stone Bricks");
        System.out.println("prob here 1.2");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB, "Soul Stone Brick Slab");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS, "Soul Stone Brick Stairs");
        translationBuilder.add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL, "Soul Stone Brick Wall");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE, "Polished Soul Stone");
        System.out.println("prob here 1.3");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB, "Polished Soul Stone Slab");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS, "Polished Soul Stone Stairs");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL, "Polished Soul Stone Wall");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON, "Polished Soul Stone Button");
        translationBuilder.add(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE, "Polished Soul Stone Pressure Plate");
        translationBuilder.add(SoulStuffBlocks.CHISELED_SOUL_STONE, "Chiseled Soul Stone");

        // DARK STONE
        System.out.println("prob here 2");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE, "Dark Soul Stone");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_SLAB, "Dark Soul Stone Slab");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS, "Dark Soul Stone Stairs");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_WALL, "Dark Soul Stone Wall");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS, "Dark Soul Stone Bricks");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB, "Dark Soul Stone Brick Slab");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS, "Dark Soul Stone Brick Stairs");
        translationBuilder.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL, "Dark Soul Stone Brick Wall");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE, "Polished Dark Soul Stone");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB, "Polished Dark Soul Stone Slab");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS, "Polished Dark Soul Stone Stairs");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL, "Polished Dark Soul Stone Wall");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON, "Polished Dark Soul Stone Button");
        translationBuilder.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE, "Polished Dark Soul Stone Pressure Plate");
        translationBuilder.add(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE, "Chiseled Dark Soul Stone");

        // LIGHT
        translationBuilder.add(SoulStuffBlocks.SOULLIGHT, "Soullight");
        translationBuilder.add(SoulStuffBlocks.NICK_O_LANTERN, "Nick o'Lantern");

        // ITEM GROUP
        translationBuilder.add("itemgroup.soul_stuff", "Soul Stuff");
    }
}
