package com.example.kotlin_di1daggerexample.Dagger2.step3.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor(){

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService")
    }

    companion object {

        private const val LOG_TAG = "MyLog"
    }
}