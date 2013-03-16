package microjunk.trees.common.biomes;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeColdValley extends BiomeGenBase 
{
	
	public BiomeColdValley(int i)
	{
		
		super(i);
		this.setBiomeName("Cold Valley");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.fillerBlock = (byte)Trees.slate.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.45F;
		this.minHeight = 0.065F;
		this.temperature = 0.05F;
		this.setEnableSnow();
		
	}
	
}