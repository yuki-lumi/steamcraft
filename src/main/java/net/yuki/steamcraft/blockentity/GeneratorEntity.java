package net.yuki.steamcraft.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.energy.EnergyStorage;
import net.yuki.steamcraft.registration.SCBlockEntity;


public class GeneratorEntity extends BlockEntity {
    public GeneratorEntity(BlockPos pos, BlockState state) {
        super(SCBlockEntity.GENERATOR_ENTITY.get(), pos, state);
    }
    private final EnergyStorage energyStorage = new EnergyStorage(
            10000, // capacity
            100,   // max receive
            100,   // max extract
            0      // initial energy
    );
    public EnergyStorage getEnergyStorage() {
        return energyStorage;
    }
}
