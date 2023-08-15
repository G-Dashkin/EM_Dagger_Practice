package com.example.kotlin_di1daggerexample.SL

class CarSL {
    private val engine = ServiceLocator.getEngine()

    fun start() {
        engine.start()
    }
}