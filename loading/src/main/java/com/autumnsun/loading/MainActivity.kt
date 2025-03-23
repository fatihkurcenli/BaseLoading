package com.autumnsun.loading

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.autumnsun.loading.login.LoginScreen
import com.autumnsun.loading.theme.BaseLoadingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BaseLoadingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    LoginScreen("test")
                }
            }
        }
    }
}