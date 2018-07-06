package trhod177.rbm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm.ReinforcedBlocksMod;

public class CustomStone extends CustomBlock {
	
	public CustomStone(String name) {
		super(Material.ROCK, name);
     	
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
	public CustomStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab);
		return this;
	}
	
	

}



