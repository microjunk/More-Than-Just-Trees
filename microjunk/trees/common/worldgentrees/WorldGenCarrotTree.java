package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCarrotTree extends WorldGenerator
{
    public WorldGenCarrotTree()
    {
    }
    public boolean generate(World world, Random rand, int i, int j, int k)
    {
    	int j1 = world.getBlockId(i, j - 1, k);
		if(j1 != Block.grass.blockID && j1 != Block.dirt.blockID && j1 != Trees.alphaGrass.blockID || j >= 128 - 12 - 1)
        {
        	return false;
        }
            world.setBlock(i + 3, j + 0, k + 4, Trees.carrotLog.blockID);
            world.setBlock(i + 3, j + 1, k + 4, Trees.carrotLog.blockID);
            world.setBlock(i + 3, j + 2, k + 4, Trees.carrotLog.blockID);
            world.setBlock(i + 2, j + 3, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 3, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 3, k + 4, Trees.carrotLog.blockID);
            world.setBlock(i + 4, j + 3, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 1, j + 4, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 4, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 4, k + 3, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 4, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 4, k + 4, Trees.carrotLog.blockID);
            world.setBlock(i + 3, j + 4, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 4, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 4, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 4, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 4, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 1, j + 5, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 1, j + 5, k + 3, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 5, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 5, k + 3, Trees.carrotLog.blockID);
            world.setBlock(i + 2, j + 5, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 5, k + 1, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 5, k + 5, Trees.carrotLog.blockID);
            world.setBlock(i + 3, j + 5, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 5, k + 1, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 5, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 5, k + 3, Trees.carrotLeaves.blockID);
            world.setBlock(i + 6, j + 5, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 0, j + 6, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 1, j + 6, k + 1, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 6, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 6, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 6, k + 3, Trees.carrotLog.blockID);
            world.setBlock(i + 2, j + 6, k + 1, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 6, k + 3, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 6, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 6, k + 6, Trees.carrotLog.blockID);
            world.setBlock(i + 4, j + 6, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 6, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 6, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 6, k + 7, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 6, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 6, j + 6, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 0, j + 7, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 0, j + 7, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 7, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 7, k + 0, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 7, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 7, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 7, k + 3, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 7, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 7, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 7, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 6, j + 7, k + 7, Trees.carrotLeaves.blockID);
            world.setBlock(i + 6, j + 7, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 8, k + 7, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 8, k + 1, Trees.carrotLeaves.blockID);
            world.setBlock(i + 2, j + 8, k + 0, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 8, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 8, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 8, k + 7, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 8, k + 6, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 8, k + 4, Trees.carrotLeaves.blockID);
            world.setBlock(i + 5, j + 8, k + 8, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 9, k + 5, Trees.carrotLeaves.blockID);
            world.setBlock(i + 3, j + 9, k + 2, Trees.carrotLeaves.blockID);
            world.setBlock(i + 4, j + 9, k + 7, Trees.carrotLeaves.blockID);

  return true;
  }
} /*=====End of Code=====*/

