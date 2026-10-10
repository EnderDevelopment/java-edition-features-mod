package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Hand;

public
class AirClickHandSwing {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.options.attackKey.isPressed()) {
                client.player.swingHand(Hand.MAIN_HAND);
            }
        });
    }
}
