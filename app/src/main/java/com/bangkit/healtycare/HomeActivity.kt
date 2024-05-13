package com.bangkit.healtycare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var landing: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        landing = findViewById(R.id.btnNotif)

        landing.setOnClickListener {
            startActivity(Intent(this,LandingActivity::class.java))
        }
    }
}