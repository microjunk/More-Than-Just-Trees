package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBigFeather extends Item
{

	public ItemBigFeather(int i)
	{
		
		super(i);
		maxStackSize = 16;
		lehfeatherID = itemID;
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
	public static int lehfeatherID;
	
}
