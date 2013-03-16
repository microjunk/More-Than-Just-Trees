package microjunk.trees.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import microjunk.trees.common.Trees;
import microjunk.trees.common.furnaces.TileEntityTreeTrunk;

public class TreeTrunkItemRenderHelper
{
    public static TreeTrunkItemRenderHelper instance = new TreeTrunkItemRenderHelper();
    private TileEntityTreeTrunk itemRender = new TileEntityTreeTrunk();

    public void renderChest(Block var1, int var2, float var3)
    {
        if (var1 == Trees.treeTrunk)
        {
            TileEntityRenderer.instance.renderTileEntityAt(this.itemRender, 0.0D, 0.0D, 0.0D, 0.0F);
        }
    }
}
