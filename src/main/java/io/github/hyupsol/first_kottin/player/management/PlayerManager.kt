package io.github.hyupsol.first_kottin.player.management

import org.bukkit.entity.Player
import io.github.hyupsol.first_kottin.Main

@Suppress("DEPRECATION")
object PlayerManager {
    private var onlinePlayerData = HashMap<Player, OnlinePlayer>()

    fun addPlayer(player: Player){
        val newOnlinePlayer = OnlinePlayer(player.uniqueId, player.displayName, "jobless","unranked","[뉴비]", 1000u)
        onlinePlayerData[player] = newOnlinePlayer
        Main.instance!!.logger.info("플레이어 데이터를 추가하였습니다.")
    }

    fun deletePlayer(player: Player){
        onlinePlayerData.remove(player)
        Main.instance!!.logger.info("플레이어 데이터를 삭제하였습니다.")
    }

    fun getPlayerData(player: Player) : OnlinePlayer?{
        return onlinePlayerData[player]
    }

}