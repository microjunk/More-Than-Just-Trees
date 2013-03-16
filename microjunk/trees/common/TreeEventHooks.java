package microjunk.trees.common;

import microjunk.trees.common.travel.EntityLavaBoat;
import net.minecraft.entity.DataWatcher;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class TreeEventHooks
{
	public boolean isImmuneToFire;
	private Object dataWatcher;
	
    @ForgeSubscribe
    public void entityDrops(LivingDropsEvent var1)
    {
        EntityLiving var2 = var1.entityLiving;
        DamageSource var3 = var1.source;
        boolean var4 = var1.recentlyHit;

        if (var4 && var3.getEntity() instanceof EntityPlayer)
        {
            if (var2 instanceof EntitySquid)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(Trees.pearl, 1)));
            }

            if (var2 instanceof EntityOcelot)
            {
                var1.drops.add(new EntityItem(var2.worldObj, var2.posX, var2.posY, var2.posZ, new ItemStack(Trees.catseye, 1)));
            }
        }
    }
    
}
