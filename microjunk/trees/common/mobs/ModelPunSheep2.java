package microjunk.trees.common.mobs;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;

public class ModelPunSheep2 extends ModelQuadruped
{

    public ModelPunSheep2()
    {
        super(12, 0.0F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-3F, -4F, -6F, 6, 6, 8, 0.0F);
        head.setRotationPoint(0.0F, 6F, -8F);
        body = new ModelRenderer(this, 28, 8);
        body.addBox(-4F, -10F, -7F, 8, 16, 6, 0.0F);
        body.setRotationPoint(0.0F, 5F, 2.0F);
    }
}
