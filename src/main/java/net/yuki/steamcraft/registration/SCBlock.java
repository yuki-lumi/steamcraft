package net.yuki.steamcraft.registration;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.yuki.steamcraft.SteamCraft.ITEMS;
import static net.yuki.steamcraft.SteamCraft.MODID;

public class SCBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> COAL_GENERATOR = BLOCKS.registerSimpleBlock("coal_generator", BlockBehaviour.Properties.of().strength(2f).explosionResistance(20f));
    public static final DeferredItem<BlockItem> COAL_GENERATOR_ITEM = ITEMS.registerSimpleBlockItem("coal_generator", COAL_GENERATOR);
}
