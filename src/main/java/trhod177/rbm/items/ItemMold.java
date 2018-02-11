package trhod177.rbm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import trhod177.rbm.ReinforcedBlocksMod;
import trhod177.rbm.init.ItemInit;

public class ItemMold extends Item {
	
	protected String name;

	public ItemMold(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setContainerItem(ItemInit.StrutMold);
	}
	
	public void registerItemModel() {
		ReinforcedBlocksMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemMold setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod.reinforcedblocksmoditemtab);
		return this;

}
	
	
	
	
}
