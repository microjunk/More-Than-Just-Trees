package microjunk.trees.common.worldgen;

import java.util.Random;

import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.worldgentrees.WorldGenNetherTrees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorNetherTrees implements IWorldGenerator 
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
	 
 }
 
 private void generateNether(World var1, Random var2, int var3, int var4)
 {
     int var5;
     int var6;
     int var7;
     int var8;

     for (var5 = 0; var5 < 9; ++var5)
     {
         var6 = var3 + var2.nextInt(16);
         var7 = var2.nextInt(var1.getHeight());
         var8 = var4 + var2.nextInt(16);
         (new WorldGenNetherTrees(true)).generate(var1, var2, var6, var7, var8);
     }
 }
}


