package com.example.kotlin_di1daggerexample.Dagger4.step3

import javax.inject.Inject

// Применем внедрение зависимости с использованием конструктора.
class Starks @Inject constructor() : House {
    override fun prepareForWar() {
        //что-то происходит
        println("${this::class.simpleName} prepared for war")
    }

    override fun reportForWar() {
        //что-то происходит
        println("${this::class.simpleName} reporting...")
    }
}