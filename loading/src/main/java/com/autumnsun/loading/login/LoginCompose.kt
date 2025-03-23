package com.autumnsun.loading.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(name: String, modifier: Modifier = Modifier) {
    Column (Modifier.background(Color.Green).padding(32.dp)){
        Text(
            text = "Hello $name!!",
            modifier = modifier
        )
        Text(
            text = "Hello $name!!",
            modifier = modifier
        )
        Text(
            text = "Hello $name!!",
            modifier = modifier
        )
    }
}
