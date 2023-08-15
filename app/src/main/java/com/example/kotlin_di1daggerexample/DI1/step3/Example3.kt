package com.example.kotlin_di1daggerexample.DI1.step3

fun main() {
    val car = CarC()
    car.engine = Engine()
    car.start()
}