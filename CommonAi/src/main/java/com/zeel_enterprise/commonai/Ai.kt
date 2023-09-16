package com.zeel_enterprise.commonai

import android.app.Activity
import android.content.Intent

class Ai {

    companion object {

        fun start(context: Activity, clazz: Class<*>) {
            context.startActivity(Intent(context, clazz))
        }

    }

}