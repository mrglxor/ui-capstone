package com.bangkit.healtycare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    private lateinit var landing: Button
    private lateinit var register: Button
    private lateinit var login: Button
    private lateinit var home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(500)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        landing = findViewById(R.id.landing)
        register = findViewById(R.id.register)
        login = findViewById(R.id.login)
        home = findViewById(R.id.home)

        landing.setOnClickListener {
            startActivity(Intent(this,LandingActivity::class.java))
        }

        register.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

        login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}