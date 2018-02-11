package trhod177.rbm.blocks;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import trhod177.rbm.ReinforcedBlocksMod;
import trhod177.rbm.init.BlockInit;


	public class CustomWoodStrutless extends CustomBlock {

		
		
		public CustomWoodStrutless(String name) {
			super(Material.WOOD, name);
		
			setHardness(25f);
			setResistance(6000f);
			this.setHarvestLevel("axe", 2);
			
			
		}
		
		
		
		@Override
		public CustomWoodStrutless setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab2);
			return this;
		}
		
		

	}

