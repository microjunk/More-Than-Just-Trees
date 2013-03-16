package microjunk.trees.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWalkingTree extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape11;
    ModelRenderer Shape122;
    ModelRenderer Shape12;
    ModelRenderer Shape112;
    ModelRenderer Shape144;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape155;
    ModelRenderer Shape1556;
    ModelRenderer Shape156;
    ModelRenderer Shape157;
    ModelRenderer Shape158;

    public ModelWalkingTree()
    {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape1.setRotationPoint(-8.0F, 8.0F, -8.0F);
        this.Shape1.setTextureSize(64, 64);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 0, 0);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape11.setRotationPoint(-8.0F, -8.0F, -8.0F);
        this.Shape11.setTextureSize(64, 64);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
        this.Shape122 = new ModelRenderer(this, 0, 0);
        this.Shape122.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape122.setRotationPoint(-8.0F, -24.0F, -8.0F);
        this.Shape122.setTextureSize(64, 64);
        this.Shape122.mirror = true;
        this.setRotation(this.Shape122, 0.0F, 0.0F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 0, 32);
        this.Shape12.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape12.setRotationPoint(8.0F, -24.0F, 8.0F);
        this.Shape12.setTextureSize(64, 64);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
        this.Shape112 = new ModelRenderer(this, 0, 32);
        this.Shape112.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape112.setRotationPoint(-8.0F, -24.0F, 8.0F);
        this.Shape112.setTextureSize(64, 64);
        this.Shape112.mirror = true;
        this.setRotation(this.Shape112, 0.0F, 0.0F, 0.0F);
        this.Shape144 = new ModelRenderer(this, 0, 32);
        this.Shape144.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape144.setRotationPoint(-24.0F, -24.0F, 8.0F);
        this.Shape144.setTextureSize(64, 64);
        this.Shape144.mirror = true;
        this.setRotation(this.Shape144, 0.0F, 0.0F, 0.0F);
        this.Shape15 = new ModelRenderer(this, 0, 32);
        this.Shape15.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape15.setRotationPoint(8.0F, -24.0F, -8.0F);
        this.Shape15.setTextureSize(64, 64);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
        this.Shape16 = new ModelRenderer(this, 0, 32);
        this.Shape16.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape16.setRotationPoint(8.0F, -24.0F, -24.0F);
        this.Shape16.setTextureSize(64, 64);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
        this.Shape17 = new ModelRenderer(this, 0, 32);
        this.Shape17.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape17.setRotationPoint(-24.0F, -24.0F, -8.0F);
        this.Shape17.setTextureSize(64, 64);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
        this.Shape18 = new ModelRenderer(this, 0, 32);
        this.Shape18.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape18.setRotationPoint(-8.0F, -24.0F, -24.0F);
        this.Shape18.setTextureSize(64, 64);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
        this.Shape19 = new ModelRenderer(this, 0, 32);
        this.Shape19.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape19.setRotationPoint(-24.0F, -24.0F, -24.0F);
        this.Shape19.setTextureSize(64, 64);
        this.Shape19.mirror = true;
        this.setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
        this.Shape155 = new ModelRenderer(this, 0, 32);
        this.Shape155.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape155.setRotationPoint(-8.0F, -40.0F, -8.0F);
        this.Shape155.setTextureSize(64, 64);
        this.Shape155.mirror = true;
        this.setRotation(this.Shape155, 0.0F, 0.0F, 0.0F);
        this.Shape1556 = new ModelRenderer(this, 0, 32);
        this.Shape1556.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape1556.setRotationPoint(-8.0F, -40.0F, -24.0F);
        this.Shape1556.setTextureSize(64, 64);
        this.Shape1556.mirror = true;
        this.setRotation(this.Shape1556, 0.0F, 0.0F, 0.0F);
        this.Shape156 = new ModelRenderer(this, 0, 32);
        this.Shape156.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape156.setRotationPoint(8.0F, -40.0F, -8.0F);
        this.Shape156.setTextureSize(64, 64);
        this.Shape156.mirror = true;
        this.setRotation(this.Shape156, 0.0F, 0.0F, 0.0F);
        this.Shape157 = new ModelRenderer(this, 0, 32);
        this.Shape157.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape157.setRotationPoint(-8.0F, -40.0F, 8.0F);
        this.Shape157.setTextureSize(64, 64);
        this.Shape157.mirror = true;
        this.setRotation(this.Shape157, 0.0F, 0.0F, 0.0F);
        this.Shape158 = new ModelRenderer(this, 0, 32);
        this.Shape158.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16);
        this.Shape158.setRotationPoint(-24.0F, -40.0F, -8.0F);
        this.Shape158.setTextureSize(64, 64);
        this.Shape158.mirror = true;
        this.setRotation(this.Shape158, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
    	super.render(var1, var2, var3, var4, var5, var6, var7);
	  	setRotationAngles(var2, var3, var4, var5, var6, var7, var1);
        this.Shape1.render(var7);
        this.Shape11.render(var7);
        this.Shape122.render(var7);
        this.Shape12.render(var7);
        this.Shape112.render(var7);
        this.Shape144.render(var7);
        this.Shape15.render(var7);
        this.Shape16.render(var7);
        this.Shape17.render(var7);
        this.Shape18.render(var7);
        this.Shape19.render(var7);
        this.Shape155.render(var7);
        this.Shape1556.render(var7);
        this.Shape156.render(var7);
        this.Shape157.render(var7);
        this.Shape158.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity par7Entity)
    {
        super.setRotationAngles(var1, var2, var3, var4, var5, var6, par7Entity);
    }
}
