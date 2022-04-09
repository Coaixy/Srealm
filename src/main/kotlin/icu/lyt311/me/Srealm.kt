package icu.lyt311.me

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info
import taboolib.common.platform.function.releaseResourceFile

object Srealm : Plugin() {

    override fun onEnable() {
        info("Successfully running Srealm")


        releaseResourceFile("config.yml")
    }
}