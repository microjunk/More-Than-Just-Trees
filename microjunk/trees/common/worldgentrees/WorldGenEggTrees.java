package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenEggTrees extends WorldGenerator
{
	public WorldGenEggTrees()
    {
		
    }
	public boolean generate(World world, Random rand, int i, int j, int k)
	{
		int j1 = world.getBlockId(i, j - 1, k);
		if(j1 != Block.grass.blockID && j1 != Block.dirt.blockID && j1 != Trees.alphaGrass.blockID || j >= 128 - 12 - 1)
        {
        	return false;
        }
		world.setBlock(i + 2, j + 0, k + 2, Trees.eggLog.blockID);
        world.setBlock(i + 0, j + 1, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 1, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 1, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 1, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 1, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 1, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 1, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 1, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 1, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 1, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 1, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 1, k + 2, Trees.eggLog.blockID);
        world.setBlock(i + 2, j + 1, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 1, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 1, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 1, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 1, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 1, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 1, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 1, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 1, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 1, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 1, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 2, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 2, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 0, j + 2, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 2, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 2, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 2, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 2, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 2, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 2, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 2, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 2, k + 2, Trees.eggLog.blockID);
        world.setBlock(i + 2, j + 2, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 2, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 2, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 2, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 2, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 2, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 2, k + 0, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 2, k + 4, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 2, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 2, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 4, j + 2, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 3, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 3, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 3, k + 2, Trees.eggLog.blockID);
        world.setBlock(i + 2, j + 3, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 3, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 3, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 1, j + 4, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 3, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 2, Trees.eggLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 1, Trees.eggLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 2, Trees.eggLeaves.blockID);

return true;
}
} /*=====End of Code=====*/