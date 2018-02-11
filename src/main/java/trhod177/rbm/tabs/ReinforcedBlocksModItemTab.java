package trhod177.rbm.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod177.rbm.init.BlockInit;
import trhod177.rbm.init.ItemInit;

public class ReinforcedBlocksModItemTab extends CreativeTabs {


	public ReinforcedBlocksModItemTab(String label) {
		super("reinforcedblocksmoditemtab");
		this.setBackgroundImageName("rbmt.png");
		
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ObsidianReinforcement);
		
	}
}
