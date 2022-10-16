package com.orbitas.kittenstore.presentation.viewmodel

import com.orbitas.kittenstore.data.KittyEntity

class KittyListViewModel {

    val kitty = KittyEntity(
        name = "Kitty",
        age = 9,
        isFemale = true,
        weight = 4.5f
    )

    fun getKittyList(): List<KittyEntity> {
        return listOf(
            kitty,
            kitty,
            kitty,
            kitty,
            kitty,
            kitty,
            kitty
        )
    }
}