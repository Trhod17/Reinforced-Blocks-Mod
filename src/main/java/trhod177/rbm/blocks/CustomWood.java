package trhod177.rbm.blocks;



import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import trhod177.rbm.ReinforcedBlocksMod;
import trhod177.rbm.init.BlockInit;


	public class CustomWood extends CustomBlock {

		
		public CustomWood(String name) {
			super(Material.WOOD, name);
		
			setHardness(10f);
			setResistance(6000f);
			this.setHarvestLevel("axe", 2);
			
			
		}
		
		
		
		@Override
		public CustomWood setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmodtab);
			return this;
		}
		
	

	}

