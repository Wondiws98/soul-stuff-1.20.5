package net.wondiws98.soulstuff;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.wondiws98.soulstuff.datagen.*;

public class SoulStuffDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(SoulStuffBlockTagProvider::new);
		pack.addProvider(SoulStuffItemTagProvider::new);
		pack.addProvider(SoulStuffEnglishLanguageProvider::new);
		pack.addProvider(SoulStuffLootTableProvider::new);
		pack.addProvider(SoulStuffModelProvider::new);
		pack.addProvider(SoulStuffRecipeProvider::new);
	}
}
