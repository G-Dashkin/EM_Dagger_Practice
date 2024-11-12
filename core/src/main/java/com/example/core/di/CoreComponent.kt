package com.example.core.di

import dagger.Component

@Component(dependencies = [CoreDeps::class])
@CoreScope
interface CoreComponent {
//    fun inject()

    @Component.Builder
    interface Builder {
        fun addDeps(deps: CoreDeps): Builder
        fun build(): CoreComponent
    }
}