package net.yuki.steamcraft.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.util.ItemStackMap;
import net.neoforged.neoforge.energy.EnergyStorage;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.yuki.steamcraft.registration.SCBlockEntity;


public class GeneratorEntity extends BlockEntity {
    public GeneratorEntity(BlockPos pos, BlockState state) {
        super(SCBlockEntity.GENERATOR_ENTITY.get(), pos, state);
    }
    int maxBurnTime = 30 * 20;
    int burnTime = 0;

    private final EnergyStorage energyStorage = new EnergyStorage(
            10000, // capacity
            100,   // max receive
            100,   // max extract
            0      // initial energy
    );


    public EnergyStorage getEnergyStorage() {
        return energyStorage;
    }


    public final ItemStackHandler inventory = new ItemStackHandler(1) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if(!level.isClientSide) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    public void burn() {
        ItemStack stack = inventory.getStackInSlot(0);
        if (burnTime > 0) {
            burnTime--;
        }
        if(burnTime == 0 && !stack.isEmpty()) {
            stack.shrink(1);
            burnTime = maxBurnTime;
        }
    }
}






