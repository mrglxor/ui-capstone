package com.bangkit.healtycare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var toLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        toLogin = findViewById(R.id.btnLogin)

        toLogin.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}