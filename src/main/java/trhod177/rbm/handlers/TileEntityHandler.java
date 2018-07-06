package trhod177.rbm.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod177.rbm.blocks.machines.reinforcer.TileEntityBlockReinforcer;

public class TileEntityHandler {
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlockReinforcer.class, "blockreinforcer");
	}

}
