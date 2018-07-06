package trhod177.rbm.blocks.machines.reinforcer;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import trhod177.rbm.init.BlockInit;
import trhod177.rbm.init.ItemInit;

public class BlockReinforcerRecipes {

	
	private static final BlockReinforcerRecipes INSTANCE = new BlockReinforcerRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static BlockReinforcerRecipes getInstance()
	{
		return INSTANCE;
	}
	private BlockReinforcerRecipes() 
	{
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,4), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_acacia_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,0), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_oak_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_spruce_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,2), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_birch_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,3), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_jungle_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,5), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforced_dark_oak_planks, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.BRICK_BLOCK,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedbrick, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.COBBLESTONE,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedcobblestone, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedmossycobblestone, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedstone, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedgranite, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,2), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedgranitesmooth, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,3), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforceddorite, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,4), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforceddoritesmooth, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,5), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedandesite, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,6), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedandesitesmooth, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedstonebrick, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedstonebrickmossy, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,2), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedstonebrickcracked, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,3), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedstonebrickcarved, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.GLASS,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedglass, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,0), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclay, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,1), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclayorange, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,2), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaymagenta, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,3), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaylightblue, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,4), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclayyellow, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,5), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaylime, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,6), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaypink, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,7), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaygray, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,8), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaysilver, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,9), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaycyan, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,10), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaypurple, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,11), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclayblue, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,12), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaybrown, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,13), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclaygreen, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,14), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclayred, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedclayblack, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.QUARTZ_BLOCK), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedquartzblock, 4), 5.0F);	
		addBlockReinforcerRecipe(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(ItemInit.ObsidianReinforcement), new ItemStack(BlockInit.reinforcedironblock, 4), 5.0F);	
		
		
		
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,4), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_acacia_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,0), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_oak_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_spruce_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,2), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_birch_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,3), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_jungle_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.PLANKS,1,5), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforced_dark_oak_planks_strutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.BRICK_BLOCK,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedbrickstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.COBBLESTONE,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedcobblestonestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedmossycobblestonestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedstonestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedgranitestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,2), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedgranitesmoothstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,3), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforceddoritestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,4), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforceddoritesmoothstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,5), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedandesitestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONE,1,6), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedandesitesmoothstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedstonebrickstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedstonebrickmossystrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,2), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedstonebrickcrackedstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STONEBRICK,1,3), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedstonebrickcarvedstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,0), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaystrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,1), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclayorangestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,2), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaymagentastrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,3), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaylightbluestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,4), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclayyellowstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,5), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaylimestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,6), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaypinkstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,7), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaygraystrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,8), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaysilverstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,9), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaycyanstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,10), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaypurplestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,11), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaybluestrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,12), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaybrownstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,13), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclaygreenstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,14), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclayredstrutless, 4), 5.0F);
		addBlockReinforcerRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedclayblackstrutless, 4), 5.0F);
	    addBlockReinforcerRecipe(new ItemStack(Blocks.QUARTZ_BLOCK), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedquartzblockstrutless, 4), 5.0F);	
	    addBlockReinforcerRecipe(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(ItemInit.GlassReinforcement), new ItemStack(BlockInit.reinforcedironblockstrutless, 4), 5.0F);	
	
	}

	
	public void addBlockReinforcerRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getBlockReinforcerResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getBlockReinforcerResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getBlockReinforcerExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
