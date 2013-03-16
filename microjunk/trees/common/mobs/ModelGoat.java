package microjunk.trees.common.mobs;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoat extends ModelQuadruped
{

    public ModelGoat()
    {
        super(0, 0.0F);
        Tail = new ModelRenderer(this, 0, 0);
        Tail.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        Tail.setRotationPoint(0.0F, 9F, 8F);
        Tail.rotateAngleX = 0.0F;
        Tail.rotateAngleY = 0.0F;
        Tail.rotateAngleZ = 0.0F;
        Tail.mirror = false;
        Horn1 = new ModelRenderer(this, 0, 4);
        Horn1.addBox(2.0F, -6F, -2F, 2, 3, 2, 0.0F);
        Horn1.setRotationPoint(0.0F, 9F, -5F);
        Horn1.rotateAngleX = 0.0F;
        Horn1.rotateAngleY = 0.0F;
        Horn1.rotateAngleZ = 0.0F;
        Horn1.mirror = false;
        Horn2 = new ModelRenderer(this, 0, 4);
        Horn2.addBox(-4F, -7F, 0.0F, 2, 3, 2, 0.0F);
        Horn2.setRotationPoint(0.0F, 10F, -7F);
        Horn2.rotateAngleX = 0.0F;
        Horn2.rotateAngleY = 0.0F;
        Horn2.rotateAngleZ = 0.0F;
        Horn2.mirror = false;
        Beard = new ModelRenderer(this, 0, 9);
        Beard.addBox(-2F, 2.0F, -8F, 4, 2, 1, 0.0F);
        Beard.setRotationPoint(0.0F, 9F, -5F);
        Beard.rotateAngleX = 0.0F;
        Beard.rotateAngleY = 0.0F;
        Beard.rotateAngleZ = 0.0F;
        Beard.mirror = false;
        head = new ModelRenderer(this, 0, 12);
        head.addBox(-4F, -4F, -8F, 6, 6, 8, 0.0F);
        head.setRotationPoint(1.0F, 9F, -5F);
        head.rotateAngleX = 0.0F;
        head.rotateAngleY = 0.0F;
        head.rotateAngleZ = 0.0F;
        head.mirror = false;
        body = new ModelRenderer(this, 28, 0);
        body.addBox(-5F, -10F, -7F, 8, 16, 10, 0.0F);
        body.setRotationPoint(1.0F, 12F, 2.0F);
        body.rotateAngleX = 1.570796F;
        body.rotateAngleY = 0.0F;
        body.rotateAngleZ = 0.0F;
        body.mirror = false;
        leg1 = new ModelRenderer(this, 10, 0);
        leg1.addBox(-2F, 0.0F, -2F, 3, 9, 3, 0.0F);
        leg1.setRotationPoint(-2F, 15F, 8F);
        leg1.rotateAngleX = 0.0F;
        leg1.rotateAngleY = 0.0F;
        leg1.rotateAngleZ = 0.0F;
        leg1.mirror = false;
        leg2 = new ModelRenderer(this, 10, 0);
        leg2.addBox(-2F, 0.0F, -2F, 3, 9, 3, 0.0F);
        leg2.setRotationPoint(3F, 15F, 8F);
        leg2.rotateAngleX = 0.0F;
        leg2.rotateAngleY = 0.0F;
        leg2.rotateAngleZ = 0.0F;
        leg2.mirror = false;
        leg3 = new ModelRenderer(this, 10, 0);
        leg3.addBox(-2F, 0.0F, -2F, 3, 9, 3, 0.0F);
        leg3.setRotationPoint(-2F, 15F, -5F);
        leg3.rotateAngleX = 0.0F;
        leg3.rotateAngleY = 0.0F;
        leg3.rotateAngleZ = 0.0F;
        leg3.mirror = false;
        leg4 = new ModelRenderer(this, 10, 0);
        leg4.addBox(-2F, 0.0F, -2F, 3, 9, 3, 0.0F);
        leg4.setRotationPoint(3F, 15F, -5F);
        leg4.rotateAngleX = 0.0F;
        leg4.rotateAngleY = 0.0F;
        leg4.rotateAngleZ = 0.0F;
        leg4.mirror = false;
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	  	setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        Tail.render(par7);
        Horn1.render(par7);
        Horn2.render(par7);
        Beard.render(par7);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        Horn1.rotateAngleY = head.rotateAngleY;
        Horn1.rotateAngleX = head.rotateAngleX;
        Horn2.rotateAngleY = head.rotateAngleY;
        Horn2.rotateAngleX = head.rotateAngleX;
        Beard.rotateAngleY = head.rotateAngleY;
        Beard.rotateAngleX = head.rotateAngleX;
    }

    public ModelRenderer Tail;
    public ModelRenderer Horn1;
    public ModelRenderer Horn2;
    public ModelRenderer Beard;
}
