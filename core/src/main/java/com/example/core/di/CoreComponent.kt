package com.example.core.di

import dagger.Component

@Component(dependencies = [CoreDeps::class])
@CoreScope
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun addDeps(deps: CoreDeps): CoreComponent
    }
}