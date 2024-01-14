package io.github.hyupsol.first_kottin.Commands

import io.github.hyupsol.first_kottin.player.management.PlayerManager
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object StatusCommand : CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player){
            sender.sendMessage("플레이어만 사용이 가능합니다.")
            return false
        }
        val player = sender.player
        PlayerManager.getPlayerData(player!!)?.let {
            player.run {
                sendMessage("----------------------------")
                sendMessage("이름 : ${it.displayName}")
                sendMessage("직업 : ${it.job}")
                sendMessage("랭크 : ${it.rank}")
                sendMessage("칭호 : ${it.prefix}")
                sendMessage("소지 금액 : ${it.money}")
                sendMessage("----------------------------")
            }
        }
        return true
    }
}