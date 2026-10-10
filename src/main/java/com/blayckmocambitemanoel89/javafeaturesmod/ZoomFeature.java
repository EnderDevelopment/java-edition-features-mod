package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public
class ZoomFeature {
    private static final KeyBinding ZOOM_KEY = new KeyBinding("key.javafeaturesmod.zoom", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, "category.javafeaturesmod");

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (ZOOM_KEY.wasPressed()) {
                client.options.getFovEffectScale().setValue(0.5F);
            } else if (ZOOM_KEY.wasReleased()) {
                client.options.getFovEffectScale().setValue(1.0F);
            }
        });
    }
}
