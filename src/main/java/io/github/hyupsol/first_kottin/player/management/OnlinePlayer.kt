package io.github.hyupsol.first_kottin.player.management

import java.util.*

data class OnlinePlayer(
            val uuid : UUID,
            var displayName:String,
            var job:String,
            var rank:String,
            var prefix:String,
            var money: ULong
    )