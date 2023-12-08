package com.example.wedigitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PatternMatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var logInButton: Button
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logInButton = findViewById(R.id.log_in_btn)
        emailInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)

        logInButton.setOnClickListener {
            val email: String = emailInput.text.toString().trim()
            val password: String = passwordInput.text.toString().trim()
            if (validEmailAndPassword(email, password)) {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }
    }

    private fun validEmailAndPassword(email: String, password: String): Boolean {
        val emailPattern: Regex =
            Regex("^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")

        if (email.isEmpty()) {
            showError("Email Required", "Enter email")
            return false
        } else if (!email.matches(emailPattern)) {
            showError("Invalid Email", "Enter a valid email")
            return false
        } else if (password.isEmpty()) {
            showError(
                "Password Required",
                "Enter password"
            )
            return false
        } else if (password.length < 8) {
            showError(
                "Invalid Password",
                "Password must be at least 8 characters"
            )
            return false
        }
        return true
    }

    private fun showError(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Try again") { _, _ ->

            }
            .create()
            .show()
    }
}