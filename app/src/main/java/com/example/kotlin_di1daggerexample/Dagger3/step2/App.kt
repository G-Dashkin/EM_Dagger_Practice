package com.example.kotlin_di1daggerexample.Dagger3.step2

import android.app.Application
import com.example.kotlin_di1daggerexample.Dagger3.step2.di.AppComponent
import com.example.kotlin_di1daggerexample.Dagger3.step2.di.AppModule
import com.example.kotlin_di1daggerexample.Dagger3.step2.di.DaggerAppComponent

class App: Application() {

    // В App мы настроили Dagger и стартуем его.
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(context = this)).build()
    }


}