package com.tabranks;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.tabranks.events.PlayerJoin;

public class TabRanks extends JavaPlugin {
	@Override
	public void onEnable() {
		checkPex(getServer().getPluginManager());
		registerEvents(getServer().getPluginManager());
	}
	
	private void checkPex(PluginManager pm) {
		if (pm.getPlugin("PermissionsEx") == null) {
			Bukkit.getLogger().info("Plugin requires PEX, disabling TabRanks.");
			pm.disablePlugin(this);
			return;
		}
	}
	
	private void registerEvents(PluginManager pm) {
		pm.registerEvents(new PlayerJoin(), this);
	}
}
