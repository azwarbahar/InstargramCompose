package com.example.instargramcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.instargramcompose.ui.views.InstagramHome
import com.example.instargramcompose.ui.theme.InstagramComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramComposeTheme() {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    InstagramHome()
                }
            }
        }
    }
}

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun previewApp(){
    InstagramHome()
}
