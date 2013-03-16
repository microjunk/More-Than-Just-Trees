package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelFlameCactus implements IFuelHandler 
{
	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.itemID == Trees.flameCactus.blockID)
			return 2000;
		else
			return 0;
	}
}
