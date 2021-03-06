package twilightforest.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import twilightforest.TwilightForestMod;
import twilightforest.client.model.ModelTFSlimeBeetle;
import twilightforest.entity.EntityTFSlimeBeetle;

public class RenderTFSlimeBeetle extends RenderLiving<EntityTFSlimeBeetle> {
    private static final ResourceLocation textureLoc = new ResourceLocation(TwilightForestMod.MODEL_DIR + "slimebeetle.png");

	public RenderTFSlimeBeetle(RenderManager manager, ModelBase par1ModelBase, float shadowSize) {
		super(manager, par1ModelBase, shadowSize);
		this.shadowSize = 1.1f;
		addLayer(new LayerInner());
	}

    @Override
    protected ResourceLocation getEntityTexture(EntityTFSlimeBeetle par1Entity)
    {
        return textureLoc;
    }

	// todo verify
	class LayerInner implements LayerRenderer<EntityTFSlimeBeetle> {
        private final ModelBase innerModel = new ModelTFSlimeBeetle(true);

        @Override
        public void doRenderLayer(EntityTFSlimeBeetle entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
            if (!entitylivingbaseIn.isInvisible())
            {
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                this.innerModel.setModelAttributes(RenderTFSlimeBeetle.this.getMainModel());
                this.innerModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
            }
        }

        @Override
        public boolean shouldCombineTextures() {
            return false;
        }
    }
}
