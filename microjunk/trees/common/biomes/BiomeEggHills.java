package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeEggHills extends BiomeGenBase 
{

	public BiomeEggHills(int i)
	{
		
		super(i);
		this.setBiomeName("Egg Hills");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.3F;
		this.minHeight = 0.1F;
		
	}
	
}
