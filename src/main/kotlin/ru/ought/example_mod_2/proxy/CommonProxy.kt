package ru.ought.example_mod_2.proxy

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import ru.ought.example_mod_2.items.EItems

open class CommonProxy {
    @Suppress("UNUSED_PARAMETER")
    fun pre(e: FMLPreInitializationEvent) {
        EItems.register()
    }

    @Suppress("UNUSED_PARAMETER")
    fun init(e: FMLInitializationEvent) {

    }

    @Suppress("UNUSED_PARAMETER")
    fun post(e: FMLPostInitializationEvent) {

    }
}