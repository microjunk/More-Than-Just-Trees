package microjunk.trees.common;

import java.util.Arrays;
import java.util.List;

import microjunk.trees.common.armour.ItemAmethystBoots;
import microjunk.trees.common.armour.ItemAmethystHelmet;
import microjunk.trees.common.armour.ItemAmethystLegs;
import microjunk.trees.common.armour.ItemAmethystPlate;
import microjunk.trees.common.armour.ItemGraniteBoots;
import microjunk.trees.common.armour.ItemGraniteHelmet;
import microjunk.trees.common.armour.ItemGraniteLegs;
import microjunk.trees.common.armour.ItemGranitePlate;
import microjunk.trees.common.armour.ItemHardwoodBoots;
import microjunk.trees.common.armour.ItemHardwoodHelmet;
import microjunk.trees.common.armour.ItemHardwoodLegs;
import microjunk.trees.common.armour.ItemHardwoodPlate;
import microjunk.trees.common.armour.ItemMarbleBoots;
import microjunk.trees.common.armour.ItemMarbleHelmet;
import microjunk.trees.common.armour.ItemMarbleLegs;
import microjunk.trees.common.armour.ItemMarblePlate;
import microjunk.trees.common.armour.ItemSapphireBoots;
import microjunk.trees.common.armour.ItemSapphireHelmet;
import microjunk.trees.common.armour.ItemSapphireLegs;
import microjunk.trees.common.armour.ItemSapphirePlate;
import microjunk.trees.common.armour.ItemStonewoodBoots;
import microjunk.trees.common.armour.ItemStonewoodHelmet;
import microjunk.trees.common.armour.ItemStonewoodLegs;
import microjunk.trees.common.armour.ItemStonewoodPlate;
import microjunk.trees.common.biomes.BiomeAfterLifeDesert;
import microjunk.trees.common.biomes.BiomeAlphaHills;
import microjunk.trees.common.biomes.BiomeBlackMountains;
import microjunk.trees.common.biomes.BiomeCliffs;
import microjunk.trees.common.biomes.BiomeColdValley;
import microjunk.trees.common.biomes.BiomeEggHills;
import microjunk.trees.common.biomes.BiomeFruitValley;
import microjunk.trees.common.biomes.BiomeHardMountains;
import microjunk.trees.common.biomes.BiomeHurtfulHills;
import microjunk.trees.common.biomes.BiomeLegendaryForest;
import microjunk.trees.common.biomes.BiomePetrifiedHills;
import microjunk.trees.common.biomes.BiomeRainForrest;
import microjunk.trees.common.biomes.BiomeRedwoodForrest;
import microjunk.trees.common.biomes.BiomeSkysPeak;
import microjunk.trees.common.biomes.BiomeStoneMountains;
import microjunk.trees.common.biomes.BiomeTheOrient;
import microjunk.trees.common.biomes.BiomeThickForest;
import microjunk.trees.common.biomes.BiomeUnNaturalPlains;
import microjunk.trees.common.biomes.BiomeWhitePlains;
import microjunk.trees.common.biomes.BiomeWitheringHeights;
import microjunk.trees.common.biomes.BiomeWolf;
import microjunk.trees.common.biomes.BiomeZeroValley;
import microjunk.trees.common.blocks.BlockAlphaGrass;
import microjunk.trees.common.blocks.BlockAmethystOre;
import microjunk.trees.common.blocks.BlockBalckIce;
import microjunk.trees.common.blocks.BlockBlackBlock;
import microjunk.trees.common.blocks.BlockBlackOre;
import microjunk.trees.common.blocks.BlockBlackPlanks;
import microjunk.trees.common.blocks.BlockBlackTnT;
import microjunk.trees.common.blocks.BlockBlackWoodSlab;
import microjunk.trees.common.blocks.BlockBlackWoodStairs;
import microjunk.trees.common.blocks.BlockBloodstoneOre;
import microjunk.trees.common.blocks.BlockFirePad;
import microjunk.trees.common.blocks.BlockGarnetOre;
import microjunk.trees.common.blocks.BlockGraniteOre;
import microjunk.trees.common.blocks.BlockHardPlanks;
import microjunk.trees.common.blocks.BlockHardTorch;
import microjunk.trees.common.blocks.BlockHardWoodSlab;
import microjunk.trees.common.blocks.BlockHardWoodStairs;
import microjunk.trees.common.blocks.BlockHematiteOre;
import microjunk.trees.common.blocks.BlockJadeOre;
import microjunk.trees.common.blocks.BlockMarble;
import microjunk.trees.common.blocks.BlockMarbleBlock;
import microjunk.trees.common.blocks.BlockMoonstoneOre;
import microjunk.trees.common.blocks.BlockNaucylium;
import microjunk.trees.common.blocks.BlockOnyxOre;
import microjunk.trees.common.blocks.BlockOpalOre;
import microjunk.trees.common.blocks.BlockPeanutwoodOre;
import microjunk.trees.common.blocks.BlockPewterOre;
import microjunk.trees.common.blocks.BlockQuickSand;
import microjunk.trees.common.blocks.BlockRedWoodSlab;
import microjunk.trees.common.blocks.BlockRedWoodStairs;
import microjunk.trees.common.blocks.BlockRedwoodLadder;
import microjunk.trees.common.blocks.BlockRedwoodPlanks;
import microjunk.trees.common.blocks.BlockRedwoodTorch;
import microjunk.trees.common.blocks.BlockRubberBlock;
import microjunk.trees.common.blocks.BlockSapphireOre;
import microjunk.trees.common.blocks.BlockSlate;
import microjunk.trees.common.blocks.BlockSoftPlanks;
import microjunk.trees.common.blocks.BlockSoftWoodSlab;
import microjunk.trees.common.blocks.BlockSoftWoodStairs;
import microjunk.trees.common.blocks.BlockStonePlanks;
import microjunk.trees.common.blocks.BlockStoneTorch;
import microjunk.trees.common.blocks.BlockStoneWoodLadder;
import microjunk.trees.common.blocks.BlockStoneWoodSlab;
import microjunk.trees.common.blocks.BlockStoneWoodStairs;
import microjunk.trees.common.blocks.BlockSunPlanks;
import microjunk.trees.common.blocks.BlockSunflowerWoodSlab;
import microjunk.trees.common.blocks.BlockSunflowerWoodStairs;
import microjunk.trees.common.blocks.BlockTender;
import microjunk.trees.common.blocks.BlockTurquoiseOre;
import microjunk.trees.common.blocks.BlockWalnutLadder;
import microjunk.trees.common.blocks.BlockWalnutPlanks;
import microjunk.trees.common.blocks.BlockWalnutTorch;
import microjunk.trees.common.blocks.BlockWalnutWoodSlab;
import microjunk.trees.common.blocks.BlockWalnutWoodStairs;
import microjunk.trees.common.blocks.BlockWolfPlanks;
import microjunk.trees.common.blocks.BlockWolfWoodSlab;
import microjunk.trees.common.blocks.BlockWolfWoodStairs;
import microjunk.trees.common.blocks.BlocktTopazOre;
import microjunk.trees.common.blocks.EntityBlackTnTPrimed;
import microjunk.trees.common.blocks.TreesSlabs;
import microjunk.trees.common.deco.BlockArrowCactus;
import microjunk.trees.common.deco.BlockBlueBelle;
import microjunk.trees.common.deco.BlockBush;
import microjunk.trees.common.deco.BlockDaisy;
import microjunk.trees.common.deco.BlockDandelion;
import microjunk.trees.common.deco.BlockDanglingFlower;
import microjunk.trees.common.deco.BlockEleGrass;
import microjunk.trees.common.deco.BlockEleGrassTop;
import microjunk.trees.common.deco.BlockFlameCactus;
import microjunk.trees.common.deco.BlockGlowingVine;
import microjunk.trees.common.deco.BlockHappyCactus;
import microjunk.trees.common.deco.BlockHosta;
import microjunk.trees.common.deco.BlockIris;
import microjunk.trees.common.deco.BlockLily;
import microjunk.trees.common.deco.BlockLovePlant;
import microjunk.trees.common.deco.BlockMarshMarigold;
import microjunk.trees.common.deco.BlockPansy;
import microjunk.trees.common.deco.BlockPoisonbush;
import microjunk.trees.common.deco.BlockRedCactus;
import microjunk.trees.common.deco.BlockRedClover;
import microjunk.trees.common.deco.BlockSnowCactus;
import microjunk.trees.common.deco.BlockSpikebush;
import microjunk.trees.common.deco.BlockSwell;
import microjunk.trees.common.deco.BlockThornGrass;
import microjunk.trees.common.deco.BlockTulip;
import microjunk.trees.common.deco.BlockTwilightRose;
import microjunk.trees.common.deco.BlockWaterPlant;
import microjunk.trees.common.deco.BlockWhiteCactus;
import microjunk.trees.common.deco.BlockWildFlower;
import microjunk.trees.common.deco.BlockWildGrass;
import microjunk.trees.common.deco.BlockWildOnion;
import microjunk.trees.common.deco.BlockWinterbush;
import microjunk.trees.common.deco.CTFlower;
import microjunk.trees.common.deco.WorldGeneratorArrowCactus;
import microjunk.trees.common.deco.WorldGeneratorBlueBelle;
import microjunk.trees.common.deco.WorldGeneratorBush;
import microjunk.trees.common.deco.WorldGeneratorDaisy;
import microjunk.trees.common.deco.WorldGeneratorDandeLion;
import microjunk.trees.common.deco.WorldGeneratorDanglingFlower;
import microjunk.trees.common.deco.WorldGeneratorEleGrass;
import microjunk.trees.common.deco.WorldGeneratorFlameCactus;
import microjunk.trees.common.deco.WorldGeneratorGlowingVine;
import microjunk.trees.common.deco.WorldGeneratorHappyCactus;
import microjunk.trees.common.deco.WorldGeneratorHosta;
import microjunk.trees.common.deco.WorldGeneratorIris;
import microjunk.trees.common.deco.WorldGeneratorLily;
import microjunk.trees.common.deco.WorldGeneratorLovePlant;
import microjunk.trees.common.deco.WorldGeneratorMarshMarigold;
import microjunk.trees.common.deco.WorldGeneratorPansy;
import microjunk.trees.common.deco.WorldGeneratorPoisonBush;
import microjunk.trees.common.deco.WorldGeneratorRedCactus;
import microjunk.trees.common.deco.WorldGeneratorRedClover;
import microjunk.trees.common.deco.WorldGeneratorSnowCactus;
import microjunk.trees.common.deco.WorldGeneratorSpikeBush;
import microjunk.trees.common.deco.WorldGeneratorSwell;
import microjunk.trees.common.deco.WorldGeneratorThornGrass;
import microjunk.trees.common.deco.WorldGeneratorTulip;
import microjunk.trees.common.deco.WorldGeneratorTwilightRose;
import microjunk.trees.common.deco.WorldGeneratorWaterPlant;
import microjunk.trees.common.deco.WorldGeneratorWhiteCactus;
import microjunk.trees.common.deco.WorldGeneratorWildFlower;
import microjunk.trees.common.deco.WorldGeneratorWildGrass;
import microjunk.trees.common.deco.WorldGeneratorWildOnion;
import microjunk.trees.common.deco.WorldGeneratorWinterBush;
import microjunk.trees.common.furnaces.BlockExtruder;
import microjunk.trees.common.furnaces.BlockForge;
import microjunk.trees.common.furnaces.BlockGemMachine;
import microjunk.trees.common.furnaces.BlockIceMachine;
import microjunk.trees.common.furnaces.BlockSmithsBench;
import microjunk.trees.common.furnaces.BlockSpiritTable;
import microjunk.trees.common.furnaces.BlockTreeTrunk;
import microjunk.trees.common.furnaces.ExtruderRecipes;
import microjunk.trees.common.furnaces.GemMachineRecipes;
import microjunk.trees.common.furnaces.GuiHandlerTrees;
import microjunk.trees.common.furnaces.SmithsCraftingManager;
import microjunk.trees.common.furnaces.TileEntityExtruder;
import microjunk.trees.common.furnaces.TileEntityGemMachine;
import microjunk.trees.common.furnaces.TileEntityIceMachine;
import microjunk.trees.common.furnaces.TileEntityTreeTrunk;
import microjunk.trees.common.items.EntityTnTStick;
import microjunk.trees.common.items.EntityWind;
import microjunk.trees.common.items.FuelChickenDrop;
import microjunk.trees.common.items.FuelFlameCactus;
import microjunk.trees.common.items.ItemAmethystIngot;
import microjunk.trees.common.items.ItemAvocado;
import microjunk.trees.common.items.ItemBigFeather;
import microjunk.trees.common.items.ItemBlackBook;
import microjunk.trees.common.items.ItemBlackStick;
import microjunk.trees.common.items.ItemBlackTorch;
import microjunk.trees.common.items.ItemBlockIngot;
import microjunk.trees.common.items.ItemBloodstoneIngot;
import microjunk.trees.common.items.ItemCatsEye;
import microjunk.trees.common.items.ItemChickenDrop;
import microjunk.trees.common.items.ItemCoalDust;
import microjunk.trees.common.items.ItemCowsTail;
import microjunk.trees.common.items.ItemDiamondDust;
import microjunk.trees.common.items.ItemEggPaper;
import microjunk.trees.common.items.ItemGarnetGemStone;
import microjunk.trees.common.items.ItemGodsHand;
import microjunk.trees.common.items.ItemGraniteIngot;
import microjunk.trees.common.items.ItemHardStick;
import microjunk.trees.common.items.ItemHematiteGemStone;
import microjunk.trees.common.items.ItemJadeGemStone;
import microjunk.trees.common.items.ItemLambFriesCooked;
import microjunk.trees.common.items.ItemLambFriesRaw;
import microjunk.trees.common.items.ItemMarbleIngot;
import microjunk.trees.common.items.ItemMoonstoneGemStone;
import microjunk.trees.common.items.ItemOnyxGemStone;
import microjunk.trees.common.items.ItemOpalIngot;
import microjunk.trees.common.items.ItemPOFire;
import microjunk.trees.common.items.ItemPeanutWoodChunk;
import microjunk.trees.common.items.ItemPearl;
import microjunk.trees.common.items.ItemPewterIngot;
import microjunk.trees.common.items.ItemRedwoodStick;
import microjunk.trees.common.items.ItemRubber;
import microjunk.trees.common.items.ItemSapphireIngot;
import microjunk.trees.common.items.ItemSmokinDust;
import microjunk.trees.common.items.ItemSoftStick;
import microjunk.trees.common.items.ItemStoneStick;
import microjunk.trees.common.items.ItemSunStick;
import microjunk.trees.common.items.ItemTnTStick;
import microjunk.trees.common.items.ItemTopazGemStone;
import microjunk.trees.common.items.ItemTurquoiseIngot;
import microjunk.trees.common.items.ItemWalnut;
import microjunk.trees.common.items.ItemWalnutStick;
import microjunk.trees.common.items.ItemWinds;
import microjunk.trees.common.items.ItemWolfStick;
import microjunk.trees.common.items.ItemWorkHammer;
import microjunk.trees.common.items.ItemsunflowerSeeds;
import microjunk.trees.common.leaves.BlockBlackLeaves;
import microjunk.trees.common.leaves.BlockCantaloupeLeaves;
import microjunk.trees.common.leaves.BlockCarroLeaves;
import microjunk.trees.common.leaves.BlockCucumberLeaves;
import microjunk.trees.common.leaves.BlockEggLeaves;
import microjunk.trees.common.leaves.BlockExplosiveLeaves;
import microjunk.trees.common.leaves.BlockGhostLeaves;
import microjunk.trees.common.leaves.BlockGiantLeaves;
import microjunk.trees.common.leaves.BlockHardLeaves;
import microjunk.trees.common.leaves.BlockIceLeaves;
import microjunk.trees.common.leaves.BlockJapaneseApricotLeaves;
import microjunk.trees.common.leaves.BlockJapaneseCherryBlossomLeaves;
import microjunk.trees.common.leaves.BlockJapaneseMapleLeaves;
import microjunk.trees.common.leaves.BlockLifeLeaves;
import microjunk.trees.common.leaves.BlockNetherLeaves;
import microjunk.trees.common.leaves.BlockNeverLeaves;
import microjunk.trees.common.leaves.BlockPainLeaves;
import microjunk.trees.common.leaves.BlockPotatoLeaves;
import microjunk.trees.common.leaves.BlockRedwoodLeaves;
import microjunk.trees.common.leaves.BlockRubberLeaves;
import microjunk.trees.common.leaves.BlockSkyLeaves;
import microjunk.trees.common.leaves.BlockSmiteLeaves;
import microjunk.trees.common.leaves.BlockSmokinLeaves;
import microjunk.trees.common.leaves.BlockSoftLeaves;
import microjunk.trees.common.leaves.BlockSquashLeaves;
import microjunk.trees.common.leaves.BlockStoneLeaves;
import microjunk.trees.common.leaves.BlockSunflowerLeaves;
import microjunk.trees.common.leaves.BlockWalnutLeaves;
import microjunk.trees.common.leaves.BlockWaterLeaves;
import microjunk.trees.common.leaves.BlockWolfLeaves;
import microjunk.trees.common.logs.BlockBlackLog;
import microjunk.trees.common.logs.BlockCantaloupeLog;
import microjunk.trees.common.logs.BlockCarrotLog;
import microjunk.trees.common.logs.BlockCucumberLog;
import microjunk.trees.common.logs.BlockEggLog;
import microjunk.trees.common.logs.BlockExplosiveLog;
import microjunk.trees.common.logs.BlockGhostLog;
import microjunk.trees.common.logs.BlockGiantLog;
import microjunk.trees.common.logs.BlockHardLog;
import microjunk.trees.common.logs.BlockIceLog;
import microjunk.trees.common.logs.BlockJapaneseApricotLog;
import microjunk.trees.common.logs.BlockJapaneseCherryBlossomLog;
import microjunk.trees.common.logs.BlockJapaneseMapleLog;
import microjunk.trees.common.logs.BlockLifeLog;
import microjunk.trees.common.logs.BlockNetherLog;
import microjunk.trees.common.logs.BlockNeverLog;
import microjunk.trees.common.logs.BlockPainLog;
import microjunk.trees.common.logs.BlockPotatoLog;
import microjunk.trees.common.logs.BlockRedwoodLog;
import microjunk.trees.common.logs.BlockRubberLog;
import microjunk.trees.common.logs.BlockSkyLog;
import microjunk.trees.common.logs.BlockSmiteLog;
import microjunk.trees.common.logs.BlockSmokinLog;
import microjunk.trees.common.logs.BlockSoftLog;
import microjunk.trees.common.logs.BlockSquashLog;
import microjunk.trees.common.logs.BlockStoneLog;
import microjunk.trees.common.logs.BlockSunflowerLog;
import microjunk.trees.common.logs.BlockWalnutLog;
import microjunk.trees.common.logs.BlockWaterLog;
import microjunk.trees.common.logs.BlockWolfLog;
import microjunk.trees.common.mobs.EntityAttackPig;
import microjunk.trees.common.mobs.EntityBlueCow;
import microjunk.trees.common.mobs.EntityEasySpider;
import microjunk.trees.common.mobs.EntityGoat;
import microjunk.trees.common.mobs.EntityPunSheep;
import microjunk.trees.common.mobs.EntitySkyChicken;
import microjunk.trees.common.mobs.EntityTallChicken;
import microjunk.trees.common.mobs.EntityWalkingTree;
import microjunk.trees.common.mobs.EntityWanderingCow;
import microjunk.trees.common.saplings.BlockBlackSapling;
import microjunk.trees.common.saplings.BlockCantaloupeSapling;
import microjunk.trees.common.saplings.BlockCarrotSapling;
import microjunk.trees.common.saplings.BlockCucumberSapling;
import microjunk.trees.common.saplings.BlockEggSapling;
import microjunk.trees.common.saplings.BlockExplosiveSapling;
import microjunk.trees.common.saplings.BlockGhostSapling;
import microjunk.trees.common.saplings.BlockGiantSapling;
import microjunk.trees.common.saplings.BlockHardSapling;
import microjunk.trees.common.saplings.BlockIceSapling;
import microjunk.trees.common.saplings.BlockLifeSapling;
import microjunk.trees.common.saplings.BlockNetherSapling;
import microjunk.trees.common.saplings.BlockNeverSapling;
import microjunk.trees.common.saplings.BlockPainSapling;
import microjunk.trees.common.saplings.BlockPotatoSapling;
import microjunk.trees.common.saplings.BlockRedwoodSapling;
import microjunk.trees.common.saplings.BlockRubberSapling;
import microjunk.trees.common.saplings.BlockSkySapling;
import microjunk.trees.common.saplings.BlockSmiteSapling;
import microjunk.trees.common.saplings.BlockSmokinSapling;
import microjunk.trees.common.saplings.BlockSoftSapling;
import microjunk.trees.common.saplings.BlockSquashSapling;
import microjunk.trees.common.saplings.BlockStoneSapling;
import microjunk.trees.common.saplings.BlockSunflowerSapling;
import microjunk.trees.common.saplings.BlockTreeHouseSapling;
import microjunk.trees.common.saplings.BlockWalnutSapling;
import microjunk.trees.common.saplings.BlockWaterSapling;
import microjunk.trees.common.saplings.BlockWolfSapling;
import microjunk.trees.common.saplings.BlockjapaneseApricotSapling;
import microjunk.trees.common.saplings.BlockjapaneseMapleSapling;
import microjunk.trees.common.saplings.BlockjapanesecherryBlossomSapling;
import microjunk.trees.common.tabs.TabArmor;
import microjunk.trees.common.tabs.TabLeaves;
import microjunk.trees.common.tabs.TabTreeBlocks;
import microjunk.trees.common.tabs.TabTreeCombat;
import microjunk.trees.common.tabs.TabTreeDeco;
import microjunk.trees.common.tabs.TabTreeThings;
import microjunk.trees.common.tabs.TabTreeTools;
import microjunk.trees.common.tabs.TabWood;
import microjunk.trees.common.tools.ItemCTAxe;
import microjunk.trees.common.tools.ItemCTHoe;
import microjunk.trees.common.tools.ItemCTPickaxe;
import microjunk.trees.common.tools.ItemCTSpade;
import microjunk.trees.common.tools.ItemCTSword;
import microjunk.trees.common.travel.EntityIceBoat;
import microjunk.trees.common.travel.EntityLavaBoat;
import microjunk.trees.common.travel.EntitySkyBoat;
import microjunk.trees.common.travel.EntitySnowSled;
import microjunk.trees.common.travel.ItemIceBoat;
import microjunk.trees.common.travel.ItemLavaBoat;
import microjunk.trees.common.travel.ItemSkyBoat;
import microjunk.trees.common.travel.ItemSnowSled;
import microjunk.trees.common.weapons.EntityExplosiveArrow;
import microjunk.trees.common.weapons.EntityIceArrow;
import microjunk.trees.common.weapons.EntityLightningArrow;
import microjunk.trees.common.weapons.EntityPurpleArrow;
import microjunk.trees.common.weapons.EntityStealthArrow;
import microjunk.trees.common.weapons.ItemBlackBow;
import microjunk.trees.common.weapons.ItemCoolBow;
import microjunk.trees.common.weapons.ItemExplosiveArrow;
import microjunk.trees.common.weapons.ItemIceArrow;
import microjunk.trees.common.weapons.ItemLightningArrow;
import microjunk.trees.common.weapons.ItemPurpleArrow;
import microjunk.trees.common.weapons.ItemPurpleBow;
import microjunk.trees.common.weapons.ItemStealthArrow;
import microjunk.trees.common.weapons.ItemStoneBow;
import microjunk.trees.common.weapons.ItemWalnutBow;
import microjunk.trees.common.worldgen.WorldGeneratorBlackTrees;
import microjunk.trees.common.worldgen.WorldGeneratorCantaloupeTree;
import microjunk.trees.common.worldgen.WorldGeneratorCarrotTree;
import microjunk.trees.common.worldgen.WorldGeneratorCucumberTree;
import microjunk.trees.common.worldgen.WorldGeneratorEggTrees;
import microjunk.trees.common.worldgen.WorldGeneratorExplosiveTrees;
import microjunk.trees.common.worldgen.WorldGeneratorGhostTrees;
import microjunk.trees.common.worldgen.WorldGeneratorGiantTrees;
import microjunk.trees.common.worldgen.WorldGeneratorHardTrees;
import microjunk.trees.common.worldgen.WorldGeneratorIceTrees;
import microjunk.trees.common.worldgen.WorldGeneratorJATree;
import microjunk.trees.common.worldgen.WorldGeneratorJCBTree;
import microjunk.trees.common.worldgen.WorldGeneratorJMTree;
import microjunk.trees.common.worldgen.WorldGeneratorLifeTrees;
import microjunk.trees.common.worldgen.WorldGeneratorNetherTrees;
import microjunk.trees.common.worldgen.WorldGeneratorNeverTrees;
import microjunk.trees.common.worldgen.WorldGeneratorNewOres;
import microjunk.trees.common.worldgen.WorldGeneratorPainTrees;
import microjunk.trees.common.worldgen.WorldGeneratorPotatoTree;
import microjunk.trees.common.worldgen.WorldGeneratorQuickSand;
import microjunk.trees.common.worldgen.WorldGeneratorRainTrees;
import microjunk.trees.common.worldgen.WorldGeneratorRedwoodTrees;
import microjunk.trees.common.worldgen.WorldGeneratorRubberTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSkyTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSmiteTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSmokinTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSoftTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSquashTree;
import microjunk.trees.common.worldgen.WorldGeneratorStoneTrees;
import microjunk.trees.common.worldgen.WorldGeneratorSunflowerTrees;
import microjunk.trees.common.worldgen.WorldGeneratorWalnutTrees;
import microjunk.trees.common.worldgen.WorldGeneratorWolfTrees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockLadder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid = "Trees", name = "Cool_Trees", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Trees 
{
	@Instance("Trees")
	public static Trees instance;
	
	
	private GuiHandlerTrees guiHandlerTrees = new GuiHandlerTrees();
	public static boolean punchSheep = true;
	public static float rarity = 10F;
	
	public static DamageSource causeStealthArrowDamage(EntityStealthArrow par0EntityArrow, Entity par1Entity) 
	{
        return (new EntityDamageSourceIndirect("stealtharrow", par0EntityArrow, par1Entity)).setProjectile();
    }
	
	public static DamageSource causePurpleArrowDamage(EntityPurpleArrow var0, Entity var1)
    {
        return (new EntityDamageSourceIndirect("purplearrow", var0, var1)).setProjectile();
    }
	
	public static DamageSource causeLightningArrowDamage(EntityLightningArrow var0, Entity var1)
    {
        return (new EntityDamageSourceIndirect("arrow", var0, var1)).setProjectile();
    }
	
	public static WorldType coolTrees = new WorldTypeCoolTrees(3, "Black Mountains");
	
	//public static Block scP;
	
	//Tabs
	public static CreativeTabs tabLeaves = new TabLeaves(CreativeTabs.getNextID(), "Leaves");
	public static CreativeTabs tabWood = new TabWood(CreativeTabs.getNextID(), "Wood");
	public static CreativeTabs tabTreeThings = new TabTreeThings(CreativeTabs.getNextID(), "TreeThings");
	public static CreativeTabs tabArmor = new TabArmor(CreativeTabs.getNextID(), "Armor");
	public static CreativeTabs tabTreeTools = new TabTreeTools(CreativeTabs.getNextID(), "TreeTools");
	public static CreativeTabs tabTreeBlocks = new TabTreeBlocks(CreativeTabs.getNextID(), "TreeBlocks");
	public static CreativeTabs tabTreeCombat = new TabTreeCombat(CreativeTabs.getNextID(), "TreeCombat");
	public static CreativeTabs tabTreeDeco = new TabTreeDeco(CreativeTabs.getNextID(), "TreeDeco");
	
	//furnace
	public static Block extruderIdle;
	public static Block extruderActive;
	
	//SmithsBench
	public static Block smithsBench;
	
	//SpiritTable
	public static Block spiritTable;

	//TreeTrunk
	public static Block treeTrunk;
	public static final int renderId = RenderingRegistry.getNextAvailableRenderId();

	//Forge
	public static Block forge;

	//IceMachine
	public static Block iceMachine;
	public static Block iceMachineActive;
	
	//GemMachine
	public static Block gemMachine;
	public static Block gemMachineActive;
	
	//Logs
	public static Block blackLog;
	public static Block eggLog;
	public static Block hardLog;
	public static Block redwoodLog;
	public static Block rubberLog;
	public static Block smokinLog;
	public static Block softLog;
	public static Block stoneLog;
	public static Block sunflowerLog;
	public static Block walnutLog;
	public static Block waterLog;
	public static Block wolfLog;
	public static Block ghostLog;
	public static Block iceLog;
	public static Block skyLog;
	public static Block smiteLog;
	public static Block painLog;
	public static Block lifeLog;
	public static Block giantLog;
	public static Block netherLog;
	public static Block neverLog;
	public static Block explosiveLog;
	
	public static Block potatoLog;
	public static Block carrotLog;
	public static Block cantaloupeLog;
	public static Block squashLog;
	public static Block cucumberLog;
	public static Block japanesecherryBlossomLog;
	public static Block japaneseMapleLog;
	public static Block japaneseApricotLog;
	
	//Leaves
	public static Block blackLeaves;
	public static Block eggLeaves;
	public static Block hardLeaves;
	public static Block redwoodLeaves;
	public static Block rubberLeaves;
	public static Block smokinLeaves;
	public static Block softLeaves;
	public static Block stoneLeaves;
	public static Block sunflowerLeaves;
	public static Block walnutLeaves;
	public static Block waterLeaves;
	public static Block wolfLeaves;
	public static Block ghostLeaves;
	public static Block iceLeaves;
	public static Block skyLeaves;
	public static Block smiteLeaves;
	public static Block painLeaves;
	public static Block lifeLeaves;
	public static Block giantLeaves;
	public static Block netherLeaves;
	public static Block neverLeaves;
	public static Block explosiveLeaves;
	
	public static Block potatoLeaves;
	public static Block carrotLeaves;
	public static Block cantaloupeLeaves;
	public static Block squashLeaves;
	public static Block cucumberLeaves;
	public static Block japanesecherryBlossomLeaves;
	public static Block japaneseMapleLeaves;
	public static Block japaneseApricotLeaves;
	
	//Saplings
	public static Block blackSapling;
	public static Block eggSapling;
	public static Block hardSapling;
	public static Block redwoodSapling;
	public static Block rubberSapling;
	public static Block smokinSapling;
	public static Block softSapling;
	public static Block stoneSapling;
	public static Block sunflowerSapling;
	public static Block walnutSapling;
	public static Block waterSapling;
	public static Block wolfSapling;
	public static Block ghostSapling;
	public static Block iceSapling;
	public static Block skySapling;
	public static Block smiteSapling;
	public static Block painSapling;
	public static Block lifeSapling;
	public static Block giantSapling;
	public static Block netherSapling;
	public static Block neverSapling;
	public static Block explosiveSapling;
	
	public static Block potatoSapling;
	public static Block carrotSapling;
	public static Block cantaloupeSapling;
	public static Block squashSapling;
	public static Block cucumberSapling;
	public static Block japanesecherryBlossomSapling;
	public static Block japaneseApricotSapling;
	public static Block japaneseMapleSapling;
	public static Block treehouseSapling;
	
	//Blocks
	public static Block slate;
	public static Block alphaGrass;
	public static Block blackOre;
	public static Block amethystOre;
	public static Block sapphireOre;
	public static Block marble;
	public static Block opalOre;
	public static Block turquoiseOre;
	public static Block graniteOre;
	public static Block quickSand;
	public static Block rubberBlock;
	public static Block blackTnT;
	public static Block firePad;
	public static Block naucylium;
	public static Block blackIce;
	public static Block tender;
	public static Block blackBlock;
	public static Block marbleBlock;
	
	public static Block pewterOre;
	public static Block moonstoneOre;
	public static Block garnetOre;
    public static Block topazOre;
    public static Block onyxOre;
    public static Block bloodstoneOre;
    public static Block peanutwoodOre;
    public static Block jadeOre;
    public static Block hematiteOre;
	
	//Planks
	public static Block blackPlanks;
	public static Block hardPlanks;
	public static Block redwoodPlanks;
	public static Block softPlanks;
	public static Block stonePlanks;
	public static Block sunflowerPlanks;
	public static Block walnutPlanks;
	public static Block wolfPlanks;
	
	//Slabs
	public static TreesSlabs blackWoodDoubleSlab;
	public static TreesSlabs blackWoodSingleSlab;
	public static TreesSlabs hardWoodDoubleSlab;
	public static TreesSlabs hardWoodSingleSlab;
	public static TreesSlabs redwoodDoubleSlab;
	public static TreesSlabs redwoodSingleSlab;
	public static TreesSlabs softWoodDoubleSlab;
	public static TreesSlabs softWoodSingleSlab;
	public static TreesSlabs stoneWoodDoubleSlab;
	public static TreesSlabs stoneWoodSingleSlab;
	public static TreesSlabs sunflowerDoubleSlab;
	public static TreesSlabs sunflowerSingleSlab;
	public static TreesSlabs walnutWoodDoubleSlab;
	public static TreesSlabs walnutWoodSingleSlab;
	public static TreesSlabs wolfWoodDoubleSlab;
	public static TreesSlabs wolfWoodSingleSlab;
	
	//Ladder
	public static BlockLadder redwoodLadder;
	public static BlockLadder stoneWoodLadder;
	public static BlockLadder walnutLadder;

	//Torch
	public static Block hardTorch;
	public static Block redwoodTorch;
	public static Block stoneTorch;
	public static Block walnutTorch;

	//Stairs
	public static Block blackWoodStairs;
	public static Block hardWoodStairs;
	public static Block redWoodStairs;
	public static Block softWoodStairs;
	public static Block stoneWoodStairs;
	public static Block sunflowerWoodStairs;
	public static Block walnutWoodStairs;
	public static Block wolfWoodStairs;
	
	//Ingots
	public static Item blackIngot;
	public static Item amethystIngot;
	public static Item sapphireIngot;
	public static Item marbleIngot;
	public static Item opalIngot;
	public static Item turquoiseIngot;
	public static Item graniteIngot;
	
	public static Item pewterIngot;
	public static Item moonstoneGemStone;
	public static Item garnetGemStone;
    public static Item topazGemStone;
    public static Item onyxGemStone;
    public static Item bloodstoneIngot;
    public static Item peanutwoodChunk;
    public static Item jadeGemStone;
    public static Item hematiteGemStone;
	
	//Items
	public static Item avocado;
	public static Item coalDust;
	public static Item diamondDust;
	public static Item sunflowerSeeds;
	public static Item tntStick;
	public static Item walnut;
	public static Item eggPaper;
	public static Item rubber;
	public static Item smokinDust;
	public static Item skyBoat;
	public static Item lavaBoat;
	public static Item snowSled;
	public static Item iceBoat;
	public static Item blackBook;
	public static Item lambfriescooked;
	public static Item lambfriesraw;
	public static Item cowsTail;
	
	//Tools
	public static Item blackAxe;
	public static Item blackHoe;
	public static Item blackPickAxe;
	public static Item blackSpade;
	public static Item blackSword;
	public static Item marbleAxe;
	public static Item marbleHoe;
	public static Item marblePickAxe;
	public static Item marbleSpade;
	public static Item marbleSword;
	public static Item graniteSword;
	public static Item blackWoodSword;
	public static Item hardWoodSword;
	public static Item redWoodSword;
	public static Item stoneWoodSword;
	
	//Armor
	public static Item marbleHelmet;
	public static Item marblePlate;
	public static Item marbleLegs;
	public static Item marbleBoots;
	public static Item amethystHelmet;
	public static Item amethystPlate;
	public static Item amethystLegs;
	public static Item amethystBoots;
	public static Item sapphireHelmet;
	public static Item sapphirePlate;
	public static Item sapphireLegs;
	public static Item sapphireBoots;
	public static Item graniteHelmet;
	public static Item granitePlate;
	public static Item graniteLegs;
	public static Item graniteBoots;
	public static Item hardwoodHelmet;
	public static Item hardwoodPlate;
	public static Item hardwoodLegs;
	public static Item hardwoodBoots;
	public static Item stonewoodHelmet;
	public static Item stonewoodPlate;
	public static Item stonewoodLegs;
	public static Item stonewoodBoots;
	
	//Sticks
	public static Item blackStick;
	public static Item hardStick;
	public static Item redwoodStick;
	public static Item softStick;
	public static Item stoneStick;
	public static Item sunflowerStick;
	public static Item walnutStick;
	public static Item wolfStick;
	
	//Black Torch
	public static Item blackTorch;
	public boolean blackTorchEquipped = false;
	
	//Wands
	public static Item godsHand;
	public static Item poFire;
	public static Item winds;

	//MiscItems
	public static Item chickenDrop;
	public static Item workHammer;
	public static Item bigFeather;
	public static Item coolBow;
	public static Item walnutBow;
	public static Item stoneBow;
	public static Item blackBow;
	public static Item purpleBow;
	public static Item purpleArrow;
	public static Item stealthArrow;
	public static Item explosiveArrow;
	public static Item iceArrow;
	public static Item lightningArrow;
	
	public static Item catseye;
	public static Item pearl;
	
	//Flowers
	public static CTFlower lilly;
	public static CTFlower tulip;
	public static CTFlower wildFlower;
	public static CTFlower dandelion;
	public static CTFlower daisy;
	public static CTFlower iris;
	public static CTFlower redClover;
	public static CTFlower pansy;
	public static CTFlower marshMarigold;
	public static CTFlower wildOnion;
	public static CTFlower wildGrass;
	public static CTFlower thornGrass;
	
	public static Block glowingVine;
	public static Block danglingFlower;
	public static Block flameCactus;
	public static CTFlower bush;
    public static Block poisonbush;
    public static Block winterbush;
    public static Block spikebush;
    public static Block eleGrass;
    public static Block eleGrassTop;
    
	public static CTFlower happyCactus;
	public static CTFlower hosta;
	public static CTFlower twilightRose;
	public static CTFlower redCactus;
	public static CTFlower whiteCactus;
	public static CTFlower waterPlant;
	public static CTFlower arrowCactus;
	public static CTFlower snowCactus;
	public static CTFlower blueBelle;
	public static CTFlower swell;
	public static CTFlower lovePlant;
    
	//Extruder
	public static int extruderIdleID;
	public static int extruderActiveID;
	
	//SmithsBench
	public static int smithsBenchID;
	
	//SpiritTable
	public static int spiritTableID;

	//TreeTrunk
	public static int treeTrunkID;

	//Forge
	public static int forgeID;

	//IceMachine
	public static int iceMachineID;
	public static int iceMachineActiveID;

	//GemMachine
	public static int gemMachineID;
	public static int gemMachineActiveID;
	
	//Logs
	public static int blackLogID;
	public static int eggLogID;
	public static int hardLogID;
	public static int redwoodLogID;
	public static int rubberLogID;
	public static int smokinLogID;
	public static int softLogID;
	public static int stoneLogID;
	public static int sunflowerLogID;
	public static int walnutLogID;
	public static int waterLogID;
	public static int wolfLogID;
	public static int ghostLogID;
	public static int iceLogID;
	public static int skyLogID;
	public static int smiteLogID;
	public static int painLogID;
	public static int lifeLogID;
	public static int giantLogID;
	public static int netherLogID;
	public static int neverLogID;
	public static int explosiveLogID;
	
	public static int potatoLogID;
	public static int carrotLogID;
	public static int cantaloupeLogID;
	public static int squashLogID;
	public static int cucumberLogID;
	public static int japanesecherryBlossomLogID;
	public static int japaneseMapleLogID;
	public static int japaneseApricotLogID;
	
	//Leaves
	public static int blackLeavesID;
	public static int eggLeavesID;
	public static int hardLeavesID;
	public static int redwoodLeavesID;
	public static int rubberLeavesID;
	public static int smokinLeavesID;
	public static int softLeavesID;
	public static int stoneLeavesID;
	public static int sunflowerLeavesID;
	public static int walnutLeavesID;
	public static int waterLeavesID;
	public static int wolfLeavesID;
	public static int ghostLeavesID;
	public static int iceLeavesID;
	public static int skyLeavesID;
	public static int smiteLeavesID;
	public static int painLeavesID;
	public static int lifeLeavesID;
	public static int giantLeavesID;
	public static int netherLeavesID;
	public static int neverLeavesID;
	public static int explosiveLeavesID;
	
	public static int potatoLeavesID;
	public static int carrotLeavesID;
	public static int cantaloupeLeavesID;
	public static int squashLeavesID;
	public static int cucumberLeavesID;
	public static int japanesecherryBlossomLeavesID;
	public static int japaneseMapleLeavesID;
	public static int japaneseApricotLeavesID;
	
	//Saplings
	public static int blackSaplingID;
	public static int eggSaplingID;
	public static int hardSaplingID;
	public static int redwoodSaplingID;
	public static int rubberSaplingID;
	public static int smokinSaplingID;
	public static int softSaplingID;
	public static int stoneSaplingID;
	public static int sunflowerSaplingID;
	public static int walnutSaplingID;
	public static int waterSaplingID;
	public static int wolfSaplingID;
	public static int ghostSaplingID;
	public static int iceSaplingID;
	public static int skySaplingID;
	public static int smiteSaplingID;
	public static int painSaplingID;
	public static int lifeSaplingID;
	public static int giantSaplingID;
	public static int netherSaplingID;
	public static int neverSaplingID;
	public static int explosiveSaplingID;
	
	public static int potatoSaplingID;
	public static int carrotSaplingID;
	public static int cantaloupeSaplingID;
	public static int squashSaplingID;
	public static int cucumberSaplingID;
	public static int japanesecherryBlossomSaplingID;
	public static int japaneseMapleSaplingID;
	public static int japaneseApricotSaplingID;
	public static int treehouseSaplingID;
	
	//Blocks
	public static int slateID;
	public static int alphaGrassID;
	public static int blackOreID;
	public static int amethystOreID;
	public static int sapphireOreID;
	public static int marbleID;
	public static int opalOreID;
	public static int turquoiseOreID;
	public static int graniteOreID;
	public static int quickSandID;
	public static int rubberBlockID;
	public static int blackTnTID;
	public static int firePadID;
	public static int naucyliumID;
	public static int blackIceID;
	public static int tenderID;
	public static int blackBlockID;
	public static int marbleBlockID;
	
	public static int pewterOreID;
	public static int moonstoneOreID;
	public static int garnetOreID;
    public static int topazOreID;
    public static int onyxOreID;
    public static int bloodstoneOreID;
    public static int peanutwoodOreID;
    public static int jadeOreID;
    public static int hematiteOreID;
	
	//Planks
	public static int blackPlanksID;
	public static int hardPlanksID;
	public static int redwoodPlanksID;
	public static int softPlanksID;
	public static int stonePlanksID;
	public static int sunflowerPlanksID;
	public static int walnutPlanksID;
	public static int wolfPlanksID;
	
	//Slabs
	public static int blackWoodDoubleSlabID;
	public static int blackWoodSingleSlabID;
	public static int hardWoodDoubleSlabID;
	public static int hardWoodSingleSlabID;
	public static int redwoodDoubleSlabID;
	public static int redwoodSingleSlabID;
	public static int softWoodDoubleSlabID;
	public static int softWoodSingleSlabID;
	public static int stoneWoodDoubleSlabID;
	public static int stoneWoodSingleSlabID;
	public static int sunflowerDoubleSlabID;
	public static int sunflowerSingleSlabID;
	public static int walnutWoodDoubleSlabID;
	public static int walnutWoodSingleSlabID;
	public static int wolfWoodDoubleSlabID;
	public static int wolfWoodSingleSlabID;
	
	//Ladder
	public static int redwoodLadderID;
	public static int stoneWoodLadderID;
	public static int walnutLadderID;

	//Torch
	public static int hardTorchID;
	public static int redwoodTorchID;
	public static int stoneTorchID;
	public static int walnutTorchID;

	//Stairs
	public static int blackWoodStairsID;
	public static int hardWoodStairsID;
	public static int redWoodStairsID;
	public static int softWoodStairsID;
	public static int stoneWoodStairsID;
	public static int sunflowerWoodStairsID;
	public static int walnutWoodStairsID;
	public static int wolfWoodStairsID;
	
	//Ingots
	public static int blackIngotID;
	public static int amethystIngotID;
	public static int sapphireIngotID;
	public static int marbleIngotID;
	public static int opalIngotID;
	public static int turquoiseIngotID;
	public static int graniteIngotID;
	
	public static int pewterIngotID;
	public static int moonstoneGemStoneID;
	public static int garnetGemStoneID;
    public static int topazGemStoneID;
    public static int onyxGemStoneID;
    public static int bloodstoneIngotID;
    public static int peanutwoodChunkID;
    public static int jadeGemStoneID;
    public static int hematiteGemStoneID;
	
	//Items
	public static int avocadoID;
	public static int coalDustID;
	public static int diamondDustID;
	public static int sunflowerSeedsID;
	public static int tntStickID;
	public static int walnutID;
	public static int eggPaperID;
	public static int rubberID;
	public static int smokinDustID;
	public static int skyBoatID;
	public static int lavaBoatID;
	public static int snowSledID;
	public static int iceBoatID;
	public static int blackBookID;
	public static int lambfriescookedID;
	public static int lambfriesrawID;
	public static int cowsTailID;
	
	public static int catseyeID;
	public static int pearlID;
	
	//Tools
	public static int blackAxeID;
	public static int blackHoeID;
	public static int blackPickAxeID;
	public static int blackSpadeID;
	public static int blackSwordID;
	public static int marbleAxeID;
	public static int marbleHoeID;
	public static int marblePickAxeID;
	public static int marbleSpadeID;
	public static int marbleSwordID;
	public static int graniteSwordID;
	public static int blackWoodSwordID;
	public static int hardWoodSwordID;
	public static int redWoodSwordID;
	public static int stoneWoodSwordID;
	
	//Armor
	public static int marbleHelmetID;
	public static int marblePlateID;
	public static int marbleLegsID;
	public static int marbleBootsID;
	public static int amethystHelmetID;
	public static int amethystPlateID;
	public static int amethystLegsID;
	public static int amethystBootsID;
	public static int sapphireHelmetID;
	public static int sapphirePlateID;
	public static int sapphireLegsID;
	public static int sapphireBootsID;
	public static int graniteHelmetID;
	public static int granitePlateID;
	public static int graniteLegsID;
	public static int graniteBootsID;
	public static int hardwoodHelmetID;
	public static int hardwoodPlateID;
	public static int hardwoodLegsID;
	public static int hardwoodBootsID;
	public static int stonewoodHelmetID;
	public static int stonewoodPlateID;
	public static int stonewoodLegsID;
	public static int stonewoodBootsID;
	
	//Sticks
	public static int blackStickID;
	public static int hardStickID;
	public static int redwoodStickID;
	public static int softStickID;
	public static int stoneStickID;
	public static int sunflowerStickID;
	public static int walnutStickID;
	public static int wolfStickID;
	
	//Black Torch
	public static int blackTorchID;
	
	//Wands
	public static int godsHandID;
	public static int poFireID;
	public static int windsID;

	//MiscItems
	public static int chickenDropID;
	public static int workHammerID;
	public static int bigFeatherID;
	public static int coolBowID;
	public static int walnutBowID;
	public static int stoneBowID;
	public static int blackBowID;
	public static int purpleBowID;
	public static int purpleArrowID;
	public static int stealthArrowID;
	public static int explosiveArrowID;
	public static int iceArrowID;
	public static int lightningArrowID;
	
	//Flowers
	public static int lillyID;
	public static int tulipID;
	public static int wildFlowerID;
	public static int dandelionID;
	public static int daisyID;
	public static int irisID;
	public static int redCloverID;
	public static int pansyID;
	public static int marshMarigoldID;
	public static int wildOnionID;
	public static int wildGrassID;
	public static int thornGrassID;
	public static int glowingVineID;
	public static int danglingFlowerID;
	public static int flameCactusID;
	public static int bushID;
    public static int poisonbushID;
    public static int winterbushID;
    public static int spikebushID;
    public static int eleGrassID;
    public static int eleGrassTopID;
    
    public static int happyCactusID;
	public static int hostaID;
	public static int twilightRoseID;
	public static int redCactusID;
	public static int whiteCactusID;
	public static int waterPlantID;
	public static int arrowCactusID;
	public static int snowCactusID;
	public static int blueBelleID;
	public static int swellID;
	public static int lovePlantID;
    
	//Biomes
	public static BiomeGenBase blackMountains;
	public static BiomeGenBase eggHills;
	public static BiomeGenBase hardMountains;
	public static BiomeGenBase rainForrest;
	public static BiomeGenBase redwoodForrest;
	public static BiomeGenBase alphaHills;
	public static BiomeGenBase stoneMountains;
	public static BiomeGenBase whitePlains;
	public static BiomeGenBase wolf;
	public static BiomeGenBase petrifiedHills;
	public static BiomeGenBase zeroValley;
	public static BiomeGenBase hurtfulHills;
	public static BiomeGenBase afterLifeDesert;
	public static BiomeGenBase cliffs;
	public static BiomeGenBase legendaryForest;
	public static BiomeGenBase fruitValley;
	public static BiomeGenBase coldValley;
	
	public static BiomeGenBase witheringHeights;
	public static BiomeGenBase skysPeak;
	public static BiomeGenBase unnaturalPlains;
	public static BiomeGenBase thickForest;
	public static BiomeGenBase theOrient;
	
	public static int witheringHeightsID;
	public static int skysPeakID;
	public static int unnaturalPlainsID;
	public static int thickForestID;
	public static int theOrientID;
	
	public static int blackMountainsID;
	public static int eggHillsID;
	public static int hardMountainsID;
	public static int rainForrestID;
	public static int redwoodForrestID;
	public static int alphaHillsID;
	public static int stoneMountainsID;
	public static int whitePlainsID;
	public static int wolfID;
	public static int petrifiedHillsID;
	public static int zeroValleyID;
	public static int hurtfulHillsID;
	public static int afterLifeDesertID;
	public static int cliffsID;
	public static int legendaryForestID;
	public static int fruitValleyID;
	public static int coldValleyID;
	
	public static List CTBiomes = Arrays.asList(new BiomeGenBase[] {blackMountains, eggHills, hardMountains});
	
	static EnumArmorMaterial aMarble = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumArmorMaterial aAmethyst = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumArmorMaterial aSapphire = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumArmorMaterial aGranite = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumArmorMaterial aHardWood = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumArmorMaterial aStoneWood = EnumHelper.addArmorMaterial("Kevlar", 35, new int[]{4,9,7,6}, 15);
	static EnumToolMaterial tMarble = EnumHelper.addToolMaterial("tMarble", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tBlack = EnumHelper.addToolMaterial("tBlack", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tGranite = EnumHelper.addToolMaterial("tGranite", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tBlackWood = EnumHelper.addToolMaterial("tBlackWood", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tHardWood = EnumHelper.addToolMaterial("tHardWood", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tRedWood = EnumHelper.addToolMaterial("tRedWood", 2, 750, 10F, 2, 14);
	static EnumToolMaterial tStoneWood = EnumHelper.addToolMaterial("tStoneWood", 2, 750, 10F, 2, 14);
	
	@SidedProxy(clientSide = "microjunk.trees.client.ClientProxy", serverSide = "microjunk.trees.common.CommonProxy")
	public static CommonProxy proxy;


	//public static int treeTrunkRender;

	

	@cpw.mods.fml.common.Mod.PreInit
	public void PreInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new SoundEventSounds());
		MinecraftForge.EVENT_BUS.register(new TreeEventHooks());
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//furnace
		extruderIdleID = config.getBlock("extruder Idle ID", 3000, (String)null).getInt();
		extruderActiveID = config.getBlock("extruder Active ID", 3001, (String)null).getInt();
	
		//SmithsBench
		smithsBenchID = config.getBlock("smiths Bench ID", 3002, (String)null).getInt();
	
		//SpiritTable
		spiritTableID = config.getBlock("spirit Table ID", 3003, (String)null).getInt();

		//TreeTrunk
		treeTrunkID = config.getBlock("tree Trunk ID", 3004, (String)null).getInt();
		
		//Forge
		forgeID = config.getBlock("forge ID", 3005, (String)null).getInt();

		//IceMachine
		iceMachineID = config.getBlock("ice Machine ID", 3006, (String)null).getInt();
		iceMachineActiveID = config.getBlock("ice Machine Active ID", 3007, (String)null).getInt();
		
		//GemMachine
		gemMachineID = config.getBlock("gem Machine ID", 3008, (String)null).getInt();
		gemMachineActiveID = config.getBlock("gem Machine Active ID", 3009, (String)null).getInt();

		//Blocks
		slateID = config.getTerrainBlock("Terrain Block IDs", "slate ID", 150, (String)null).getInt();
		alphaGrassID = config.getTerrainBlock("Terrain Block IDs", "alpha Grass ID", 151, (String)null).getInt();
		blackOreID = config.getTerrainBlock("Terrain Block IDs", "black Ore ID", 152, (String)null).getInt();
		amethystOreID = config.getTerrainBlock("Terrain Block IDs", "amethyst Ore ID", 153, (String)null).getInt();
		sapphireOreID = config.getTerrainBlock("Terrain Block IDs", "sapphire Ore ID", 154, (String)null).getInt();
		marbleID = config.getTerrainBlock("Terrain Block IDs", "marble ID", 155, (String)null).getInt();
		opalOreID = config.getTerrainBlock("Terrain Block IDs", "opal Ore ID", 156, (String)null).getInt();
		turquoiseOreID = config.getTerrainBlock("Terrain Block IDs", "turquoise Ore ID", 157, (String)null).getInt();
		graniteOreID = config.getTerrainBlock("Terrain Block IDs", "granite Ore ID", 158, (String)null).getInt();
		quickSandID = config.getTerrainBlock("Terrain Block IDs", "quick Sand ID", 159, (String)null).getInt();
		naucyliumID = config.getTerrainBlock("Terrain Block IDs", "naucylium ID", 160, (String)null).getInt();
		blackIceID = config.getTerrainBlock("Terrain Block IDs", "black Ice ID", 161, (String)null).getInt();
		
		pewterOreID = config.getTerrainBlock("Terrain Block IDs", "pewter ID", 162, (String)null).getInt();
		moonstoneOreID = config.getTerrainBlock("Terrain Block IDs", "moonstone ID", 163, (String)null).getInt();
		garnetOreID = config.getTerrainBlock("Terrain Block IDs", "garnet ID", 164, (String)null).getInt();
		topazOreID = config.getTerrainBlock("Terrain Block IDs", "topaz ID", 165, (String)null).getInt();
		onyxOreID = config.getTerrainBlock("Terrain Block IDs", "onyx ID", 166, (String)null).getInt();
		bloodstoneOreID = config.getTerrainBlock("Terrain Block IDs", "bloodstone ID", 167, (String)null).getInt();
		peanutwoodOreID = config.getTerrainBlock("Terrain Block IDs", "peanutwood ID", 168, (String)null).getInt();
		jadeOreID = config.getTerrainBlock("Terrain Block IDs", "jade ID", 169, (String)null).getInt();
		hematiteOreID = config.getTerrainBlock("Terrain Block IDs", "hematite ID", 170, (String)null).getInt();
		
		tenderID = config.getBlock("tender ID", 200, (String)null).getInt();
		rubberBlockID = config.getBlock("rubber Block ID", 201, (String)null).getInt();
		blackTnTID = config.getBlock("black TnT ID", 202, (String)null).getInt();
		firePadID = config.getBlock("fire Pad ID", 203, (String)null).getInt();
		blackBlockID = config.getBlock("black Block ID", 204, (String)null).getInt();
		marbleBlockID = config.getBlock("marble Block ID", 205, (String)null).getInt();
		
		//Logs
		blackLogID = config.getBlock("black Log ID", 3010, (String)null).getInt();
		eggLogID = config.getBlock("egg Log ID", 3011, (String)null).getInt();
		hardLogID = config.getBlock("hard Log ID", 3012, (String)null).getInt();
		redwoodLogID = config.getBlock("redwood Log ID", 3013, (String)null).getInt();
		rubberLogID = config.getBlock("rubber Log ID", 3014, (String)null).getInt();
		smokinLogID = config.getBlock("smokin Log ID", 3015, (String)null).getInt();
		softLogID = config.getBlock("soft Log ID", 3016, (String)null).getInt();
		stoneLogID = config.getBlock("stone Log ID", 3017, (String)null).getInt();
		sunflowerLogID = config.getBlock("sunflower Log ID", 3018, (String)null).getInt();
		walnutLogID = config.getBlock("walnut Log ID", 3019, (String)null).getInt();
		waterLogID = config.getBlock("water Log ID", 3020, (String)null).getInt();
		wolfLogID = config.getBlock("wolf Log ID", 3021, (String)null).getInt();
		ghostLogID = config.getBlock("ghost Log ID", 3022, (String)null).getInt();
		iceLogID = config.getBlock("ice Log ID", 3023, (String)null).getInt();
		skyLogID = config.getBlock("sky Log ID", 3024, (String)null).getInt();
		smiteLogID = config.getBlock("smite Log ID", 3025, (String)null).getInt();
		painLogID = config.getBlock("pain Log ID", 3026, (String)null).getInt();
		lifeLogID = config.getBlock("life Log ID", 3027, (String)null).getInt();
		giantLogID = config.getBlock("giant Log ID", 3028, (String)null).getInt();
		netherLogID = config.getBlock("nether Log ID", 3029, (String)null).getInt();
		neverLogID = config.getBlock("never Log ID", 3030, (String)null).getInt();
		explosiveLogID = config.getBlock("explosive Log ID", 3031, (String)null).getInt();
		
		potatoLogID = config.getBlock("potato Log ID", 3032, (String)null).getInt();
		carrotLogID = config.getBlock("carrot Log ID", 3033, (String)null).getInt();
		cantaloupeLogID = config.getBlock("cantaloupe Log ID", 3033, (String)null).getInt();
		squashLogID = config.getBlock("squash Log ID", 3034, (String)null).getInt();
		cucumberLogID = config.getBlock("cucumber Log ID", 3035, (String)null).getInt();
		japanesecherryBlossomLogID = config.getBlock("japanese Cherry Blossom Log ID", 3036, (String)null).getInt();
		japaneseMapleLogID = config.getBlock("japanese Maple Log ID", 3037, (String)null).getInt();
		japaneseApricotLogID = config.getBlock("japanese Apricot Log ID", 3038, (String)null).getInt();
		
		//Leaves
		blackLeavesID = config.getBlock("black Leaves ID", 3046, (String)null).getInt();
		eggLeavesID = config.getBlock("eggLeaves ID", 3047, (String)null).getInt();
		hardLeavesID = config.getBlock("hardLeaves ID", 3048, (String)null).getInt();
		redwoodLeavesID = config.getBlock("redwoodLeaves ID", 3049, (String)null).getInt();
		rubberLeavesID = config.getBlock("rubberLeaves ID", 3050, (String)null).getInt();
		smokinLeavesID = config.getBlock("smokinLeaves ID", 3051, (String)null).getInt();
		softLeavesID = config.getBlock("softLeaves ID", 3052, (String)null).getInt();
		stoneLeavesID = config.getBlock("stoneLeaves ID", 3053, (String)null).getInt();
		sunflowerLeavesID = config.getBlock("sunflowerLeaves ID", 3054, (String)null).getInt();
		walnutLeavesID = config.getBlock("walnutLeaves ID", 3055, (String)null).getInt();
		waterLeavesID = config.getBlock("waterLeaves ID", 3056, (String)null).getInt();
		wolfLeavesID = config.getBlock("wolfLeaves ID", 3057, (String)null).getInt();
		ghostLeavesID = config.getBlock("ghostLeaves ID", 3058, (String)null).getInt();
		iceLeavesID = config.getBlock("iceLeaves ID", 3059, (String)null).getInt();
		skyLeavesID = config.getBlock("skyLeaves ID", 3060, (String)null).getInt();
		smiteLeavesID = config.getBlock("smiteLeaves ID", 3061, (String)null).getInt();
		painLeavesID = config.getBlock("painLeaves ID", 3062, (String)null).getInt();
		lifeLeavesID = config.getBlock("lifeLeaves ID", 3063, (String)null).getInt();
		giantLeavesID = config.getBlock("giantLeaves ID", 3064, (String)null).getInt();
		netherLeavesID = config.getBlock("netherLeaves ID", 3065, (String)null).getInt();
		neverLeavesID = config.getBlock("neverLeaves ID", 3066, (String)null).getInt();
		explosiveLeavesID = config.getBlock("explosiveLeaves ID", 3067, (String)null).getInt();
	
		potatoLeavesID = config.getBlock("potatoLeaves ID", 3068, (String)null).getInt();
		carrotLeavesID = config.getBlock("carrotLeaves ID", 3069, (String)null).getInt();
		cantaloupeLeavesID = config.getBlock("cantaloupeLeaves ID", 3070, (String)null).getInt();
		squashLeavesID = config.getBlock("squashLeaves ID", 3071, (String)null).getInt();
		cucumberLeavesID = config.getBlock("cucumberLeaves ID", 3072, (String)null).getInt();
		japanesecherryBlossomLeavesID = config.getBlock("japanesecherryBlossomLeaves ID", 3073, (String)null).getInt();
		japaneseMapleLeavesID = config.getBlock("japaneseMapleLeaves ID", 3074, (String)null).getInt();
		japaneseApricotLeavesID = config.getBlock("japaneseApricotLeaves ID", 3075, (String)null).getInt();
		
		//Saplings
		blackSaplingID = config.getBlock("blackSapling ID", 3082, (String)null).getInt();
		eggSaplingID = config.getBlock("eggSapling ID", 3083, (String)null).getInt();
		hardSaplingID = config.getBlock("hardSapling ID", 3084, (String)null).getInt();
		redwoodSaplingID = config.getBlock("redwoodSapling ID", 3085, (String)null).getInt();
		rubberSaplingID = config.getBlock("rubberSapling ID", 3086, (String)null).getInt();
		smokinSaplingID = config.getBlock("smokinSapling ID", 3087, (String)null).getInt();
		softSaplingID = config.getBlock("softSapling ID", 3088, (String)null).getInt();
		stoneSaplingID = config.getBlock("stoneSapling ID", 3089, (String)null).getInt();
		sunflowerSaplingID = config.getBlock("sunflowerSapling ID", 3090, (String)null).getInt();
		walnutSaplingID = config.getBlock("walnutSapling ID", 3091, (String)null).getInt();
		waterSaplingID = config.getBlock("waterSapling ID", 3092, (String)null).getInt();
		wolfSaplingID = config.getBlock("wolfSapling ID", 3093, (String)null).getInt();
		ghostSaplingID = config.getBlock("ghostSapling ID", 3094, (String)null).getInt();
		iceSaplingID = config.getBlock("iceSapling ID", 3095, (String)null).getInt();
		skySaplingID = config.getBlock("skySapling ID", 3096, (String)null).getInt();
		smiteSaplingID = config.getBlock("smiteSapling ID", 3097, (String)null).getInt();
		painSaplingID = config.getBlock("painSapling ID", 3098, (String)null).getInt();
		lifeSaplingID = config.getBlock("lifeSapling ID", 3099, (String)null).getInt();
		giantSaplingID = config.getBlock("giantSapling ID", 3100, (String)null).getInt();
		netherSaplingID = config.getBlock("netherSapling ID", 3101, (String)null).getInt();
		neverSaplingID = config.getBlock("neverSapling ID", 3102, (String)null).getInt();
		explosiveSaplingID = config.getBlock("explosiveSapling ID", 3103, (String)null).getInt();
		
		potatoSaplingID = config.getBlock("potatoSapling ID", 3104, (String)null).getInt();
		carrotSaplingID = config.getBlock("carrotSapling ID", 3105, (String)null).getInt();
		cantaloupeSaplingID = config.getBlock("cantaloupeSapling ID", 3106, (String)null).getInt();
		squashSaplingID = config.getBlock("squashSapling ID", 3107, (String)null).getInt();
		cucumberSaplingID = config.getBlock("cucumberSapling ID", 3108, (String)null).getInt();
		japanesecherryBlossomSaplingID = config.getBlock("japanesecherryBlossomSapling ID", 3109, (String)null).getInt();
		japaneseMapleSaplingID = config.getBlock("japaneseMapleSapling ID", 3110, (String)null).getInt();
		japaneseApricotSaplingID = config.getBlock("japaneseApricotSapling ID", 3111, (String)null).getInt();
		treehouseSaplingID = config.getBlock("treehouseSapling ID", 3112, (String)null).getInt();
		
		//Planks
		blackPlanksID = config.getBlock("blackPlanks ID", 3118, (String)null).getInt();
		hardPlanksID = config.getBlock("hardPlanks ID", 3119, (String)null).getInt();
		redwoodPlanksID = config.getBlock("redwoodPlanks ID", 3120, (String)null).getInt();
		softPlanksID = config.getBlock("softPlanks ID", 3121, (String)null).getInt();
		stonePlanksID = config.getBlock("stonePlanks ID", 3122, (String)null).getInt();
		sunflowerPlanksID = config.getBlock("sunflowerPlanks ID", 3123, (String)null).getInt();
		walnutPlanksID = config.getBlock("walnutPlanks ID", 3124, (String)null).getInt();
		wolfPlanksID = config.getBlock("wolfPlanks ID", 3125, (String)null).getInt();
	
		//Slabs
		blackWoodDoubleSlabID = config.getBlock("blackWoodDoubleSlab ID", 3140, (String)null).getInt();
		blackWoodSingleSlabID = config.getBlock("blackWoodSingleSlab ID", 3141, (String)null).getInt();
		hardWoodDoubleSlabID = config.getBlock("hardWoodDoubleSlab ID", 3142, (String)null).getInt();
		hardWoodSingleSlabID = config.getBlock("hardWoodSingleSlab ID", 3143, (String)null).getInt();
		redwoodDoubleSlabID = config.getBlock("redwoodDoubleSlab ID", 3144, (String)null).getInt();
		redwoodSingleSlabID = config.getBlock("redwoodSingleSlab ID", 3145, (String)null).getInt();
		softWoodDoubleSlabID = config.getBlock("softWoodDoubleSlab ID", 3146, (String)null).getInt();
		softWoodSingleSlabID = config.getBlock("softWoodSingleSlab ID", 3147, (String)null).getInt();
		stoneWoodDoubleSlabID = config.getBlock("stoneWoodDoubleSlab ID", 3148, (String)null).getInt();
		stoneWoodSingleSlabID = config.getBlock("stoneWoodSingleSlab ID", 3149, (String)null).getInt();
		sunflowerDoubleSlabID = config.getBlock("sunflowerDoubleSlab ID", 3150, (String)null).getInt();
		sunflowerSingleSlabID = config.getBlock("sunflowerSingleSlab ID", 3151, (String)null).getInt();
		walnutWoodDoubleSlabID = config.getBlock("walnutWoodDoubleSlab ID", 3152, (String)null).getInt();
		walnutWoodSingleSlabID = config.getBlock("walnutWoodSingleSlab ID", 3153, (String)null).getInt();
		wolfWoodDoubleSlabID = config.getBlock("wolfWoodDoubleSlab ID", 3154, (String)null).getInt();
		wolfWoodSingleSlabID = config.getBlock("wolfWoodSingleSlab ID", 3155, (String)null).getInt();
	
		//Ladder
		redwoodLadderID = config.getBlock("redwoodLadder ID", 3170, (String)null).getInt();
		stoneWoodLadderID = config.getBlock("stoneWoodLadder ID", 3171, (String)null).getInt();
		walnutLadderID = config.getBlock("walnutLadder ID", 3172, (String)null).getInt();

		//Torch
		hardTorchID = config.getBlock("hardTorch ID", 3173, (String)null).getInt();
		redwoodTorchID = config.getBlock("redwoodTorch ID", 3174, (String)null).getInt();
		stoneTorchID = config.getBlock("stoneTorch ID", 3175, (String)null).getInt();
		walnutTorchID = config.getBlock("walnutTorch ID", 3176, (String)null).getInt();
		
		//Stairs
		blackWoodStairsID = config.getBlock("blackWoodStairs ID", 3190, (String)null).getInt();
		hardWoodStairsID = config.getBlock("hardWoodStairs ID", 3191, (String)null).getInt();
		redWoodStairsID = config.getBlock("redWoodStairs ID", 3192, (String)null).getInt();
		softWoodStairsID = config.getBlock("softWoodStairs ID", 3193, (String)null).getInt();
		stoneWoodStairsID = config.getBlock("stoneWoodStairs ID", 3194, (String)null).getInt();
		sunflowerWoodStairsID = config.getBlock("sunflowerWoodStairs ID", 3195, (String)null).getInt();
		walnutWoodStairsID = config.getBlock("walnutWoodStairs ID", 3196, (String)null).getInt();
		wolfWoodStairsID = config.getBlock("wolfWoodStairs ID", 3197, (String)null).getInt();
		
		//Flowers
		lillyID = config.getBlock("lilly ID", 3215, (String)null).getInt();
		tulipID = config.getBlock("tulip ID", 3216, (String)null).getInt();
		wildFlowerID = config.getBlock("wildFlower ID", 3217, (String)null).getInt();
		dandelionID = config.getBlock("dandelion ID", 3218, (String)null).getInt();
		daisyID = config.getBlock("daisy ID", 3219, (String)null).getInt();
		irisID = config.getBlock("iris ID", 3220, (String)null).getInt();
		redCloverID = config.getBlock("redClover ID", 3221, (String)null).getInt();
		pansyID = config.getBlock("pansy ID", 3222, (String)null).getInt();
		marshMarigoldID = config.getBlock("marshMarigold ID", 3223, (String)null).getInt();
		wildOnionID = config.getBlock("wildOnion ID", 3224, (String)null).getInt();
		wildGrassID = config.getBlock("wildGrass ID", 3225, (String)null).getInt();
		thornGrassID = config.getBlock("thornGrass ID", 3226, (String)null).getInt();
		glowingVineID = config.getBlock("glowingVine ID", 3250, (String)null).getInt();
		danglingFlowerID = config.getBlock("danglingFlower ID", 3251, (String)null).getInt();
		flameCactusID = config.getBlock("flameCactus ID", 3252, (String)null).getInt();
		bushID = config.getBlock("bush ID", 3253, (String)null).getInt();
	    poisonbushID = config.getBlock("poisonbush ID", 3254, (String)null).getInt();
	    winterbushID = config.getBlock("winterbush ID", 3255, (String)null).getInt();
	    spikebushID = config.getBlock("spikebush ID", 3256, (String)null).getInt();
	    eleGrassID = config.getBlock("eleGrass ID", 3257, (String)null).getInt();
	    eleGrassTopID = config.getBlock("eleGrassTop ID", 3258, (String)null).getInt();
	    
		happyCactusID = config.getBlock("happyCactus ID", 3300, (String)null).getInt();
		hostaID = config.getBlock("hosta ID", 3301, (String)null).getInt();
		twilightRoseID = config.getBlock("twilightRose ID", 3302, (String)null).getInt();
		redCactusID = config.getBlock("redCactus ID", 3303, (String)null).getInt();
		whiteCactusID = config.getBlock("whiteCactus ID", 3304, (String)null).getInt();
		waterPlantID = config.getBlock("waterPlant ID", 3305, (String)null).getInt();
		arrowCactusID = config.getBlock("arrowCactus ID", 3306, (String)null).getInt();
		snowCactusID = config.getBlock("snowCactus ID", 3307, (String)null).getInt();
		blueBelleID = config.getBlock("blueBelle ID", 3308, (String)null).getInt();
		swellID = config.getBlock("swell ID", 3309, (String)null).getInt();
		lovePlantID = config.getBlock("lovePlant ID", 3310, (String)null).getInt();
		
		//Ingots
		blackIngotID = config.getItem("blackIngot ID", 10000, (String)null).getInt();
		amethystIngotID = config.getItem("amethystIngot ID", 10001, (String)null).getInt();
		sapphireIngotID = config.getItem("sapphireIngot ID", 10002, (String)null).getInt();
		marbleIngotID = config.getItem("marbleIngot ID", 10003, (String)null).getInt();
		opalIngotID = config.getItem("opalIngot ID", 10004, (String)null).getInt();
		turquoiseIngotID = config.getItem("turquoiseIngot ID", 10005, (String)null).getInt();
		graniteIngotID = config.getItem("graniteIngot ID", 10006, (String)null).getInt();
	
		pewterIngotID = config.getItem("pewterIngot ID", 10007, (String)null).getInt();
		moonstoneGemStoneID = config.getItem("moonstoneGemStone ID", 10008, (String)null).getInt();
		garnetGemStoneID = config.getItem("garnetGemStone ID", 10009, (String)null).getInt();
	    topazGemStoneID = config.getItem("topazGemStone ID", 10010, (String)null).getInt();
	    onyxGemStoneID = config.getItem("onyxGemStone ID", 10011, (String)null).getInt();
	    bloodstoneIngotID = config.getItem("bloodstoneIngot ID", 10012, (String)null).getInt();
	    peanutwoodChunkID = config.getItem("peanutwoodChunk ID", 10013, (String)null).getInt();
	    jadeGemStoneID = config.getItem("jadeGemStone ID", 10014, (String)null).getInt();
	    hematiteGemStoneID = config.getItem("hematiteGemStone ID", 10015, (String)null).getInt();
	    
		//Items
		avocadoID = config.getItem("avocado ID", 10021, (String)null).getInt();
		coalDustID = config.getItem("coalDust ID", 10022, (String)null).getInt();
		diamondDustID = config.getItem("diamondDust ID", 10023, (String)null).getInt();
		sunflowerSeedsID = config.getItem("sunflowerSeeds ID", 10024, (String)null).getInt();
		tntStickID = config.getItem("tntStick ID", 10025, (String)null).getInt();
		walnutID = config.getItem("walnut ID", 10026, (String)null).getInt();
		eggPaperID = config.getItem("eggPaper ID", 10027, (String)null).getInt();
		rubberID = config.getItem("rubber ID", 10028, (String)null).getInt();
		smokinDustID = config.getItem("smokinDust ID", 10029, (String)null).getInt();
		skyBoatID = config.getItem("skyBoat ID", 10030, (String)null).getInt();
		lavaBoatID = config.getItem("lavaBoat ID", 10031, (String)null).getInt();
		snowSledID = config.getItem("snowSled ID", 10032, (String)null).getInt();
		iceBoatID = config.getItem("iceBoat ID", 10033, (String)null).getInt();
		blackBookID = config.getItem("blackBook ID", 10034, (String)null).getInt();
		
		catseyeID = config.getItem("catseye ID", 10035, (String)null).getInt();
		pearlID = config.getItem("pearl ID", 10036, (String)null).getInt();
		
		//Tools
		blackAxeID = config.getItem("blackAxe ID", 10050, (String)null).getInt();
		blackHoeID = config.getItem("blackHoe ID", 10051, (String)null).getInt();
		blackPickAxeID = config.getItem("blackPickAxe ID", 10052, (String)null).getInt();
		blackSpadeID = config.getItem("blackSpade ID", 10053, (String)null).getInt();
		blackSwordID = config.getItem("blackSword ID", 10054, (String)null).getInt();
		marbleAxeID = config.getItem("marbleAxe ID", 10055, (String)null).getInt();
		marbleHoeID = config.getItem("marbleHoe ID", 10056, (String)null).getInt();
		marblePickAxeID = config.getItem("marblePickAxe ID", 10057, (String)null).getInt();
		marbleSpadeID = config.getItem("marbleSpade ID", 10058, (String)null).getInt();
		marbleSwordID = config.getItem("marbleSword ID", 10059, (String)null).getInt();
		graniteSwordID = config.getItem("graniteSword ID", 10060, (String)null).getInt();
		blackWoodSwordID = config.getItem("blackWoodSword ID", 10061, (String)null).getInt();
		hardWoodSwordID = config.getItem("hardWoodSword ID", 10062, (String)null).getInt();
		redWoodSwordID = config.getItem("redWoodSword ID", 10063, (String)null).getInt();
		stoneWoodSwordID = config.getItem("stoneWoodSword ID", 10064, (String)null).getInt();
	
		//Armor
		marbleHelmetID = config.getItem("marbleHelmet ID", 10100, (String)null).getInt();
		marblePlateID = config.getItem("marblePlate ID", 10101, (String)null).getInt();
		marbleLegsID = config.getItem("marbleLegs ID", 10102, (String)null).getInt();
		marbleBootsID = config.getItem("marbleBoots ID", 10103, (String)null).getInt();
		amethystHelmetID = config.getItem("amethystHelmet ID", 10104, (String)null).getInt();
		amethystPlateID = config.getItem("amethystPlate ID", 10105, (String)null).getInt();
		amethystLegsID = config.getItem("amethystLegs ID", 10106, (String)null).getInt();
		amethystBootsID = config.getItem("amethystBoots ID", 10107, (String)null).getInt();
		sapphireHelmetID = config.getItem("sapphireHelmet ID", 10108, (String)null).getInt();
		sapphirePlateID = config.getItem("sapphirePlate ID", 10109, (String)null).getInt();
		sapphireLegsID = config.getItem("sapphireLegs ID", 10110, (String)null).getInt();
		sapphireBootsID = config.getItem("sapphireBoots ID", 10111, (String)null).getInt();
		graniteHelmetID = config.getItem("graniteHelmet ID", 10112, (String)null).getInt();
		granitePlateID = config.getItem("granitePlate ID", 10113, (String)null).getInt();
		graniteLegsID = config.getItem("graniteLegs ID", 10114, (String)null).getInt();
		graniteBootsID = config.getItem("graniteBoots ID", 10115, (String)null).getInt();
		hardwoodHelmetID = config.getItem("hardwoodHelmet ID", 10116, (String)null).getInt();
		hardwoodPlateID = config.getItem("hardwoodPlate ID", 10117, (String)null).getInt();
		hardwoodLegsID = config.getItem("hardwoodLegs ID", 10118, (String)null).getInt();
		hardwoodBootsID = config.getItem("hardwoodBoots ID", 10119, (String)null).getInt();
		stonewoodHelmetID = config.getItem("stonewoodHelmet ID", 10120, (String)null).getInt();
		stonewoodPlateID = config.getItem("stonewoodPlate ID", 10121, (String)null).getInt();
		stonewoodLegsID = config.getItem("stonewoodLegs ID", 10122, (String)null).getInt();
		stonewoodBootsID = config.getItem("stonewoodBoots ID", 10123, (String)null).getInt();
	
		//Sticks
		blackStickID = config.getItem("blackStick ID", 10170, (String)null).getInt();
		hardStickID = config.getItem("hardStick ID", 10171, (String)null).getInt();
		redwoodStickID = config.getItem("redwoodStick ID", 10172, (String)null).getInt();
		softStickID = config.getItem("softStick ID", 10173, (String)null).getInt();
		stoneStickID = config.getItem("stoneStick ID", 10174, (String)null).getInt();
		sunflowerStickID = config.getItem("sunflowerStick ID", 10175, (String)null).getInt();
		walnutStickID = config.getItem("walnutStick ID", 10178, (String)null).getInt();
		wolfStickID = config.getItem("wolfStick ID", 10179, (String)null).getInt();
	
		//Black Torch
		blackTorchID = config.getItem("blackTorch ID", 10200, (String)null).getInt();
		
		//Wands
		godsHandID = config.getItem("godsHand ID", 10201, (String)null).getInt();
		poFireID = config.getItem("poFire ID", 10202, (String)null).getInt();
		windsID = config.getItem("winds ID", 10203, (String)null).getInt();

		//MiscItems
		chickenDropID = config.getItem("chickenDrop ID", 10210, (String)null).getInt();
		workHammerID = config.getItem("workHammer ID", 10211, (String)null).getInt();
		bigFeatherID = config.getItem("bigFeather ID", 10212, (String)null).getInt();
		walnutBowID = config.getItem("walnutBow ID", 10213, (String)null).getInt();
		stoneBowID = config.getItem("stoneBow ID", 10214, (String)null).getInt();
		blackBowID = config.getItem("blackBow ID", 10215, (String)null).getInt();
		purpleBowID = config.getItem("purpleBow ID", 10216, (String)null).getInt();
		purpleArrowID = config.getItem("purpleArrow ID", 10217, (String)null).getInt();
		stealthArrowID = config.getItem("stealthArrow ID", 10218, (String)null).getInt();
		explosiveArrowID = config.getItem("explosiveArrow ID", 10219, (String)null).getInt();
		iceArrowID = config.getItem("iceArrow ID", 10220, (String)null).getInt();
		lightningArrowID = config.getItem("lightningArrow ID", 10221, (String)null).getInt();
		lambfriescookedID = config.getItem("lambfriescooked ID", 10222, (String)null).getInt();
		lambfriesrawID = config.getItem("lambfriesraw ID", 10223, (String)null).getInt();
		cowsTailID = config.getItem("cowsTail ID", 10224, (String)null).getInt();
		coolBowID = config.getItem("coolBow ID", 10225, (String)null).getInt();
		
		//Biomes
		blackMountainsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		eggHillsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		hardMountainsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		rainForrestID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		redwoodForrestID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		alphaHillsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		stoneMountainsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		whitePlainsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		wolfID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		petrifiedHillsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		zeroValleyID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		hurtfulHillsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		afterLifeDesertID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		cliffsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		legendaryForestID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		fruitValleyID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		coldValleyID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
	
		witheringHeightsID = config.get("Biome IDs", "witheringHeights ID", 23).getInt();
		skysPeakID = config.get("Biome IDs", "skysPeak ID", 23).getInt();
		unnaturalPlainsID = config.get("unnaturalPlains IDs", "Alps ID", 23).getInt();
		thickForestID = config.get("thickForest IDs", "Alps ID", 23).getInt();
		theOrientID = config.get("Biome IDs", "theOrient ID", 23).getInt();
		
		config.save();
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		//scP = new BlockSCP(4000, 0).setStepSound(Block.soundStoneFootstep).setHardness(-1.0F).setLightValue(0.75F).setBlockName("Portal Block");
		
		//Furnaces
		extruderIdle = new BlockExtruder(extruderIdleID, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("extruder").setRequiresSelfNotify().setCreativeTab(Trees.tabTreeThings);
		extruderActive = new BlockExtruder(extruderActiveID, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("extruder").setRequiresSelfNotify();
		
		//Bench
		smithsBench = new BlockSmithsBench(smithsBenchID, 1).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setBlockName("Smiths Bench");
		
		//SpiritTable
		spiritTable = new BlockSpiritTable(spiritTableID, 2).setHardness(5.0F).setResistance(2000.0F).setBlockName("spiritTable");

		//TreeTrunk
		treeTrunk = new BlockTreeTrunk(treeTrunkID, 3).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setBlockName("treetrunk").setRequiresSelfNotify();

		//Forge
		forge = new BlockForge(forgeID, 4).setHardness(5.0F).setStepSound(Block.soundAnvilFootstep).setResistance(2000.0F).setBlockName("forge").setRequiresSelfNotify();

		//IceMachine
		iceMachine = new BlockIceMachine(iceMachineID, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("iceMachine").setRequiresSelfNotify().setCreativeTab(Trees.tabTreeThings);
		iceMachineActive = new BlockIceMachine(iceMachineActiveID, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("iceMachine").setRequiresSelfNotify();
		
		//GemMachine
		gemMachine = new BlockGemMachine(gemMachineID, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("gemMachine").setRequiresSelfNotify().setCreativeTab(Trees.tabTreeThings);
		gemMachineActive = new BlockGemMachine(gemMachineActiveID, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setBlockName("gemMachine").setRequiresSelfNotify();
	
		//Logs
		blackLog = new BlockBlackLog(blackLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Black Log").setRequiresSelfNotify();
		eggLog = new BlockEggLog(eggLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Egg Log").setRequiresSelfNotify();
		hardLog = new BlockHardLog(hardLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Hard Log").setRequiresSelfNotify();
		redwoodLog = new BlockRedwoodLog(redwoodLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Redwood Log").setRequiresSelfNotify();
		rubberLog = new BlockRubberLog(rubberLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Rubber Log").setRequiresSelfNotify();
		smokinLog = new BlockSmokinLog(smokinLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Smokin Log").setRequiresSelfNotify();
		softLog = new BlockSoftLog(softLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Soft Log").setRequiresSelfNotify();
		stoneLog = new BlockStoneLog(stoneLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Stone Log").setRequiresSelfNotify();
		sunflowerLog = new BlockSunflowerLog(sunflowerLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Sunflower Log").setRequiresSelfNotify();
		walnutLog = new BlockWalnutLog(walnutLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Walnut Log").setRequiresSelfNotify();
		waterLog = new BlockWaterLog(waterLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Water Log").setRequiresSelfNotify();
		wolfLog = new BlockWolfLog(wolfLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Wolf Log").setRequiresSelfNotify();
		ghostLog = new BlockGhostLog(ghostLogID).setStepSound(Block.soundWoodFootstep).setHardness(50F).setResistance(2000F).setBlockName("Ghost Log").setRequiresSelfNotify();
		iceLog = new BlockIceLog(iceLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Ice Log").setRequiresSelfNotify();
		skyLog = new BlockSkyLog(skyLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Sky Log").setRequiresSelfNotify();
		smiteLog = new BlockSmiteLog(smiteLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Smite Log").setRequiresSelfNotify();
		painLog = new BlockPainLog(painLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Pain Log").setRequiresSelfNotify();
		lifeLog = new BlockLifeLog(lifeLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Life Log").setRequiresSelfNotify();
		giantLog = new BlockGiantLog(giantLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Giant Log").setRequiresSelfNotify();		
		netherLog = new BlockNetherLog(netherLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Nether Log").setRequiresSelfNotify();
		neverLog = new BlockNeverLog(neverLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Never Log").setRequiresSelfNotify();
		explosiveLog = new BlockExplosiveLog(explosiveLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("Explosive Log").setRequiresSelfNotify();
		
		potatoLog = new BlockPotatoLog(potatoLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Black Log").setRequiresSelfNotify();
		carrotLog = new BlockCarrotLog(carrotLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Egg Log").setRequiresSelfNotify();
		cantaloupeLog = new BlockCantaloupeLog(cantaloupeLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Hard Log").setRequiresSelfNotify();
		squashLog = new BlockSquashLog(squashLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Redwood Log").setRequiresSelfNotify();
		cucumberLog = new BlockCucumberLog(cucumberLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Rubber Log").setRequiresSelfNotify();
		japanesecherryBlossomLog = new BlockJapaneseCherryBlossomLog(japanesecherryBlossomLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Smokin Log").setRequiresSelfNotify();
		japaneseMapleLog = new BlockJapaneseMapleLog(japaneseMapleLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Soft Log").setRequiresSelfNotify();
		japaneseApricotLog = new BlockJapaneseApricotLog(japaneseApricotLogID).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1F).setBlockName("Stone Log").setRequiresSelfNotify();
		
		//Leaves
		blackLeaves = new BlockBlackLeaves(blackLeavesID, 7).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Black Leaves").setRequiresSelfNotify();
		eggLeaves = new BlockEggLeaves(eggLeavesID, 6).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Egg Leaves").setRequiresSelfNotify();
		hardLeaves = new BlockHardLeaves(hardLeavesID, 9).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Hard Leaves").setRequiresSelfNotify();
		redwoodLeaves = new BlockRedwoodLeaves(redwoodLeavesID, 11).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Redwood Leaves").setRequiresSelfNotify();
		rubberLeaves = new BlockRubberLeaves(rubberLeavesID, 5).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Rubber Leaves").setRequiresSelfNotify();
		smokinLeaves = new BlockSmokinLeaves(smokinLeavesID, 1).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Smokin Leaves").setRequiresSelfNotify();
		softLeaves = new BlockSoftLeaves(softLeavesID, 8).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Soft Leaves").setRequiresSelfNotify();
		stoneLeaves = new BlockStoneLeaves(stoneLeavesID, 10).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Stone Leaves").setRequiresSelfNotify();
		sunflowerLeaves = new BlockSunflowerLeaves(sunflowerLeavesID, 2).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setLightValue(1F).setBlockName("Sunflower Leaves").setRequiresSelfNotify();
		walnutLeaves = new BlockWalnutLeaves(walnutLeavesID, 4).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Walnut Leaves").setRequiresSelfNotify();	
		waterLeaves = new BlockWaterLeaves(waterLeavesID, 0).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Water Leaves").setRequiresSelfNotify();
		wolfLeaves = new BlockWolfLeaves(wolfLeavesID, 3).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Wolf Leaves").setRequiresSelfNotify();
		ghostLeaves = new BlockGhostLeaves(ghostLeavesID, 12).setStepSound(Block.soundGrassFootstep).setHardness(50F).setResistance(2000F).setBlockName("Ghost Leaves").setRequiresSelfNotify();
		iceLeaves = new BlockIceLeaves(iceLeavesID, 13).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Ice Leaves").setRequiresSelfNotify();
		skyLeaves = new BlockSkyLeaves(skyLeavesID, 14).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Sky Leaves").setRequiresSelfNotify();
		smiteLeaves = new BlockSmiteLeaves(smiteLeavesID, 15).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Smite Leaves").setRequiresSelfNotify();
		painLeaves = new BlockPainLeaves(painLeavesID, 64).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Pain Leaves").setRequiresSelfNotify();
		lifeLeaves = new BlockLifeLeaves(lifeLeavesID, 65).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Life Leaves").setRequiresSelfNotify();
		giantLeaves = new BlockGiantLeaves(giantLeavesID, 66).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Giant Leaves").setRequiresSelfNotify();		
		netherLeaves = new BlockNetherLeaves(netherLeavesID, 67).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setLightValue(1).setBlockName("Nether Leaves").setRequiresSelfNotify();	
		neverLeaves = new BlockNeverLeaves(neverLeavesID, 68).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setLightValue(1).setBlockName("Never Leaves").setRequiresSelfNotify();	
		explosiveLeaves = new BlockExplosiveLeaves(explosiveLeavesID, 69).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Explosive Leaves").setRequiresSelfNotify();
		
		potatoLeaves = new BlockPotatoLeaves(potatoLeavesID, 74).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Black Leaves").setRequiresSelfNotify();
		carrotLeaves = new BlockCarroLeaves(carrotLeavesID, 70).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Egg Leaves").setRequiresSelfNotify();
		cantaloupeLeaves = new BlockCantaloupeLeaves(cantaloupeLeavesID, 72).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Hard Leaves").setRequiresSelfNotify();
		squashLeaves = new BlockSquashLeaves(squashLeavesID, 71).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Redwood Leaves").setRequiresSelfNotify();
		cucumberLeaves = new BlockCucumberLeaves(cucumberLeavesID, 73).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Rubber Leaves").setRequiresSelfNotify();
		japanesecherryBlossomLeaves = new BlockJapaneseCherryBlossomLeaves(japanesecherryBlossomLeavesID, 112).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Smokin Leaves").setRequiresSelfNotify();
		japaneseMapleLeaves = new BlockJapaneseMapleLeaves(japaneseMapleLeavesID, 80).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Soft Leaves").setRequiresSelfNotify();
		japaneseApricotLeaves = new BlockJapaneseApricotLeaves(japaneseApricotLeavesID, 192).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Stone Leaves").setRequiresSelfNotify();
		
		//Saplings
		blackSapling = new BlockBlackSapling(blackSaplingID, 23).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Black Sapling").setRequiresSelfNotify();
		eggSapling = new BlockEggSapling(eggSaplingID, 22).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Egg Sapling").setRequiresSelfNotify();
		hardSapling = new BlockHardSapling(hardSaplingID, 25).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Hard Sapling").setRequiresSelfNotify();
		redwoodSapling = new BlockRedwoodSapling(redwoodSaplingID, 27).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Redwood Sapling").setRequiresSelfNotify();
		rubberSapling = new BlockRubberSapling(rubberSaplingID, 21).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Rubber Sapling").setRequiresSelfNotify();
		smokinSapling = new BlockSmokinSapling(smokinSaplingID, 17).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Smokin Sapling").setRequiresSelfNotify();
		softSapling = new BlockSoftSapling(softSaplingID, 24).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Soft Sapling").setRequiresSelfNotify();
		stoneSapling = new BlockStoneSapling(stoneSaplingID, 26).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Stone Sapling").setRequiresSelfNotify();
		sunflowerSapling = new BlockSunflowerSapling(sunflowerSaplingID, 18).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Sunflower Sapling").setRequiresSelfNotify();
		walnutSapling = new BlockWalnutSapling(walnutSaplingID, 20).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Walnut Sapling").setRequiresSelfNotify();
		waterSapling = new BlockWaterSapling(waterSaplingID, 16).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Water Sapling").setRequiresSelfNotify();
		wolfSapling = new BlockWolfSapling(wolfSaplingID, 19).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("Wolf Sapling").setRequiresSelfNotify();
		ghostSapling = new BlockGhostSapling(ghostSaplingID, 28).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Ghost Sapling").setRequiresSelfNotify();
		iceSapling = new BlockIceSapling(iceSaplingID, 29).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Ice Sapling").setRequiresSelfNotify();
		skySapling = new BlockSkySapling(skySaplingID, 30).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Sky Sapling").setRequiresSelfNotify();
		smiteSapling = new BlockSmiteSapling(smiteSaplingID, 31).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Smite Sapling").setRequiresSelfNotify();
		painSapling = new BlockPainSapling(painSaplingID, 80).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Pain Sapling").setRequiresSelfNotify();
		lifeSapling = new BlockLifeSapling(lifeSaplingID, 81).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Life Sapling").setRequiresSelfNotify();
		giantSapling = new BlockGiantSapling(giantSaplingID, 82).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Giant Sapling").setRequiresSelfNotify();		
		netherSapling = new BlockNetherSapling(netherSaplingID, 83).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Nether Sapling").setRequiresSelfNotify();
		neverSapling = new BlockNeverSapling(neverSaplingID, 84).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Never Sapling").setRequiresSelfNotify();
		explosiveSapling = new BlockExplosiveSapling(explosiveSaplingID, 85).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1.0F).setBlockName("Explosive Sapling").setRequiresSelfNotify();
		
		potatoSapling = new BlockPotatoSapling(potatoSaplingID, 90).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("potatoSapling").setRequiresSelfNotify();
		carrotSapling = new BlockCarrotSapling(carrotSaplingID, 86).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("carrotSapling").setRequiresSelfNotify();
		cantaloupeSapling = new BlockCantaloupeSapling(cantaloupeSaplingID, 88).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("cantaloupeSapling").setRequiresSelfNotify();
		squashSapling = new BlockSquashSapling(squashSaplingID, 87).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("squashSapling").setRequiresSelfNotify();
		cucumberSapling = new BlockCucumberSapling(cucumberSaplingID, 89).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("cucumberSapling").setRequiresSelfNotify();
		japanesecherryBlossomSapling = new BlockjapanesecherryBlossomSapling(japanesecherryBlossomSaplingID, 49).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("japanesecherryBlossomSapling").setRequiresSelfNotify();
		japaneseMapleSapling = new BlockjapaneseMapleSapling(japaneseMapleSaplingID, 66).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("japaneseMapleSapling").setRequiresSelfNotify();
		japaneseApricotSapling = new BlockjapaneseApricotSapling(japaneseApricotSaplingID, 224).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("japaneseApricotSapling").setRequiresSelfNotify();
		treehouseSapling = new BlockTreeHouseSapling(treehouseSaplingID, 240).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setBlockName("treehouseSapling").setRequiresSelfNotify();
		
		//Blocks
		slate = new BlockSlate(slateID, 0).setBlockName("Slate");
		alphaGrass = new BlockAlphaGrass(alphaGrassID, 1).setBlockName("AlphaGrass");
		naucylium = new BlockNaucylium(naucyliumID, 25).setBlockName("naucylium");
		blackOre = new BlockBlackOre(blackOreID, 3).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("BlackOre");
		amethystOre = new BlockAmethystOre(amethystOreID, 4).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Amethyst");
		sapphireOre = new BlockSapphireOre(sapphireOreID, 5).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Sapphire");
		marble = new BlockMarble(marbleID, 6).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Marble");
		opalOre = new BlockOpalOre(opalOreID, 7).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("OpalOre");
		turquoiseOre = new BlockTurquoiseOre(turquoiseOreID, 8).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Turquoise");
		graniteOre = new BlockGraniteOre(graniteOreID, 9).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Granite");
		
		pewterOre = new BlockPewterOre(pewterOreID, 37).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("BlackOre");
		moonstoneOre = new BlockMoonstoneOre(moonstoneOreID, 38).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Amethyst");
		garnetOre = new BlockGarnetOre(garnetOreID, 39).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Sapphire");
		topazOre = new BlocktTopazOre(topazOreID, 40).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Marble");
		onyxOre = new BlockOnyxOre(onyxOreID, 41).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("OpalOre");
		bloodstoneOre = new BlockBloodstoneOre(bloodstoneOreID, 42).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Turquoise");
		peanutwoodOre = new BlockPeanutwoodOre(peanutwoodOreID, 43).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Granite");
		jadeOre = new BlockJadeOre(jadeOreID, 44).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Turquoise");
		hematiteOre = new BlockHematiteOre(hematiteOreID, 45).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setBlockName("Granite");
		
		blackPlanks = new BlockBlackPlanks(blackPlanksID, 10).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("BlackPlanks").setRequiresSelfNotify();
		hardPlanks = new BlockHardPlanks(hardPlanksID, 11).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("HardPlanks").setRequiresSelfNotify();
		redwoodPlanks = new BlockRedwoodPlanks(redwoodPlanksID, 12).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("RedwoodPlanks").setRequiresSelfNotify();
		softPlanks = new BlockSoftPlanks(softPlanksID, 13).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("SoftPlanks").setRequiresSelfNotify();
		stonePlanks = new BlockStonePlanks(stonePlanksID, 14).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("StonePlanks").setRequiresSelfNotify();
		sunflowerPlanks = new BlockSunPlanks(sunflowerPlanksID, 15).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("SunPlanks").setRequiresSelfNotify();
		walnutPlanks = new BlockWalnutPlanks(walnutPlanksID, 16).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("WalnutPlanks").setRequiresSelfNotify();
		wolfPlanks = new BlockWolfPlanks(wolfPlanksID, 17).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("WolfPlanks").setRequiresSelfNotify();
		quickSand = new BlockQuickSand(quickSandID, 22).setHardness(0.9F).setResistance(1.0F).setStepSound(Block.soundSandFootstep).setBlockName("quicksand");
		rubberBlock = new BlockRubberBlock(rubberBlockID, 18).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1F).setBlockName("rubberBlock");
		blackTnT = new BlockBlackTnT(blackTnTID, 19).setStepSound(Block.soundPowderFootstep).setHardness(3F).setResistance(1F).setBlockName("blackTnT");
		firePad = new BlockFirePad(firePadID, 23).setBlockName("firePad").setHardness(1.0F).setResistance(0.5F);
		blackIce = new BlockBalckIce(blackIceID, 26).setBlockName("blackIce").setHardness(1.0F).setResistance(0.5F);
		tender = new BlockTender(tenderID, 27).setBlockName("tender").setHardness(1.0F).setResistance(0.5F);
		blackBlock = new BlockBlackBlock(blackBlockID, 35).setBlockName("blackBlock").setHardness(1.0F).setResistance(0.5F);
		marbleBlock = new BlockMarbleBlock(marbleBlockID, 36).setBlockName("marbleBlock").setHardness(1.0F).setResistance(0.5F);
		
		//Flowers
		lilly = (CTFlower) new BlockLily(lillyID, 0).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("Lily").setCreativeTab(Trees.tabTreeDeco);
		tulip = (CTFlower) new BlockTulip(tulipID, 1).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("tulip").setCreativeTab(Trees.tabTreeDeco);
		wildFlower = (CTFlower) new BlockWildFlower(wildFlowerID, 2).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("wildFlower").setCreativeTab(Trees.tabTreeDeco);
		dandelion = (CTFlower) new BlockDandelion(dandelionID, 3).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("dandelion").setCreativeTab(Trees.tabTreeDeco);
		daisy = (CTFlower) new BlockDaisy(daisyID, 4).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("daisy").setCreativeTab(Trees.tabTreeDeco);
		iris = (CTFlower) new BlockIris(irisID, 12).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("iris").setCreativeTab(Trees.tabTreeDeco);
		redClover = (CTFlower) new BlockRedClover(redCloverID, 6).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("redClover").setCreativeTab(Trees.tabTreeDeco);
		pansy = (CTFlower) new BlockPansy(pansyID, 7).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("pansy").setCreativeTab(Trees.tabTreeDeco);
		marshMarigold = (CTFlower) new BlockMarshMarigold(marshMarigoldID, 8).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("marshMarigold").setCreativeTab(Trees.tabTreeDeco);
		wildOnion = (CTFlower) new BlockWildOnion(wildOnionID, 9).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("wildOnion").setCreativeTab(Trees.tabTreeDeco);
		wildGrass = (CTFlower) new BlockWildGrass(wildGrassID, 10).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("wildGrass").setCreativeTab(Trees.tabTreeDeco);
		thornGrass = (CTFlower) new BlockThornGrass(thornGrassID, 11).setHardness(1.5F).setStepSound(Block.soundGrassFootstep).setBlockName("thornGrass").setCreativeTab(Trees.tabTreeDeco);
		glowingVine = new BlockGlowingVine(glowingVineID, 6).setHardness(0.3F).setStepSound(Block.soundGrassFootstep).setLightValue(0.7375F).setBlockName("glowVine");
		danglingFlower = new BlockDanglingFlower(danglingFlowerID, 5).setHardness(0.3F).setStepSound(Block.soundGrassFootstep).setLightValue(0.7375F).setBlockName("Hanging2");
		flameCactus = new BlockFlameCactus(flameCactusID, 0).setLightValue(0.3F).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("Flametongue");
		bush = (CTFlower) new BlockBush(bushID, 4).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("bush1");
        poisonbush = new BlockPoisonbush(poisonbushID, 3).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("poisonbush");
        winterbush = new BlockWinterbush(winterbushID, 1).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("winterbush");
        spikebush = new BlockSpikebush(spikebushID, 2).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("spikebush");
        eleGrass = new BlockEleGrass(eleGrassID, 16).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("highgrass");
        eleGrassTop = new BlockEleGrassTop(eleGrassTopID, 17).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("highgrasstop");
        
		happyCactus = (CTFlower) new BlockHappyCactus(happyCactusID, 10).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("happyCactus").setCreativeTab(Trees.tabTreeDeco);
		hosta = (CTFlower) new BlockHosta(hostaID, 15).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("hosta").setCreativeTab(Trees.tabTreeDeco);
		twilightRose = (CTFlower) new BlockTwilightRose(twilightRoseID, 14).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("twilightRose").setCreativeTab(Trees.tabTreeDeco);
		redCactus = (CTFlower) new BlockRedCactus(redCactusID, 8).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("redCactus").setCreativeTab(Trees.tabTreeDeco);
		whiteCactus = (CTFlower) new BlockWhiteCactus(whiteCactusID, 9).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("whiteCactus").setCreativeTab(Trees.tabTreeDeco);
		waterPlant = (CTFlower) new BlockWaterPlant(waterPlantID, 9).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("waterPlant").setCreativeTab(Trees.tabTreeDeco);
		arrowCactus = (CTFlower) new BlockArrowCactus(arrowCactusID, 11).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("arrowCactus").setCreativeTab(Trees.tabTreeDeco);
		snowCactus = (CTFlower) new BlockSnowCactus(snowCactusID, 7).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("snowCactus").setCreativeTab(Trees.tabTreeDeco);
		blueBelle = (CTFlower) new BlockBlueBelle(blueBelleID, 48).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("blueBelle").setCreativeTab(Trees.tabTreeDeco);
		swell = (CTFlower) new BlockSwell(swellID, 13).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("swell").setCreativeTab(Trees.tabTreeDeco);
		lovePlant = (CTFlower) new BlockLovePlant(lovePlantID, 19).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setBlockName("lovePlant").setCreativeTab(Trees.tabTreeDeco);
		
		//Torch
		hardTorch = new BlockHardTorch(hardTorchID, 28).setHardness(0.0F).setLightValue(0.70125F).setStepSound(Block.soundWoodFootstep).setBlockName("hardTorch").setRequiresSelfNotify();
		redwoodTorch = new BlockRedwoodTorch(redwoodTorchID, 29).setHardness(0.0F).setLightValue(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("redwoodTorch").setRequiresSelfNotify();
		stoneTorch = new BlockStoneTorch(stoneTorchID, 30).setHardness(0.0F).setLightValue(0.6015F).setStepSound(Block.soundWoodFootstep).setBlockName("stoneTorch").setRequiresSelfNotify();
		walnutTorch = new BlockWalnutTorch(walnutTorchID, 31).setHardness(0.0F).setLightValue(0.8765F).setStepSound(Block.soundWoodFootstep).setBlockName("walnutTorch").setRequiresSelfNotify();

		//Ladder
		redwoodLadder = (BlockLadder) new BlockRedwoodLadder(redwoodLadderID, 32).setHardness(0.4F).setStepSound(Block.soundLadderFootstep).setBlockName("redwoodladder").setRequiresSelfNotify();
		stoneWoodLadder = (BlockLadder) new BlockStoneWoodLadder(stoneWoodLadderID, 33).setHardness(0.4F).setStepSound(Block.soundLadderFootstep).setBlockName("stonewoodladder").setRequiresSelfNotify();
		walnutLadder = (BlockLadder) new BlockWalnutLadder(walnutLadderID, 34).setHardness(0.4F).setStepSound(Block.soundLadderFootstep).setBlockName("walnutladder").setRequiresSelfNotify();

		//Stairs
		blackWoodStairs = new BlockBlackWoodStairs(blackWoodStairsID, blackPlanks, 10).setBlockName("blackWoodStairs").setRequiresSelfNotify();
		hardWoodStairs = new BlockHardWoodStairs(hardWoodStairsID, hardPlanks, 11).setBlockName("hardWoodStairs").setRequiresSelfNotify();
		redWoodStairs = new BlockRedWoodStairs(redWoodStairsID, redwoodPlanks, 12).setBlockName("redWoodStairs").setRequiresSelfNotify();
		softWoodStairs = new BlockSoftWoodStairs(softWoodStairsID, softPlanks, 13).setBlockName("softWoodStairs").setRequiresSelfNotify();
		stoneWoodStairs = new BlockStoneWoodStairs(stoneWoodStairsID, stonePlanks, 14).setBlockName("stoneWoodStairs").setRequiresSelfNotify();
		sunflowerWoodStairs = new BlockSunflowerWoodStairs(sunflowerWoodStairsID, sunflowerPlanks, 15).setBlockName("sunflowerWoodStairs").setRequiresSelfNotify();
		walnutWoodStairs = new BlockWalnutWoodStairs(walnutWoodStairsID, walnutPlanks, 16).setBlockName("walnutWoodStairs").setRequiresSelfNotify();
		wolfWoodStairs = new BlockWolfWoodStairs(wolfWoodStairsID, wolfPlanks, 17).setBlockName("wolfWoodStairs").setRequiresSelfNotify();

		//Slabs
		blackWoodDoubleSlab = (TreesSlabs)(new BlockBlackWoodSlab(blackWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("blackWoodSlab");
        blackWoodSingleSlab = (TreesSlabs)(new BlockBlackWoodSlab(blackWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("blackWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		hardWoodDoubleSlab = (TreesSlabs)(new BlockHardWoodSlab(hardWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("HardWoodSlab");
		hardWoodSingleSlab = (TreesSlabs)(new BlockHardWoodSlab(hardWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("HardWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		redwoodDoubleSlab = (TreesSlabs)(new BlockRedWoodSlab(redwoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("RedWoodSlab");
		redwoodSingleSlab = (TreesSlabs)(new BlockRedWoodSlab(redwoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("RedWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		softWoodDoubleSlab = (TreesSlabs)(new BlockSoftWoodSlab(softWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("SoftWoodSlab");
		softWoodSingleSlab = (TreesSlabs)(new BlockSoftWoodSlab(softWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("SoftWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		stoneWoodDoubleSlab = (TreesSlabs)(new BlockStoneWoodSlab(stoneWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("StoneWoodSlab");
		stoneWoodSingleSlab = (TreesSlabs)(new BlockStoneWoodSlab(stoneWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("StoneWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		sunflowerDoubleSlab = (TreesSlabs)(new BlockSunflowerWoodSlab(sunflowerDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("SunflowerWoodSlab");
		sunflowerSingleSlab = (TreesSlabs)(new BlockSunflowerWoodSlab(sunflowerSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("sunflowerWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		walnutWoodDoubleSlab = (TreesSlabs)(new BlockWalnutWoodSlab(walnutWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("walnutWoodSlab");
		walnutWoodSingleSlab = (TreesSlabs)(new BlockWalnutWoodSlab(walnutWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("walnutWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		wolfWoodDoubleSlab = (TreesSlabs)(new BlockWolfWoodSlab(wolfWoodDoubleSlabID, true)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("wolfWoodSlab");
		wolfWoodSingleSlab = (TreesSlabs)(new BlockWolfWoodSlab(wolfWoodSingleSlabID, false)).setHardness(1.6F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setBlockName("wolfWoodSlab").setCreativeTab(Trees.tabTreeBlocks);
		
		//Items
		avocado = new ItemAvocado(avocadoID, 2, 1F, false).setIconIndex(3).setItemName("Avocado");
		coalDust = new ItemCoalDust(coalDustID).setIconIndex(1).setItemName("Coal Dust");
		diamondDust = new ItemDiamondDust(diamondDustID).setIconIndex(2).setItemName("Diamond Dust");
		sunflowerSeeds = new ItemsunflowerSeeds(sunflowerSeedsID, 1, 1F, false).setIconIndex(4).setItemName("Sunflower Seeds");
		tntStick = new ItemTnTStick(tntStickID).setIconIndex(0).setItemName("TnT Stick");
		walnut = new ItemWalnut(walnutID, 1, 1F, false).setIconIndex(5).setItemName("Walnut");
		eggPaper = new ItemEggPaper(eggPaperID).setIconIndex(6).setItemName("EggPaper");
		rubber = new ItemRubber(rubberID).setIconIndex(7).setItemName("Rubber");
		smokinDust = new ItemSmokinDust(smokinDustID).setIconIndex(8).setItemName("SmokinDust");
		skyBoat = new ItemSkyBoat(skyBoatID).setIconIndex(11).setItemName("Sky Boat");
		lavaBoat = new ItemLavaBoat(lavaBoatID).setIconIndex(10).setItemName("Lava Boat");
		snowSled = new ItemSnowSled(snowSledID).setIconIndex(12).setItemName("Snow Sled");
		iceBoat = new ItemIceBoat(iceBoatID).setIconIndex(13).setItemName("Ice Boat");
		blackBook = new ItemBlackBook(blackBookID).setIconIndex(9).setItemName("Black Book");
		
		catseye = new ItemCatsEye(catseyeID).setIconIndex(145).setItemName("CatsEye");
		pearl = new ItemPearl(pearlID).setIconIndex(79).setItemName("Pearl");
		
		//Sticks
		blackStick = new ItemBlackStick(blackStickID).setIconIndex(32).setItemName("BlackStick");
		hardStick = new ItemHardStick(hardStickID).setIconIndex(33).setItemName("HardStick");
		redwoodStick = new ItemRedwoodStick(redwoodStickID).setIconIndex(34).setItemName("RedwoodStick");
		softStick = new ItemSoftStick(softStickID).setIconIndex(35).setItemName("SoftStick");
		stoneStick = new ItemStoneStick(stoneStickID).setIconIndex(36).setItemName("StoneStick");
		sunflowerStick = new ItemSunStick(sunflowerStickID).setIconIndex(37).setItemName("SunStick");
		walnutStick = new ItemWalnutStick(walnutStickID).setIconIndex(38).setItemName("WalnutStick");
		wolfStick = new ItemWolfStick(wolfStickID).setIconIndex(39).setItemName("WolfStick");
		
		//Ingots
		blackIngot = new ItemBlockIngot(blackIngotID).setIconIndex(64).setItemName("BlockIngot");
		amethystIngot = new ItemAmethystIngot(amethystIngotID).setIconIndex(65).setItemName("AmethystIngot");
		sapphireIngot = new ItemSapphireIngot(sapphireIngotID).setIconIndex(66).setItemName("SapphireIngot");
		marbleIngot = new ItemMarbleIngot(marbleIngotID).setIconIndex(67).setItemName("MarbleIngot");
		opalIngot = new ItemOpalIngot(opalIngotID).setIconIndex(68).setItemName("OpalIngot");
		turquoiseIngot = new ItemTurquoiseIngot(turquoiseIngotID).setIconIndex(69).setItemName("TurquoiseIngot");
		graniteIngot = new ItemGraniteIngot(graniteIngotID).setIconIndex(70).setItemName("GraniteIngot");
		
		pewterIngot = new ItemPewterIngot(pewterIngotID).setIconIndex(71).setItemName("PewterIngot");
		moonstoneGemStone = new ItemMoonstoneGemStone(moonstoneGemStoneID).setIconIndex(72).setItemName("MoonstoneGemStone");
		garnetGemStone = new ItemGarnetGemStone(garnetGemStoneID).setIconIndex(73).setItemName("GarnetGemStone");
	    topazGemStone = new ItemTopazGemStone(topazGemStoneID).setIconIndex(74).setItemName("TopazGemStone");
	    onyxGemStone = new ItemOnyxGemStone(onyxGemStoneID).setIconIndex(75).setItemName("OnyxGemStone");
	    bloodstoneIngot = new ItemBloodstoneIngot(bloodstoneIngotID).setIconIndex(76).setItemName("BloodstoneIngot");
	    peanutwoodChunk = new ItemPeanutWoodChunk(peanutwoodChunkID).setIconIndex(77).setItemName("PeanutWoodChunk");
	    jadeGemStone = new ItemJadeGemStone(jadeGemStoneID).setIconIndex(78).setItemName("JadeGemStone");
	    hematiteGemStone = new ItemHematiteGemStone(hematiteGemStoneID).setIconIndex(160).setItemName("HematiteGemStone");
	    
		//Tools
		blackAxe = new ItemCTAxe(blackAxeID, tBlack).setIconIndex(96).setItemName("BlackAxe").setCreativeTab(Trees.tabTreeTools);
		blackHoe = new ItemCTHoe(blackHoeID, tBlack).setIconIndex(97).setItemName("BlackHoe").setCreativeTab(Trees.tabTreeTools);
		blackPickAxe = new ItemCTPickaxe(blackPickAxeID, tBlack).setIconIndex(98).setItemName("BlackPickAxe").setCreativeTab(Trees.tabTreeTools);
		blackSpade = new ItemCTSpade(blackSpadeID, tBlack).setIconIndex(99).setItemName("BlackSpade").setCreativeTab(Trees.tabTreeTools);
		blackSword = new ItemCTSword(blackSwordID, tBlack).setIconIndex(100).setItemName("BlackSword").setCreativeTab(Trees.tabTreeCombat);
		marbleAxe = new ItemCTAxe(marbleAxeID, tMarble).setIconIndex(112).setItemName("MarbleAxe").setCreativeTab(Trees.tabTreeTools);
		marbleHoe = new ItemCTHoe(marbleHoeID, tMarble).setIconIndex(113).setItemName("MarbleHoe").setCreativeTab(Trees.tabTreeTools);
		marblePickAxe = new ItemCTPickaxe(marblePickAxeID, tMarble).setIconIndex(114).setItemName("MarblePickAxe").setCreativeTab(Trees.tabTreeTools);
		marbleSpade = new ItemCTSpade(marbleSpadeID, tMarble).setIconIndex(115).setItemName("MarbleSpade").setCreativeTab(Trees.tabTreeTools);
		marbleSword = new ItemCTSword(marbleSwordID, tMarble).setIconIndex(116).setItemName("MarbleSword").setCreativeTab(Trees.tabTreeCombat);
		graniteSword = new ItemCTSword(graniteSwordID, tGranite).setIconIndex(128).setItemName("GraniteSword").setCreativeTab(Trees.tabTreeCombat);
		blackWoodSword = new ItemCTSword(blackWoodSwordID, tBlackWood).setIconIndex(129).setItemName("BlackWoodSword").setCreativeTab(Trees.tabTreeCombat);
		hardWoodSword = new ItemCTSword(hardWoodSwordID, tHardWood).setIconIndex(130).setItemName("HardWoodSword").setCreativeTab(Trees.tabTreeCombat);
		redWoodSword = new ItemCTSword(redWoodSwordID, tRedWood).setIconIndex(131).setItemName("RedWoodSword").setCreativeTab(Trees.tabTreeCombat);
		stoneWoodSword = new ItemCTSword(stoneWoodSwordID, tStoneWood).setIconIndex(132).setItemName("StoneWoodSword").setCreativeTab(Trees.tabTreeCombat);
		
		//Armor
		marbleHelmet = new ItemMarbleHelmet(marbleHelmetID, aMarble, 3, 0).setIconIndex(192).setItemName("Marble Helmet");
		marblePlate = new ItemMarblePlate(marblePlateID, aMarble, 3, 1).setIconIndex(208).setItemName("Marble Plate");
		marbleLegs = new ItemMarbleLegs(marbleLegsID, aMarble, 3, 2).setIconIndex(224).setItemName("Marble Legs");
		marbleBoots = new ItemMarbleBoots(marbleBootsID, aMarble, 3, 3).setIconIndex(240).setItemName("Marble Boots");
		amethystHelmet = new ItemAmethystHelmet(amethystHelmetID, aAmethyst, 3, 0).setIconIndex(193).setItemName("Amethyst Helmet");
		amethystPlate = new ItemAmethystPlate(amethystPlateID, aAmethyst, 3, 1).setIconIndex(209).setItemName("Amethyst Plate");
		amethystLegs = new ItemAmethystLegs(amethystLegsID, aAmethyst, 3, 2).setIconIndex(225).setItemName("Amethyst Legs");
		amethystBoots = new ItemAmethystBoots(amethystBootsID, aAmethyst, 3, 3).setIconIndex(241).setItemName("Amethyst Boots");
		sapphireHelmet = new ItemSapphireHelmet(sapphireHelmetID, aSapphire, 3, 0).setIconIndex(194).setItemName("Sapphire Helmet");
		sapphirePlate = new ItemSapphirePlate(sapphirePlateID, aSapphire, 3, 1).setIconIndex(210).setItemName("Sapphire Plate");
		sapphireLegs = new ItemSapphireLegs(sapphireLegsID, aSapphire, 3, 2).setIconIndex(226).setItemName("Sapphire Legs");
		sapphireBoots = new ItemSapphireBoots(sapphireBootsID, aSapphire, 3, 3).setIconIndex(242).setItemName("Sapphire Boots");
		graniteHelmet = new ItemGraniteHelmet(graniteHelmetID, aGranite, 3, 0).setIconIndex(195).setItemName("Granite Helmet");
		granitePlate = new ItemGranitePlate(granitePlateID, aGranite, 3, 1).setIconIndex(211).setItemName("Granite Plate");
		graniteLegs = new ItemGraniteLegs(graniteLegsID, aGranite, 3, 2).setIconIndex(227).setItemName("Granite Legs");
		graniteBoots = new ItemGraniteBoots(graniteBootsID, aGranite, 3, 3).setIconIndex(243).setItemName("Granite Boots");
		hardwoodHelmet = new ItemHardwoodHelmet(hardwoodHelmetID, aHardWood, 3, 0).setIconIndex(196).setItemName("Hardwood Helmet");
		hardwoodPlate = new ItemHardwoodPlate(hardwoodPlateID, aHardWood, 3, 1).setIconIndex(212).setItemName("Hardwood Plate");
		hardwoodLegs = new ItemHardwoodLegs(hardwoodLegsID, aHardWood, 3, 2).setIconIndex(228).setItemName("Hardwood Legs");
		hardwoodBoots = new ItemHardwoodBoots(hardwoodBootsID, aHardWood, 3, 3).setIconIndex(244).setItemName("Hardwood Boots");
		stonewoodHelmet = new ItemStonewoodHelmet(stonewoodHelmetID, aStoneWood, 3, 0).setIconIndex(197).setItemName("Stonewood Helmet");
		stonewoodPlate = new ItemStonewoodPlate(stonewoodPlateID, aStoneWood, 3, 1).setIconIndex(213).setItemName("Stonewood Plate");
		stonewoodLegs = new ItemStonewoodLegs(stonewoodLegsID, aStoneWood, 3, 2).setIconIndex(229).setItemName("Stonewood Legs");
		stonewoodBoots = new ItemStonewoodBoots(stonewoodBootsID, aStoneWood, 3, 3).setIconIndex(245).setItemName("Stonewood Boots");
		
		//BlackTorch
		blackTorch = new ItemBlackTorch(blackTorchID).setIconIndex(48).setItemName("Black Torch");
		
		//Wands
		godsHand = new ItemGodsHand(godsHandID).setIconIndex(18).setItemName("Gods Hand");
		poFire = new ItemPOFire(poFireID).setIconIndex(21).setItemName("Power of Fire");
		winds = new ItemWinds(windsID).setIconIndex(24).setItemName("Winds");	

		//MiscItems
		bigFeather = new ItemBigFeather(bigFeatherID).setIconIndex(49).setItemName("Big Feather");
		workHammer = new ItemWorkHammer(workHammerID).setIconIndex(50).setItemName("Work Hammer");
		chickenDrop = new ItemChickenDrop(chickenDropID).setIconIndex(51).setItemName("Chicken Drop");
		coolBow = new ItemCoolBow(coolBowID).setIconIndex(89).setItemName("Cool Bow");
		walnutBow = new ItemWalnutBow(walnutBowID).setIconIndex(83).setItemName("Walnut Bow");
		stoneBow = new ItemStoneBow(stoneBowID).setIconIndex(82).setItemName("Stone Bow");
		blackBow = new ItemBlackBow(blackBowID).setIconIndex(81).setItemName("Black Bow");
		purpleBow = new ItemPurpleBow(purpleBowID).setIconIndex(80).setItemName("Purple Bow");
		purpleArrow = new ItemPurpleArrow(purpleArrowID).setIconIndex(84).setItemName("purple arrow");
		stealthArrow = new ItemStealthArrow(stealthArrowID).setIconIndex(88).setItemName("glass arrow");
		explosiveArrow = new ItemExplosiveArrow(explosiveArrowID).setIconIndex(86).setItemName("explosive arrow");
		iceArrow = new ItemIceArrow(iceArrowID).setIconIndex(87).setItemName("ice arrow");
		lightningArrow = new ItemLightningArrow(lightningArrowID).setIconIndex(85).setItemName("lightning arrow");
		lambfriescooked = new ItemLambFriesCooked(lambfriescookedID, 2, 1F, false).setIconIndex(53).setItemName("Lamb Fries Cooked");
		lambfriesraw = new ItemLambFriesRaw(lambfriesrawID, 2, 1F, false).setIconIndex(54).setItemName("Lamb Fries Raw");
		cowsTail = new ItemCowsTail(cowsTailID).setIconIndex(52).setItemName("Cows Tail");
		
		//Biomes
		blackMountains = new BiomeBlackMountains(33);
		eggHills = new BiomeEggHills(32);
		hardMountains = new BiomeHardMountains(35);
		rainForrest = new BiomeRainForrest(31);
		redwoodForrest = new BiomeRedwoodForrest(38);
		stoneMountains = new BiomeStoneMountains(36);
		alphaHills = new BiomeAlphaHills(37);
		whitePlains = new BiomeWhitePlains(34);
		wolf = new BiomeWolf(30);
		petrifiedHills = new BiomePetrifiedHills(39);
		zeroValley = new BiomeZeroValley(40);
		hurtfulHills = new BiomeHurtfulHills(41);
		afterLifeDesert = new BiomeAfterLifeDesert(42);
		cliffs = new BiomeCliffs(43);
		legendaryForest = new BiomeLegendaryForest(44);
		fruitValley = new BiomeFruitValley(45);
		coldValley = new BiomeColdValley(46);
		
		witheringHeights = new BiomeWitheringHeights(47);
		skysPeak = new BiomeSkysPeak(48);
		unnaturalPlains = new BiomeUnNaturalPlains(49);
		thickForest = new BiomeThickForest(50);
		theOrient = new BiomeTheOrient(51);
		
		//scp
		//GameRegistry.registerBlock(scP, "SCP");
		//LanguageRegistry.addName(scP, "SCP");
		
		//RegFurnace
		GameRegistry.registerBlock(extruderIdle, "ExtruderIdle");
		GameRegistry.registerBlock(extruderActive, "ExtruderActive");
		LanguageRegistry.addName(extruderIdle, "Extruder");
		
		//RegSmiths
		GameRegistry.registerBlock(smithsBench, "SmithsBench");
		LanguageRegistry.addName(smithsBench, "Smiths Bench");
		
		//SpiritTable
		GameRegistry.registerBlock(spiritTable, "Spirit Table");
		LanguageRegistry.addName(spiritTable, "Spirit Table");

		//TreeTrunk
		GameRegistry.registerBlock(treeTrunk, "Tree Trunk");
		LanguageRegistry.addName(treeTrunk, "Tree Trunk");

		//Forge
		GameRegistry.registerBlock(forge, "Forge");
		LanguageRegistry.addName(forge, "Forge");

		//IceMachine
		GameRegistry.registerBlock(iceMachine, "Ice Machine");
		GameRegistry.registerBlock(iceMachineActive, "Ice Machine Active");
		LanguageRegistry.addName(iceMachine, "Ice Machine");
		
		//GemMachine
		GameRegistry.registerBlock(gemMachine, "Gem Machine");
		GameRegistry.registerBlock(gemMachineActive, "Gem Machine Active");
		LanguageRegistry.addName(gemMachine, "Gem Machine");
		
		//RegBlocks
		GameRegistry.registerBlock(blackLog, "Black Log");
		GameRegistry.registerBlock(blackLeaves, "Black Leaves");
		GameRegistry.registerBlock(blackSapling, "Black Sapling");
		GameRegistry.registerBlock(eggLog, "Egg Log");
		GameRegistry.registerBlock(eggLeaves, "Egg Leaves");
		GameRegistry.registerBlock(eggSapling, "Egg Sapling");
		GameRegistry.registerBlock(hardLog, "Hard Log");
		GameRegistry.registerBlock(hardLeaves, "Hard Leaves");
		GameRegistry.registerBlock(hardSapling, "Hard Sapling");
		GameRegistry.registerBlock(redwoodLog, "Redwood Log");
		GameRegistry.registerBlock(redwoodLeaves, "Redwood Leaves");
		GameRegistry.registerBlock(redwoodSapling, "Redwood Sapling");
		GameRegistry.registerBlock(rubberLog, "Rubber Log");
		GameRegistry.registerBlock(rubberLeaves, "Rubber Leaves");
		GameRegistry.registerBlock(rubberSapling, "Rubber Sapling");
		GameRegistry.registerBlock(smokinLeaves, "Smokin Leaves");
		GameRegistry.registerBlock(smokinLog, "Smokin Log");
		GameRegistry.registerBlock(smokinSapling, "Smokin Sapling");
		GameRegistry.registerBlock(softLog, "Soft Log");
		GameRegistry.registerBlock(softLeaves, "Soft Leaves");
		GameRegistry.registerBlock(softSapling, "Soft Sapling");
		GameRegistry.registerBlock(stoneLog, "Stone Log");
		GameRegistry.registerBlock(stoneLeaves, "Stone Leaves");
		GameRegistry.registerBlock(stoneSapling, "Stone Sapling");
		GameRegistry.registerBlock(sunflowerLeaves, "Sunflower Leaves");
		GameRegistry.registerBlock(sunflowerLog, "Sunflower Log");
		GameRegistry.registerBlock(sunflowerSapling, "Sunflower Sapling");
		GameRegistry.registerBlock(walnutLog, "Walnut Log");
		GameRegistry.registerBlock(walnutLeaves, "Walnut Leaves");
		GameRegistry.registerBlock(walnutSapling, "Walnut Sapling");
		GameRegistry.registerBlock(waterLeaves, "Water Leaves");
		GameRegistry.registerBlock(waterLog, "Water Log");
		GameRegistry.registerBlock(waterSapling, "Water Sapling");
		GameRegistry.registerBlock(wolfLeaves, "Wolf Leaves");
		GameRegistry.registerBlock(wolfLog, "Wolf Log");
		GameRegistry.registerBlock(wolfSapling, "Wolf Sapling");
		GameRegistry.registerBlock(slate, "Slate");
		GameRegistry.registerBlock(alphaGrass, "alphaGrass");
		GameRegistry.registerBlock(blackOre, "blackOre");
		GameRegistry.registerBlock(amethystOre, "amethystOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(marble, "marble");
		GameRegistry.registerBlock(opalOre, "opalOre");
		GameRegistry.registerBlock(turquoiseOre, "turquoiseOre");
		GameRegistry.registerBlock(graniteOre, "graniteOre");
		GameRegistry.registerBlock(blackPlanks, "blackPlanks");
		GameRegistry.registerBlock(hardPlanks, "hardPlanks");
		GameRegistry.registerBlock(redwoodPlanks, "redwoodPlanks");
		GameRegistry.registerBlock(softPlanks, "softPlanks");
		GameRegistry.registerBlock(stonePlanks, "stonePlanks");
		GameRegistry.registerBlock(sunflowerPlanks, "sunflowerPlanks");
		GameRegistry.registerBlock(walnutPlanks, "walnutPlanks");
		GameRegistry.registerBlock(wolfPlanks, "wolfPlanks");
		GameRegistry.registerBlock(ghostLog, "ghostLog");
		GameRegistry.registerBlock(iceLog, "iceLog");
		GameRegistry.registerBlock(skyLog, "skyLog");
		GameRegistry.registerBlock(ghostLeaves, "ghostLeaves");
		GameRegistry.registerBlock(iceLeaves, "iceLeaves");
		GameRegistry.registerBlock(skyLeaves, "skyLeaves");
		GameRegistry.registerBlock(ghostSapling, "ghostSapling");
		GameRegistry.registerBlock(iceSapling, "iceSapling");
		GameRegistry.registerBlock(skySapling, "skySapling");
		GameRegistry.registerBlock(quickSand, "quickSand");
		GameRegistry.registerBlock(rubberBlock, "rubberBlock");
		GameRegistry.registerBlock(blackTnT, "blackTnT");
		GameRegistry.registerBlock(smiteLog,"smiteLog");
		GameRegistry.registerBlock(painLog,"painLog");
		GameRegistry.registerBlock(lifeLog,"lifeLog");
		GameRegistry.registerBlock(giantLog,"giantLog");
		GameRegistry.registerBlock(netherLog,"netherLog");
		GameRegistry.registerBlock(neverLog,"neverLog");
		GameRegistry.registerBlock(explosiveLog,"explosiveLog");
		GameRegistry.registerBlock(smiteLeaves,"smiteLeaves");
		GameRegistry.registerBlock(painLeaves,"painLeaves");
		GameRegistry.registerBlock(lifeLeaves,"lifeLeaves");
		GameRegistry.registerBlock(giantLeaves,"giantLeaves");
		GameRegistry.registerBlock(netherLeaves,"netherLeaves");
		GameRegistry.registerBlock(neverLeaves,"neverLeaves");
		GameRegistry.registerBlock(explosiveLeaves,"explosiveLeaves");
		GameRegistry.registerBlock(smiteSapling,"smiteSapling");
		GameRegistry.registerBlock(painSapling,"painSapling");
		GameRegistry.registerBlock(lifeSapling,"lifeSapling");
		GameRegistry.registerBlock(giantSapling,"giantSapling");
		GameRegistry.registerBlock(netherSapling,"netherSapling");
		GameRegistry.registerBlock(neverSapling,"neverSapling");
		GameRegistry.registerBlock(explosiveSapling,"explosiveSapling");
		GameRegistry.registerBlock(firePad,"firePad");
		GameRegistry.registerBlock(naucylium,"naucylium");
		GameRegistry.registerBlock(blackIce,"blackIce");
		GameRegistry.registerBlock(tender,"tender");
		GameRegistry.registerBlock(hardTorch,"hardTorch");
		GameRegistry.registerBlock(redwoodTorch,"redwoodTorch");
		GameRegistry.registerBlock(stoneTorch,"stoneTorch");
		GameRegistry.registerBlock(walnutTorch,"walnutTorch");
		GameRegistry.registerBlock(redwoodLadder,"redwoodLadder");
		GameRegistry.registerBlock(stoneWoodLadder,"stoneWoodLadder");
		GameRegistry.registerBlock(walnutLadder,"walnutLadder");
		GameRegistry.registerBlock(blackWoodStairs,"blackWoodStairs");
		GameRegistry.registerBlock(hardWoodStairs,"hardWoodStairs");
		GameRegistry.registerBlock(redWoodStairs,"redWoodStairs");
		GameRegistry.registerBlock(softWoodStairs,"softWoodStairs");
		GameRegistry.registerBlock(stoneWoodStairs,"stoneWoodStairs");
		GameRegistry.registerBlock(sunflowerWoodStairs,"sunflowerWoodStairs");
		GameRegistry.registerBlock(walnutWoodStairs,"walnutWoodStairs");
		GameRegistry.registerBlock(wolfWoodStairs,"wolfWoodStairs");
		GameRegistry.registerBlock(blackWoodDoubleSlab, "blackWoodDoubleSlab");
		GameRegistry.registerBlock(blackWoodSingleSlab,"blackWoodSingleSlab");
		GameRegistry.registerBlock(hardWoodDoubleSlab,"hardWoodDoubleSlab");
		GameRegistry.registerBlock(hardWoodSingleSlab,"hardWoodSingleSlab");
		GameRegistry.registerBlock(redwoodDoubleSlab,"redwoodDoubleSlab");
		GameRegistry.registerBlock(redwoodSingleSlab,"redwoodSingleSlab");
		GameRegistry.registerBlock(softWoodDoubleSlab,"softWoodDoubleSlab");
		GameRegistry.registerBlock(softWoodSingleSlab,"softWoodSingleSlab");
		GameRegistry.registerBlock(stoneWoodDoubleSlab,"stoneWoodDoubleSlab");
		GameRegistry.registerBlock(stoneWoodSingleSlab,"stoneWoodSingleSlab");
		GameRegistry.registerBlock(sunflowerDoubleSlab,"sunflowerDoubleSlab");
		GameRegistry.registerBlock(sunflowerSingleSlab,"sunflowerSingleSlab");
		GameRegistry.registerBlock(walnutWoodDoubleSlab,"walnutWoodDoubleSlab");
		GameRegistry.registerBlock(walnutWoodSingleSlab,"walnutWoodSingleSlab");
		GameRegistry.registerBlock(wolfWoodDoubleSlab,"wolfWoodDoubleSlab");
		GameRegistry.registerBlock(wolfWoodSingleSlab,"wolfWoodSingleSlab");
		GameRegistry.registerBlock(blackBlock,"blackBlock");
		GameRegistry.registerBlock(marbleBlock,"marbleBlock");
		GameRegistry.registerBlock(lilly, "lily");
		GameRegistry.registerBlock(tulip, "tulip");
		GameRegistry.registerBlock(wildFlower, "wildFlower");
		GameRegistry.registerBlock(dandelion, "dandelion");
		GameRegistry.registerBlock(daisy, "daisy");
		GameRegistry.registerBlock(iris, "iris");
		GameRegistry.registerBlock(redClover, "redClover");
		GameRegistry.registerBlock(pansy, "pansy");
		GameRegistry.registerBlock(marshMarigold, "marshMarigold");
		GameRegistry.registerBlock(wildOnion, "wildOnion");
		GameRegistry.registerBlock(wildGrass, "wildGrass");
		GameRegistry.registerBlock(thornGrass,"thornGrass");
		GameRegistry.registerBlock(glowingVine, "Glow-vine");
		GameRegistry.registerBlock(danglingFlower, "hangingFlower");
		GameRegistry.registerBlock(flameCactus, "Flametongue");
		GameRegistry.registerBlock(bush, "Bush");
        GameRegistry.registerBlock(poisonbush, "Poisonous bush");
        GameRegistry.registerBlock(winterbush, "Frozen sapling");
        GameRegistry.registerBlock(spikebush, "Spiky bush");
        GameRegistry.registerBlock(eleGrass, "eleGrass");
        GameRegistry.registerBlock(eleGrassTop, "eleGrassTop");
        
		GameRegistry.registerBlock(pewterOre, "pewterOre");
		GameRegistry.registerBlock(moonstoneOre, "moonstoneOre");
		GameRegistry.registerBlock(garnetOre, "garnetOre");
		GameRegistry.registerBlock(topazOre, "topazOre");
		GameRegistry.registerBlock(onyxOre, "onyxOre");
		GameRegistry.registerBlock(bloodstoneOre, "bloodstoneOre");
		GameRegistry.registerBlock(peanutwoodOre, "peanutwoodOre");
        GameRegistry.registerBlock(jadeOre, "jadeOre");
        GameRegistry.registerBlock(hematiteOre, "hematiteOre");
        GameRegistry.registerBlock(potatoLog, "potatoLog");
        GameRegistry.registerBlock(carrotLog, "carrotLog");
        GameRegistry.registerBlock(cantaloupeLog, "cantaloupeLog");
        GameRegistry.registerBlock(squashLog, "squashLog");
		GameRegistry.registerBlock(cucumberLog, "cucumberLog");
		GameRegistry.registerBlock(japanesecherryBlossomLog, "japanesecherryBlossomLog");
		GameRegistry.registerBlock(japaneseMapleLog, "japaneseMapleLog");
		GameRegistry.registerBlock(japaneseApricotLog, "japaneseApricotLog");
		GameRegistry.registerBlock(potatoLeaves, "potatoLeaves");
		GameRegistry.registerBlock(carrotLeaves, "carrotLeaves");
		GameRegistry.registerBlock(cantaloupeLeaves, "cantaloupeLeaves");
        GameRegistry.registerBlock(squashLeaves, "squashLeaves");
        GameRegistry.registerBlock(cucumberLeaves, "cucumberLeaves");
        GameRegistry.registerBlock(japanesecherryBlossomLeaves, "japanesecherryBlossomLeaves");
        GameRegistry.registerBlock(japaneseMapleLeaves, "japaneseMapleLeaves");
        GameRegistry.registerBlock(japaneseApricotLeaves, "japaneseApricotLeaves");
        GameRegistry.registerBlock(potatoSapling, "potatoSapling");
		GameRegistry.registerBlock(carrotSapling, "carrotSapling");
		GameRegistry.registerBlock(cantaloupeSapling, "cantaloupeSapling");
		GameRegistry.registerBlock(squashSapling, "squashSapling");
		GameRegistry.registerBlock(cucumberSapling, "cucumberSapling");
		GameRegistry.registerBlock(japanesecherryBlossomSapling, "japanesecherryBlossomSapling");
		GameRegistry.registerBlock(japaneseMapleSapling, "japaneseMapleSapling");
		GameRegistry.registerBlock(japaneseApricotSapling, "japaneseApricotSapling");
		GameRegistry.registerBlock(treehouseSapling, "treehouseSapling");
		GameRegistry.registerBlock(happyCactus, "happyCactus");
		GameRegistry.registerBlock(hosta, "hosta");
		GameRegistry.registerBlock(twilightRose, "twilightRose");
		GameRegistry.registerBlock(redCactus, "redCactus");
		GameRegistry.registerBlock(whiteCactus, "whiteCactus");
		GameRegistry.registerBlock(waterPlant, "waterPlant");
		GameRegistry.registerBlock(arrowCactus, "arrowCactus");
        GameRegistry.registerBlock(snowCactus, "snowCactus");
        GameRegistry.registerBlock(blueBelle, "blueBelle");
        GameRegistry.registerBlock(swell, "swell");
        GameRegistry.registerBlock(lovePlant, "lovePlant");
        
		//NameBlocks&Items
		LanguageRegistry.addName(blackLog, "Black Log");
		LanguageRegistry.addName(blackLeaves, "Black Leaves");
		LanguageRegistry.addName(blackSapling, "Black Sapling");
		LanguageRegistry.addName(eggLog, "Egg Log");
		LanguageRegistry.addName(eggLeaves, "Egg Leaves");
		LanguageRegistry.addName(eggSapling, "Egg Sapling");
		LanguageRegistry.addName(hardLog, "Hard Log");
		LanguageRegistry.addName(hardLeaves, "Hard Leaves");
		LanguageRegistry.addName(hardSapling, "Hard Sapling");
		LanguageRegistry.addName(redwoodLog, "Redwood Log");
		LanguageRegistry.addName(redwoodLeaves, "Redwood Leaves");
		LanguageRegistry.addName(redwoodSapling, "Redwood Sapling");
		LanguageRegistry.addName(rubberLog, "Rubber Log");
		LanguageRegistry.addName(rubberLeaves, "Rubber Leaves");
		LanguageRegistry.addName(rubberSapling, "Rubber Sapling");
		LanguageRegistry.addName(smokinLeaves, "Smokin Leaves");
		LanguageRegistry.addName(smokinLog, "Smokin Log");
		LanguageRegistry.addName(smokinSapling, "Smokin Sapling");
		LanguageRegistry.addName(softLog, "Soft Log");
		LanguageRegistry.addName(softLeaves, "Soft Leaves");
		LanguageRegistry.addName(softSapling, "Soft Sapling");
		LanguageRegistry.addName(stoneLog, "Stone Log");
		LanguageRegistry.addName(stoneLeaves, "Stone Leaves");
		LanguageRegistry.addName(stoneSapling, "Stone Sapling");
		LanguageRegistry.addName(sunflowerLeaves, "Sunflower Leaves");
		LanguageRegistry.addName(sunflowerLog, "Sunflower Log");
		LanguageRegistry.addName(sunflowerSapling, "Sunflower Sapling");
		LanguageRegistry.addName(walnutLog, "Walnut Log");
		LanguageRegistry.addName(walnutLeaves, "Walnut Leaves");
		LanguageRegistry.addName(walnutSapling, "Walnut Sapling");
		LanguageRegistry.addName(waterLeaves, "Water Leaves");
		LanguageRegistry.addName(waterLog, "Water Log");
		LanguageRegistry.addName(waterSapling, "Water Sapling");
		LanguageRegistry.addName(wolfLeaves, "Wolf Leaves");
		LanguageRegistry.addName(wolfLog, "Wolf Log");
		LanguageRegistry.addName(wolfSapling, "Wolf Sapling");
		LanguageRegistry.addName(slate, "Slate");
		LanguageRegistry.addName(alphaGrass, "Alpha Grass");
		LanguageRegistry.addName(blackOre, "Black Ore");
		LanguageRegistry.addName(amethystOre, "Amethyst Ore");
		LanguageRegistry.addName(sapphireOre, "Sapphire Ore");
		LanguageRegistry.addName(marble, "Marble");
		LanguageRegistry.addName(opalOre, "Opal Ore");
		LanguageRegistry.addName(turquoiseOre, "Turquoise Ore");
		LanguageRegistry.addName(graniteOre, "Granite Ore");
		LanguageRegistry.addName(blackPlanks, "Black Planks");
		LanguageRegistry.addName(hardPlanks, "Hard Planks");
		LanguageRegistry.addName(redwoodPlanks, "Redwood Planks");
		LanguageRegistry.addName(softPlanks, "Soft Planks");
		LanguageRegistry.addName(stonePlanks, "Stone Planks");
		LanguageRegistry.addName(sunflowerPlanks, "Sunflower Planks");
		LanguageRegistry.addName(walnutPlanks, "Walnut Planks");
		LanguageRegistry.addName(wolfPlanks, "Wolf Planks");
		LanguageRegistry.addName(avocado, "Avocado");
		LanguageRegistry.addName(coalDust, "Coal Dust");
		LanguageRegistry.addName(diamondDust, "Diamond Dust");
		LanguageRegistry.addName(sunflowerSeeds, "Sunflower Seeds");
		LanguageRegistry.addName(tntStick, "TnT Stick");
		LanguageRegistry.addName(walnut, "Walnut");
		LanguageRegistry.addName(eggPaper, "Egg Paper");
		LanguageRegistry.addName(rubber, "Rubber");
		LanguageRegistry.addName(smokinDust, "Smokin Dust");
		LanguageRegistry.addName(blackStick, "Black Stick");
		LanguageRegistry.addName(hardStick, "Hard Stick");
		LanguageRegistry.addName(redwoodStick, "Redwood Stick");
		LanguageRegistry.addName(softStick, "Soft Stick");
		LanguageRegistry.addName(stoneStick, "Stone Stick");
		LanguageRegistry.addName(sunflowerStick, "Sunflower Stick");
		LanguageRegistry.addName(walnutStick, "Walnut Stick");
		LanguageRegistry.addName(wolfStick, "Wolf Stick");
		LanguageRegistry.addName(blackIngot, "Black Ingot");
		LanguageRegistry.addName(amethystIngot, "Amethyst Ingot");
		LanguageRegistry.addName(sapphireIngot, "Sapphire Ingot");
		LanguageRegistry.addName(marbleIngot, "Marble Ingot");
		LanguageRegistry.addName(opalIngot, "Opal Ingot");
		LanguageRegistry.addName(turquoiseIngot, "Turquoise Ingot");
		LanguageRegistry.addName(graniteIngot, "Granite Ingot");
		LanguageRegistry.addName(blackAxe, "Black Axe");
		LanguageRegistry.addName(blackHoe, "Black Hoe");
		LanguageRegistry.addName(blackPickAxe, "black PickAxe");
		LanguageRegistry.addName(blackSpade, "Black Spade");
		LanguageRegistry.addName(blackSword, "Black Sword");
		LanguageRegistry.addName(marbleAxe, "Marble Axe");
		LanguageRegistry.addName(marbleHoe, "Marble Hoe");
		LanguageRegistry.addName(marblePickAxe, "Marble PickAxe");
		LanguageRegistry.addName(marbleSpade, "Marble Spade");
		LanguageRegistry.addName(marbleSword, "Marble Sword");
		LanguageRegistry.addName(graniteSword, "Granite Sword");
		LanguageRegistry.addName(blackWoodSword, "BlackWood Sword");
		LanguageRegistry.addName(hardWoodSword, "HardWood Sword");
		LanguageRegistry.addName(redWoodSword, "RedWood Sword");
		LanguageRegistry.addName(stoneWoodSword, "StoneWood Sword");
		LanguageRegistry.addName(blackTorch, "Black Torch");
		LanguageRegistry.addName(skyBoat, "Sky Boat");
		LanguageRegistry.addName(lavaBoat, "Lava Boat");
		LanguageRegistry.addName(snowSled, "Snow Sled");
		LanguageRegistry.addName(ghostLog, "Ghost Log");
		LanguageRegistry.addName(iceLog, "Ice Log");
		LanguageRegistry.addName(skyLog, "Sky Log");
		LanguageRegistry.addName(ghostLeaves, "Ghost Leaves");
		LanguageRegistry.addName(iceLeaves, "Ice Leaves");
		LanguageRegistry.addName(skyLeaves, "Sky Leaves");
		LanguageRegistry.addName(ghostSapling, "Ghost Sapling");
		LanguageRegistry.addName(iceSapling, "Ice Sapling");
		LanguageRegistry.addName(skySapling, "Sky Sapling");
		LanguageRegistry.addName(quickSand, "Quick Sand");
		LanguageRegistry.addName(rubberBlock, "Rubber Block");
		LanguageRegistry.addName(blackTnT, "Black TnT");
		LanguageRegistry.addName(smiteLog,"Smite Log");
		LanguageRegistry.addName(painLog,"Pain Log");
		LanguageRegistry.addName(lifeLog,"Life Log");
		LanguageRegistry.addName(giantLog,"Giant Log");
		LanguageRegistry.addName(netherLog,"Nether Log");
		LanguageRegistry.addName(neverLog,"Never Log");
		LanguageRegistry.addName(explosiveLog,"Explosive Log");
		LanguageRegistry.addName(smiteLeaves,"Smite Leaves");
		LanguageRegistry.addName(painLeaves,"Pain Leaves");
		LanguageRegistry.addName(lifeLeaves,"Life Leaves");
		LanguageRegistry.addName(giantLeaves,"Giant Leaves");
		LanguageRegistry.addName(netherLeaves,"Nether Leaves");
		LanguageRegistry.addName(neverLeaves,"Never Leaves");
		LanguageRegistry.addName(explosiveLeaves,"Explosive Leaves");
		LanguageRegistry.addName(smiteSapling,"Smite Sapling");
		LanguageRegistry.addName(painSapling,"Pain Sapling");
		LanguageRegistry.addName(lifeSapling,"Life Sapling");
		LanguageRegistry.addName(giantSapling,"Giant Sapling");
		LanguageRegistry.addName(netherSapling,"Nether Sapling");
		LanguageRegistry.addName(neverSapling,"Never Sapling");
		LanguageRegistry.addName(explosiveSapling,"Explosive Sapling");
		LanguageRegistry.addName(firePad,"Fire Pad");
		LanguageRegistry.addName(naucylium,"Naucylium");
		LanguageRegistry.addName(blackIce,"Black Ice");
		LanguageRegistry.addName(tender,"Tender");
		LanguageRegistry.addName(hardTorch,"Hard Torch");
		LanguageRegistry.addName(redwoodTorch,"Redwood Torch");
		LanguageRegistry.addName(stoneTorch,"Stone Torch");
		LanguageRegistry.addName(walnutTorch,"WalnutTorch");
		LanguageRegistry.addName(redwoodLadder,"Redwood Ladder");
		LanguageRegistry.addName(stoneWoodLadder,"StoneWood Ladder");
		LanguageRegistry.addName(walnutLadder,"Walnut Ladder");
		LanguageRegistry.addName(blackWoodStairs,"BlackWood Stairs");
		LanguageRegistry.addName(hardWoodStairs,"HardWood Stairs");
		LanguageRegistry.addName(redWoodStairs,"RedWood Stairs");
		LanguageRegistry.addName(softWoodStairs,"SoftWood Stairs");
		LanguageRegistry.addName(stoneWoodStairs,"StoneWood Stairs");
		LanguageRegistry.addName(sunflowerWoodStairs,"SunflowerWood Stairs");
		LanguageRegistry.addName(walnutWoodStairs,"WalnutWood Stairs");
		LanguageRegistry.addName(wolfWoodStairs,"WolfWood Stairs");
		LanguageRegistry.addName(blackWoodDoubleSlab,"BlackWood DoubleSlab");
		LanguageRegistry.addName(blackWoodSingleSlab,"BlackWood SingleSlab");
		LanguageRegistry.addName(hardWoodDoubleSlab,"HardWood DoubleSlab");
		LanguageRegistry.addName(hardWoodSingleSlab,"HardWood SingleSlab");
		LanguageRegistry.addName(redwoodDoubleSlab,"Redwood DoubleSlab");
		LanguageRegistry.addName(redwoodSingleSlab,"Redwood SingleSlab");
		LanguageRegistry.addName(softWoodDoubleSlab,"SoftWood DoubleSlab");
		LanguageRegistry.addName(softWoodSingleSlab,"SoftWood SingleSlab");
		LanguageRegistry.addName(stoneWoodDoubleSlab,"StoneWood DoubleSlab");
		LanguageRegistry.addName(stoneWoodSingleSlab,"StoneWood SingleSlab");
		LanguageRegistry.addName(sunflowerDoubleSlab,"Sunflower DoubleSlab");
		LanguageRegistry.addName(sunflowerSingleSlab,"Sunflower SingleSlab");
		LanguageRegistry.addName(walnutWoodDoubleSlab,"WalnutWood DoubleSlab");
		LanguageRegistry.addName(walnutWoodSingleSlab,"WalnutWood SingleSlab");
		LanguageRegistry.addName(wolfWoodDoubleSlab,"WolfWood DoubleSlab");
		LanguageRegistry.addName(wolfWoodSingleSlab,"WolfWood SingleSlab");
		LanguageRegistry.addName(iceBoat,"Ice Boat");
		LanguageRegistry.addName(blackBook,"Black Book");
		LanguageRegistry.addName(godsHand,"Gods Hand");
		LanguageRegistry.addName(poFire,"Power of Fire");
		LanguageRegistry.addName(winds,"Winds");
		LanguageRegistry.addName(bigFeather,"Big Feather");
		LanguageRegistry.addName(workHammer,"Work Hammer");
		LanguageRegistry.addName(chickenDrop,"Chicken Drop");
		LanguageRegistry.addName(coolBow, "Cool Bow");
		LanguageRegistry.addName(walnutBow,"Walnut Bow");
		LanguageRegistry.addName(stoneBow,"Stone Bow");
		LanguageRegistry.addName(blackBow,"Black Bow");
		LanguageRegistry.addName(purpleBow,"Purple Bow");
		LanguageRegistry.addName(purpleArrow,"Purple Arrow");
		LanguageRegistry.addName(stealthArrow,"Stealth Arrow");
		LanguageRegistry.addName(explosiveArrow,"Explosive Arrow");
		LanguageRegistry.addName(iceArrow,"Ice Arrow");
		LanguageRegistry.addName(lightningArrow,"Lightning Arrow");
		LanguageRegistry.addName(blackBlock,"Black Block");
		LanguageRegistry.addName(marbleBlock,"Marble Block");
		LanguageRegistry.addName(lilly, "Lily");
		LanguageRegistry.addName(tulip, "Tulip");
		LanguageRegistry.addName(wildFlower, "Wild Flower");
		LanguageRegistry.addName(dandelion, "Dandelion");
		LanguageRegistry.addName(daisy, "Daisy");
		LanguageRegistry.addName(iris, "Iris");
		LanguageRegistry.addName(redClover, "Red Clover");
		LanguageRegistry.addName(pansy, "Pansy");
		LanguageRegistry.addName(marshMarigold, "Marsh Marigold");
		LanguageRegistry.addName(wildOnion, "Wild Onion");
		LanguageRegistry.addName(wildGrass, "Wild Grass");
		LanguageRegistry.addName(thornGrass,"Thorn Grass");
		LanguageRegistry.addName(lambfriescooked, "Lambfries Cooked");
		LanguageRegistry.addName(lambfriesraw, "Lambfries Raw");
		LanguageRegistry.addName(cowsTail,"Cows Tail");
		LanguageRegistry.addName(glowingVine, "Glowing Vine");
		LanguageRegistry.addName(danglingFlower, "Dangling Flower");
		LanguageRegistry.addName(flameCactus, "Flame Cactus");
		LanguageRegistry.addName(bush, "Bush");
        LanguageRegistry.addName(poisonbush, "Poisonous bush");
        LanguageRegistry.addName(winterbush, "Winter Bush");
        LanguageRegistry.addName(spikebush, "Spike bush");
        LanguageRegistry.addName(eleGrass, "Ele Grass");
        LanguageRegistry.addName(eleGrassTop, "Ele Grass Top");
        
		LanguageRegistry.addName(happyCactus, "happyCactus");
		LanguageRegistry.addName(pewterOre, "pewterOre");
		LanguageRegistry.addName(moonstoneOre, "moonstoneOre");
		LanguageRegistry.addName(garnetOre, "garnetOre");
		LanguageRegistry.addName(topazOre, "topazOre");
		LanguageRegistry.addName(onyxOre, "onyxOre");
		LanguageRegistry.addName(bloodstoneOre, "bloodstoneOre");
		LanguageRegistry.addName(peanutwoodOre, "peanutwoodOre");
        LanguageRegistry.addName(jadeOre, "jadeOre");
        LanguageRegistry.addName(hematiteOre, "hematiteOre");
        LanguageRegistry.addName(potatoLog, "potatoLog");
        LanguageRegistry.addName(carrotLog, "carrotLog");
        LanguageRegistry.addName(cantaloupeLog, "cantaloupeLog");
        LanguageRegistry.addName(squashLog, "squashLog");
		LanguageRegistry.addName(cucumberLog, "cucumberLog");
		LanguageRegistry.addName(japanesecherryBlossomLog, "japanesecherryBlossomLog");
		LanguageRegistry.addName(japaneseMapleLog, "japaneseMapleLog");
		LanguageRegistry.addName(japaneseApricotLog, "japaneseApricotLog");
		LanguageRegistry.addName(potatoLeaves, "potatoLeaves");
		LanguageRegistry.addName(carrotLeaves, "carrotLeaves");
		LanguageRegistry.addName(cantaloupeLeaves, "cantaloupeLeaves");
        LanguageRegistry.addName(squashLeaves, "squashLeaves");
        LanguageRegistry.addName(cucumberLeaves, "cucumberLeaves");
        LanguageRegistry.addName(japanesecherryBlossomLeaves, "japanesecherryBlossomLeaves");
        LanguageRegistry.addName(japaneseMapleLeaves, "japaneseMapleLeaves");
        LanguageRegistry.addName(japaneseApricotLeaves, "japaneseApricotLeaves");
        LanguageRegistry.addName(potatoSapling, "potatoSapling");
		LanguageRegistry.addName(carrotSapling, "carrotSapling");
		LanguageRegistry.addName(cantaloupeSapling, "cantaloupeSapling");
		LanguageRegistry.addName(squashSapling, "squashSapling");
		LanguageRegistry.addName(cucumberSapling, "cucumberSapling");
		LanguageRegistry.addName(japanesecherryBlossomSapling, "japanesecherryBlossomSapling");
		LanguageRegistry.addName(japaneseMapleSapling, "japaneseMapleSapling");
		LanguageRegistry.addName(japaneseApricotSapling, "japaneseApricotSapling");
		LanguageRegistry.addName(treehouseSapling, "treehouseSapling");
		LanguageRegistry.addName(happyCactus, "happyCactus");
		LanguageRegistry.addName(hosta, "hosta");
		LanguageRegistry.addName(twilightRose, "twilightRose");
		LanguageRegistry.addName(redCactus, "redCactus");
		LanguageRegistry.addName(whiteCactus, "whiteCactus");
		LanguageRegistry.addName(waterPlant, "waterPlant");
		LanguageRegistry.addName(arrowCactus, "arrowCactus");
        LanguageRegistry.addName(snowCactus, "snowCactus");
        LanguageRegistry.addName(blueBelle, "blueBelle");
        LanguageRegistry.addName(swell, "swell");
        LanguageRegistry.addName(lovePlant, "lovePlant");
        LanguageRegistry.addName(pewterIngot, "pewterIngot");
        LanguageRegistry.addName(moonstoneGemStone, "moonstoneGemStone");
        LanguageRegistry.addName(garnetGemStone, "garnetGemStone");
        LanguageRegistry.addName(topazGemStone, "topazGemStone");
        LanguageRegistry.addName(onyxGemStone, "onyxGemStone");
        LanguageRegistry.addName(bloodstoneIngot, "bloodstoneIngot");
        LanguageRegistry.addName(peanutwoodChunk, "peanutwoodChunk");
        LanguageRegistry.addName(jadeGemStone, "jadeGemStone");
        LanguageRegistry.addName(hematiteGemStone, "hematiteGemStone");
        LanguageRegistry.addName(catseye, "Cats Eye");
        LanguageRegistry.addName(pearl, "Pearl");
        
		//Armor
		LanguageRegistry.addName(marbleHelmet, "Marble Helmet");
		LanguageRegistry.addName(marblePlate, "Marble Plate");
		LanguageRegistry.addName(marbleLegs, "Marble Legs");
		LanguageRegistry.addName(marbleBoots, "Marble Boots");
		LanguageRegistry.addName(amethystHelmet, "Amethyst Helmet");
		LanguageRegistry.addName(amethystPlate, "Amethyst Plate");
		LanguageRegistry.addName(amethystLegs, "Amethyst Legs");
		LanguageRegistry.addName(amethystBoots, "Amethyst Boots");
		LanguageRegistry.addName(sapphireHelmet, "Sapphire Helmet");
		LanguageRegistry.addName(sapphirePlate, "Sapphire Plate");
		LanguageRegistry.addName(sapphireLegs, "Sapphire Legs");
		LanguageRegistry.addName(sapphireBoots, "Sapphire Boots");
		LanguageRegistry.addName(graniteHelmet, "Granite Helmet");
		LanguageRegistry.addName(granitePlate, "Granite Plate");
		LanguageRegistry.addName(graniteLegs, "Granite Legs");
		LanguageRegistry.addName(graniteBoots, "Granite Boots");
		LanguageRegistry.addName(hardwoodHelmet, "Hardwood Helmet");
		LanguageRegistry.addName(hardwoodPlate, "Hardwood Plate");
		LanguageRegistry.addName(hardwoodLegs, "Hardwood Legs");
		LanguageRegistry.addName(hardwoodBoots, "Hardwood Boots");
		LanguageRegistry.addName(stonewoodHelmet, "Stonewood Helmet");
		LanguageRegistry.addName(stonewoodPlate, "Stonewood Plate");
		LanguageRegistry.addName(stonewoodLegs, "Stonewood Legs");
		LanguageRegistry.addName(stonewoodBoots, "Stonewood Boots");
		
		//RegBiomes
		BiomeManager.addSpawnBiome(blackMountains);
		BiomeManager.addSpawnBiome(eggHills);
		BiomeManager.addSpawnBiome(hardMountains);
		BiomeManager.addSpawnBiome(rainForrest);
		BiomeManager.addSpawnBiome(redwoodForrest);
		BiomeManager.addSpawnBiome(alphaHills);
		BiomeManager.addSpawnBiome(stoneMountains);
		BiomeManager.addSpawnBiome(whitePlains);
		BiomeManager.addSpawnBiome(wolf);
		BiomeManager.addSpawnBiome(petrifiedHills);
		BiomeManager.addSpawnBiome(zeroValley);
		BiomeManager.addVillageBiome(blackMountains, true);
		BiomeManager.addVillageBiome(eggHills, true);
		BiomeManager.addVillageBiome(hardMountains, true);
		BiomeManager.addVillageBiome(rainForrest, true);
		BiomeManager.addVillageBiome(redwoodForrest, true);
		BiomeManager.addVillageBiome(alphaHills, true);
		BiomeManager.addVillageBiome(stoneMountains, true);
		BiomeManager.addVillageBiome(whitePlains, true);
		BiomeManager.addVillageBiome(wolf, true);
		BiomeManager.addVillageBiome(petrifiedHills, true);
		BiomeManager.addVillageBiome(zeroValley, true);
		BiomeManager.addStrongholdBiome(blackMountains);
		BiomeManager.addStrongholdBiome(eggHills);
		BiomeManager.addStrongholdBiome(hardMountains);
		BiomeManager.addStrongholdBiome(rainForrest);
		BiomeManager.addStrongholdBiome(redwoodForrest);
		BiomeManager.addStrongholdBiome(alphaHills);
		BiomeManager.addStrongholdBiome(stoneMountains);
		BiomeManager.addStrongholdBiome(whitePlains);
		BiomeManager.addStrongholdBiome(wolf);
		BiomeManager.addStrongholdBiome(petrifiedHills);
		BiomeManager.addStrongholdBiome(zeroValley);
		GameRegistry.addBiome(blackMountains);
		GameRegistry.addBiome(eggHills);
		GameRegistry.addBiome(hardMountains);
		GameRegistry.addBiome(rainForrest);
		GameRegistry.addBiome(redwoodForrest);
		GameRegistry.addBiome(stoneMountains);
		GameRegistry.addBiome(alphaHills);
		GameRegistry.addBiome(whitePlains);
		GameRegistry.addBiome(wolf);
		GameRegistry.addBiome(petrifiedHills);
		GameRegistry.addBiome(zeroValley);
		GameRegistry.addBiome(hurtfulHills);
		GameRegistry.addBiome(afterLifeDesert);
		GameRegistry.addBiome(cliffs);
		GameRegistry.addBiome(legendaryForest);
		GameRegistry.addBiome(fruitValley);
		GameRegistry.addBiome(coldValley);
		
		//Recipes
		//Furnaces
		GameRegistry.addRecipe(new ItemStack(extruderIdle, 1), new Object[] {"BBB", "B B", "BBB", Character.valueOf('B'), this.blackIngot});
			
		//Bench
		GameRegistry.addRecipe(new ItemStack(smithsBench, 1), new Object[] {"B#", "#B", '#', this.blackPlanks, 'B', this.blackIngot});
			
		//SpiritTable
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(spiritTable, 1), new Object[] {" B ", "GID", "MMM", Character.valueOf('B'), this.blackBook, Character.valueOf('G'), Item.ingotGold, Character.valueOf('I'), this.blackIngot, Character.valueOf('D'), Item.diamond, Character.valueOf('M'), this.marbleBlock});

		//TreeTrunk
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(treeTrunk, 1), new Object[] {"###", "# #", "###", Character.valueOf('#'), this.walnutPlanks});

		//Forge
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(forge, 1), new Object[] {"BBB", " # ", "###", Character.valueOf('B'), this.blackBlock, Character.valueOf('#'), this.blackIngot});

		//IceMachine
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(iceMachine, 1), new Object[] {"###", "#R#", "###", Character.valueOf('#'), this.graniteIngot, Character.valueOf('R'), Item.redstone});
		
		//GemMachine
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(gemMachine, 1), new Object[] {"###", "#H#", "###", Character.valueOf('#'), this.graniteIngot, Character.valueOf('H'), this.workHammer});
		
		//Blocks
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackPlanks, 4), new Object[] {"#", '#', this.blackLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardPlanks, 4), new Object[] {"#", '#', this.hardLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redwoodPlanks, 4), new Object[] {"#", '#', this.redwoodLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(softPlanks, 4), new Object[] {"#", '#', this.softLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stonePlanks, 4), new Object[] {"#", '#', this.stoneLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sunflowerPlanks, 4), new Object[] {"#", '#', this.sunflowerLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutPlanks, 4), new Object[] {"#", '#', this.walnutLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(wolfPlanks, 4), new Object[] {"#", '#', this.wolfLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(rubberBlock, 1), new Object[] {"###", "#S#", "###", '#', this.rubber, 'S', this.softPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackTnT, 1), new Object[] {"###", "#B#", "###", '#', Item.gunpowder, 'B', this.blackIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(firePad, 4), new Object[] {"#R#", "R#R", "#R#", '#', Block.sponge, 'R', this.rubber});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(tender, 4), new Object[] {"###", "#R#", "###", '#', this.rubberBlock, 'R', this.rubber});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackBlock, 1), new Object[] {"###", "###", "###", '#', this.blackIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleBlock, 1), new Object[] {"###", "###", "###", '#', this.marbleIngot});
		
		//Torch
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardTorch, 4), new Object[] {"   ", " C ", " # ", '#', this.hardStick, 'C', Item.coal});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redwoodTorch, 4), new Object[] {"   ", " C ", " # ", '#', this.redwoodStick, 'C', Item.coal});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneTorch, 4), new Object[] {"   ", " C ", " # ", '#', this.stoneStick, 'C', Item.coal});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutTorch, 4), new Object[] {"   ", " C ", " # ", '#', this.walnutStick, 'C', Item.coal});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackTorch, 1), new Object[]{"   ", " # ", " B ", '#', Item.coal, 'B', this.blackIngot});
		
		//Ladder
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redwoodLadder, 3), new Object[] {"# #", "###", "# #", '#', this.redwoodStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneWoodLadder, 3), new Object[] {"# #", "###", "# #", '#', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutLadder, 3), new Object[] {"# #", "###", "# #", '#', this.walnutStick});
		
		//Stairs
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.blackPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.redwoodPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(softWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.softPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sunflowerWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.sunflowerPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.walnutPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(wolfWoodStairs, 4), new Object[] {"#  ", "## ", "###", '#', this.wolfPlanks});
		
		//Slabs
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackWoodSingleSlab, 3), new Object[] {"###", '#', this.blackPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardWoodSingleSlab, 3), new Object[] {"###", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redwoodSingleSlab, 3), new Object[] {"###", '#', this.redwoodPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(softWoodSingleSlab, 3), new Object[] {"###", '#', this.softPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneWoodSingleSlab, 3), new Object[] {"###", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutWoodSingleSlab, 3), new Object[] {"###", '#', this.walnutPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sunflowerSingleSlab, 3), new Object[] {"###", '#', this.sunflowerPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(wolfWoodSingleSlab, 3), new Object[] {"###", '#', this.wolfPlanks});
		
		//Sticks
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackStick, 4), new Object[] {"#", "#", '#', this.blackPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardStick, 4), new Object[] {"#", "#", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redwoodStick, 4), new Object[] {"#", "#", '#', this.redwoodPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(softStick, 4), new Object[] {"#", "#", '#', this.softPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneStick, 4), new Object[] {"#", "#", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sunflowerStick, 4), new Object[] {"#", "#", '#', this.sunflowerPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutStick, 4), new Object[] {"#", "#", '#', this.walnutPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(wolfStick, 4), new Object[] {"#", "#", '#', this.wolfPlanks});
		
		//Items
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(rubber, 3), new Object[] {"###", '#', this.rubberLeaves});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(eggPaper, 3), new Object[] {"###", '#', this.eggLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackBook, 1), new Object[] {"##", "L#", '#', this.eggPaper, 'L', Item.leather});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(skyBoat, 1), new Object[] {"# #", "#S#", '#', this.softPlanks, 'S', this.skyLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(lavaBoat, 1), new Object[] {"# #", "#F#", '#', this.stonePlanks, 'F', this.firePad});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(snowSled, 1), new Object[] {"# #", "###", '#', this.softPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(iceBoat, 1), new Object[] {"# #", "#D#", '#', this.softPlanks, 'D', this.diamondDust});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(smokinDust, 3), new Object[]{"   ", "S #", "   ", 'S', this.smokinLog, '#', this.workHammer});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(workHammer, 1), new Object[] {"  G", " S ", "S  ", Character.valueOf('G'), Item.ingotGold, Character.valueOf('S'), this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(coolBow, 1), new Object[] {" IS", "I S", " IS", Character.valueOf('I'), this.iceLog, Character.valueOf('S'), Item.silk});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(walnutBow, 1), new Object[] {" WS", "W S", " WS", Character.valueOf('W'), this.walnutStick, Character.valueOf('S'), Item.silk});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneBow, 1), new Object[] {" #S", "# S", " #S", Character.valueOf('#'), this.stoneStick, Character.valueOf('S'), Item.silk});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackBow, 1), new Object[] {" BS", "B S", " BS", Character.valueOf('B'), this.blackStick, Character.valueOf('S'), Item.silk});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(purpleBow, 1), new Object[] {" WS", "W S", " WS", Character.valueOf('W'), this.wolfStick, Character.valueOf('S'), Item.silk});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(purpleArrow, 1), new Object[] {"F", "W", "B", Character.valueOf('F'), Item.flint, Character.valueOf('W'), this.wolfStick, Character.valueOf('B'), this.bigFeather});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stealthArrow, 1), new Object[] {"F  ", "GS ", "#  ", Character.valueOf('F'), Item.flint, Character.valueOf('S'), this.softStick, Character.valueOf('G'), Block.glass, Character.valueOf('#'), Item.feather});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(explosiveArrow, 1), new Object[] {"F  ", "TS ", "#  ", Character.valueOf('F'), Item.flint, Character.valueOf('S'), this.softStick, Character.valueOf('T'), Block.tnt, Character.valueOf('#'), Item.feather});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(iceArrow, 1), new Object[] {"F  ", "IS ", "#  ", Character.valueOf('F'), Item.flint, Character.valueOf('S'), this.softStick, Character.valueOf('I'), Block.ice, Character.valueOf('#'), Item.feather});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(lightningArrow, 1), new Object[] {"F  ", "LS ", "#  ", Character.valueOf('F'), Item.flint, Character.valueOf('S'), this.softStick, Character.valueOf('L'), Block.obsidian, Character.valueOf('#'), Item.feather});
		
		//Tools
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackAxe, 4), new Object[] {" ##", " S#", " S ", '#', this.blackIngot, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackHoe, 4), new Object[] {"## ", " S ", " S ", '#', this.blackIngot, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackPickAxe, 4), new Object[] {"###", " S ", " S ", '#', this.blackIngot, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackSpade, 4), new Object[] {" # ", " S ", " S ", '#', this.blackIngot, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackSword, 4), new Object[] {" # ", " # ", " S ", '#', this.blackIngot, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleAxe, 4), new Object[] {" ##", " S#", " S ", '#', this.marbleIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleHoe, 4), new Object[] {"## ", " S ", " S ", '#', this.marbleIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marblePickAxe, 4), new Object[] {"###", " S ", " S ", '#', this.marbleIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleSpade, 4), new Object[] {" # ", " S ", " S ", '#', this.marbleIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleSword, 4), new Object[] {" # ", " # ", " S ", '#', this.marbleIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(graniteSword, 4), new Object[] {" # ", " # ", " S ", '#', this.graniteIngot, 'S', this.stoneStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(blackWoodSword, 4), new Object[] {" # ", " # ", " S ", '#', this.blackPlanks, 'S', this.blackStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardWoodSword, 4), new Object[] {" H ", " H ", " S ", 'H', this.hardPlanks, 'S', this.hardStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(redWoodSword, 4), new Object[] {" R ", " R ", " S ", 'H', this.redwoodPlanks, 'S', this.redwoodStick});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stoneWoodSword, 4), new Object[] {" # ", " # ", " S ", '#', this.stonePlanks, 'S', this.stoneStick});
		
		//Armor
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.marbleIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marblePlate, 1), new Object[] {"# #", "###", "###", '#', this.marbleIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleLegs, 1), new Object[] {"###", "# #", "# #", '#', this.marbleIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(marbleBoots, 1), new Object[] {"   ","# #", "# #", '#', this.marbleIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(amethystHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.amethystIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(amethystPlate, 1), new Object[] {"# #", "###", "###", '#', this.amethystIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(amethystLegs, 1), new Object[] {"###", "# #", "# #", '#', this.amethystIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(amethystBoots, 1), new Object[] {"   ","# #", "# #", '#', this.amethystIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sapphireHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.sapphireIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sapphirePlate, 1), new Object[] {"# #", "###", "###", '#', this.sapphireIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sapphireLegs, 1), new Object[] {"###", "# #", "# #", '#', this.sapphireIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(sapphireBoots, 1), new Object[] {"   ","# #", "# #", '#', this.sapphireIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(graniteHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.graniteIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(granitePlate, 1), new Object[] {"# #", "###", "###", '#', this.graniteIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(graniteLegs, 1), new Object[] {"###", "# #", "# #", '#', this.graniteIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(graniteBoots, 1), new Object[] {"   ","# #", "# #", '#', this.graniteIngot});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardwoodHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardwoodPlate, 1), new Object[] {"# #", "###", "###", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardwoodLegs, 1), new Object[] {"###", "# #", "# #", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(hardwoodBoots, 1), new Object[] {"   ","# #", "# #", '#', this.hardPlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stonewoodHelmet, 1), new Object[] {"###", "# #", "   ", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stonewoodPlate, 1), new Object[] {"# #", "###", "###", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stonewoodLegs, 1), new Object[] {"###", "# #", "# #", '#', this.stonePlanks});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(stonewoodBoots, 1), new Object[] {"   ","# #", "# #", '#', this.stonePlanks});
		
		//Wands	
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(godsHand, 1), new Object[] {"P", "B", "S", Character.valueOf('S'), this.softStick, Character.valueOf('B'), this.blackBook, Character.valueOf('P'), this.smiteLog});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(poFire, 1), new Object[] {"F", "B", "S", Character.valueOf('S'), this.blackStick, Character.valueOf('B'), this.blackBook, Character.valueOf('F'), Item.flintAndSteel});
		SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(winds, 1), new Object[] {"W", "B", "S", Character.valueOf('S'), this.softStick, Character.valueOf('B'), this.blackBook, Character.valueOf('W'), this.bigFeather});
		
		//SmithsCraftingManager.getInstance().func_92051_a(new ItemStack(skyBoat, 1), new Object[] {"# #", "###", '#', Block.planks});
		//Smelting
		GameRegistry.addSmelting(this.blackOre.blockID, new ItemStack(this.blackIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.amethystOre.blockID, new ItemStack(this.amethystIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.sapphireOre.blockID, new ItemStack(this.sapphireIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.marble.blockID, new ItemStack(this.marbleIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.opalOre.blockID, new ItemStack(this.opalIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.turquoiseOre.blockID, new ItemStack(this.turquoiseIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.graniteOre.blockID, new ItemStack(this.graniteIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.garnetOre.blockID, new ItemStack(this.garnetGemStone), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.hematiteOre.blockID, new ItemStack(this.hematiteGemStone), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.jadeOre.blockID, new ItemStack(this.jadeGemStone), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.moonstoneOre.blockID, new ItemStack(this.moonstoneGemStone), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.onyxOre.blockID, new ItemStack(this.onyxGemStone), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.pewterOre.blockID, new ItemStack(this.pewterIngot), 0.1F);
		GemMachineRecipes.smelting().addSmelting(this.topazOre.blockID, new ItemStack(this.topazGemStone), 0.1F);
		ExtruderRecipes.smelting().addSmelting(this.waterLeaves.blockID, new ItemStack(Item.bucketWater),  0.1F);
		GameRegistry.addSmelting(this.lambfriesraw.itemID, new ItemStack(lambfriescooked, 1), 1);
		
		//WorldGenReg
		GameRegistry.registerWorldGenerator(new WorldGeneratorBlackTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorEggTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorHardTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRainTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRedwoodTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRubberTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSmokinTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSoftTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorStoneTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSunflowerTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWalnutTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWolfTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorGhostTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorIceTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSkyTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSmiteTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPainTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorLifeTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorGiantTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorNetherTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorNeverTrees());
		GameRegistry.registerWorldGenerator(new WorldGeneratorExplosiveTrees());
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorJATree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorJCBTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorJMTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorCantaloupeTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorCarrotTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorCucumberTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPotatoTree());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSquashTree());
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorBush());
		GameRegistry.registerWorldGenerator(new WorldGeneratorEleGrass());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSpikeBush());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPoisonBush());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWinterBush());
		GameRegistry.registerWorldGenerator(new WorldGeneratorFlameCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorDanglingFlower());
		GameRegistry.registerWorldGenerator(new WorldGeneratorGlowingVine());
		GameRegistry.registerWorldGenerator(new WorldGeneratorTulip());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWildFlower());
		GameRegistry.registerWorldGenerator(new WorldGeneratorDandeLion());
		GameRegistry.registerWorldGenerator(new WorldGeneratorDaisy());
		GameRegistry.registerWorldGenerator(new WorldGeneratorIris());
		GameRegistry.registerWorldGenerator(new WorldGeneratorLily());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRedClover());
		GameRegistry.registerWorldGenerator(new WorldGeneratorPansy());
		GameRegistry.registerWorldGenerator(new WorldGeneratorMarshMarigold());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWildOnion());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWildGrass());
		GameRegistry.registerWorldGenerator(new WorldGeneratorThornGrass());
		GameRegistry.registerWorldGenerator(new WorldGeneratorNewOres());
		GameRegistry.registerWorldGenerator(new WorldGeneratorQuickSand());
		GameRegistry.registerWorldGenerator(new WorldGeneratorArrowCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorBlueBelle());
		GameRegistry.registerWorldGenerator(new WorldGeneratorHappyCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorHosta());
		GameRegistry.registerWorldGenerator(new WorldGeneratorLovePlant());
		GameRegistry.registerWorldGenerator(new WorldGeneratorRedCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSnowCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorTwilightRose());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWhiteCactus());
		GameRegistry.registerWorldGenerator(new WorldGeneratorSwell());
		GameRegistry.registerWorldGenerator(new WorldGeneratorWaterPlant());
		
		DungeonHooks.addDungeonLoot(new ItemStack(this.blackBook), 15, 1, 1);
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(this.blackBook),2,2,5));
		GameRegistry.registerFuelHandler(new FuelChickenDrop());
		GameRegistry.registerFuelHandler(new FuelFlameCactus());
		//TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		NetworkRegistry.instance().registerGuiHandler(this,  guiHandlerTrees);
		
		//Tiles
		GameRegistry.registerTileEntity(TileEntityExtruder.class,"tileEntityExtruder");
		GameRegistry.registerTileEntity(TileEntityIceMachine.class,"tileEntityIceMachine");
		GameRegistry.registerTileEntity(TileEntityTreeTrunk.class,"tileEntityTreeTrunk");
		GameRegistry.registerTileEntity(TileEntityGemMachine.class,"tileEntityGemMachine");
		
		//Weapons
		EntityRegistry.registerModEntity(EntityStealthArrow.class, "Stealth Arrow",  12087, this, 64, 20, true);
		EntityRegistry.registerModEntity(EntityExplosiveArrow.class, "Explosive Arrow",  12088, this, 64, 20, true);
		EntityRegistry.registerModEntity(EntityIceArrow.class, "Ice Arrow",  12089, this, 64, 20, true);
		EntityRegistry.registerModEntity(EntityLightningArrow.class, "Lightning Arrow",  12090, this, 64, 20, true);
		EntityRegistry.registerModEntity(EntityPurpleArrow.class, "Purple Arrow",  12086, this, 64, 20, true);
		EntityRegistry.registerModEntity(EntityTnTStick.class, "TnT Stick", 12004, this, 8, 1, true);
		EntityRegistry.registerModEntity(EntityBlackTnTPrimed.class, "BlackTnT", 231, this, 8, 1, false);
		EntityRegistry.registerGlobalEntityID(EntityBlackTnTPrimed.class, "biomeBuster", 231);
        EntityRegistry.registerModEntity(EntityBlackTnTPrimed.class, "biomeBuster", 231, instance, 256, 1, true);
        
        EntityRegistry.registerModEntity(EntityWind.class, "Wind", 8, this, 8, 1, true);
        
        //Travel
        EntityRegistry.registerModEntity(EntitySkyBoat.class, "Sky Boat", 12063, this, 8, 1, true);
        EntityRegistry.registerModEntity(EntityLavaBoat.class, "Lava Boat", 12064, this, 8, 1, true);
        EntityRegistry.registerModEntity(EntitySnowSled.class, "Snow Sled", 12065, this, 8, 1, true);
        EntityRegistry.registerModEntity(EntityIceBoat.class, "Ice Boat", 12066, this, 8, 1, true);
        
		//Mobs
		EntityRegistry.registerModEntity(EntityWalkingTree.class, "WalkingTree", 19, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityWalkingTree.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.WalkingTree.name", "en_US", "Walking Tree");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(19), EntityWalkingTree.class);
		EntityList.entityEggs.put(Integer.valueOf(19), new EntityEggInfo(19, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntitySkyChicken.class, "SkyChicken", 2, this, 80, 3, true);
		EntityRegistry.addSpawn(EntitySkyChicken.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.SkyChicken.name", "en_US", "Sky Chicken");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(3), EntitySkyChicken.class);
		EntityList.entityEggs.put(Integer.valueOf(3), new EntityEggInfo(3, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntityAttackPig.class, "AttackPig", 3, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityAttackPig.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.AttackPig.name", "en_US", "Attack Pig");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(4), EntityAttackPig.class);
		EntityList.entityEggs.put(Integer.valueOf(4), new EntityEggInfo(4, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntityWanderingCow.class, "WanderingCow", 4, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityWanderingCow.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.WanderingCow.name", "en_US", "Wandering Cow");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(5), EntityWanderingCow.class);
		EntityList.entityEggs.put(Integer.valueOf(5), new EntityEggInfo(5, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntityTallChicken.class, "TallChicken", 5, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityTallChicken.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.TallChicken.name", "en_US", "Tall Chicken");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(1), EntityTallChicken.class);
		EntityList.entityEggs.put(Integer.valueOf(1), new EntityEggInfo(1, 2039583, 11638068));		

		EntityRegistry.registerModEntity(EntityGoat.class, "Goat", 6, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityGoat.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.Goat.name", "en_US", "Goat");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(6), EntityGoat.class);
		EntityList.entityEggs.put(Integer.valueOf(6), new EntityEggInfo(6, 2039583, 11638068));

		EntityRegistry.registerModEntity(EntityPunSheep.class, "PunSheep", 7, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityPunSheep.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.PunSheep.name", "en_US", "Punch Sheep");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(7), EntityPunSheep.class);
		EntityList.entityEggs.put(Integer.valueOf(7), new EntityEggInfo(7, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntityBlueCow.class, "BlueCow", 18, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityBlueCow.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.BlueCow.name", "en_US", "Blue Cow");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(18), EntityBlueCow.class);
		EntityList.entityEggs.put(Integer.valueOf(18), new EntityEggInfo(18, 2039583, 11638068));
		
		EntityRegistry.registerModEntity(EntityEasySpider.class, "EasySpider", 9, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityEasySpider.class, 10, 2, 4, EnumCreatureType.creature);
		LanguageRegistry.instance().addStringLocalization("entity.Trees.EasySpider.name", "en_US", "Easy Spider");
	    EntityList.IDtoClassMapping.put(Integer.valueOf(9), EntityEasySpider.class);
		EntityList.entityEggs.put(Integer.valueOf(9), new EntityEggInfo(9, 2039583, 11638068));
		
		proxy.registerTileEntitySpecialRenderer();
		proxy.registerRenderThings();
		
	}
	
	@cpw.mods.fml.common.Mod.PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}
