package io.github.hyupsol.first_kottin

import io.github.hyupsol.first_kottin.Commands.StatusCommand

object CommnadManager {
    fun registcommnad(){
        Main.instance?.let{
            it.server.run{
                getPluginCommand("status")!!.setExecutor(StatusCommand)
            }
        }
    }
}