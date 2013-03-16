package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.BlockFlower;

public class BlockWildFlower extends CTFlower
{
 
        public BlockWildFlower(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
        }
 
        public String getTextureFile()
        {
                return "/microjunk/trees/common/aart/Deco.png";
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