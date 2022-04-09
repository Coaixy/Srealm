package icu.lyt311.me.core

import icu.lyt311.me.command.helpCommand
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.command.*
import taboolib.common.platform.function.getProxyPlayer
import taboolib.common.platform.function.onlinePlayers

@Suppress("unused")
@CommandHeader(
    name = "sr",
    aliases = ["srealm","realm"],
    permission = "srealm.use"
)
object Cmd {
    @CommandBody(
        optional = true,
        permissionDefault = PermissionDefault.TRUE
    )
    val help = helpCommand

}