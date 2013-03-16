package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.BlockFlower;

public class BlockIris extends CTFlower
{
 
        public BlockIris(int i, int j) 
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