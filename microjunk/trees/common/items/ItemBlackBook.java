package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBlackBook extends Item
{
	private Item containerItem = null;
	
    public ItemBlackBook(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setContainerItem(this);
        this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
	/**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 1;
    }
}
