package com.orbitas.kittenstore.presentation.view.viewmodel

import androidx.lifecycle.ViewModel
import com.orbitas.kittenstore.data.KittyEntity

class KittyDetailViewModel : ViewModel() {

    var kitty = KittyEntity(
        name = "Kitty",
        age = 9,
        isFemale = true,
        weight = 4.5f
    )

    fun getCatGenre(): String {
        val genre = if (kitty.isFemale) {
            "Female"
        } else {
            "Male"
        }
        return "The cat is $genre"
    }
}