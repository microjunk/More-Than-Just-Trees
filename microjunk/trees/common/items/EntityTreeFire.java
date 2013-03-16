package microjunk.trees.common.items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityTreeFire extends Entity
{
    boolean ignite;

    public EntityTreeFire(World world)
    {
        super(world);
        setSize(0.2F, 0.2F);
        yOffset = 0.0F;
        ignite = false;
    }

    public EntityTreeFire(World world, Entity entity)
    {
        this(world);
        setRotation(entity.rotationYaw, 0.0F);
        double d = -MathHelper.sin((entity.rotationYaw * (float)Math.PI) / 180F);
        double d1 = MathHelper.cos((entity.rotationYaw * (float)Math.PI) / 180F);
        motionX = 0.80000000000000004D * d * (double)MathHelper.cos((entity.rotationPitch / 180F) * (float)Math.PI);
        motionY = -0.80000000000000004D * (double)MathHelper.sin((entity.rotationPitch / 180F) * (float)Math.PI);
        motionZ = 0.80000000000000004D * d1 * (double)MathHelper.cos((entity.rotationPitch / 180F) * (float)Math.PI);
        setPosition(entity.posX + d * 0.80000000000000004D, entity.posY, entity.posZ + d1 * 0.80000000000000004D);
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        moveEntity(motionX, motionY, motionZ);
        motionY -= 0.040000000000000001D;

        if (onGround)
        {
            ignite();
        }

        if (isCollidedHorizontally)
        {
            ignite();
        }

        if (isCollidedVertically)
        {
            ignite();
        }

        motionX *= 0.98999999999999999D;
        motionY *= 0.98999999999999999D;
        motionZ *= 0.98999999999999999D;
        worldObj.spawnParticle("smoke", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
    }

    private void ignite()
    {
        if (!ignite)
        {
            ignite = true;
            boolean flag = false;
            int i = (int)posX;
            int j = (int)posY;
            int k = (int)posZ;

            if (!flag)
            {
                worldObj.setBlockWithNotify(i, j, k, Block.fire.blockID);
                /*worldObj.setBlockWithNotify(i - 2, j, k - 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k - 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k + 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k + 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k + 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k + 0, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k + 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k + 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k + 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k - 1, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k - 2, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 3, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 2, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i - 1, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 0, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 1, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 2, j, k - 3, Block.fire.blockID);
                worldObj.setBlockWithNotify(i + 3, j, k - 3, Block.fire.blockID);*/
            }

            setDead();
        }
    }

    protected void entityInit()
    {
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        readEntityFromNBT(nbttagcompound);
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        writeEntityToNBT(nbttagcompound);
    }
}
