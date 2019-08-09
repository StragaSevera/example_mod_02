package ru.ought.example_mod_2

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import ru.ought.example_mod_2.proxy.CommonProxy

@Mod(modid = "example_mod_2", name = "Example Mod 2", version = "1.7.10-0.0.1")
object ExampleMod2 {
    @JvmStatic
    @SidedProxy(clientSide = "ru.ought.example_mod_2.proxy.ClientProxy", serverSide = "ru.ought.example_mod_2.proxy.CommonProxy")
    lateinit var proxy: CommonProxy

    @JvmStatic
    @Mod.InstanceFactory
    fun instance() = ExampleMod2

    @Mod.EventHandler
    fun pre(e: FMLPreInitializationEvent) {
        proxy.pre(e)
    }

    @Mod.EventHandler
    fun init(e: FMLInitializationEvent) {
        proxy.init(e)
    }

    @Mod.EventHandler
    fun post(e: FMLPostInitializationEvent) {
        proxy.post(e)
    }
}