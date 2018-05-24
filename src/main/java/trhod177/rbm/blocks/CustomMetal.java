package trhod177.rbm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm.ReinforcedBlocksMod;

public class CustomMetal extends CustomBlock {
	
	public CustomMetal(String name) {
		super(Material.IRON, name);
     	
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
	public CustomMetal setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab);
		return this;
	}
}
