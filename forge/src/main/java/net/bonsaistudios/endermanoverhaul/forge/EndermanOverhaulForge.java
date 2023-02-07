package net.bonsaistudios.endermanoverhaul.forge;

import net.bonsaistudios.endermanoverhaul.core.EndermanOverhaul;
import dev.architectury.platform.forge.EventBuses;
import io.github.padlocks.EndermanOverhaul.client.render.entity.BadlandsHoodRenderer;
import io.github.padlocks.EndermanOverhaul.common.item.BadlandsHoodItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EndermanOverhaul.MOD_ID)
@Mod.EventBusSubscriber(modid = EndermanOverhaul.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EndermanOverhaulForge {
    public EndermanOverhaulForge() {
        EndermanOverhaul.PLATFORM.setup();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(EndermanOverhaul.MOD_ID, modBus);
    }
//
//    @SubscribeEvent
//    public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {
//        GeoArmorRenderer.registerArmorRenderer(BadlandsHoodItem.class, () -> new BadlandsHoodRenderer());
//    }
}
