package com.example.wmpet.ui

import android.app.Application
import com.google.firebase.FirebaseApp

class WatchMyPetApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (FirebaseApp.getApps(this).isEmpty()) {
            FirebaseApp.initializeApp(this)
        }
    }
}