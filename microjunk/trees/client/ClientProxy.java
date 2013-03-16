package microjunk.trees.client;

import microjunk.trees.common.CommonProxy;
import microjunk.trees.common.blocks.EntityBlackTnTPrimed;
import microjunk.trees.common.blocks.RenderBlackTnTPrimed;
import microjunk.trees.common.furnaces.RenderSpiritTable;
import microjunk.trees.common.furnaces.TileEntitySpiritTable;
import microjunk.trees.common.furnaces.TileEntityTreeTrunk;
import microjunk.trees.common.furnaces.TileEntityTreeTrunkRenderer;
import microjunk.trees.common.items.EntityTnTStick;
import microjunk.trees.common.items.EntityWind;
import microjunk.trees.common.items.RenderTnTStick;
import microjunk.trees.common.items.RenderWinds;
import microjunk.trees.common.mobs.EntityAttackPig;
import microjunk.trees.common.mobs.EntityBlueCow;
import microjunk.trees.common.mobs.EntityEasySpider;
import microjunk.trees.common.mobs.EntityGoat;
import microjunk.trees.common.mobs.EntityPunSheep;
import microjunk.trees.common.mobs.EntitySkyChicken;
import microjunk.trees.common.mobs.EntityTallChicken;
import microjunk.trees.common.mobs.EntityWalkingTree;
import microjunk.trees.common.mobs.EntityWanderingCow;
import microjunk.trees.common.mobs.ModelAttackPig;
import microjunk.trees.common.mobs.ModelBlueCow;
import microjunk.trees.common.mobs.ModelEasySpider;
import microjunk.trees.common.mobs.ModelGoat;
import microjunk.trees.common.mobs.ModelPunSheep1;
import microjunk.trees.common.mobs.ModelPunSheep2;
import microjunk.trees.common.mobs.ModelSkyChicken;
import microjunk.trees.common.mobs.ModelWalkingTree;
import microjunk.trees.common.mobs.ModelWanderingCow;
import microjunk.trees.common.mobs.RenderAttackPig;
import microjunk.trees.common.mobs.RenderBlueCow;
import microjunk.trees.common.mobs.RenderEasySpider;
import microjunk.trees.common.mobs.RenderGoat;
import microjunk.trees.common.mobs.RenderPunSheep;
import microjunk.trees.common.mobs.RenderSkyChicken;
import microjunk.trees.common.mobs.RenderWalkingTree;
import microjunk.trees.common.mobs.RenderWanderingCow;
import microjunk.trees.common.travel.EntityIceBoat;
import microjunk.trees.common.travel.EntityLavaBoat;
import microjunk.trees.common.travel.EntitySkyBoat;
import microjunk.trees.common.travel.EntitySnowSled;
import microjunk.trees.common.travel.RenderIceBoat;
import microjunk.trees.common.travel.RenderLavaBoat;
import microjunk.trees.common.travel.RenderSkyBoat;
import microjunk.trees.common.travel.RenderSnowSled;
import microjunk.trees.common.weapons.EntityExplosiveArrow;
import microjunk.trees.common.weapons.EntityIceArrow;
import microjunk.trees.common.weapons.EntityLightningArrow;
import microjunk.trees.common.weapons.EntityPurpleArrow;
import microjunk.trees.common.weapons.EntityStealthArrow;
import microjunk.trees.common.weapons.RenderExplosiveArrow;
import microjunk.trees.common.weapons.RenderIceArrow;
import microjunk.trees.common.weapons.RenderLightningArrow;
import microjunk.trees.common.weapons.RenderPurpleArrow;
import microjunk.trees.common.weapons.RenderStealthArrow;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderThings()
	{
		
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/Trees.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/Blocks.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/Items.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/HD_flowers.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/book.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/Deco.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/iceboat.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/skyboat.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/lavaboat.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/snowsled.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/BlackTnT.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/furnace.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/enchant.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/iceboxgui.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/Smiths.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/container.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/chest.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/largechest.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/xmaschest.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/largexmaschest.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/angrypig.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/flyingchicken.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/TallChicken.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/wanderingcow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/WalkingTree.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/punsheep.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/punsheep_fur.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/mgoat.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/glassarrow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/explosivearrow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/icearrow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/purplearrow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/lightningarrow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/bluecow.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/easyspider.png");
		MinecraftForgeClient.preloadTexture("/microjunk/trees/common/aart/easyeyes.png");
	
		
		RenderingRegistry.registerBlockHandler(new TreeTrunkRenderer());
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyBoat.class, new RenderSkyBoat());
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaBoat.class, new RenderLavaBoat());
		RenderingRegistry.registerEntityRenderingHandler(EntitySnowSled.class, new RenderSnowSled());
		RenderingRegistry.registerEntityRenderingHandler(EntityIceBoat.class, new RenderIceBoat());
		RenderingRegistry.registerEntityRenderingHandler(EntityTallChicken.class, new RenderLiving(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityAttackPig.class, new RenderAttackPig(new ModelAttackPig(), null, 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyChicken.class, new RenderSkyChicken(new ModelSkyChicken(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityWanderingCow.class, new RenderWanderingCow(new ModelWanderingCow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueCow.class, new RenderBlueCow(new ModelBlueCow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityEasySpider.class, new RenderEasySpider());
		RenderingRegistry.registerEntityRenderingHandler(EntityWalkingTree.class, new RenderWalkingTree(new ModelWalkingTree(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(new ModelGoat(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPunSheep.class, new RenderPunSheep(new ModelPunSheep2(), new ModelPunSheep1(), 0.7F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTnTStick.class, new RenderTnTStick(0));
		RenderingRegistry.registerEntityRenderingHandler(EntityStealthArrow.class, new RenderStealthArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityExplosiveArrow.class, new RenderExplosiveArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityIceArrow.class, new RenderIceArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningArrow.class, new RenderLightningArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityPurpleArrow.class, new RenderPurpleArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityWind.class, new RenderWinds());
		TileEntity.addMapping(TileEntityTreeTrunk.class, "TreeTrunk");
		RenderingRegistry.registerEntityRenderingHandler(EntityBlackTnTPrimed.class, new RenderBlackTnTPrimed());
	
	}
	
	@Override
	public void registerTileEntitySpecialRenderer()
	{
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTreeTrunk.class, new TileEntityTreeTrunkRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpiritTable.class, new RenderSpiritTable());
    	//ClientRegistry.
	}
	
}
