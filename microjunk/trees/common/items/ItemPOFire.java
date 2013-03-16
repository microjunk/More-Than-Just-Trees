package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemPOFire extends Item
{
    public ItemPOFire(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(64);
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        world.playSoundAtEntity(entityplayer, "fire.ignite", 0.2F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        world.spawnEntityInWorld(new EntityTreeFire(world, entityplayer));
        itemstack.damageItem(1, entityplayer);
        return itemstack;
    }
}
