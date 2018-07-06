package trhod177.rbm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm.ReinforcedBlocksMod;

public class CustomClay extends CustomBlock {

	public CustomClay(String name) {
		super(Material.ROCK, name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
	public CustomClay setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab);
		return this;
	}

}
