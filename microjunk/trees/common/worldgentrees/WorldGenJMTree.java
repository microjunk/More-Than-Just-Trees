package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenJMTree extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			Block.grass.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public WorldGenJMTree() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 18, j, k) || !LocationIsValidSpawn(world, i + 18, j, k + 15) || !LocationIsValidSpawn(world, i, j, k + 15))
		{
			return false;
		}
		
		world.setBlock(i + 5, j + 0, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 5, j + 1, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 5, j + 2, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 3, j + 3, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 3, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 3, k + 6, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 3, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 3, k + 4, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 6, j + 3, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 2, j + 4, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 4, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 4, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 4, k + 6, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 4, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 4, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 4, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 4, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 4, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 4, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 4, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 4, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 4, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 4, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 4, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 4, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 8, j + 4, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 4, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 5, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 5, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 5, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 5, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 5, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 5, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 5, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 5, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 5, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 5, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 5, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 5, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 7, j + 5, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 5, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 5, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 6, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 3, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 6, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 4, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 5, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 6, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 6, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 6, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 7, j + 6, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 6, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 6, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 10, j + 6, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 7, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 7, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 7, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 7, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 3, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 7, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 3, j + 7, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 7, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 5, j + 7, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 7, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 7, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 6, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 7, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 7, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 7, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 9, j + 7, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 10, j + 7, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 8, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 3, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 2, j + 8, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 8, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 10, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 3, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 8, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 10, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 8, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 8, k + 2, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 6, j + 8, k + 0, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 7, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 8, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 8, k + 5, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 8, j + 8, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 0, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 6, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 2, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 9, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 9, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 9, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 9, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 9, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 9, k + 2, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 6, j + 9, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 7, Trees.japaneseMapleLog.blockID);
        world.setBlock(i + 7, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 9, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 9, j + 9, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 10, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 1, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 10, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 10, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 10, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 10, k + 1, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 10, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 10, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 10, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 10, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 10, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 2, j + 11, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 11, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 11, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 11, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 11, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 11, k + 8, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 11, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 11, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 11, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 11, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 11, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 11, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 11, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 11, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 11, k + 7, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 11, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 11, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 11, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 11, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 8, j + 11, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 12, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 12, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 3, j + 12, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 4, j + 12, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 12, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 12, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 12, k + 2, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 12, k + 6, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 12, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 7, j + 12, k + 3, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 13, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 5, j + 13, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 13, k + 5, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 13, k + 4, Trees.japaneseMapleLeaves.blockID);
        world.setBlock(i + 6, j + 13, k + 3, Trees.japaneseMapleLeaves.blockID);

return true;
}
} /*=====End of Code=====*/