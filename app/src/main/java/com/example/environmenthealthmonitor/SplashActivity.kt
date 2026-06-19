package com.example.environmenthealthmonitor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 2 seconds then start ConnectDeviceActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ConnectDeviceActivity::class.java))
            finish()
        }, 2000)
    }
}