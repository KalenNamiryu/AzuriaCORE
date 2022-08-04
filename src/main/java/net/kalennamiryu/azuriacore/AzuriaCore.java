package net.kalennamiryu.azuriacore;

import net.kalennamiryu.azuriacore.setup.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AzuriaCore.MOD_ID)
public class AzuriaCore {
    public static final String MOD_ID = "azuriacore";

    public static final Logger LOGGER = LogManager.getLogger();

    public AzuriaCore() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register blocks, items & all other stuffs added by the mod
        registries(eventBus);

        eventBus.addListener(this::setup);

        // Init config files
        Config.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // nothing here for now
        });
    }

    private void registries(IEventBus eventBus) {
//        ModItems.register(eventBus);
//        ModBlocks.register(eventBus);

    }

}
