package me.zombie_striker.qg.guns.projectiles;

import me.zombie_striker.qg.guns.Gun;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public interface RealtimeCalculationProjectile {

    public String getName();

    public void spawn(final Gun g, final Location starting, final Player player, final Vector dir);
}
