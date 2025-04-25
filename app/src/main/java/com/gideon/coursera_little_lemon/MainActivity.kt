package com.gideon.coursera_little_lemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.gideon.coursera_little_lemon.ui.theme.Coursera_little_lemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Coursera_little_lemonTheme {
                AppScreen()
            }
        }
    }
}

@Composable
fun AppScreen() {
    ScrollableGalleryScreen()
}

