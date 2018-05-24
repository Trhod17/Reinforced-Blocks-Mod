package trhod177.rbm.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLogic;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm.ReinforcedBlocksMod;

public class CustomClayStrutless extends CustomBlock {

	public CustomClayStrutless(String name) {
		super(Material.ROCK , name);
		
		setHardness(10f);
		setResistance(6000f);
        this.setHarvestLevel("pickaxe", 2);
		
	}
	
	@Override
	public CustomClayStrutless setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab2);
		return this;
	}

}
