package icu.lyt311.me

import icu.lyt311.me.command.View
import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.ProxyPlayer
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.mainCommand
import taboolib.common.platform.command.subCommand
import taboolib.common.platform.function.getProxyPlayer
import taboolib.common.platform.function.onlinePlayers

@CommandHeader("Srealm")
object Cmd {

    @CommandBody
    val main = mainCommand {
        /**
         * 查看玩家信息
         * Srealm View {player_name}
         */
        literal("view"){
            dynamic(optional = false) {
                suggestion<ProxyPlayer>(uncheck = true) { sender, context ->
                    onlinePlayers().map { it.name }
                }
                execute<ProxyPlayer> { sender, context, argument ->
                    getProxyPlayer(argument)?.let { View.run(sender, it) }
                }
            }
        }
    }
    /**
     * 输出版本号
     * 测试时使用
     */
    @CommandBody(optional = true)
    val version = subCommand {
        execute<ProxyCommandSender> { sender, context, argument ->
            onlinePlayers().forEach { it.sendMessage("Srealm Version 1.0.0") }
        }
    }


}