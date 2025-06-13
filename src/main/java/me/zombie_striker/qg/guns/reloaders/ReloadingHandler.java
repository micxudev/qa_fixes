package me.zombie_striker.qg.guns.reloaders;

import me.zombie_striker.qg.guns.Gun;
import org.bukkit.entity.Player;

public interface ReloadingHandler {

    public boolean isReloading(Player player);

    public double reload(Player player, Gun g, int amountReloading);

    public String getName();

    String getDefaultReloadingSound();
}
