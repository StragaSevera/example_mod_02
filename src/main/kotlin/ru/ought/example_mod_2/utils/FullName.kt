package ru.ought.example_mod_2.utils

import ru.ought.example_mod_2.MODID

data class FullName(val name: String, val unlocalisedName: String, val textureName: String) {
    constructor(name: String) : this(
            name,
            unlocalisedName = MODID + "_" + name.toLowerCase().replace(' ', '_'),
            textureName = MODID + ":" + name.toLowerCase().replace(' ', '_')
    )
}