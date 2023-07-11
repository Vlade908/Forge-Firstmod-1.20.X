package net.vlade.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vlade.firstmod.FirstMod;
import net.vlade.firstmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIRST_TAB = CREATIVE_MODE_TABS.register("first_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                .title(Component.translatable("creativetab.first_tab"))
                .displayItems((pParameters, pOutput) -> {

                    //items que estarão na aba criativa do seu mod
                    pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                    pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                    pOutput.accept(ModBlocks.NETHERRACK_SAPPHIRE_ORE.get());
                    pOutput.accept(ModBlocks.ENDSTONE_SAPPHIRE_ORE.get());
                    pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    pOutput.accept(Moditems.SAPPHIRE.get());
                    pOutput.accept(Moditems.RAW_SAPPHIRE.get());


                })
                .build());

    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
