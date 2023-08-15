package com.example.kotlin_dependencyinjectionexample.DI2.step4

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}