package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAvocado extends ItemFood
{

	public ItemAvocado(int i, int j, float f, boolean b)
	{
		super(i, j, f, b);
		this.setCreativeTab(Trees.tabTreeThings);
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
}
