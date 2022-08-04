package net.kalennamiryu.azuriacore.event;

import net.kalennamiryu.azuriacore.AzuriaCore;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

// This class come from Kaupenjoe 1.18 tutorial under MIT License, link in the CREDITS.txt
@Mod.EventBusSubscriber(modid = AzuriaCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

    }

    // REGISTER CLIENT EVENTS HERE

}
