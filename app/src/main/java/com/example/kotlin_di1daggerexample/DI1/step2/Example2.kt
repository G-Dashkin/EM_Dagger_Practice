package com.example.kotlin_di1daggerexample.DI1.step2

fun main() {
    val engine = Engine()
    val car = CarB(engine)
    car.start()
}