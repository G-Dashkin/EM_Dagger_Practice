package com.example.kotlin_di1daggerexample.Dagger2.step1.data.database

import android.util.Log

class ExampleDatabase {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
    }

    companion object {

        private const val LOG_TAG = "MyLog"
    }
}