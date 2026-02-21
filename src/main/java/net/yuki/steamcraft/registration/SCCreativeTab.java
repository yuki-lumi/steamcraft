package net.yuki.steamcraft.registration;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.yuki.steamcraft.SteamCraft.MODID;

public class SCCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> Steamcraft = CREATIVE_MODE_TABS.register("steamcraft", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.steamcraft"))
            .displayItems((parameters, output) -> {
                output.accept(SCBlock.COAL_GENERATOR_ITEM.get());
            }).icon(() -> SCBlock.COAL_GENERATOR_ITEM.get().getDefaultInstance())
            .build());
}
