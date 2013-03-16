package microjunk.trees.common.mobs;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderPunSheep extends RenderLiving
{

    public RenderPunSheep(ModelBase modelbase, ModelBase modelbase1, float f)
    {
        super(modelbase, f);
        setRenderPassModel(modelbase1);
    }

    protected int setWoolColorAndRender(EntityPunSheep entitypunsheep, int i, float f)
    {
        if(i == 0 && !entitypunsheep.getSheared())
        {
            loadTexture("/mob/sheep_fur.png");
            float f1 = 1.0F;
            int j = entitypunsheep.getFleeceColor();
            GL11.glColor3f(f1 * EntityPunSheep.fleeceColorTable[j][0], f1 * EntityPunSheep.fleeceColorTable[j][1], f1 * EntityPunSheep.fleeceColorTable[j][2]);
            return 1;
        } else
        {
            return -1;
        }
    }

    public void func_40271_a(EntityPunSheep entitypunsheep, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entitypunsheep, d, d1, d2, f, f1);
    }

    protected int shouldRenderPass(EntityLiving entityliving, int i, float f)
    {
        return setWoolColorAndRender((EntityPunSheep)entityliving, i, f);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        func_40271_a((EntityPunSheep)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_40271_a((EntityPunSheep)entity, d, d1, d2, f, f1);
    }
}
