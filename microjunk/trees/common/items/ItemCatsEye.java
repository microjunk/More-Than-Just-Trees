package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;

public class ItemCatsEye extends Item
{

	public ItemCatsEye(int i)
	{
		
		super(i);
		maxStackSize = 16;
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/HD_flowers.png";
    }
	
	
}
