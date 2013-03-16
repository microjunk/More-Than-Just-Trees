package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockThornGrass extends CTFlower
{
 
        public BlockThornGrass(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
        }
 
        public String getTextureFile()
        {
                return "/microjunk/trees/common/aart/Deco.png";
        }
        
        public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
        {
            entity.attackEntityFrom(DamageSource.cactus, 4);
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