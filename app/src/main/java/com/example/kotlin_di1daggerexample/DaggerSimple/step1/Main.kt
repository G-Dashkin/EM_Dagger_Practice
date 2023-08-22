package com.example.kotlin_di1daggerexample.DaggerSimple.step1

fun main() {
    val pump = Pump()
    val heater = Heater()
    val coffeeMaker = CoffeeMaker(heater, pump)
    coffeeMaker.makeCoffee()
}