package com.example.kotlin_di1daggerexample.DaggerSimple.step2

import javax.inject.Inject

class CoffeeMaker @Inject constructor(private val heater: Heater, private val pump: Pump) {

    fun makeCoffee() {
        println("${heater.heatWater()} and ${pump.pumpWater()}")
    }

}