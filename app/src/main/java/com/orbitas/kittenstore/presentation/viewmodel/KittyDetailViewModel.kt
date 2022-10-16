package com.orbitas.kittenstore.presentation.view.viewmodel

import androidx.lifecycle.ViewModel

class KittyDetailViewModel : ViewModel() {

    var catName = "This is your cats name"
    var catAge = 7
    var catIsFemale = true
    var catWeight = 4.5f

    fun getCatGenre(): String {
        val genre = if (catIsFemale) {
            "Female"
        } else {
            "Male"
        }
        return "The cat is $genre"
    }
}