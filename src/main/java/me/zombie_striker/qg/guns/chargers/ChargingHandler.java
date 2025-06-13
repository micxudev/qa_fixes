package me.zombie_striker.qg.guns.chargers;

import me.zombie_striker.qg.guns.Gun;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ChargingHandler {

    public boolean isCharging(Player player);

    public boolean shoot(Gun g, Player player, ItemStack stack);

    public String getName();

    String getDefaultChargingSound();
}
