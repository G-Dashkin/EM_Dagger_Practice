package com.example.kotlin_di1daggerexample.DaggerSimple.step2

fun main() {
    val coffeeMakerComponent = DaggerCoffeeMakerComponent.create()
    val coffeeMaker = coffeeMakerComponent.getCoffeeMaker()
    coffeeMaker.makeCoffee()
}