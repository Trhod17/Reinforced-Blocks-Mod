package trhod177.rbm;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import trhod177.rbm.handlers.OreDictionaryHandler;
import trhod177.rbm.handlers.RecipeHandler;
import trhod177.rbm.init.BlockInit;
import trhod177.rbm.init.ItemInit;
import trhod177.rbm.proxy.CommonProxy;
import trhod177.rbm.tabs.ReinforcedBlocksModTab;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ReinforcedBlocksMod {
 
	public static final CreativeTabs reinforcedblocksmodtab = new ReinforcedBlocksModTab("BlockInit.reinforced_oak_planks");
	
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@Mod.Instance(Reference.MODID)
	public static ReinforcedBlocksMod instance;

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlockInit.register(event.getRegistry());
		}
		

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ItemInit.register(event.getRegistry());
			BlockInit.registerItemBlocks(event.getRegistry());
			
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ItemInit.registerModels();
			BlockInit.registerModels();
			
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ItemInit.registerModels();
		}


  
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));

	}
	
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		//BlockInit.init();
		//BlockInit.register(); 

	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
		OreDictionaryHandler.registerOreDictionary();
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
