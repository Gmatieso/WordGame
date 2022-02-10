package com.example.wordguess

import android.app.Application

/* Application Class: A base class that contains global application
case for your entire app. its kinda a main object your OS uses to interact with your main app
there is always a default application class created by the OS if you not going to do anything special */
class wordGuessApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // initialize Timber
        //Timber.plant(Timber.DebugTree())
        /* You'll rarely add items in this application class
        always feel free to use android inbuilt log or timber log
        */
    }
}