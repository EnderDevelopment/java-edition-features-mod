package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class JavaFeaturesMod implements ModInitializer {
    public static final String MOD_ID = "javafeaturesmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Java Features Mod");
        CombatHandler.register();
        ZoomFeature.register();
        HealthRegeneration.register();
        ItemDropHandler.register();
        AirClickHandSwing.register();
        CrouchingWithShield.register();
    }
}
