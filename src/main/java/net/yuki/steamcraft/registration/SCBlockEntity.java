package net.yuki.steamcraft.registration;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yuki.steamcraft.block.GeneratorBlock;
import net.yuki.steamcraft.blockentity.GeneratorBlockEntity;

import java.util.Set;
import java.util.function.Supplier;

import static net.yuki.steamcraft.SteamCraft.MODID;

public class SCBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MODID);
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GeneratorBlockEntity>> GENERATOR_ENTITY =
            BLOCK_ENTITY.register("generator_block_entity", () ->
                    new BlockEntityType<>(GeneratorBlockEntity::new, Set.of(SCBlock.COAL_GENERATOR.get()), null));
}
