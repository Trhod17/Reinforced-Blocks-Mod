package trhod177.rbm.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm.Reference;
import trhod177.rbm.blocks.CustomWood;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;


public class BlockInit {
	
	public static CustomWood reinforced_oak_planks = new CustomWood("reinforcedoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomWood reinforced_birch_planks = new CustomWood("reinforcedbirchplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWood reinforced_spruce_planks = new CustomWood("reinforcedspruceplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWood reinforced_jungle_planks = new CustomWood("reinforcedjungleplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWood reinforced_acacia_planks = new CustomWood("reinforcedacaciaplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWood reinforced_dark_oak_planks = new CustomWood("reinforceddarkoakplanks").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_oak_log = new CustomWood("reinforcedoaklog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_birch_log = new CustomWood("reinforcedbirchlog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_spruce_log = new CustomWood("reinforcedsprucelog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_jungle_log = new CustomWood("reinforcedjunglelog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_acacia_log = new CustomWood("reinforcedacacialog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	//public static CustomWood reinforced_dark_oak_log = new CustomWood("reinforceddarkoaklog").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	
	
	
	
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				reinforced_oak_planks,
				reinforced_birch_planks,
				reinforced_spruce_planks,
				reinforced_jungle_planks,
				reinforced_acacia_planks,
				reinforced_dark_oak_planks
				//reinforced_oak_log,
				//reinforced_birch_log,
				//reinforced_spruce_log,
				//reinforced_acacia_log,
				//reinforced_jungle_log,
				//reinforced_dark_oak_log
				
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			reinforced_oak_planks.createItemBlock(),
			reinforced_birch_planks.createItemBlock(),
			reinforced_spruce_planks.createItemBlock(),
			reinforced_jungle_planks.createItemBlock(),
			reinforced_dark_oak_planks.createItemBlock(),
			reinforced_acacia_planks.createItemBlock()
			//reinforced_oak_log.createItemBlock(),
			//reinforced_birch_log.createItemBlock(),
			//reinforced_spruce_log.createItemBlock(),
			//reinforced_acacia_log.createItemBlock(),
			//reinforced_jungle_log.createItemBlock(),
			//reinforced_dark_oak_log.createItemBlock()
			
		);
	
	}

	public static void registerModels() {
		reinforced_oak_planks.registerItemModel(Item.getItemFromBlock(reinforced_oak_planks));
		reinforced_birch_planks.registerItemModel(Item.getItemFromBlock(reinforced_birch_planks));
		reinforced_spruce_planks.registerItemModel(Item.getItemFromBlock(reinforced_spruce_planks));
		reinforced_jungle_planks.registerItemModel(Item.getItemFromBlock(reinforced_jungle_planks));
		reinforced_acacia_planks.registerItemModel(Item.getItemFromBlock(reinforced_acacia_planks));
		reinforced_dark_oak_planks.registerItemModel(Item.getItemFromBlock(reinforced_dark_oak_planks));
		//reinforced_oak_log.registerItemModel(Item.getItemFromBlock(reinforced_oak_log));
		//reinforced_birch_log.registerItemModel(Item.getItemFromBlock(reinforced_birch_log));
		//reinforced_spruce_log.registerItemModel(Item.getItemFromBlock(reinforced_spruce_log));
		//reinforced_acacia_log.registerItemModel(Item.getItemFromBlock(reinforced_acacia_log));
		//reinforced_jungle_log.registerItemModel(Item.getItemFromBlock(reinforced_jungle_log));
		//reinforced_dark_oak_log.registerItemModel(Item.getItemFromBlock(reinforced_dark_oak_log));

	}

}
