package microjunk.trees.common.mobs;

import microjunk.trees.common.travel.ModelIceBoat;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityWalkingTree extends EntityMob
{
	
	public EntityWalkingTree(World par1World) 
	{
	  super(par1World);
	  this.texture = "/microjunk/trees/common/aart/WalkingTree.png";
	  this.moveSpeed = 0.25F;
	  //this.tasks.addTask(0, new EntityAISwimming(this));
	  //this.tasks.addTask(1, new EntityAIBreakDoor(this));
	  //this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
	  //this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	  //this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
	  //this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	  //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}
	
	/*public int getAttackStrength(Entity par1Entity)
    {
     return 4;
    }
	protected boolean isAIEnabled()
    {
        return true;
    }
 
	public int getMaxHealth() 
	{
		return 20;
	}

	public int getTotalArmorValue()
    {
        return 2;
    }
 
	protected String getLivingSound()
    {
        return "mob.zombie.say";
    }
 
    protected String getHurtSound()
    {
        return "mob.zombie.hurt";
    }
    
    protected String getDeathSound()
    {
        return "mob.zombie.death";
    }
    
    protected void playStepSound(int par1, int par2, int par3, int par4)
    {
        this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
    }
    
    protected int getDropItemId()
    {
        return Item.ingotGold.itemID;
    }
    
    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(2))
        {
            case 0:
                this.dropItem(Item.ingotIron.itemID, 1);
                break;
            case 1:
                this.dropItem(Item.helmetSteel.itemID, 1);
                break;
        }
    }
    
    protected void dropFewItems(boolean par1, int par2)
    {
     if(this.rand.nextInt(3) == 0)
     {
      this.dropItem(Item.appleRed.itemID, 1);
     }
    }*/
	
	public int getMaxHealth()
    {
        return 30;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombie";
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(20);

        for (int var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Block.wood.blockID, 10);
        }
    }
    
}