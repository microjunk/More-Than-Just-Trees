package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChickenDrop extends Item
{

	public ItemChickenDrop(int i)
	{
		
		super(i);
		maxStackSize = 16;
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
}
