package com.bangkit.healtycare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class LandingActivity : AppCompatActivity() {
    private lateinit var register: Button
    private lateinit var toLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(500)
        installSplashScreen()
        setContentView(R.layout.activity_landing)

        register = findViewById(R.id.btnStarted)
        toLogin = findViewById(R.id.toLogin)

        register.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
        toLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}