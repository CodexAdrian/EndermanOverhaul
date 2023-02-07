package net.bonsaistudios.endermanoverhaul.client.model.entity;

import net.bonsaistudios.endermanoverhaul.core.EndermanOverhaul;
import net.bonsaistudios.endermanoverhaul.common.entity.base.BaseEnderman;
import net.bonsaistudios.endermanoverhaul.common.entity.base.EndermanType;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EndermanModel <E extends BaseEnderman> extends AnimatedGeoModel<E> {
    private final EndermanType type;
    public boolean carryingBlock;
    public boolean angry;

    public EndermanModel(EndermanType type) {
        this.type = type;
    }

    @Override
    public Identifier getModelLocation(E entity) {
        return type.model();
    }

    @Override
    public Identifier getTextureLocation(E entity) {
        return type.texture();
    }

    @Override
    public Identifier getAnimationFileLocation(E animatable) {
        return new Identifier(EndermanOverhaul.MOD_ID, "animations/enderman.animation.json");
    }
}
