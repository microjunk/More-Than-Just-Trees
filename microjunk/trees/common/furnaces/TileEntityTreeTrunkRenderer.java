package microjunk.trees.common.furnaces;

import java.util.Calendar;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTreeTrunkRenderer extends TileEntitySpecialRenderer
{
    private ModelChest chestModel = new ModelChest();
    private ModelChest largeChestModel = new ModelLargeChest();
    private boolean field_92061_d;

    public TileEntityTreeTrunkRenderer()
    {
        Calendar var1 = Calendar.getInstance();

        if (var1.get(2) + 1 == 12 && var1.get(5) >= 24 && var1.get(5) <= 26)
        {
            this.field_92061_d = true;
        }
    }

    public void renderTileEntityChestAt(TileEntityTreeTrunk var1, double var2, double var4, double var6, float var8)
    {
        int var9;

        if (!var1.func_70309_m())
        {
            var9 = 0;
        }
        else
        {
            Block var10 = var1.getBlockType();
            var9 = var1.getBlockMetadata();

            if (var10 != null && var9 == 0)
            {
                ((BlockTreeTrunk)var10).unifyAdjacentChests(var1.getWorldObj(), var1.xCoord, var1.yCoord, var1.zCoord);
                var9 = var1.getBlockMetadata();
            }

            var1.checkForAdjacentChests();
        }

        if (var1.adjacentChestZNeg == null && var1.adjacentChestXNeg == null)
        {
            ModelChest var14;

            if (var1.adjacentChestXPos == null && var1.adjacentChestZPosition == null)
            {
                var14 = this.chestModel;

                if (this.field_92061_d)
                {
                    this.bindTextureByName("/microjunk/trees/common/aart/xmaschest.png");
                }
                else
                {
                    this.bindTextureByName("/microjunk/trees/common/aart/chest.png");
                }
            }
            else
            {
                var14 = this.largeChestModel;

                if (this.field_92061_d)
                {
                    this.bindTextureByName("/microjunk/trees/common/aart/largexmaschest.png");
                }
                else
                {
                    this.bindTextureByName("/microjunk/trees/common/aart/largechest.png");
                }
            }

            GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            short var11 = 0;

            if (var9 == 2)
            {
                var11 = 180;
            }

            if (var9 == 3)
            {
                var11 = 0;
            }

            if (var9 == 4)
            {
                var11 = 90;
            }

            if (var9 == 5)
            {
                var11 = -90;
            }

            if (var9 == 2 && var1.adjacentChestXPos != null)
            {
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
            }

            if (var9 == 5 && var1.adjacentChestZPosition != null)
            {
                GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            }

            GL11.glRotatef((float)var11, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float var12 = var1.prevLidAngle + (var1.lidAngle - var1.prevLidAngle) * var8;
            float var13;

            if (var1.adjacentChestZNeg != null)
            {
                var13 = var1.adjacentChestZNeg.prevLidAngle + (var1.adjacentChestZNeg.lidAngle - var1.adjacentChestZNeg.prevLidAngle) * var8;

                if (var13 > var12)
                {
                    var12 = var13;
                }
            }

            if (var1.adjacentChestXNeg != null)
            {
                var13 = var1.adjacentChestXNeg.prevLidAngle + (var1.adjacentChestXNeg.lidAngle - var1.adjacentChestXNeg.prevLidAngle) * var8;

                if (var13 > var12)
                {
                    var12 = var13;
                }
            }

            var12 = 1.0F - var12;
            var12 = 1.0F - var12 * var12 * var12;
            var14.chestLid.rotateAngleX = -(var12 * (float)Math.PI / 2.0F);
            var14.renderAll();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        this.renderTileEntityChestAt((TileEntityTreeTrunk)var1, var2, var4, var6, var8);
    }
}
