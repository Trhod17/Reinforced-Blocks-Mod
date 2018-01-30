package trhod177.rbm.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod177.rbm.Reference;
import trhod177.rbm.ReinforcedBlocksMod;


public class CommonProxy {

	
	
	
	public void preInit(FMLPreInitializationEvent event) {
		
		 
	}
	
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));
	}
}
