package net.wondiws98.soulstuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wondiws98.soulstuff.SoulStuffMain;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;

public class SoulStuffItemGroups {
    public static final ItemGroup SOUL_STUFF = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(SoulStuffMain.MOD_ID, "soul_stuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.soul_stuff")).icon(() -> new ItemStack(Items.SOUL_LANTERN)).entries(((displayContext, entries) -> {

                // GLASS STUFF
                entries.add(SoulStuffBlocks.SOUL_GLASS);
                entries.add(SoulStuffBlocks.TINTED_SOUL_GLASS);
                entries.add(SoulStuffBlocks.SOUL_GLASS_PANE);

                // STONE STUFF
                entries.add(SoulStuffBlocks.SOUL_STONE);
                entries.add(SoulStuffBlocks.SOUL_STONE_SLAB);
                entries.add(SoulStuffBlocks.SOUL_STONE_STAIRS);
                entries.add(SoulStuffBlocks.SOUL_STONE_WALL);
                entries.add(SoulStuffBlocks.SOUL_STONE_BRICKS);
                entries.add(SoulStuffBlocks.SOUL_STONE_BRICK_SLAB);
                entries.add(SoulStuffBlocks.SOUL_STONE_BRICK_STAIRS);
                entries.add(SoulStuffBlocks.SOUL_STONE_BRICK_WALL);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE_SLAB);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE_STAIRS);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE_WALL);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE_BUTTON);
                entries.add(SoulStuffBlocks.POLISHED_SOUL_STONE_PRESSURE_PLATE);
                entries.add(SoulStuffBlocks.CHISELED_SOUL_STONE);

                // DARK STONE STUFF
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_SLAB);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_STAIRS);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_WALL);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICKS);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_SLAB);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_STAIRS);
                entries.add(SoulStuffBlocks.DARK_SOUL_STONE_BRICK_WALL);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_SLAB);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_STAIRS);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_WALL);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_BUTTON);
                entries.add(SoulStuffBlocks.POLISHED_DARK_SOUL_STONE_PRESSURE_PLATE);
                entries.add(SoulStuffBlocks.CHISELED_DARK_SOUL_STONE);

                // LIGHT
                entries.add(SoulStuffBlocks.SOULLIGHT);
                entries.add(SoulStuffBlocks.NICK_O_LANTERN);

                // MINECRAFT SOUL STUFF
                entries.add(Blocks.SOUL_SAND);
                entries.add(Blocks.SOUL_SOIL);
                entries.add(Blocks.SOUL_LANTERN);
                entries.add(Blocks.SOUL_TORCH);
                entries.add(Blocks.SOUL_CAMPFIRE);

            })).build()
    );
    public static void registerItemGroups() {
    }
}
