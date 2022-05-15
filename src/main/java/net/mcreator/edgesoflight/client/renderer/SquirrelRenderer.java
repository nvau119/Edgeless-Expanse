
package net.mcreator.edgesoflight.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.edgesoflight.entity.SquirrelEntity;
import net.mcreator.edgesoflight.client.model.Modelcustom_model;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, Modelcustom_model<SquirrelEntity>> {
	public SquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquirrelEntity entity) {
		return new ResourceLocation("edges_of_light:textures/squirrelginger.png");
	}
}
