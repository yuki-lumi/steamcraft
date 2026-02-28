package net.yuki.steamcraft.registration;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.yuki.steamcraft.blockentity.GeneratorEntity;

import java.util.function.Supplier;

import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.MOD_ID;



public class SCBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MOD_ID);

    public static final Supplier<BlockEntityType<GeneratorEntity>> GENERATOR_ENTITY = BLOCK_ENTITY_TYPES.register(
            "generator_entity",
            // The block entity type, created using a builder.
            () -> BlockEntityType.Builder.of(
                            // The supplier to use for constructing the block entity instances.
                            GeneratorEntity::new,
                            // A vararg of blocks that can have this block entity.
                            // This assumes the existence of the referenced blocks as DeferredBlock<Block>s.
                            SCBlock.COAL_GENERATOR.get()
                    )
                    // Build using null; vanilla does some datafixer shenanigans with the parameter that we don't need.
                    .build(null)
    );
}
