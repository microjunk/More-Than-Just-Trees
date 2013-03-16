package microjunk.trees.common.biomes;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeBlackMountains extends BiomeGenBase 
{
	
	public BiomeBlackMountains(int i)
	{
		
		super(i);
		this.setBiomeName("Black Mountains");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.theBiomeDecorator.treesPerChunk = 3;
		this.fillerBlock = (byte)Trees.slate.blockID;
		this.topBlock = (byte)Block.stone.blockID;
		//this.createBiomeDecorator();
		this.maxHeight = 0.8F;
		this.minHeight = 0.1F;
		
	}
	
}
