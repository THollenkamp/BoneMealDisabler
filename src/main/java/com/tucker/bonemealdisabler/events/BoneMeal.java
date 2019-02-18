package com.tucker.bonemealdisabler.events;

import com.tucker.bonemealdisabler.BoneMealDisabler;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BoneMeal implements Listener {

	private static BoneMealDisabler instance;

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e)
	{

		if (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getPlayer().getInventory().getItemInHand().getType().equals(Material.INK_SACK))
		{
			e.setCancelled(true);
		}
	}
}
