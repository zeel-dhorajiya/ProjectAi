package com.zeel_enterprise.commonai

import android.app.Activity
import android.content.Intent
import android.os.Build

class Ai {

    companion object {

        fun start(context : Activity , clazz : Class<*>) {
            context.startActivity(Intent(context , clazz))
        }

        fun isBelowR() : Boolean {
            return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R).not()
        }

        fun isTiramisu() : Boolean {
            return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        }

    }

}