package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLambFriesRaw extends ItemFood
{

	public ItemLambFriesRaw(int i, int j, float f, boolean b)
	{
		
		super(i, j, f, b);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        //par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 100, 2));
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        return par1ItemStack;
    }
	
	
	
	public String getTextureFile()
    {
            return "/microjunk/trees/common/aart/Items.png";
    }
	
}
