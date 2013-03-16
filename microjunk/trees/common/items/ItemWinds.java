package microjunk.trees.common.items;

import microjunk.trees.common.Trees;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemWinds extends Item
{

	public ItemWinds(int i)
	{
		
		super(i);
		maxStackSize = 1;
		this.setCreativeTab(Trees.tabTreeThings);
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Items.png";
    }
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        MovingObjectPosition movingobjectposition = entityplayer.rayTrace(70D, 1.0F);

        if (movingobjectposition == null)
        {
            return itemstack;
        }

        Vec3 vec3d = movingobjectposition.hitVec;
        double d = vec3d.xCoord;
        double d1 = vec3d.yCoord;
        double d2 = vec3d.zCoord;
        int i = MathHelper.floor_double(d);
        int j = MathHelper.floor_double(d1);
        int k = MathHelper.floor_double(d2);

        if (!world.canBlockSeeTheSky(i, j, k))
        {
            return itemstack;
        }

        EntityWind entitywind = new EntityWind(world);
        entitywind.setLocationAndAngles(d, d1, d2, 0.0F, 0.0F);
        world.spawnEntityInWorld(entitywind);
        itemstack.damageItem(1, entityplayer);

        return itemstack;
    }

    public boolean hasEffect(ItemStack itemstack)
    {
        return true;
    }
	
}