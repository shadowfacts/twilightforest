package twilightforest.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.ResourceLocation;
import twilightforest.TwilightForestMod;

public class RenderTFMazeSlime extends RenderSlime {
    private static final ResourceLocation textureLoc = new ResourceLocation(TwilightForestMod.MODEL_DIR + "mazeslime.png");

	public RenderTFMazeSlime(RenderManager manager, ModelBase model, float shadowSize) {
		super(manager, model, shadowSize);
	}

	@Override
    protected ResourceLocation getEntityTexture(EntitySlime par1Entity)
    {
        return textureLoc;
    }
}
