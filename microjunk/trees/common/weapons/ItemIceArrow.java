package microjunk.trees.common.weapons;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;

public class ItemIceArrow extends Item
{
	public ItemIceArrow(int i)
	{
		super(i);
		this.maxStackSize = 64;
		this.setCreativeTab(Trees.tabTreeCombat);
	}
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
}
