package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ShieldItem;

public
class CrouchingWithShield {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            PlayerEntity player = client.player;
            if (player != null && player.isSneaking() && player.getMainHandStack().getItem() instanceof ShieldItem) {
                player.setSprinting(false);
            }
        });
    }
}
