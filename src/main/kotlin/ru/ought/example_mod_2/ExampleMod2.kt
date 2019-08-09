package ru.ought.example_mod_2

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.block.Block
import net.minecraft.enchantment.Enchantment
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import ru.ought.example_mod_2.proxy.CommonProxy

const val MODID = "example_mod_2"
const val VERSION = "1.7.10-0.0.1"

@Mod(modid = MODID, name = "Example Mod 2", version = VERSION)
object ExampleMod2 {
    @JvmStatic
    @SidedProxy(clientSide = "ru.ought.example_mod_2.proxy.ClientProxy", serverSide = "ru.ought.example_mod_2.proxy.CommonProxy")
    lateinit var proxy: CommonProxy

    @JvmStatic
    @Mod.InstanceFactory // В качестве инстанса всегда подаем синглтончик
    fun instance() = ExampleMod2

    @Mod.EventHandler
    fun pre(e: FMLPreInitializationEvent) {
        proxy.pre(e)
    }

    @Mod.EventHandler
    fun init(e: FMLInitializationEvent) {
        proxy.init(e)
        GameRegistry.addRecipe(ItemStack(Items.apple), "XXX", "XXX", "XXX", 'X', Blocks.leaves)
        GameRegistry.addShapelessRecipe(ItemStack(Items.dye, 2, 1), Items.redstone, ItemStack(Items.dye, 1, 1))
        GameRegistry.addSmelting(Blocks.stone, ItemStack(Blocks.stonebrick), 0.1f)

        val sword = ItemStack(Items.stone_sword)
        sword.addEnchantment(Enchantment.sharpness, 1)
        GameRegistry.addShapelessRecipe(sword, Items.flint, Items.stone_sword)
    }

    @Mod.EventHandler
    fun post(e: FMLPostInitializationEvent) {
        proxy.post(e)
    }
}
