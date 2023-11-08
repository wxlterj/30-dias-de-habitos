package com.example.a30diasdehabitos

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
import com.example.a30diasdehabitos.ui.theme._30diasdehabitosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30diasdehabitosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    _30DiasDeHabitosApp()
                }
            }
        }
    }
}

@Composable
fun _30DiasDeHabitosApp() {

}

@Preview
@Composable
fun _30DiasDeHabitosAppPreview() {
    _30diasdehabitosTheme {
        _30DiasDeHabitosApp()
    }
}