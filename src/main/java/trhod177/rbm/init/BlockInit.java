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
import trhod177.rbm.blocks.CustomClay;
import trhod177.rbm.blocks.CustomClayStrutless;
import trhod177.rbm.blocks.CustomGlass;
import trhod177.rbm.blocks.CustomMetal;
import trhod177.rbm.blocks.CustomNether;
import trhod177.rbm.blocks.CustomStone;
import trhod177.rbm.blocks.CustomStoneStrutless;
import trhod177.rbm.blocks.CustomWood;
import trhod177.rbm.blocks.CustomWoodStrutless;
import trhod177.rbm.blocks.machines.reinforcer.BlockReinforcer;
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
	public static CustomStone reinforcedbrick = new CustomStone("reinforcedbrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedcobblestone = new CustomStone("reinforcedcobblestone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedmossycobblestone = new CustomStone("reinforcedmossycobblestone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedstone = new CustomStone("reinforcedstone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedandesite = new CustomStone("reinforcedandesite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedandesitesmooth = new CustomStone("reinforcedandesitesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedstonebrick = new CustomStone("reinforcedstonebrick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedstonebrickcarved = new CustomStone("reinforcedstonebrickcarved").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedstonebrickcracked = new CustomStone("reinforcedstonebrickcracked").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedstonebrickmossy = new CustomStone("reinforcedstonebrickmossy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforceddorite = new CustomStone("reinforceddorite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforceddoritesmooth = new CustomStone("reinforceddoritesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedgranite = new CustomStone("reinforcedgranite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStone reinforcedgranitesmooth = new CustomStone("reinforcedgranitesmooth").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomGlass reinforcedglass = new CustomGlass("reinforcedglass").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclay = new CustomClay("reinforcedclay").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclayblue = new CustomClay("reinforcedclayblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaybrown = new CustomClay("reinforcedclaybrown").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaycyan = new CustomClay("reinforcedclaycyan").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaygray = new CustomClay("reinforcedclaygray").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaygreen = new CustomClay("reinforcedclaygreen").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaylightblue = new CustomClay("reinforcedclaylightblue").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaylime = new CustomClay("reinforcedclaylime").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaymagenta = new CustomClay("reinforcedclaymagenta").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclayorange = new CustomClay("reinforcedclayorange").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaypink = new CustomClay("reinforcedclaypink").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaypurple = new CustomClay("reinforcedclaypurple").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclayred = new CustomClay("reinforcedclayred").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaysilver = new CustomClay("reinforcedclaysilver").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclaywhite = new CustomClay("reinforcedclaywhite").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclayyellow = new CustomClay("reinforcedclayyellow").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClay reinforcedclayblack = new CustomClay("reinforcedclayblack").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomMetal reinforcedironblock = new CustomMetal("reinforcedironblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomNether reinforcedquartzblock = new CustomNether("reinforcedquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
  //public static CustomNether reinforcedchisledquartzblock= new CustomNether("reinforcedchisledquartzblock").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	
	
	public static CustomWoodStrutless reinforced_oak_planks_strutless = new CustomWoodStrutless("reinforcedoakplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomWoodStrutless reinforced_birch_planks_strutless = new CustomWoodStrutless("reinforcedbirchplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWoodStrutless reinforced_spruce_planks_strutless = new CustomWoodStrutless("reinforcedspruceplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWoodStrutless reinforced_jungle_planks_strutless = new CustomWoodStrutless("reinforcedjungleplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWoodStrutless reinforced_acacia_planks_strutless = new CustomWoodStrutless("reinforcedacaciaplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomWoodStrutless reinforced_dark_oak_planks_strutless = new CustomWoodStrutless("reinforceddarkoakplanksstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);;
	public static CustomStoneStrutless reinforcedbrickstrutless = new CustomStoneStrutless("reinforcedbrickstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedcobblestonestrutless = new CustomStoneStrutless("reinforcedcobblestonestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedmossycobblestonestrutless = new CustomStoneStrutless("reinforcedmossycobblestonestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedstonestrutless = new CustomStoneStrutless("reinforcedstonestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedandesitestrutless = new CustomStoneStrutless("reinforcedandesitestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedandesitesmoothstrutless = new CustomStoneStrutless("reinforcedandesitesmoothstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedstonebrickstrutless = new CustomStoneStrutless("reinforcedstonebrickstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedstonebrickcarvedstrutless = new CustomStoneStrutless("reinforcedstonebrickcarvedstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedstonebrickcrackedstrutless = new CustomStoneStrutless("reinforcedstonebrickcrackedstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedstonebrickmossystrutless = new CustomStoneStrutless("reinforcedstonebrickmossystrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforceddoritestrutless = new CustomStoneStrutless("reinforceddoritestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforceddoritesmoothstrutless = new CustomStoneStrutless("reinforceddoritesmoothstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedgranitestrutless = new CustomStoneStrutless("reinforcedgranitestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomStoneStrutless reinforcedgranitesmoothstrutless = new CustomStoneStrutless("reinforcedgranitesmoothstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaystrutless = new CustomClayStrutless("reinforcedclaystrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaybluestrutless = new CustomClayStrutless("reinforcedclaybluestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaybrownstrutless = new CustomClayStrutless("reinforcedclaybrownstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaycyanstrutless = new CustomClayStrutless("reinforcedclaycyanstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaygraystrutless = new CustomClayStrutless("reinforcedclaygraystrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaygreenstrutless = new CustomClayStrutless("reinforcedclaygreenstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaylightbluestrutless = new CustomClayStrutless("reinforcedclaylightbluestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaylimestrutless = new CustomClayStrutless("reinforcedclaylimestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaymagentastrutless = new CustomClayStrutless("reinforcedclaymagentastrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclayorangestrutless = new CustomClayStrutless("reinforcedclayorangestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaypinkstrutless = new CustomClayStrutless("reinforcedclaypinkstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaypurplestrutless = new CustomClayStrutless("reinforcedclaypurplestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclayredstrutless = new CustomClayStrutless("reinforcedclayredstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaysilverstrutless = new CustomClayStrutless("reinforcedclaysilverstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclaywhitestrutless = new CustomClayStrutless("reinforcedclaywhitestrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclayyellowstrutless = new CustomClayStrutless("reinforcedclayyellowstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomClayStrutless reinforcedclayblackstrutless = new CustomClayStrutless("reinforcedclayblackstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomMetal reinforcedironblockstrutless = new CustomMetal("reinforcedironblockstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static CustomNether reinforcedquartzblockstrutless = new CustomNether("reinforcedquartzblockstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
  //public static CustomNether reinforcedchisledquartzblockstrutless = new CustomNether("reinforcedchisledquartzblockstrutless").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	
	
	
	
	public static BlockReinforcer blockreinforcermachine = new BlockReinforcer("blockreinforcermachine").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				reinforced_oak_planks,
				reinforced_birch_planks,
				reinforced_spruce_planks,
				reinforced_jungle_planks,
				reinforced_acacia_planks,
				reinforced_dark_oak_planks,
				reinforcedbrick,
				reinforcedcobblestone,
				reinforcedmossycobblestone,
				reinforcedstone,
				reinforcedandesite,
				reinforcedandesitesmooth,
				reinforcedstonebrick,
				reinforcedstonebrickcarved,
				reinforcedstonebrickcracked,
				reinforcedstonebrickmossy,
				reinforceddorite,
				reinforceddoritesmooth,
				reinforcedgranite,
				reinforcedgranitesmooth,
				reinforcedglass,
				reinforcedclay,
				reinforcedclayblue,
				reinforcedclaybrown,
				reinforcedclaycyan,
				reinforcedclaygray,
				reinforcedclaygreen,
				reinforcedclaylightblue,
				reinforcedclaylime,
				reinforcedclaymagenta,
				reinforcedclayorange,
				reinforcedclaypink,
				reinforcedclaypurple,
				reinforcedclayred,
				reinforcedclaysilver,
				reinforcedclaywhite,
				reinforcedclayyellow,
				reinforcedclayblack,
				reinforced_oak_planks_strutless,
				reinforced_birch_planks_strutless,
				reinforced_spruce_planks_strutless,
				reinforced_jungle_planks_strutless,
				reinforced_acacia_planks_strutless,
				reinforced_dark_oak_planks_strutless,
				reinforcedbrickstrutless,
				reinforcedcobblestonestrutless,
				reinforcedmossycobblestonestrutless,
				reinforcedstonestrutless,
				reinforcedandesitestrutless,
				reinforcedandesitesmoothstrutless,
				reinforcedstonebrickstrutless,
				reinforcedstonebrickcarvedstrutless,
				reinforcedstonebrickcrackedstrutless,
				reinforcedstonebrickmossystrutless,
				reinforceddoritestrutless,
				reinforceddoritesmoothstrutless,
				reinforcedgranitestrutless,
				reinforcedgranitesmoothstrutless,
				reinforcedclaystrutless,
				reinforcedclaybluestrutless,
				reinforcedclaybrownstrutless,
				reinforcedclaycyanstrutless,
				reinforcedclaygraystrutless,
				reinforcedclaygreenstrutless,
				reinforcedclaylightbluestrutless,
				reinforcedclaylimestrutless,
				reinforcedclaymagentastrutless,
				reinforcedclayorangestrutless,
				reinforcedclaypinkstrutless,
				reinforcedclaypurplestrutless,
				reinforcedclayredstrutless,
				reinforcedclaysilverstrutless,
				reinforcedclaywhitestrutless,
				reinforcedclayyellowstrutless,
				reinforcedclayblackstrutless,
				blockreinforcermachine,
				//reinforcedchisledquartzblock,
				reinforcedquartzblock,
				reinforcedironblock,
				//reinforcedchisledquartzblockstrutless,
				reinforcedquartzblockstrutless,
				reinforcedironblockstrutless
				
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			reinforced_oak_planks.createItemBlock(),
			reinforced_birch_planks.createItemBlock(),
			reinforced_spruce_planks.createItemBlock(),
			reinforced_jungle_planks.createItemBlock(),
			reinforced_dark_oak_planks.createItemBlock(),
			reinforced_acacia_planks.createItemBlock(),
			reinforcedbrick.createItemBlock(),
			reinforcedcobblestone.createItemBlock(),
			reinforcedmossycobblestone.createItemBlock(),
			reinforcedstone.createItemBlock(),
			reinforcedandesite.createItemBlock(),
			reinforcedandesitesmooth.createItemBlock(),
			reinforcedstonebrick.createItemBlock(),
			reinforcedstonebrickcarved.createItemBlock(),
			reinforcedstonebrickcracked.createItemBlock(),
			reinforcedstonebrickmossy.createItemBlock(),
			reinforceddorite.createItemBlock(),
			reinforceddoritesmooth.createItemBlock(),
			reinforcedgranite.createItemBlock(),
			reinforcedgranitesmooth.createItemBlock(),
			reinforcedglass.createItemBlock(),
			reinforcedclay.createItemBlock(),
			reinforcedclayblue.createItemBlock(),
			reinforcedclaybrown.createItemBlock(),
			reinforcedclaycyan.createItemBlock(),
			reinforcedclaygray.createItemBlock(),
			reinforcedclaygreen.createItemBlock(),
			reinforcedclaylightblue.createItemBlock(),
			reinforcedclaylime.createItemBlock(),
			reinforcedclaymagenta.createItemBlock(),
			reinforcedclayorange.createItemBlock(),
			reinforcedclaypink.createItemBlock(),
			reinforcedclaypurple.createItemBlock(),
			reinforcedclayred.createItemBlock(),
			reinforcedclaysilver.createItemBlock(),
			reinforcedclaywhite.createItemBlock(),
			reinforcedclayyellow.createItemBlock(),
			reinforcedclayblack.createItemBlock(),
			reinforced_oak_planks_strutless.createItemBlock(),
			reinforced_birch_planks_strutless.createItemBlock(),
			reinforced_spruce_planks_strutless.createItemBlock(),
			reinforced_jungle_planks_strutless.createItemBlock(),
			reinforced_dark_oak_planks_strutless.createItemBlock(),
			reinforced_acacia_planks_strutless.createItemBlock(),
			reinforcedbrickstrutless.createItemBlock(),
			reinforcedcobblestonestrutless.createItemBlock(),
			reinforcedmossycobblestonestrutless.createItemBlock(),
			reinforcedstonestrutless.createItemBlock(),
			reinforcedandesitestrutless.createItemBlock(),
			reinforcedandesitesmoothstrutless.createItemBlock(),
			reinforcedstonebrickstrutless.createItemBlock(),
			reinforcedstonebrickcarvedstrutless.createItemBlock(),
			reinforcedstonebrickcrackedstrutless.createItemBlock(),
			reinforcedstonebrickmossystrutless.createItemBlock(),
			reinforceddoritestrutless.createItemBlock(),
			reinforceddoritesmoothstrutless.createItemBlock(),
			reinforcedgranitestrutless.createItemBlock(),
			reinforcedgranitesmoothstrutless.createItemBlock(),
			reinforcedclaystrutless.createItemBlock(),
			reinforcedclaybluestrutless.createItemBlock(),
			reinforcedclaybrownstrutless.createItemBlock(),
			reinforcedclaycyanstrutless.createItemBlock(),
			reinforcedclaygraystrutless.createItemBlock(),
			reinforcedclaygreenstrutless.createItemBlock(),
			reinforcedclaylightbluestrutless.createItemBlock(),
			reinforcedclaylimestrutless.createItemBlock(),
			reinforcedclaymagentastrutless.createItemBlock(),
			reinforcedclayorangestrutless.createItemBlock(),
			reinforcedclaypinkstrutless.createItemBlock(),
			reinforcedclaypurplestrutless.createItemBlock(),
			reinforcedclayredstrutless.createItemBlock(),
			reinforcedclaysilverstrutless.createItemBlock(),
			reinforcedclaywhitestrutless.createItemBlock(),
			reinforcedclayyellowstrutless.createItemBlock(),
			reinforcedclayblackstrutless.createItemBlock(),
			blockreinforcermachine.createItemBlock(),
			//reinforcedchisledquartzblock.createItemBlock(),
			reinforcedquartzblock.createItemBlock(),
			reinforcedironblock.createItemBlock(),
			//reinforcedchisledquartzblockstrutless.createItemBlock(),
			reinforcedquartzblockstrutless.createItemBlock(),
			reinforcedironblockstrutless.createItemBlock()
		);
	
	}

	public static void registerModels() {
		reinforced_oak_planks.registerItemModel(Item.getItemFromBlock(reinforced_oak_planks));
		reinforced_birch_planks.registerItemModel(Item.getItemFromBlock(reinforced_birch_planks));
		reinforced_spruce_planks.registerItemModel(Item.getItemFromBlock(reinforced_spruce_planks));
		reinforced_jungle_planks.registerItemModel(Item.getItemFromBlock(reinforced_jungle_planks));
		reinforced_acacia_planks.registerItemModel(Item.getItemFromBlock(reinforced_acacia_planks));
		reinforced_dark_oak_planks.registerItemModel(Item.getItemFromBlock(reinforced_dark_oak_planks));
		reinforcedbrick.registerItemModel(Item.getItemFromBlock(reinforcedbrick));
		reinforcedcobblestone.registerItemModel(Item.getItemFromBlock(reinforcedcobblestone));
		reinforcedmossycobblestone.registerItemModel(Item.getItemFromBlock(reinforcedmossycobblestone));
		reinforcedstone.registerItemModel(Item.getItemFromBlock(reinforcedstone));
		reinforcedandesite.registerItemModel(Item.getItemFromBlock(reinforcedandesite));
		reinforcedandesitesmooth.registerItemModel(Item.getItemFromBlock(reinforcedandesitesmooth));
		reinforcedstonebrick.registerItemModel(Item.getItemFromBlock(reinforcedstonebrick));
		reinforcedstonebrickcarved.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickcarved));
		reinforcedstonebrickcracked.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickcracked));
		reinforcedstonebrickmossy.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickmossy));
		reinforceddorite.registerItemModel(Item.getItemFromBlock(reinforceddorite));
		reinforceddoritesmooth.registerItemModel(Item.getItemFromBlock(reinforceddoritesmooth));
		reinforcedgranite.registerItemModel(Item.getItemFromBlock(reinforcedgranite));
		reinforcedgranitesmooth.registerItemModel(Item.getItemFromBlock(reinforcedgranitesmooth));
        reinforcedglass.registerItemModel(Item.getItemFromBlock(reinforcedglass));
        reinforcedclay.registerItemModel(Item.getItemFromBlock(reinforcedclay));
		reinforcedclayblue.registerItemModel(Item.getItemFromBlock(reinforcedclayblue));
		reinforcedclaybrown.registerItemModel(Item.getItemFromBlock(reinforcedclaybrown));
		reinforcedclaycyan.registerItemModel(Item.getItemFromBlock(reinforcedclaycyan));
		reinforcedclaygray.registerItemModel(Item.getItemFromBlock(reinforcedclaygray));
		reinforcedclaygreen.registerItemModel(Item.getItemFromBlock(reinforcedclaygreen));
		reinforcedclaylightblue.registerItemModel(Item.getItemFromBlock(reinforcedclaylightblue));
		reinforcedclaylime.registerItemModel(Item.getItemFromBlock(reinforcedclaylime));
		reinforcedclaymagenta.registerItemModel(Item.getItemFromBlock(reinforcedclaymagenta));
		reinforcedclayorange.registerItemModel(Item.getItemFromBlock(reinforcedclayorange));
		reinforcedclaypink.registerItemModel(Item.getItemFromBlock(reinforcedclaypink));
		reinforcedclaypurple.registerItemModel(Item.getItemFromBlock(reinforcedclaypurple));
		reinforcedclayred.registerItemModel(Item.getItemFromBlock(reinforcedclayred));
		reinforcedclaysilver.registerItemModel(Item.getItemFromBlock(reinforcedclaysilver));
		reinforcedclaywhite.registerItemModel(Item.getItemFromBlock(reinforcedclaywhite));
		reinforcedclayyellow.registerItemModel(Item.getItemFromBlock(reinforcedclayyellow));
	    reinforcedclayblack.registerItemModel(Item.getItemFromBlock(reinforcedclayblack));
	    reinforced_oak_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_oak_planks_strutless));
		reinforced_birch_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_birch_planks_strutless));
		reinforced_spruce_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_spruce_planks_strutless));
		reinforced_jungle_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_jungle_planks_strutless));
		reinforced_acacia_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_acacia_planks_strutless));
		reinforced_dark_oak_planks_strutless.registerItemModel(Item.getItemFromBlock(reinforced_dark_oak_planks_strutless));
		reinforcedbrickstrutless.registerItemModel(Item.getItemFromBlock(reinforcedbrickstrutless));
		reinforcedcobblestonestrutless.registerItemModel(Item.getItemFromBlock(reinforcedcobblestonestrutless));
		reinforcedmossycobblestonestrutless.registerItemModel(Item.getItemFromBlock(reinforcedmossycobblestonestrutless));
		reinforcedstonestrutless.registerItemModel(Item.getItemFromBlock(reinforcedstonestrutless));
		reinforcedandesitestrutless.registerItemModel(Item.getItemFromBlock(reinforcedandesitestrutless));
		reinforcedandesitesmoothstrutless.registerItemModel(Item.getItemFromBlock(reinforcedandesitesmoothstrutless));
		reinforcedstonebrickstrutless.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickstrutless));
		reinforcedstonebrickcarvedstrutless.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickcarvedstrutless));
		reinforcedstonebrickcrackedstrutless.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickcrackedstrutless));
		reinforcedstonebrickmossystrutless.registerItemModel(Item.getItemFromBlock(reinforcedstonebrickmossystrutless));
		reinforceddoritestrutless.registerItemModel(Item.getItemFromBlock(reinforceddoritestrutless));
		reinforceddoritesmoothstrutless.registerItemModel(Item.getItemFromBlock(reinforceddoritesmoothstrutless));
		reinforcedgranitestrutless.registerItemModel(Item.getItemFromBlock(reinforcedgranitestrutless));
		reinforcedgranitesmoothstrutless.registerItemModel(Item.getItemFromBlock(reinforcedgranitesmoothstrutless));
        reinforcedclaystrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaystrutless));
		reinforcedclaybluestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaybluestrutless));
		reinforcedclaybrownstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaybrownstrutless));
		reinforcedclaycyanstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaycyanstrutless));
		reinforcedclaygraystrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaygraystrutless));
		reinforcedclaygreenstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaygreenstrutless));
		reinforcedclaylightbluestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaylightbluestrutless));
		reinforcedclaylimestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaylimestrutless));
		reinforcedclaymagentastrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaymagentastrutless));
		reinforcedclayorangestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclayorangestrutless));
		reinforcedclaypinkstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaypinkstrutless));
		reinforcedclaypurplestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaypurplestrutless));
		reinforcedclayredstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclayredstrutless));
		reinforcedclaysilverstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaysilverstrutless));
		reinforcedclaywhitestrutless.registerItemModel(Item.getItemFromBlock(reinforcedclaywhitestrutless));
		reinforcedclayyellowstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclayyellowstrutless));
	    reinforcedclayblackstrutless.registerItemModel(Item.getItemFromBlock(reinforcedclayblackstrutless));
	    blockreinforcermachine.registerItemModel(Item.getItemFromBlock(blockreinforcermachine));
	    //reinforcedchisledquartzblock.registerItemModel(Item.getItemFromBlock(reinforcedchisledquartzblock));
	    reinforcedquartzblock.registerItemModel(Item.getItemFromBlock(reinforcedquartzblock));
	    reinforcedironblock.registerItemModel(Item.getItemFromBlock(reinforcedironblock));
	    //reinforcedchisledquartzblockstrutless.registerItemModel(Item.getItemFromBlock(reinforcedchisledquartzblockstrutless));
		reinforcedquartzblockstrutless.registerItemModel(Item.getItemFromBlock(reinforcedquartzblockstrutless));
		reinforcedironblockstrutless.registerItemModel(Item.getItemFromBlock(reinforcedironblockstrutless));
		
	}

}
