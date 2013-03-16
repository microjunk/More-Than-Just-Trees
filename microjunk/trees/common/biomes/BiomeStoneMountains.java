package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeStoneMountains extends BiomeGenBase 
{

	public BiomeStoneMountains(int i)
	{
		
		super(i);
		this.setBiomeName("Stone Mountains");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.stone.blockID;
		this.fillerBlock = (byte)Block.cobblestone.blockID;
		this.topBlock = (byte)Block.dirt.blockID;
		this.maxHeight = 0.8F;
		this.minHeight = 0.1F;
		
	}
	
}
