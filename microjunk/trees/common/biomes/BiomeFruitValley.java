package microjunk.trees.common.biomes;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeFruitValley extends BiomeGenBase 
{
	
	public BiomeFruitValley(int i)
	{
		
		super(i);
		this.setBiomeName("Fruit Valley");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.fillerBlock = (byte)Trees.slate.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 1.0F;
		this.minHeight = 0.175F;
		
	}
	
}