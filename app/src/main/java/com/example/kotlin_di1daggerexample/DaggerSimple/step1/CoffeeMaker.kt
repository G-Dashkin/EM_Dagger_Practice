package com.example.kotlin_di1daggerexample.DaggerSimple.step1

import javax.inject.Inject

class CoffeeMaker (private val heater: Heater, private val pump: Pump) {

    fun makeCoffee() {
        println("${heater.heatWater()} and ${pump.pumpWater()}")
    }

}