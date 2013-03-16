package microjunk.trees.common.weapons;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public abstract class EntityProjectile extends Entity
{
    protected int damage;
    protected int xTile = -1;
    protected int yTile = -1;
    protected int zTile = -1;
    private int inTile = 0;
    private int inData = 0;
    private boolean inGround = false;
    public boolean doesProjectileBelongToPlayer = false;
    public int arrowShake = 0;
    public EntityLiving owner;
    private int ticksInGround;
    private int ticksInAir = 0;

    public EntityProjectile(World var1)
    {
        super(var1);
        this.setSize(0.5F, 0.5F);
    }

    public EntityProjectile(World var1, double var2, double var4, double var6)
    {
        super(var1);
        this.setSize(0.5F, 0.5F);
        this.setPositionAndRotation(var2, var4, var6, 0.0F, 0.0F);
        this.yOffset = 0.0F;
    }

    public EntityProjectile(World var1, EntityLiving var2)
    {
        super(var1);
        this.owner = var2;
        this.doesProjectileBelongToPlayer = var2 instanceof EntityPlayer;
        this.setSize(0.5F, 0.5F);
        this.setLocationAndAngles(var2.posX, var2.posY + (double)var2.getEyeHeight(), var2.posZ, var2.rotationYaw, var2.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.1000000014901161D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPositionAndRotation(var2.posX, var2.posY + (double)var2.getEyeHeight(), var2.posZ, var2.rotationYaw, var2.rotationPitch);
        this.yOffset = 0.0F;
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
        this.setProjectileHeading(this.motionX, this.motionY, this.motionZ, 1.5F, 1.0F);
    }

    protected void entityInit() {}

    public void setProjectileHeading(double var1, double var3, double var5, float var7, float var8)
    {
        float var9 = MathHelper.sin((float)(var1 * var1 + var3 * var3 + var5 * var5));
        var1 /= (double)var9;
        var3 /= (double)var9;
        var5 /= (double)var9;
        var1 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var3 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var5 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
        var1 *= (double)var7;
        var3 *= (double)var7;
        var5 *= (double)var7;
        this.motionX = var1;
        this.motionY = var3;
        this.motionZ = var5;
        float var10 = MathHelper.sin((float)(var1 * var1 + var5 * var5));
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, (double)var10) * 180.0D / Math.PI);
        this.ticksInGround = 0;
    }

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    public void setVelocity(double var1, double var3, double var5)
    {
        this.motionX = var1;
        this.motionY = var3;
        this.motionZ = var5;

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float var7 = MathHelper.sin((float)(var1 * var1 + var5 * var5));
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / 4.141592741012573D);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, (double)var7) * 180.0D / 4.141592741012573D);
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.ticksInGround = 0;
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float var1 = MathHelper.sin((float)(this.motionX * this.motionX + this.motionZ * this.motionZ));
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var1) * 180.0D / Math.PI);
        }

        int var16 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);

        if (var16 > 0)
        {
            Block.blocksList[var16].setBlockBoundsBasedOnState(this.worldObj, this.xTile, this.yTile, this.zTile);
            AxisAlignedBB var2 = Block.blocksList[var16].getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);

            if (var2 != null && var2.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ)))
            {
                this.inGround = true;
            }
        }

        if (this.arrowShake > 0)
        {
            --this.arrowShake;
        }

        if (this.inGround)
        {
            int var17 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
            int var3 = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);

            if (var17 == this.inTile || var3 == this.inData)
            {
                this.Activate(this.worldObj, this.xTile, this.yTile, this.zTile);
                this.setDead();
                return;
            }
        }

        ++this.ticksInAir;
        Vec3 var18 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        Vec3 var19 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition var4 = this.worldObj.rayTraceBlocks_do_do(var18, var19, false, true);
        var18 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        var19 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (var4 != null)
        {
            var19 = Vec3.createVectorHelper(var4.hitVec.xCoord, var4.hitVec.yCoord, var4.hitVec.zCoord);
        }

        Entity var5 = null;
        List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
        double var7 = 0.0D;
        float var11;

        for (int var9 = 0; var9 < var6.size(); ++var9)
        {
            Entity var10 = (Entity)var6.get(var9);

            if (var10.canBeCollidedWith() && (var10 != this.owner || this.ticksInAir >= 5))
            {
                var11 = 0.3F;
                AxisAlignedBB var12 = var10.boundingBox.expand((double)var11, (double)var11, (double)var11);
                MovingObjectPosition var13 = var12.calculateIntercept(var18, var19);

                if (var13 != null)
                {
                    double var14 = var18.distanceTo(var13.hitVec);

                    if (var14 < var7 || var7 == 0.0D)
                    {
                        var5 = var10;
                        var7 = var14;
                    }
                }
            }
        }

        if (var5 != null)
        {
            var4 = new MovingObjectPosition(var5);
        }

        float var20;

        if (var4 != null)
        {
            if (var4.entityHit != null)
            {
                var4.entityHit.attackEntityFrom(DamageSource.magic, this.damage);
                this.ActivateOnEntity(var4.entityHit, this.worldObj, this.xTile, this.yTile, this.zTile);
                this.setDead();
            }
            else
            {
                this.motionX *= -0.1000000014901161D;
                this.motionY *= -0.1000000014901161D;
                this.motionZ *= -0.1000000014901161D;
                this.rotationYaw += 180.0F;
                this.prevRotationYaw += 180.0F;
                this.ticksInAir = 0;
            }

            this.xTile = var4.blockX;
            this.yTile = var4.blockY;
            this.zTile = var4.blockZ;
            this.inTile = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
            this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
            this.motionX = (double)((float)(var4.hitVec.xCoord - this.posX));
            this.motionY = (double)((float)(var4.hitVec.yCoord - this.posY));
            this.motionZ = (double)((float)(var4.hitVec.zCoord - this.posZ));
            var20 = MathHelper.sin((float)(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ));
            this.posX -= this.motionX / (double)var20 * 0.0500000007450581D;
            this.posY -= this.motionY / (double)var20 * 0.0500000007450581D;
            this.posZ -= this.motionZ / (double)var20 * 0.0500000007450581D;
            this.Activate(this.worldObj, this.xTile, this.yTile, this.zTile);
            this.setDead();
        }

        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        var20 = MathHelper.sin((float)(this.motionX * this.motionX + this.motionZ * this.motionZ));
        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var20) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
        {
            ;
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        {
            this.prevRotationYaw += 360.0F;
        }

        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
        float var21 = 0.99F;
        var11 = 0.03F;

        if (this.isInWater())
        {
            this.OnCollisionWithWater(this.worldObj, this.xTile, this.yTile, this.zTile);
        }

        this.motionX *= (double)var21;
        this.motionY *= (double)var21;
        this.motionZ *= (double)var21;
        this.motionY -= (double)var11;
        this.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
    }

    public abstract void ActivateOnEntity(Entity var1, World var2, int var3, int var4, int var5);

    public abstract void Activate(World var1, int var2, int var3, int var4);

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        var1.setShort("xTile", (short)this.xTile);
        var1.setShort("yTile", (short)this.yTile);
        var1.setShort("zTile", (short)this.zTile);
        var1.setByte("inTile", (byte)this.inTile);
        var1.setByte("inData", (byte)this.inData);
        var1.setByte("shake", (byte)this.arrowShake);
        var1.setByte("inGround", (byte)(this.inGround ? 1 : 0));
        var1.setBoolean("player", this.doesProjectileBelongToPlayer);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        this.xTile = var1.getShort("xTile");
        this.yTile = var1.getShort("yTile");
        this.zTile = var1.getShort("zTile");
        this.inTile = var1.getByte("inTile") & 255;
        this.inData = var1.getByte("inData") & 255;
        this.arrowShake = var1.getByte("shake") & 255;
        this.inGround = var1.getByte("inGround") == 1;
        this.doesProjectileBelongToPlayer = var1.getBoolean("player");
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    public void onCollideWithPlayer(EntityPlayer var1) {}

    public void OnCollisionWithWater(World var1, int var2, int var3, int var4)
    {
        this.setDead();
    }

    public float getShadowSize()
    {
        return 0.0F;
    }
}

