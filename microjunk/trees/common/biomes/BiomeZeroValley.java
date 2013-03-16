package microjunk.trees.common.biomes;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeZeroValley extends BiomeGenBase 
{

	public BiomeZeroValley(int i)
	{
		
		super(i);
		this.setBiomeName("Zero Valley");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.stone.blockID;
		this.topBlock = (byte)Block.cobblestone.blockID;
		this.maxHeight = 2.0F;
		this.minHeight = 0.2F;
		
	}
	
}
