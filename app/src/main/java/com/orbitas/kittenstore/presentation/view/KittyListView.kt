package com.orbitas.kittenstore.presentation.view


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.orbitas.kittenstore.presentation.view.viewmodel.KittyDetailViewModel
import com.orbitas.kittenstore.presentation.viewmodel.KittyListViewModel
import com.orbitas.kittenstore.view.kittydetail.KittyDetailView

@Composable
fun KittyListView (kittyListViewModel: KittyListViewModel = KittyListViewModel()) {
    LazyColumn {
        items(kittyListViewModel.getKittyList()) { kitty ->
            val kittyDetailViewModel = KittyDetailViewModel()
            kittyDetailViewModel.kitty = kitty
            KittyDetailView(kittyDetailViewModel)
        }
    }
}

@Preview
@Composable
fun KittyListView_Preview() {
    KittyListView()
}