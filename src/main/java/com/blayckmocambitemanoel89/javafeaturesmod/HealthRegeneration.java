package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;

public
class HealthRegeneration {
    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                if (player.getHealth() < player.getMaxHealth() && player.getHungerManager().getFoodLevel() > 0) {
                    player.heal(0.1F);
                }
            }
        });
    }
}
