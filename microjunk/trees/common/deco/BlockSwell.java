package microjunk.trees.common.deco;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;
import microjunk.trees.common.Trees;

public class BlockSwell extends CTFlower
{
 
        public BlockSwell(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
        }
 
        public int getTextureSize()
        {
        	return 128;
        }
        
        public String getTextureFile()
        {
         return "/microjunk/trees/common/aart/HD_flowers.png";
        }
        
        public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
        {
            super.onEntityCollidedWithBlock(var1, var2, var3, var4, var5);

            if (var5 instanceof EntityLiving || var5 instanceof EntityArrow)
            {
                //if (!this.isCoveredWithWater(var1, var2, var3, var4))
                //{
                    var1.setBlockWithNotify(var2, var3, var4, 0);
                    var1.createExplosion((Entity)null, (double)var2, (double)var3, (double)var4, 0.8F, true);
                //}
            }
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
