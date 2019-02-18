package com.tucker.bonemealdisabler;

import com.tucker.bonemealdisabler.events.BoneMeal;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BoneMealDisabler extends JavaPlugin implements Listener {

	private static BoneMealDisabler instance;

	@Override
	public void onEnable() {
		// Plugin startup logic

		System.out.println("Enabling BoneMealDisabler...");


		getConfig().options().copyDefaults(true);
		saveConfig();



		if (getConfig().getBoolean("enabled")) {

			getServer().getPluginManager().registerEvents(new BoneMeal(), this);


		}





	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
		System.out.println("Disabling BoneMealDisabler...");

	}


	public static BoneMealDisabler getInstance() {
		return instance;
	}
}
