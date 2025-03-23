package com.autumnsun.baseloading

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.autumnsun.loading.MainActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
    }
}