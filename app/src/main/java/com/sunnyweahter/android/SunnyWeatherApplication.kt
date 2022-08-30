package com.sunnyweahter.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
        const val TOKEN = "1CrgjAeFkf0fGXPj"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}