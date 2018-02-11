package trhod177.rbm.init;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm.ReinforcedBlocksMod;
import trhod177.rbm.items.ItemBase;
import trhod177.rbm.items.ItemMold;

public class ItemInit {
	
	public static ItemBase ObsidianReinforcement = new ItemBase("ObsidianReinforcement").setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmoditemtab);
	public static ItemBase StrutMold = new ItemBase("StrutMold").setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmoditemtab);
	public static ItemMold redhotstrutmold = new ItemMold("redhotstrutmold").setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmoditemtab);
	public static ItemBase GlassReinforcement = new ItemBase("GlassReinforcement").setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmoditemtab);
	
	public static void register(IForgeRegistry<Item> registry) {
	  registry.registerAll(
	      ObsidianReinforcement,
	      StrutMold,
	      redhotstrutmold,
	      GlassReinforcement
		
			  );
	  
	
	}
	
	public static void registerModels() {
	    ObsidianReinforcement.registerItemModel();
	    StrutMold.registerItemModel();
	    redhotstrutmold.registerItemModel();
	    GlassReinforcement.registerItemModel();
	}

}

