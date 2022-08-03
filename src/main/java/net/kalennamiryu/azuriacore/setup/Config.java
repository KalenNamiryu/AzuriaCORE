package net.kalennamiryu.azuriacore.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

// This class come from McJty 1.18 tutorial under MIT License, link in the CREDITS.txt
// Some modifications has been made
public class Config {
    
    public static void register() {
        registerClientConfigs();
        registerCommonConfigs();
        registerServerConfigs();
    }
    
    private static void registerClientConfigs() {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        // register config classes here
        
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_BUILDER.build(), "azuriacore-client.toml");
    }

    private static void registerCommonConfigs() {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        // register config classes here

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_BUILDER.build(), "azuriacore-common.toml");
    }

    private static void registerServerConfigs() {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

        // register config classes here

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_BUILDER.build(), "azuriacore-server.toml");
    }
}
