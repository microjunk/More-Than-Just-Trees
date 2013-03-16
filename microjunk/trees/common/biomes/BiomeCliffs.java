package microjunk.trees.common.biomes;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeCliffs extends BiomeGenBase 
{
	
	public BiomeCliffs(int i)
	{
		
		super(i);
		this.setBiomeName("Cliffs");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.theBiomeDecorator.treesPerChunk = 3;
		this.fillerBlock = (byte)Block.stone.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		//this.createBiomeDecorator();
		this.maxHeight = 0.83F;
		this.minHeight = -0.2F;
		
	}
	
}