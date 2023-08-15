package com.example.kotlin_di1daggerexample.DI1.step2

class CarB(private val engine: Engine) {

    fun start(){
        engine.start()
    }
}