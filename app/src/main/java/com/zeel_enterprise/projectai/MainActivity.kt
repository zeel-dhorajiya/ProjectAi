package com.zeel_enterprise.projectai

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.zeel_enterprise.commonai.Ai
import com.zeel_enterprise.projectai.start.SettingActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.mainSetting).setOnClickListener {
            Ai.start(this@MainActivity, SettingActivity::class.java)
        }
        findViewById<ImageView>(R.id.mainStatus).setOnClickListener {
            Ai.start(this@MainActivity, StatusSaverActivity::class.java)
        }

    }
}