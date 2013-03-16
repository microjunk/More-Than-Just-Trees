package microjunk.trees.common.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeSkysPeak extends BiomeGenBase 
{

	public BiomeSkysPeak(int i)
	{
		
		super(i);
		this.setBiomeName("Skys Peak");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.theBiomeDecorator.treesPerChunk = 20;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 3.0F;
		this.minHeight = 0.0F;
		
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : this.worldGeneratorTrees);
    }
	
}
