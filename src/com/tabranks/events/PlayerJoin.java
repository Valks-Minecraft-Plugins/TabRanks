package com.tabranks.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PlayerJoin implements Listener {
	@EventHandler
	private void playerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		PermissionUser user = PermissionsEx.getUser(p);
		p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', user.getPrefix() + e.getPlayer().getName()));
	}
}
