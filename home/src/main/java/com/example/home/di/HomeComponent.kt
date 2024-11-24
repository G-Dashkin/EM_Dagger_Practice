package com.example.home.di

import com.example.home.HomeActivity
import dagger.Component

@Component(dependencies = [HomeDeps::class])
@HomeScope
interface HomeComponent {

    fun inject(activity: HomeActivity)

    @Component.Factory
    interface Factory {
        fun create(deps: HomeDeps): HomeComponent
    }
}