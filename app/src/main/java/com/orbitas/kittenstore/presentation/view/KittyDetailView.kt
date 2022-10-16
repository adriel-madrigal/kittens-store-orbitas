package com.orbitas.kittenstore.view.kittydetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.orbitas.kittenstore.R
import com.orbitas.kittenstore.presentation.view.viewmodel.KittyDetailViewModel

@Composable
fun KittyDetailView (kittyDetailViewModel: KittyDetailViewModel = KittyDetailViewModel()) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Cat"
        )
        Text(text = kittyDetailViewModel.catName)
        Text(text = "The cat is ${kittyDetailViewModel.catAge} years old")
        Text(text = kittyDetailViewModel.getCatGenre())
        Text(text = "The cat weight is ${kittyDetailViewModel.catWeight} kg")
    }
}

@Preview
@Composable
fun KittyDetailView_Preview() {
    val kittyDetailViewModel = KittyDetailViewModel()
    kittyDetailViewModel.catName = "Random Cat Name"
    kittyDetailViewModel.catAge = 6
    kittyDetailViewModel.catIsFemale = true
    kittyDetailViewModel.catWeight = 4.6f
    KittyDetailView(kittyDetailViewModel = kittyDetailViewModel)
}