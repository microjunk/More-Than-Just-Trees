package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWorkHammer extends Item
{

	public ItemWorkHammer(int i)
	{
		
		super(i);
		this.maxStackSize = 1;
        this.setContainerItem(this);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
}
