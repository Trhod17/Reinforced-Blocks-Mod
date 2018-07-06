package trhod177.rbm.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import trhod177.rbm.Reference;
import trhod177.rbm.blocks.machines.reinforcer.ContainerBlockReinforcer;
import trhod177.rbm.blocks.machines.reinforcer.GuiBlockReinforcer;
import trhod177.rbm.blocks.machines.reinforcer.TileEntityBlockReinforcer;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_MachineReinforcer) return new ContainerBlockReinforcer(player.inventory, (TileEntityBlockReinforcer)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_MachineReinforcer) return new GuiBlockReinforcer(player.inventory, (TileEntityBlockReinforcer)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}