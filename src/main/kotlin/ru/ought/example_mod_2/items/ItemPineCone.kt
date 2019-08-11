package ru.ought.example_mod_2.items

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemFood
import ru.ought.example_mod_2.utils.FullName

class ItemPineCone(name: String) : ItemFood(3, 0.3f, true), INamed {
    override val fullName = FullName(name).also { println(it) }

    init {
        unlocalizedName = fullName.unlocalisedName
        setTextureName(fullName.textureName)
        creativeTab = CreativeTabs.tabFood
    }
}


