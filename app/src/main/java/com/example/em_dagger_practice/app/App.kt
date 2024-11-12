package com.example.em_dagger_practice.app

import android.app.Application
import com.example.core.di.CoreDepsProvider
import com.example.em_dagger_practice.di.DaggerAppComponent
import com.example.em_dagger_practice.di.DaggerProvider
import com.example.home.di.HomeDepsProvider

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger()
        instance = this
    }

    private fun initDagger() {
        val appComponent = DaggerAppComponent.create()
        DaggerProvider.appComponent = appComponent
        CoreDepsProvider.deps = appComponent
        HomeDepsProvider.deps = appComponent


//            .builder()
//            .appModule(AppModule(this))
//            .build()
//        DaggerProvider.appComponent = appComponent
//        StartFeatureDepsProvider.deps = appComponent
//        AuthFeatureDepsProvider.deps = appComponent
//        HomeFeatureDepsProvider.deps = appComponent
//        ProjectsFeatureDepsProvider.deps = appComponent
//        AccountsFeatureDepsProvider.deps = appComponent
    }
    companion object {
        lateinit var instance: App private set
    }

}