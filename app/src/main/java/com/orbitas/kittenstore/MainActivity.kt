package com.orbitas.kittenstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.orbitas.kittenstore.presentation.view.KittyListView
import com.orbitas.kittenstore.ui.theme.KittenStoreTheme
import com.orbitas.kittenstore.view.kittydetail.KittyDetailView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KittenStoreTheme {
                // A surface container using the 'background' color from the theme
                KittyListView()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KittenStoreTheme {
        Greeting("Android")
    }
}