package net.ghosted.fragmentmod.item;

import net.ghosted.fragmentmod.FragmentMod;
import net.ghosted.fragmentmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MORE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FragmentMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MORE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STAREECH.get()))
            .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STAREECH.get());
                        pOutput.accept(ModItems.STAREECH_DUST.get());
                        pOutput.accept(ModItems.HASTER.get());
                        pOutput.accept(ModItems.STAREECH_SHOVEL.get());
                        pOutput.accept(ModItems.STAREECH_SWORD.get());
                        pOutput.accept(ModItems.STAREECH_AXE.get());
                        pOutput.accept(ModItems.STAREECH_HOE.get());
                        pOutput.accept(ModItems.STAREECH_PICKAXE.get());

                        pOutput.accept(ModBlocks.STAREECH_BLOCK.get());
                        pOutput.accept(ModBlocks.STAREECH_ORE.get());


                    }).build());





    public static void register(IEventBus eventBus) {
        CREATIVE_MORE_TABS.register(eventBus);
    }
}
