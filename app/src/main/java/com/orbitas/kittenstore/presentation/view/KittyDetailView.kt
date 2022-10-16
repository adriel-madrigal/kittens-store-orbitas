package com.orbitas.kittenstore.view.kittydetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.orbitas.kittenstore.R
import com.orbitas.kittenstore.data.KittyEntity
import com.orbitas.kittenstore.presentation.view.viewmodel.KittyDetailViewModel

@Composable
fun KittyDetailView (kittyDetailViewModel: KittyDetailViewModel = KittyDetailViewModel()) {
    val kitty = kittyDetailViewModel.kitty
    Column {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Cat"
        )
        Text(text = kitty.name)
        Text(text = "The cat is ${kitty.age} years old")
        Text(text = kittyDetailViewModel.getCatGenre())
        Text(text = "The cat weight is ${kitty.weight} kg")
    }
}

@Preview
@Composable
fun KittyDetailView_Preview() {
    val kittyDetailViewModel = KittyDetailViewModel()
    var kitty = KittyEntity(
        "Sola",
        6,
        true,
        4.7f
    )
    kittyDetailViewModel.kitty = kitty
    KittyDetailView(kittyDetailViewModel = kittyDetailViewModel)
}