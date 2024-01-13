package io.github.hyupsol.first_kottin

import io.github.hyupsol.first_kottin.Events.PlayerJoinEvent
import io.github.hyupsol.first_kottin.Events.PlayerKickEvent
import io.github.hyupsol.first_kottin.Events.PlayerQuitEvent

object EventManager {
    fun registerEvents(){
        Main.instance?.let {
            it.server.pluginManager.run {
                registerEvents(PlayerJoinEvent, it)
                registerEvents(PlayerKickEvent, it)
                registerEvents(PlayerQuitEvent, it)
            }
        }
    }
}