package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.biomes.BiomeAfterLifeDesert;
import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.biomes.BiomeHardMountains;
import microjunk.trees.common.biomes.BiomePetrifiedHills;
import microjunk.trees.common.biomes.BiomeStoneMountains;
import microjunk.trees.common.biomes.BiomeUnNaturalPlains;
import microjunk.trees.common.biomes.BiomeZeroValley;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorGlowingVine implements IWorldGenerator
{
    
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 0:
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 1:
                this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(World var1, Random var2, int var3, int var4) 
	{
	
	
	
	}

    private void generateSurface(World var1, Random var2, int var3, int var4)
    {
    	BiomeGenBase biome = var1.getWorldChunkManager().getBiomeGenAt(var3, var4);
    	if((biome instanceof BiomeAfterLifeDesert) || (biome instanceof BiomeBlackMountains) || (biome instanceof BiomeHardMountains) || (biome instanceof BiomePetrifiedHills) || (biome instanceof BiomeStoneMountains) || (biome instanceof BiomeUnNaturalPlains) || (biome instanceof BiomeZeroValley))
   	 	{
		for(int k = 0; k < 7; k++)
        {
            int l = var3 + var2.nextInt(16) + 8;
            int i1 = var2.nextInt(60);
            int j1 = var4 + var2.nextInt(16) + 8;
            (new WorldGenGlowingVine()).generate(var1, var2, l, i1, j1);
        }
   	 	}
		
    }

    private void generateEnd(World var1, Random var2, int var3, int var4) 
	{
	
	
	
	}
}
