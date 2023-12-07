package com.example.wedigitapp

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {

    private lateinit var button: Button

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView

    private lateinit var animationButton: Animation
    private lateinit var animationText: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        button = findViewById(R.id.explore_btn)
        textView1 = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)

        animationButton  = AnimationUtils.loadAnimation(this, R.anim.animate_btn)
        animationText = AnimationUtils.loadAnimation(this, R.anim.animate_texts)

        button.animation = animationButton

        textView1.animation = animationText
        textView2.animation = animationText

        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}