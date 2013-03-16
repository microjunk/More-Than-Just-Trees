package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeHardMountains extends BiomeGenBase 
{

	public BiomeHardMountains(int i)
	{
		
		super(i);
		this.setBiomeName("Hard Mountains");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.theBiomeDecorator.treesPerChunk = -999;
		this.fillerBlock = (byte)Block.stone.blockID;
		this.topBlock = (byte)Block.dirt.blockID;
		this.maxHeight = 0.8F;
		this.minHeight = 0.1F;
		
	}
	
}
