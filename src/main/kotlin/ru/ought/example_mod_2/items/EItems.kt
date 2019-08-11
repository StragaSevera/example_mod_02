package ru.ought.example_mod_2.items

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.item.Item

object EItems {
    private val itemsList = mutableListOf<Item>()
    val pineCone = ItemPineCone("Pine Cone").also(::addItem)

    fun register() {
        itemsList.forEach(::registerItem)
    }

    private fun addItem(item: Item) {
        itemsList.add(item)
    }

    private fun registerItem(item: Item) {
        val name = if (item is INamed) item.name else "Unnamed Item"
        GameRegistry.registerItem(item, name)
    }

}
