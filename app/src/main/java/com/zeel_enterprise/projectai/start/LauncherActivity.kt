package com.zeel_enterprise.projectai.start

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.zeel_enterprise.commonai.Ai
import com.zeel_enterprise.projectai.R

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        Handler(mainLooper).postDelayed({
            Ai.start(this@LauncherActivity, StartActivity::class.java)
        }, 1000)

    }
}