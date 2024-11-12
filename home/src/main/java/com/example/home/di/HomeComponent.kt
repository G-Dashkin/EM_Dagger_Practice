package com.example.home.di

import com.example.home.HomeActivity
import dagger.Component

@Component(dependencies = [HomeDeps::class])
@HomeScope
interface HomeComponent {

    fun inject(activity: HomeActivity)

    @Component.Builder
    interface Builder {
        fun addDeps(deps: HomeDeps): Builder
        fun build(): HomeComponent
    }
}