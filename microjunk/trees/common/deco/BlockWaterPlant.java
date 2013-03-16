package microjunk.trees.common.deco;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import microjunk.trees.common.Trees;
import microjunk.trees.common.worldgentrees.WorldGenHardTrees;
import microjunk.trees.common.worldgentrees.WorldGenIceTrees;

public class BlockWaterPlant extends CTFlower
{
 
        private Random random;

		public BlockWaterPlant(int i, int j) 
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
        
        public void growTree(World world, int i, int j, int k, Random random)
        {
                int l = world.getBlockMetadata(i, j, k) & 3;
                world.setBlock(i, j, k, 0);
                Object obj = null;
                obj = new WorldGenWaterPond();//Change to your own tree's gen class
                if(!((WorldGenerator) (obj)).generate(world, random, i, j, k))
                {
                        world.setBlockAndMetadata(i, j, k, blockID, l);
                }
        }
        
        public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
        {
           ItemStack equipped = entityplayer.getCurrentEquippedItem();
           if (equipped == null)
           {
                return false;
           }
           if ((equipped.getItem() == Item.bucketEmpty))
           {
                growTree(world, i, j, k, world.rand);
                equipped.stackSize -= 1;
           }
           return false;
        }
 
}
