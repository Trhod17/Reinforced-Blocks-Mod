package trhod177.rbm.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import trhod177.rbm.init.BlockInit;
import trhod177.rbm.init.ItemInit;
import trhod177.rbm.handlers.RBMCraftingHelper;

public class RecipeHandler {

	public static void registerCrafting() {
		
		//GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_oak_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS), 'O', Blocks.OBSIDIAN});
		//GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_birch_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS, 1), 'O', Blocks.OBSIDIAN});
		//GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_spruce_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS, 2), 'O', Blocks.OBSIDIAN});
		//GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_jungle_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS, 3), 'O', Blocks.OBSIDIAN});
		//GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_acacia_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS, 4), 'O', Blocks.OBSIDIAN});
	    //GameRegistry.addShapedRecipe(new ResourceLocation("rbm"), new ResourceLocation("rbm"), new ItemStack(BlockInit.reinforced_dark_oak_planks,8), new Object[] {"PPP","POP","PPP", 'P', new ItemStack(Blocks.PLANKS, 5), 'O', Blocks.OBSIDIAN});
		RBMCraftingHelper.addShapedRecipe(new ItemStack(BlockInit.blockreinforcermachine,1), new Object[]{"SSS", "ODO", "SSS", 'S', Blocks.STONE, 'O', Blocks.OBSIDIAN, 'D', Items.DIAMOND});
	    
	}
	
   
	
	
	public static void registerSmelting() {
		
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ItemInit.ObsidianReinforcement, 8), 1.0F);
		GameRegistry.addSmelting(ItemInit.StrutMold, new ItemStack(ItemInit.redhotstrutmold), 1.0F);
	}
	
	
	
}