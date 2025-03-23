package com.autumnsun.loading.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(name: String, modifier: Modifier = Modifier) {
    Column {
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
