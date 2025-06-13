package me.zombie_striker.qg.guns.chargers;

import me.zombie_striker.qg.api.QualityArmory;
import me.zombie_striker.qg.guns.Gun;
import me.zombie_striker.qg.guns.utils.WeaponSounds;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RequireAimCharger implements ChargingHandler {

    public RequireAimCharger() {
        ChargingManager.add(this);
    }

    @Override
    public boolean isCharging(Player player) {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean shoot(Gun g, final Player player, ItemStack stack) {
        if (QualityArmory.isIronSights(player.getItemInHand())) {
            return true;
        }
        QualityArmory.addAmmoToInventory(player, g.getAmmoType(), 1);
        return false;
    }


    @Override
    public String getName() {

        return ChargingManager.REQUIREAIM;
    }

    @Override
    public String getDefaultChargingSound() {
        return WeaponSounds.SHOCKWAVE.getSoundName();
        //g.getChargingSound()
    }

}
