package pl.panszelescik.colorize.common.handler;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import pl.panszelescik.colorize.common.api.MaterialBlockHandler;

public class ConcretePowderBlockHandler extends MaterialBlockHandler {

    public ConcretePowderBlockHandler() {
        super(CONCRETE_POWDERS);
    }

    private static final Object2ObjectOpenHashMap<DyeColor, Block> CONCRETE_POWDERS = new Object2ObjectOpenHashMap<>(16);

    static {
        CONCRETE_POWDERS.put(DyeColor.WHITE, Blocks.WHITE_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.LIME, Blocks.LIME_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.PINK, Blocks.PINK_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.GRAY, Blocks.GRAY_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.CYAN, Blocks.CYAN_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.BLUE, Blocks.BLUE_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.BROWN, Blocks.BROWN_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.GREEN, Blocks.GREEN_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.RED, Blocks.RED_CONCRETE_POWDER);
        CONCRETE_POWDERS.put(DyeColor.BLACK, Blocks.BLACK_CONCRETE_POWDER);
    }
}
