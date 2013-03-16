package microjunk.trees.common.mobs;

import org.lwjgl.input.Keyboard;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWanderingCow extends EntityAnimal
{
	
	int jumpTicks;
    double prevMotionX;
    double prevMotionZ;
    boolean shouldSteer;
    private static String togglekey;
    private static int itogglekey;
    
    /** AI task for player control. */
    //private final EntityAIControlledByPlayer aiControlledByPlayer;

    public EntityWanderingCow(World par1World)
    {
        super(par1World);
        this.texture = "/microjunk/trees/common/aart/wanderingcow.png";
        this.setSize(0.9F, 1.3F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(2, new EntityAIMate(this, 0.2F));
        this.tasks.addTask(3, new EntityAITempt(this, 0.25F, Item.wheat.itemID, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 0.25F));
        this.tasks.addTask(5, new EntityAIWander(this, 0.2F));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        //this.tasks.addTask(8, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.34F));
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
        return 10;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.cow.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.cow.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.cow.hurt";
    }

    /**
     * Plays step sound at given x, y, z for the entity
     */
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.playSound("mob.cow.step", 0.15F, 1.0F);
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Item.leather.itemID;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3 = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Item.leather.itemID, 1);
        }

        var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(Item.beefCooked.itemID, 1);
            }
            else
            {
                this.dropItem(Item.beefRaw.itemID, 1);
            }
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
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityCow spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityCow(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}
