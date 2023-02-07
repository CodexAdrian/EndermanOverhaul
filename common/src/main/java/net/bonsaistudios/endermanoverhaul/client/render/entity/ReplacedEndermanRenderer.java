package net.bonsaistudios.endermanoverhaul.client.render.entity;

import net.bonsaistudios.endermanoverhaul.client.model.entity.ReplacedEndermanModel;
import net.bonsaistudios.endermanoverhaul.common.entity.ReplacedEnderman;
import net.bonsaistudios.endermanoverhaul.core.EndermanOverhaul;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;
@Environment(EnvType.CLIENT)
public class ReplacedEndermanRenderer extends GeoReplacedEntityRenderer<ReplacedEnderman> {
    public ReplacedEndermanRenderer(EntityRendererFactory.Context context) {
        super(context, new ReplacedEndermanModel(), new ReplacedEnderman());
        EndermanOverhaul.registerReplacedEntity(ReplacedEnderman.class, this);
    }

//    @Override
//    public RenderLayer getRenderType(Object animatable, float partialTicks, MatrixStack stack,
//                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
//                                     Identifier textureLocation) {
//        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
//    }
}
