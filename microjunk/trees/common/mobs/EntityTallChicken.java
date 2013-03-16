package microjunk.trees.common.mobs;

import org.lwjgl.input.Keyboard;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityTallChicken extends EntityAnimal implements IAnimals
{
	public boolean field_753_a = false;
    int jumpTicks;
    double prevMotionX;
    double prevMotionZ;
    boolean shouldSteer;
    public float field_752_b = 0.0F;
    public float destPos = 0.0F;
    public float field_757_d;
    public float field_756_e;
    public float field_755_h;
    private static String togglekey;
    private static int itogglekey;

    /** The time until the next egg is spawned. */
    public int timeUntilNextLehEgg;

    public EntityTallChicken(World par1World)
    {
        super(par1World);
        field_753_a = false;
        field_752_b = 0.0F;
        destPos = 0.0F;
        field_755_h = 1.0F;
        texture = "/microjunk/trees/common/aart/TallChicken.png";
        this.moveSpeed = 0.25F;
        setSize(0.3F, 0.7F);
        timeUntilNextLehEgg = rand.nextInt(6000) + 6000;
        float f = 0.25F;
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        tasks.addTask(2, new EntityAIMate(this, f));
        tasks.addTask(3, new EntityAITempt(this, 0.25F, Item.gunpowder.itemID, false));
        tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));
        tasks.addTask(5, new EntityAIWander(this, f));
        tasks.addTask(6, new EntityAIWatchClosest(this, net.minecraft.entity.player.EntityPlayer.class, 6F));
        tasks.addTask(7, new EntityAILookIdle(this));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 4;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        field_756_e = field_752_b;
        field_757_d = destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);

        if (this.destPos < 0.0F)
        {
            this.destPos = 0.0F;
        }

        if (this.destPos > 1.0F)
        {
            this.destPos = 1.0F;
        }

        if (this.riddenByEntity != null)
        {
            this.rotationPitch = 0.0F;
        }

        if (!this.onGround && this.field_755_h < 1.0F)
        {
            this.field_755_h = 1.0F;
        }

        this.field_755_h = (float)((double)this.field_755_h * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.field_752_b += this.field_755_h * 2.0F;

        if (!isChild() && !worldObj.isRemote && --timeUntilNextLehEgg <= 0)
        {
            worldObj.playSoundAtEntity(this, "mob.chickenplop", 1.0F, (rand.nextFloat() - rand.nextFloat()) * 0.2F + 1.0F);
            dropItem(Trees.chickenDrop.itemID, 1);
            timeUntilNextLehEgg = rand.nextInt(6000) + 6000;
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float f)
    {
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.chicken";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.chickenhurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.chickenhurt";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Trees.bigFeather.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int i = rand.nextInt(3) + rand.nextInt(1 + par2);

        for (int j = 0; j < i; j++)
        {
            dropItem(Trees.bigFeather.itemID, 1);
        }

        if (isBurning())
        {
            dropItem(Item.chickenCooked.itemID, 1);
        }
        else
        {
            dropItem(Item.gunpowder.itemID, 4);
        }
    }
    
    public static void assignToggleButton(String var0)
    {
        togglekey = var0;
        itogglekey = Keyboard.getKeyIndex(togglekey);
    }
    
    /**
     * Tries to moves the entity by the passed in displacement. Args: x, y, z
     */
    public void moveEntity(double var1, double var3, double var5)
    {
        if (this.riddenByEntity != null)
        {
            boolean var7 = true;
            boolean var8 = false;

            if (this.onGround && !var7 && !this.isSprinting() && !this.isInWeb)
            {
                this.setSprinting(true);
            }

            int var9 = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ));
            float var10 = 1.0F;

            if (Keyboard.getEventKeyState() && Keyboard.getEventKey() == itogglekey)
            {
                this.motionY = 0.1D;
                this.motionX = this.prevMotionX * 1.5D;
                this.motionZ = this.prevMotionZ * 1.5D;
                super.moveEntity(this.motionX, this.motionY, this.motionZ);
                super.jump();
            }

            if (var9 == Block.ice.blockID)
            {
                var10 = Block.blocksList[var9].slipperiness * 0.3F;
            }
            else if (!this.onGround && !this.isInWeb)
            {
                this.motionX += this.riddenByEntity.motionX;
                this.motionZ += this.riddenByEntity.motionZ;
            }
            else
            {
                this.isInWeb = false;
                this.motionX += this.riddenByEntity.motionX * 7.0D * (double)var10;
                this.motionZ += this.riddenByEntity.motionZ * 7.0D * (double)var10;
            }

            EntityPlayer var11 = (EntityPlayer)this.riddenByEntity;
            this.rotationYaw = this.prevRotationYaw = var11.rotationYaw;
            this.prevMotionX = this.motionX * 0.6000000000000001D;
            this.prevMotionZ = this.motionZ * 0.6000000000000001D;
            super.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX = this.prevMotionX * 1.5D;
            this.motionZ = this.prevMotionZ * 1.5D;
            super.moveEntity(this.motionX, this.motionY, this.motionZ);
        }
        else
        {
            super.moveEntity(var1, var3, var5);
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        if (super.interact(var1))
        {
            return true;
        }
        else if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == var1))
        {
            var1.mountEntity(this);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityTallChicken spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityTallChicken(worldObj);
    }

	@Override
	public EntityAgeable createChild(EntityAgeable var1) 
	{
		return this.spawnBabyAnimal(var1);
	}
}
