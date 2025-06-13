package me.zombie_striker.qg.armor;

import me.zombie_striker.customitemmanager.MaterialStorage;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Helmet extends ArmorObject {

    public Helmet(String name, String displayname, List<String> lore, ItemStack[] ingredients, MaterialStorage ms,
                  double cost) {
        this(name, displayname, lore, ingredients, ms, cost, cost > 0);
    }

    public Helmet(String name, String displayname, List<String> lore, ItemStack[] ingredients, MaterialStorage ms,
                  double cost, boolean allowInShop) {
        super(name, displayname, lore, ingredients, ms, cost);

        setEnableShop(allowInShop);
    }
}