package net.bonsaistudios.endermanoverhaul.common.registry;

import net.bonsaistudios.endermanoverhaul.common.block.TinySkullBlock;
import net.bonsaistudios.endermanoverhaul.common.block.TinySkullWallBlock;
import net.bonsaistudios.endermanoverhaul.core.EndermanOverhaul;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, EndermanOverhaul.MOD_ID);
    public static final Block TINY_SKULL = registerBlock("tiny_skull", new TinySkullBlock());
    public static final Block TINY_SKULL_WALL = registerBlock("tiny_skull_wall", new TinySkullWallBlock());
    //public static final Block TINY_SKULL = new TinySkullBlock();

    //public static final Block TINY_SKULL_WALL = new WallBlock(AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque());

    private static <B extends Block> B registerBlock(String name, B block) {
        return BLOCKS.register(name, () -> block).get();
    }
}
