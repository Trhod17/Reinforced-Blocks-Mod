package trhod177.rbm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm.init.BlockInit;

public class ReinforcedBlocksModTab extends CreativeTabs {

	
	public ReinforcedBlocksModTab(String label) {
		super("reinforcedblocksmodtab");
		this.setBackgroundImageName("rbmt.png");
		
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.reinforced_oak_planks));
		
	}
}
