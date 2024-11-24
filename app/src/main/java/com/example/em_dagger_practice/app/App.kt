package com.example.em_dagger_practice.app

import android.app.Application
import com.example.core.di.CoreDepsProvider
import com.example.em_dagger_practice.di.AppComponent
import com.example.em_dagger_practice.di.DaggerAppComponent
import com.example.home.di.HomeDepsProvider

class App: Application() {

    private lateinit var instance: App
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initDagger()
        instance = this
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.create()
        CoreDepsProvider.deps = appComponent
        HomeDepsProvider.deps = appComponent
    }

}