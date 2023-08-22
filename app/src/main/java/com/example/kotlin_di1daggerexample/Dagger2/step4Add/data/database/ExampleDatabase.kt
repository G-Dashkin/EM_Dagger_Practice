package com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.database

import android.util.Log
import javax.inject.Inject

//Теперь даггер умеет создавать экземпляр базы данных
class ExampleDatabase @Inject constructor() {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
    }

    companion object {

        private const val LOG_TAG = "MyLog"
    }
}