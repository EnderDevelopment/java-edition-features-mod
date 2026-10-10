package com.blayckmocambitemanoel89.javafeaturesmod;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public
class CombatHandler {
    public static void register() {
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (player.getAttackCooldownProgress(0.5F) > 0.9F) {
                player.swingHand(hand);
                return ActionResult.SUCCESS;
            }
            return ActionResult.PASS;
        });
    }
}
