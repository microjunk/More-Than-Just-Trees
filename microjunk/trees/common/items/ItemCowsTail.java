package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;

public class ItemCowsTail extends Item
{

	public ItemCowsTail(int i)
	{
		
		super(i);
		this.setMaxStackSize(16);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
            return "/microjunk/trees/common/aart/Items.png";
    }
	
}
