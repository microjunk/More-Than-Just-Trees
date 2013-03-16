package microjunk.trees.common.worldgen;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorNewOres implements IWorldGenerator 
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }
		
	}

		 

		private void generateSurface(World world, Random random, int blockX, int blockZ) 
		 {
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.amethystOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.blackOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.graniteOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.marble.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.opalOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.sapphireOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.slate.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
			for(int i=0;i<38;i++)
			{
				int Xcoord = blockX + random.nextInt(16);
				int Ycoord = random.nextInt(60);
				int Zcoord = blockZ + random.nextInt(16);
				(new WorldGenMinable(Trees.turquoiseOre.blockID, 5+random.nextInt(6))).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
		 }
		 
		 private void generateNether(World world, Random random, int blockX, int blockZ) 
		 {
		  
		 }


}
