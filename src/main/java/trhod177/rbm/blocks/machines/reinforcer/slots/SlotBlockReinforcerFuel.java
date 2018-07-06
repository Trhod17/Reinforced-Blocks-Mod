package trhod177.rbm.blocks.machines.reinforcer.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import trhod177.rbm.blocks.machines.reinforcer.TileEntityBlockReinforcer;

public class SlotBlockReinforcerFuel extends Slot
{
	public SlotBlockReinforcerFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityBlockReinforcer.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}