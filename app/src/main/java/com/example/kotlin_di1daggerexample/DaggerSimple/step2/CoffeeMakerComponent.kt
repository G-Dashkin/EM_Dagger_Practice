package com.example.kotlin_di1daggerexample.DaggerSimple.step2

import dagger.Component

@Component(modules = [CoffeeMakerModule::class])
interface CoffeeMakerComponent {
    fun getCoffeeMaker(): CoffeeMaker
}