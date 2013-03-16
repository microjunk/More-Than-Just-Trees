package microjunk.trees.common.weapons;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityDiggingFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class EntityIceArrow extends EntityArrow
{
    public EntityIceArrow(World var1, EntityLiving var2, EntityLiving var3, float var4, float var5)
    {
        super(var1, var2, var3, var4, var5);
    }

    public EntityIceArrow(World var1, EntityLiving var2, float var3)
    {
        super(var1, var2, var3);
    }

    public EntityIceArrow(World var1, double var2, double var4, double var6)
    {
        super(var1, var2, var4, var6);
    }

    public EntityIceArrow(World var1)
    {
        super(var1);
    }

    public ItemStack getItem()
    {
        return new ItemStack(Trees.iceArrow, 1);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (!this.onGround)
        {
            Minecraft var1 = ModLoader.getMinecraftInstance();
            int var2;

            for (var2 = 0; var2 < 5; ++var2)
            {
                var1.effectRenderer.addEffect(new EntityDiggingFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, Block.ice, 0, 0));
                var1.effectRenderer.addEffect(new EntityDiggingFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, Block.blockSnow, 0, 0));
            }

            var2 = (int)this.posX;
            int var3 = (int)this.posY;
            int var4 = (int)this.posZ;

            if (this.worldObj.getBlockMaterial(var2, var3, var4) == Material.water || this.worldObj.getBlockMaterial(var2, var3, var4) == Material.lava)
            {
                this.hitGround(var2, var3, var4, -1, this.worldObj.getBlockId(var2, var3, var4));
            }
        }
    }

    public void hitGround(int var1, int var2, int var3, int var4, int var5)
    {
        if (var4 == 0)
        {
            --var2;
        }

        if (var4 == 1)
        {
            ++var2;
        }

        if (var4 == 2)
        {
            --var3;
        }

        if (var4 == 3)
        {
            ++var3;
        }

        if (var4 == 4)
        {
            --var1;
        }

        if (var4 == 5)
        {
            ++var1;
        }

        for (int var6 = var1 - 1; var6 <= var1 + 1; ++var6)
        {
            for (int var7 = var2 - 1; var7 <= var2 + 1; ++var7)
            {
                for (int var8 = var3 - 1; var8 <= var3 + 1; ++var8)
                {
                    boolean var9 = false;

                    if (this.worldObj.getBlockMaterial(var6, var7, var8) == Material.water && this.worldObj.getBlockMetadata(var6, var7, var8) == 0)
                    {
                        this.worldObj.setBlockAndMetadataWithNotify(var6, var7, var8, Block.ice.blockID, 0);
                        var9 = true;
                    }
                    else if (this.worldObj.getBlockMaterial(var6, var7, var8) == Material.lava && this.worldObj.getBlockMetadata(var6, var7, var8) == 0)
                    {
                        this.worldObj.setBlockAndMetadataWithNotify(var6, var7, var8, Block.obsidian.blockID, 0);
                        var9 = true;
                    }
                    else if (this.worldObj.getBlockId(var6, var7, var8) == Block.fire.blockID)
                    {
                        this.worldObj.setBlockAndMetadataWithNotify(var6, var7, var8, 0, 0);
                        var9 = true;
                    }
                    else if (this.worldObj.getBlockId(var6, var7, var8) == Block.torchWood.blockID)
                    {
                        Block.torchWood.dropBlockAsItem(this.worldObj, var6, var7, var8, this.worldObj.getBlockMetadata(var6, var7, var8), 1);
                        this.worldObj.setBlockAndMetadata(var6, var7, var8, 0, 0);
                        Block.torchWood.getCollisionBoundingBoxFromPool(this.worldObj, var6, var7, var8);
                        var9 = true;
                    }

                    if (var9)
                    {
                        this.worldObj.blockExists(var6, var7, var8);
                        Minecraft var10 = ModLoader.getMinecraftInstance();

                        for (int var11 = 0; var11 < 50; ++var11)
                        {
                            EntityBreakingFX var12 = new EntityBreakingFX(this.worldObj, (double)var6 + 0.5D, (double)var7 + 0.5D, (double)var8 + 0.5D, Item.snowball);
                            float var13 = 0.25F;
                            var12.motionX = (double)((float)this.worldObj.rand.nextGaussian() * var13);
                            var12.motionY = (double)((float)this.worldObj.rand.nextGaussian() * var13 + 0.2F);
                            var12.motionZ = (double)((float)this.worldObj.rand.nextGaussian() * var13);
                            var10.effectRenderer.addEffect(var12);
                        }

                        this.setDead();
                    }
                }
            }
        }
    }

    public boolean validTarget(EntityLiving var1)
    {
        return true;
    }

    public boolean hitTarget(Entity var1)
    {
        return true;
    }
}
