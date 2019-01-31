package com.alaaeddinalbarghoth.wonderfullslashscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        finish()
    }
}
