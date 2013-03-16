package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSkyTrees extends WorldGenerator
{
	public WorldGenSkyTrees()
    {
		
    }
	public boolean generate(World world, Random rand, int i, int j, int k)
	{
		int j1 = world.getBlockId(i, j - 1, k);
		if(j1 != Block.grass.blockID && j1 != Block.dirt.blockID || j >= 128 - 12 - 1)
        {
        	return false;
        }
         
         world.setBlock(i, j + 8, k, Trees.skyLog.blockID);///This sets what your tree will look like
         world.setBlock(i, j + 9, k, Trees.skyLog.blockID);// You should make your own version
         world.setBlock(i, j + 10, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 11, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 12, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 13, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 14, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 15, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 16, k, Trees.skyLog.blockID);
         
         world.setBlock(i + 1, j + 16, k + 1, Trees.skyLeaves.blockID);
         world.setBlock(i + 1, j + 16, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i + 1, j + 16, k + 0, Trees.skyLeaves.blockID);
         world.setBlock(i + 0, j + 16, k + 1, Trees.skyLeaves.blockID);
         
         world.setBlock(i - 1, j + 16, k + 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 1, j + 16, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 0, j + 16, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 1, j + 16, k - 0, Trees.skyLeaves.blockID);
         
         world.setBlock(i + 2, j + 16, k + 2, Trees.skyLeaves.blockID);
         world.setBlock(i + 2, j + 16, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i + 2, j + 16, k + 0, Trees.skyLeaves.blockID);
         world.setBlock(i + 0, j + 16, k + 2, Trees.skyLeaves.blockID);
         
         world.setBlock(i - 2, j + 16, k + 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 2, j + 16, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 0, j + 16, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 2, j + 16, k - 0, Trees.skyLeaves.blockID);
         
         world.setBlock(i, j + 17, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 18, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 19, k, Trees.skyLog.blockID);
         world.setBlock(i, j + 20, k, Trees.skyLog.blockID);
         
         world.setBlock(i + 1, j + 20, k + 1, Trees.skyLeaves.blockID);
         world.setBlock(i + 1, j + 20, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i + 1, j + 20, k + 0, Trees.skyLeaves.blockID);
         world.setBlock(i + 0, j + 20, k + 1, Trees.skyLeaves.blockID);
         
         world.setBlock(i - 1, j + 20, k + 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 1, j + 20, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 0, j + 20, k - 1, Trees.skyLeaves.blockID);
         world.setBlock(i - 1, j + 20, k - 0, Trees.skyLeaves.blockID);
         
         world.setBlock(i + 2, j + 20, k + 2, Trees.skyLeaves.blockID);
         world.setBlock(i + 2, j + 20, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i + 2, j + 20, k + 0, Trees.skyLeaves.blockID);
         world.setBlock(i + 0, j + 20, k + 2, Trees.skyLeaves.blockID);
         
         world.setBlock(i - 2, j + 20, k + 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 2, j + 20, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 0, j + 20, k - 2, Trees.skyLeaves.blockID);
         world.setBlock(i - 2, j + 20, k - 0, Trees.skyLeaves.blockID);
         
         return true;
	}
}