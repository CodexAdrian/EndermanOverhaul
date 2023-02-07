package net.bonsaistudios.endermanoverhaul.common.registry;

import net.bonsaistudios.endermanoverhaul.common.effect.FriendermanEffect;
import net.bonsaistudios.endermanoverhaul.core.EndermanOverhaul;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModEffects {
    public static final PollinatedRegistry<StatusEffect> EFFECTS = PollinatedRegistry.create(Registry.STATUS_EFFECT, EndermanOverhaul.MOD_ID);
    public static final Supplier<FriendermanEffect> FRIENDERMAN_EFFECT = EFFECTS.register("frienderman", () -> new FriendermanEffect());
}
