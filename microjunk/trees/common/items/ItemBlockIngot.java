package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;

public class ItemBlockIngot extends Item
{

	public ItemBlockIngot(int i)
	{
		
		super(i);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
}