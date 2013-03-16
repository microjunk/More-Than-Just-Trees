package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;

public class ItemMoonstoneGemStone extends Item
{

	public ItemMoonstoneGemStone(int i)
	{
		
		super(i);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
}