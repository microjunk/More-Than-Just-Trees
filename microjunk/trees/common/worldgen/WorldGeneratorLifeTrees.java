package microjunk.trees.common.worldgen;

import java.util.Random;

import microjunk.trees.common.biomes.BiomeAlphaHills;
import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.biomes.BiomeHurtfulHills;
import microjunk.trees.common.worldgentrees.WorldGenLifeTrees;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorLifeTrees implements IWorldGenerator 
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
	 WorldGenLifeTrees tree = new WorldGenLifeTrees(false);
	 
	 if((biome instanceof BiomeAlphaHills))// then add ||BiomeGenXYZ if you want more.
	 {
        for(int x = 0;x<2;x++)
        {
        	int i = chunkX + rand.nextInt(1024);
        	int k = chunkZ + rand.nextInt(1024);
        	int j = world.getHeightValue(i, k);
        	tree.generate(world, rand, i, j, k);
        }
	 }
	 if((biome instanceof BiomeHurtfulHills))// then add ||BiomeGenXYZ if you want more.
	 {
        for(int x = 0;x<2;x++)
        {
        	int i = chunkX + rand.nextInt(512);
        	int k = chunkZ + rand.nextInt(512);
        	int j = world.getHeightValue(i, k);
        	tree.generate(world, rand, i, j, k);
        }
	 }
 }

 private void generateNether(World world, Random random, int blockX, int blockZ) 
 {

 }

}
