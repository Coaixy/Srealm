package icu.lyt311.me.command

import taboolib.common.platform.ProxyCommandSender
import taboolib.common.platform.command.subCommand

val a = "Srealm"
val helpCommand = subCommand {
    execute<ProxyCommandSender> { sender, _, _ ->
        sender.sendMessage("&a/&e$a &bhelp &c- &a查看主帮助(当前).")
        sender.sendMessage("&a/&e$a &bview [玩家名]&c- &a获取玩家的信息")
    }
}