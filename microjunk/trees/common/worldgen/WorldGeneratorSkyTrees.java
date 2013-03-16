package microjunk.trees.common.worldgen;

import java.util.Random;

import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.biomes.BiomeCliffs;
import microjunk.trees.common.worldgentrees.WorldGenBlackTrees;
import microjunk.trees.common.worldgentrees.WorldGenSkyTrees;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorSkyTrees implements IWorldGenerator 
{
 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
 {
  switch (world.provider.dimensionId)
  {
   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
  }
 }

 private void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
 {
	 BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
	 WorldGenSkyTrees tree = new WorldGenSkyTrees();
	 
	 if((biome instanceof BiomeCliffs))// then add ||BiomeGenXYZ if you want more.
	 {
		 for(int x = 0;x<1;x++)
		 {
			 int i = chunkX + rand.nextInt(256);
			 int k = chunkZ + rand.nextInt(256);
			 int j = world.getHeightValue(i, k);
			 tree.generate(world, rand, i, j, k);
		 }
	 }
 }
 
 private void generateNether(World world, Random random, int blockX, int blockZ) 
 {

 }

}
