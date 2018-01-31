package trhod177.rbm.init;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm.ReinforcedBlocksMod;
import trhod177.rbm.items.ItemBase;

public class ItemInit {
	
	public static ItemBase ObsidianReinforcement = new ItemBase("ObsidianReinforcement").setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab);
	
	public static void register(IForgeRegistry<Item> registry) {
	  registry.registerAll(
	      ObsidianReinforcement
			  
			  );
	  
	
	}
	
	public static void registerModels() {
	    ObsidianReinforcement.registerItemModel();
	
	}

}

