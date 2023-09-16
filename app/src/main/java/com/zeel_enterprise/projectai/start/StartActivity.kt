package com.zeel_enterprise.projectai.start

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.zeel_enterprise.commonai.Ai
import com.zeel_enterprise.projectai.MainActivity
import com.zeel_enterprise.projectai.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        findViewById<CardView>(R.id.startLetsStart).setOnClickListener {
            Ai.start(this@StartActivity, MainActivity::class.java)
        }
        findViewById<TextView>(R.id.startShare).setOnClickListener {
            // TODO : Share
        }
        findViewById<TextView>(R.id.startRate).setOnClickListener {
            // TODO : Rate us
        }
        findViewById<TextView>(R.id.startPrivacyPolicy).setOnClickListener {
            // TODO : Privacy Policy
        }

    }
}