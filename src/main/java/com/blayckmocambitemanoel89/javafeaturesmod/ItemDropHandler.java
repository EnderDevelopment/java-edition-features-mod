package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.lwjgl.glfw.GLFW;

public
class ItemDropHandler {
    private static final KeyBinding DROP_KEY = new KeyBinding("key.javafeaturesmod.drop", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Q, "category.javafeaturesmod");

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (DROP_KEY.wasPressed()) {
                PlayerInventory inventory = client.player.getInventory();
                ItemStack itemStack = inventory.getMainHandStack();
                if (!itemStack.isEmpty()) {
                    client.player.dropItem(itemStack, true);
                    inventory.setStack(inventory.selectedSlot, ItemStack.EMPTY);
                }
            }
        });
    }
}
