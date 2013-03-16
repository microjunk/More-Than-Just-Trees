package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import microjunk.trees.common.biomes.BiomeAfterLifeDesert;
import microjunk.trees.common.biomes.BiomeAlphaHills;
import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.biomes.BiomeCliffs;
import microjunk.trees.common.biomes.BiomeColdValley;
import microjunk.trees.common.biomes.BiomeEggHills;
import microjunk.trees.common.biomes.BiomeFruitValley;
import microjunk.trees.common.biomes.BiomeHardMountains;
import microjunk.trees.common.biomes.BiomeHurtfulHills;
import microjunk.trees.common.biomes.BiomeLegendaryForest;
import microjunk.trees.common.biomes.BiomePetrifiedHills;
import microjunk.trees.common.biomes.BiomeRainForrest;
import microjunk.trees.common.biomes.BiomeRedwoodForrest;
import microjunk.trees.common.biomes.BiomeSkysPeak;
import microjunk.trees.common.biomes.BiomeStoneMountains;
import microjunk.trees.common.biomes.BiomeTheOrient;
import microjunk.trees.common.biomes.BiomeThickForest;
import microjunk.trees.common.biomes.BiomeUnNaturalPlains;
import microjunk.trees.common.biomes.BiomeWhitePlains;
import microjunk.trees.common.biomes.BiomeWitheringHeights;
import microjunk.trees.common.biomes.BiomeWolf;
import microjunk.trees.common.biomes.BiomeZeroValley;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorLovePlant implements IWorldGenerator 
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
		if((biome instanceof BiomeAlphaHills) || (biome instanceof BiomeCliffs) || (biome instanceof BiomeEggHills) || (biome instanceof BiomeFruitValley) || (biome instanceof BiomeLegendaryForest) || (biome instanceof BiomeRainForrest) || (biome instanceof BiomeRedwoodForrest) || (biome instanceof BiomeSkysPeak) || (biome instanceof BiomeTheOrient) || (biome instanceof BiomeWhitePlains))
		{
			for(int x = 0;x<2;x++)
	        {
	        	int i = blockX + random.nextInt(16);
	        	int k = blockZ + random.nextInt(16);
	        	int j = world.getHeightValue(i, k);

	        	if (world.getBlockId(i, j - 1, k) == Block.dirt.blockID || world.getBlockId(i, j - 1, k) == Block.sand.blockID)
                {
                    world.setBlockWithNotify(i, j, k, Trees.wildFlower.blockID);
                }
	        }
		}
	
    }
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
			  
	}
}
