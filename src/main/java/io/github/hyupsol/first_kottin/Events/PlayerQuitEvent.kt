package io.github.hyupsol.first_kottin.Events

import io.github.hyupsol.first_kottin.player.management.PlayerManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

object PlayerQuitEvent : Listener{
    @EventHandler
    fun onPlayerQuitEvent(e: PlayerQuitEvent){
        PlayerManager.deletePlayer(e.player)
    }

}