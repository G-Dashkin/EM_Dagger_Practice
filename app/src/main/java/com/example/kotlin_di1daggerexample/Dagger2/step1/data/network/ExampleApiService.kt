package com.example.kotlin_di1daggerexample.Dagger2.step1.data.network

import android.util.Log

class ExampleApiService {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
    }

    companion object {

        private const val LOG_TAG = "MyLog"
    }
}