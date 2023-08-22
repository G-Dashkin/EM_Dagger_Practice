package com.example.kotlin_di1daggerexample.DaggerSimple.step2

import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule {

    @Provides
    fun provideHeater():Heater {
        return Heater()
    }

    @Provides
    fun providePump():Pump {
        return Pump()
    }
}