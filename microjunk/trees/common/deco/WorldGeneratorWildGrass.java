package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import microjunk.trees.common.biomes.BiomeAlphaHills;
import microjunk.trees.common.biomes.BiomeCliffs;
import microjunk.trees.common.biomes.BiomeEggHills;
import microjunk.trees.common.biomes.BiomeLegendaryForest;
import microjunk.trees.common.biomes.BiomeWhitePlains;
import microjunk.trees.common.biomes.BiomeWitheringHeights;
import microjunk.trees.common.biomes.BiomeZeroValley;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorWildGrass implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }		
	}
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
    {
		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
		if((biome instanceof BiomeAlphaHills) || (biome instanceof BiomeCliffs) || (biome instanceof BiomeEggHills) || (biome instanceof BiomeLegendaryForest) || (biome instanceof BiomeWhitePlains) || (biome instanceof BiomeWitheringHeights) || (biome instanceof BiomeZeroValley))
		{
			for(int x = 0;x<2;x++)
	        {
	        	int i = blockX + random.nextInt(16);
	        	int k = blockZ + random.nextInt(16);
	        	int j = world.getHeightValue(i, k);

	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlockWithNotify(i, j, k, Trees.wildGrass.blockID);
                }
	        }
		}
	
    }
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
			  
	}
}
