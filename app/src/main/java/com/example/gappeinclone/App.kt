package com.example.gappeinclone

import android.app.Application
import com.example.gappeinclone.data.AppPreference
import com.gappein.sdk.Gappein

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppPreference.init(this)
        Gappein.initialize()
    }

}