package net.yuki.steamcraft.registration;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yuki.steamcraft.block.GeneratorCoal;
import net.yuki.steamcraft.blockentity.GeneratorEntity;

import static net.yuki.steamcraft.SteamCraft.ITEMS;
import static net.yuki.steamcraft.SteamCraft.MODID;

public class SCBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<GeneratorCoal> COAL_GENERATOR =
            BLOCKS.register("coal_generator", () -> new GeneratorCoal(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE)));
    public static final DeferredItem<BlockItem> COAL_GENERATOR_ITEM = ITEMS.registerSimpleBlockItem("coal_generator", COAL_GENERATOR);
}
