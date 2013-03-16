package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeRedwoodForrest extends BiomeGenBase 
{

	public BiomeRedwoodForrest(int i)
	{
		
		super(i);
		this.setBiomeName("RedWood Forest");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.stone.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.29F;
		this.minHeight = 0.1F;
		
	}
	
}
