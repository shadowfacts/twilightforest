package twilightforest.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityGhast;

import twilightforest.client.model.ModelTFGhast;
import twilightforest.entity.EntityTFTowerGhast;

/**
 * This is a copy of the RenderGhast class that changes the model
 *
 */
public class RenderTFTowerGhast extends RenderTFGhast<EntityTFTowerGhast> {
	
    private float ghastScale = 8.0F;

	public RenderTFTowerGhast(RenderManager renderManager, ModelTFGhast modelTFGhast, float f) {
		super(renderManager, modelTFGhast, f);
	}

	public RenderTFTowerGhast(RenderManager renderManager, ModelTFGhast modelTFGhast, float f, float scale) {
		super(renderManager, modelTFGhast, f);
		this.ghastScale = scale;
	}
	
    @Override
    protected void preRenderCallback(EntityTFTowerGhast par1EntityLiving, float partialTicks)
    {
        EntityTFTowerGhast.AIAttack attackAI = par1EntityLiving.attackAI;
        float scaleVariable = (attackAI.prevAttackTimer + (attackAI.attackTimer - attackAI.prevAttackTimer) * partialTicks) / 20.0F;

        if (scaleVariable < 0.0F)
        {
            scaleVariable = 0.0F;
        }

        scaleVariable = 1.0F / (scaleVariable * scaleVariable * scaleVariable * scaleVariable * scaleVariable * 2.0F + 1.0F);
        float yScale = (ghastScale + scaleVariable) / 2.0F;
        float xzScale = (ghastScale + 1.0F / scaleVariable) / 2.0F;
        GlStateManager.scale(xzScale, yScale, xzScale);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}