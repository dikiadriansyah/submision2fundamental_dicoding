package com.example.submision2fundamental

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splash_activity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, SPLASH_TIME_OUT)
    }

}