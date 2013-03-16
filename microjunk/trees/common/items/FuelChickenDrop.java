package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelChickenDrop implements IFuelHandler 
{
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.itemID == Trees.chickenDrop.itemID)
			return 1000;
		else
			return 0;
	}
}
