package io.github.hyupsol.first_kottin

import io.github.hyupsol.first_kottin.player.management.PlayerManager
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object{
        var instance : Main? = null
    }

    override fun onEnable() {
        instance = this
        EventManager.registerEvents()
        CommnadManager.registcommnad()
    }

    override fun onDisable() {
    }
}
