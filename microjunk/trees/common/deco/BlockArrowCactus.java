package microjunk.trees.common.deco;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;
import microjunk.trees.common.Trees;

public class BlockArrowCactus extends CTFlower
{
 
        public BlockArrowCactus(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
                this.setTickRandomly(true);
        }
        public int tickRate()
        {
            return 5000;
        }
        public void updateTick(World var1, int var2, int var3, int var4, Random var5)
        {
        	EntityPlayer PL1;
        	if((PL1=var1.getClosestPlayer(var2, var3, var4, 16F))!=null)
        	{
        		EntitySkeleton SK1=new EntitySkeleton(var1);
        		SK1.setPosition(var2, var3, var4);
        		EntityArrow arr = new EntityArrow(var1, SK1, PL1, 1.6F, 12.0F);
        		arr.setDamage(arr.getDamage() + 4.0D);
        		arr.setKnockbackStrength(3);
        		arr.setFire(25);
        		SK1.playSound("random.bow", 1.0F, 1.0F);
                var1.spawnEntityInWorld(arr);
                SK1.setDead();
        	}
        }
        public int getTextureSize()
        {
        	return 128;
        }
        
        public String getTextureFile()
        {
         return "/microjunk/trees/common/aart/HD_flowers.png";
        }
        
        /**
         * Returns the quantity of items to drop on block destruction.
         */
        public int quantityDropped(Random par1Random)
        {
            return 1;
        }

        /**
         * Returns the ID of the items to drop on destruction.
         */
        public int idDropped(int par1, Random par2Random, int par3)
        {
            return this.blockID;
        }
        
}