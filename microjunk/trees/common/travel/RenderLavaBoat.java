package microjunk.trees.common.travel;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.MathHelper;

public class RenderLavaBoat extends Render
{
    /** instance of ModelBoat for rendering */
    protected ModelBase modelBoat;

    public RenderLavaBoat()
    {
        this.shadowSize = 0.5F;
        this.modelBoat = new ModelLavaBoat();
    }

    /**
     * The render method used in RenderBoat that renders the boat model.
     */
    public void renderLavaBoat(EntityLavaBoat par1EntityLavaBoat, double par2, double par4, double par6, float par8, float par9)
    {
        this.modelBoat = par1EntityLavaBoat.getModel();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glRotatef(180.0F - par8, 0.0F, 1.0F, 0.0F);
        float var10 = (float)par1EntityLavaBoat.getTimeSinceHit() - par9;
        float var11 = (float)par1EntityLavaBoat.getDamageTaken() - par9;

        if (var11 < 0.0F)
        {
            var11 = 0.0F;
        }

        if (var10 > 0.0F)
        {
            GL11.glRotatef(MathHelper.sin(var10) * var10 * var11 / 10.0F * (float)par1EntityLavaBoat.getForwardDirection(), 1.0F, 0.0F, 0.0F);
        }

        //this.loadTexture("/terrain.png");
        float var12 = 0.75F;
        GL11.glScalef(var12, var12, var12);
        GL11.glScalef(1.0F / var12, 1.0F / var12, 1.0F / var12);
        this.loadTexture("/microjunk/trees/common/aart/lavaboat.png");
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        this.modelBoat.render(par1EntityLavaBoat, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderLavaBoat((EntityLavaBoat)par1Entity, par2, par4, par6, par8, par9);
    }
}
