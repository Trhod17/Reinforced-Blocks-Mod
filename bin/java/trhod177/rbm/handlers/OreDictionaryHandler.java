package trhod177.rbm.handlers;

import net.minecraftforge.oredict.OreDictionary;
import trhod177.rbm.init.BlockInit;

public class OreDictionaryHandler {
	
	public static void registerOreDictionary() {
		
		OreDictionary.registerOre("rbm:reinforcedoak", BlockInit.reinforced_oak_planks);
		OreDictionary.registerOre("rbm:reinforcebirch", BlockInit.reinforced_birch_planks);
		OreDictionary.registerOre("rbm:reinforcedspruce", BlockInit.reinforced_spruce_planks);
		OreDictionary.registerOre("rbm:reinforcedjungle", BlockInit.reinforced_jungle_planks);
		OreDictionary.registerOre("rbm:reinforcedacacia", BlockInit.reinforced_acacia_planks);
		OreDictionary.registerOre("rbm:reinforceddarkoak", BlockInit.reinforced_dark_oak_planks);
		
	}

}
