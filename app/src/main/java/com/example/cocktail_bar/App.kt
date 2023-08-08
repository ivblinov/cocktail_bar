package com.example.cocktail_bar

import android.app.Application
import android.util.Log
import androidx.room.Room

private const val TAG = "MyLog"
class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "onCreate: ")

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "db"
        ).build()
    }
}