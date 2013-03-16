package microjunk.trees.common.biomes;

import java.util.Random;

import microjunk.trees.common.worldgen.WorldGeneratorSkyTrees;
import microjunk.trees.common.worldgentrees.WorldGenSkyTrees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeWitheringHeights extends BiomeGenBase 
{

	public BiomeWitheringHeights(int i)
	{
		
		super(i);
		this.setBiomeName("Withering Heights");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.theBiomeDecorator.treesPerChunk = 1;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 2.0F;
		this.minHeight = 0.1F;
		
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGenSkyTrees() : new WorldGenSkyTrees());
    }
	
}