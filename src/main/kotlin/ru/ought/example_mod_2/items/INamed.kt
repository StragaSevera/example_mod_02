package ru.ought.example_mod_2.items

import ru.ought.example_mod_2.utils.FullName

interface INamed {
    val fullName: FullName
    val name: String
        get() = fullName.name
}
