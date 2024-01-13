package io.github.hyupsol.first_kottin.Events

import io.github.hyupsol.first_kottin.player.management.PlayerManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object PlayerJoinEvent : Listener{

    @EventHandler
    fun onPlayerJoinEvent(e : PlayerJoinEvent) {
        PlayerManager.addPlayer(e.player)
    }

}