package me.zombie_striker.qg.armor;

import me.zombie_striker.customitemmanager.MaterialStorage;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Helmet extends ArmorObject {

	public Helmet(String name, String displayname, List<String> lore, ItemStack[] ing, MaterialStorage st,
				  double cost) {
		this(name, displayname, lore, ing, st, cost, cost > 0);
	}

	public Helmet(String name, String displayname, List<String> lore, ItemStack[] ing, MaterialStorage st,
			double cost, boolean allowInShop) {
		super(name, displayname, lore, ing, st, cost);
		this.setEnableShop(allowInShop);
	}

}
