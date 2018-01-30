package trhod177.rbm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import trhod177.rbm.ReinforcedBlocksMod;

public class CustomBlock extends Block {


	protected String name;

	public CustomBlock(Material material, String name) {
		
		super(material.ROCK);
		this.name = name;
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("axe", 2);
	}
	
	public void registerItemModel(Item itemBlock) {
		ReinforcedBlocksMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public CustomBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}


