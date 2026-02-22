package net.yuki.steamcraft.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.energy.EnergyStorage;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.yuki.steamcraft.registration.SCBlockEntity;


public class GeneratorBlockEntity extends BlockEntity {

    private EnergyStorage energyStorage = new EnergyStorage(10000, 100,100);

    public GeneratorBlockEntity(BlockPos pos, BlockState blockState) {
        super(SCBlockEntity.GENERATOR_ENTITY.get(), pos, blockState);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, GeneratorBlockEntity entity) {
    }

}
