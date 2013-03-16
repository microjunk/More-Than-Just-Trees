package microjunk.trees.common.blocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;

public class ExplosionBlackTnT
{
    public boolean isFlaming = false;
    private Random ExplosionRNG = new Random();
    private World worldObj;
    public double explosionX;
    public double explosionY;
    public double explosionZ;
    public Entity exploder;
    public float explosionSize;
    public Set destroyedBlockPositions = new HashSet();

    public ExplosionBlackTnT(World var1, Entity var2, double var3, double var5, double var7, float var9)
    {
        this.worldObj = var1;
        this.exploder = var2;
        this.explosionSize = var9;
        this.explosionX = var3;
        this.explosionY = var5;
        this.explosionZ = var7;
    }

    public void doExplosionA()
    {
        float var1 = this.explosionSize;
        byte var2 = 64;
        int var3;
        int var4;
        int var5;
        double var6;
        double var8;
        double var10;

        for (var3 = 0; var3 < var2; ++var3)
        {
            for (var4 = 0; var4 < var2; ++var4)
            {
                for (var5 = 0; var5 < var2; ++var5)
                {
                    if (var3 == 0 || var3 == var2 - 1 || var4 == 0 || var4 == var2 - 1 || var5 == 0 || var5 == var2 - 1)
                    {
                        double var12 = (double)((float)var3 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                        double var14 = (double)((float)var4 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                        double var16 = (double)((float)var5 / ((float)var2 - 1.0F) * 2.0F - 1.0F);
                        double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
                        var12 /= var18;
                        var14 /= var18;
                        var16 /= var18;
                        float var20 = this.explosionSize * (0.7F + this.worldObj.rand.nextFloat() * 0.6F);
                        var6 = this.explosionX;
                        var8 = this.explosionY;
                        var10 = this.explosionZ;

                        for (float var21 = 0.3F; var20 > 0.0F; var20 -= var21 * 0.75F)
                        {
                            int var22 = MathHelper.floor_double(var6);
                            int var23 = MathHelper.floor_double(var8);
                            int var24 = MathHelper.floor_double(var10);
                            int var25 = this.worldObj.getBlockId(var22, var23, var24);

                            if (var25 > 0)
                            {
                                var20 -= (Block.blocksList[var25].getExplosionResistance(this.exploder) + 0.3F) * var21;
                            }

                            if (var20 > 0.0F)
                            {
                                this.destroyedBlockPositions.add(new ChunkPosition(var22, var23, var24));
                            }

                            var6 += var12 * (double)var21 * 0.7D;
                            var8 += var14 * (double)var21 * 1.5D;
                            var10 += var16 * (double)var21 * 0.7D;
                        }
                    }
                }
            }
        }

        this.explosionSize *= 2.0F;
        var3 = MathHelper.floor_double(this.explosionX - (double)this.explosionSize - 1.0D);
        var4 = MathHelper.floor_double(this.explosionX + (double)this.explosionSize + 1.0D);
        var5 = MathHelper.floor_double(this.explosionY - (double)this.explosionSize - 1.0D);
        int var27 = MathHelper.floor_double(this.explosionY + (double)this.explosionSize + 1.0D);
        int var13 = MathHelper.floor_double(this.explosionZ - (double)this.explosionSize - 1.0D);
        int var28 = MathHelper.floor_double(this.explosionZ + (double)this.explosionSize + 1.0D);
        List var15 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this.exploder, AxisAlignedBB.getBoundingBox((double)var3, (double)var5, (double)var13, (double)var4, (double)var27, (double)var28));
        Vec3 var29 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.explosionX, this.explosionY, this.explosionZ);

        for (int var17 = 0; var17 < var15.size(); ++var17)
        {
            Entity var31 = (Entity)var15.get(var17);
            double var19 = var31.getDistance(this.explosionX, this.explosionY, this.explosionZ) / (double)this.explosionSize;

            if (var19 <= 1.0D)
            {
                var6 = var31.posX - this.explosionX;
                var8 = var31.posY - this.explosionY;
                var10 = var31.posZ - this.explosionZ;
                double var33 = (double)MathHelper.sqrt_double(var6 * var6 + var8 * var8 + var10 * var10);
                var6 /= var33;
                var8 /= var33;
                var10 /= var33;
                double var32 = (double)this.worldObj.getBlockDensity(var29, var31.boundingBox);
                double var34 = (1.0D - var19) * var32;
                var31.attackEntityFrom(DamageSource.explosion, (int)((var34 * var34 + var34) / 2.0D * 8.0D * (double)this.explosionSize + 1.0D));
                var31.motionX += var6 * var34;
                var31.motionY += var8 * var34;
                var31.motionZ += var10 * var34;
            }
        }

        this.explosionSize = var1;
        ArrayList var30 = new ArrayList();
        var30.addAll(this.destroyedBlockPositions);
    }

    public void doExplosionB(boolean var1)
    {
        this.worldObj.playSoundEffect(this.explosionX, this.explosionY, this.explosionZ, "random.explode", 4.0F, (1.0F + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F) * 0.7F);
        this.worldObj.spawnParticle("hugeexplosion", this.explosionX, this.explosionY, this.explosionZ, 0.0D, 0.0D, 0.0D);
        ArrayList var2 = new ArrayList();
        var2.addAll(this.destroyedBlockPositions);
        int var3;
        ChunkPosition var4;
        int var5;
        int var6;
        int var7;
        int var8;

        for (var3 = var2.size() - 1; var3 >= 0; --var3)
        {
            var4 = (ChunkPosition)var2.get(var3);
            var5 = var4.x;
            var6 = var4.y;
            var7 = var4.z;
            var8 = this.worldObj.getBlockId(var5, var6, var7);

            if (var1)
            {
                double var9 = (double)((float)var5 + this.worldObj.rand.nextFloat());
                double var11 = (double)((float)var6 + this.worldObj.rand.nextFloat());
                double var13 = (double)((float)var7 + this.worldObj.rand.nextFloat());
                double var15 = var9 - this.explosionX;
                double var17 = var11 - this.explosionY;
                double var19 = var13 - this.explosionZ;
                double var21 = (double)MathHelper.sqrt_double(var15 * var15 + var17 * var17 + var19 * var19);
                var15 /= var21;
                var17 /= var21;
                var19 /= var21;
                double var23 = 0.5D / (var21 / (double)this.explosionSize + 0.1D);
                var23 *= (double)(this.worldObj.rand.nextFloat() * this.worldObj.rand.nextFloat() + 0.3F);
                var15 *= var23;
                var17 *= var23;
                var19 *= var23;
                this.worldObj.spawnParticle("explode", (var9 + this.explosionX * 1.0D) / 2.0D, (var11 + this.explosionY * 1.0D) / 2.0D, (var13 + this.explosionZ * 1.0D) / 2.0D, var15, var17, var19);
                this.worldObj.spawnParticle("smoke", var9, var11, var13, var15, var17, var19);
            }

            if (var8 > 0)
            {
                this.worldObj.setBlockWithNotify(var5, var6, var7, 0);
                Block.blocksList[var8].onBlockDestroyedByExplosion(this.worldObj, var5, var6, var7);
            }
        }

        if (this.isFlaming)
        {
            for (var3 = var2.size() - 1; var3 >= 0; --var3)
            {
                var4 = (ChunkPosition)var2.get(var3);
                var5 = var4.x;
                var6 = var4.y;
                var7 = var4.z;
                var8 = this.worldObj.getBlockId(var5, var6, var7);
                int var25 = this.worldObj.getBlockId(var5, var6 - 1, var7);

                if (var8 == 0 && Block.opaqueCubeLookup[var25] && this.ExplosionRNG.nextInt(3) == 0)
                {
                    this.worldObj.setBlockWithNotify(var5, var6, var7, Block.fire.blockID);
                }
            }
        }
    }
}