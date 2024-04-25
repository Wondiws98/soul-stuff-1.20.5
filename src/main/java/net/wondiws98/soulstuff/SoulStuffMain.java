package net.wondiws98.soulstuff;

import net.fabricmc.api.ModInitializer;
import net.wondiws98.soulstuff.block.SoulStuffBlocks;
import net.wondiws98.soulstuff.item.SoulStuffItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoulStuffMain implements ModInitializer {
	public static final String MOD_ID = "soul_stuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		SoulStuffBlocks.registerSoulStuffBlocks();
		SoulStuffItemGroups.registerItemGroups();

		LOGGER.info("Soul Stuff in!");
	}
}