package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenCucumberTree extends WorldGenerator
{
    public WorldGenCucumberTree()
    {
    }
    public boolean generate(World world, Random rand, int i, int j, int k)
    {
    	int j1 = world.getBlockId(i, j - 1, k);
		if(j1 != Block.grass.blockID && j1 != Block.dirt.blockID && j1 != Trees.alphaGrass.blockID || j >= 128 - 12 - 1)
        {
        	return false;
        }
		world.setBlock(i + 3, j + 0, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 4, j + 0, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 4, j + 0, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 0, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 0, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 0, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 0, k + 12, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 0, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 0, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 0, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 0, k + 6, Trees.cucumberLog.blockID);
        world.setBlock(i + 11, j + 0, k + 5, Trees.cucumberLog.blockID);
        
		world.setBlock(i + 3, j + 1, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 4, j + 1, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 4, j + 1, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 1, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 1, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 1, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 1, k + 12, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 1, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 1, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 1, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 1, k + 6, Trees.cucumberLog.blockID);
        world.setBlock(i + 11, j + 1, k + 5, Trees.cucumberLog.blockID);
        world.setBlock(i + 3, j + 2, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 2, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 2, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 2, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 2, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 2, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 2, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 2, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 2, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 2, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 2, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 2, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 2, k + 12, Trees.cucumberLog.blockID);
        world.setBlock(i + 3, j + 3, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 3, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 3, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 3, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 3, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 3, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 3, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 3, k + 2, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 4, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 4, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 4, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 4, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 4, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 4, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 4, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 4, k + 3, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 4, k + 2, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 4, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 2, j + 5, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 4, j + 5, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 5, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 5, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 4, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 5, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 5, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 5, k + 3, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 5, k + 2, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 5, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 14, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 13, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 6, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 6, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 6, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 6, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 5, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 6, k + 4, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 6, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 4, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 6, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 2, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 6, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 6, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 14, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 13, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 7, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 7, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 7, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 7, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 7, k + 6, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 7, k + 5, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 7, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 7, k + 7, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 7, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 3, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 7, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 7, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 7, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 7, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 7, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 7, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 14, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 13, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 8, k + 12, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 8, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 8, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 8, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 8, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 7, j + 8, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 6, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 8, j + 8, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 5, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 4, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 8, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 8, k + 8, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 8, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 8, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 8, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 8, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 8, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 8, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 13, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 12, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 9, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 5, j + 9, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 11, Trees.cucumberLog.blockID);
        world.setBlock(i + 6, j + 9, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 7, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 9, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 9, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 9, k + 9, Trees.cucumberLog.blockID);
        world.setBlock(i + 9, j + 9, k + 8, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 9, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 9, k + 10, Trees.cucumberLog.blockID);
        world.setBlock(i + 10, j + 9, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 11, j + 9, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 12, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 11, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 10, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 7, j + 10, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 8, j + 10, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 10, k + 10, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 9, j + 10, k + 9, Trees.cucumberLeaves.blockID);
        world.setBlock(i + 10, j + 10, k + 10, Trees.cucumberLeaves.blockID);

return true;
}
} /*=====End of Code=====*/

