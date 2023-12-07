package com.example.wedigitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    lateinit var logInButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logInButton = findViewById(R.id.log_in_btn)

        logInButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}