package com.example.kotlin_di1daggerexample.DI1.step3

class CarC() {

    lateinit var engine: Engine

    fun start(){
        engine.start()
    }
}