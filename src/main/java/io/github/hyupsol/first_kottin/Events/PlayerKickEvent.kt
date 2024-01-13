package io.github.hyupsol.first_kottin.Events

import io.github.hyupsol.first_kottin.player.management.PlayerManager
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerKickEvent
import java.net.http.WebSocket.Listener

object PlayerKickEvent : Listener, org.bukkit.event.Listener {

    @EventHandler
    fun onPlayerKickEvent(e: PlayerKickEvent){
        PlayerManager.deletePlayer(e.player)
    }
}
