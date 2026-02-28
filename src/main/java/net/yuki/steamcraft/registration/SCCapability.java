package net.yuki.steamcraft.registration;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.yuki.steamcraft.blockentity.GeneratorEntity;

public class SCCapability {
    @SubscribeEvent  // on the mod event bus
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.EnergyStorage.BLOCK,
                SCBlockEntity.GENERATOR_ENTITY.get(),
                (GeneratorEntity blockEntity, net.minecraft.core.Direction side) ->
                        blockEntity.getEnergyStorage()
        );
    }
}
