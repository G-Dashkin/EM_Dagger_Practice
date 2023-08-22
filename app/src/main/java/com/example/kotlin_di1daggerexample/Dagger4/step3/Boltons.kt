package com.example.kotlin_di1daggerexample.Dagger4.step3

import javax.inject.Inject

// Применем внедрение зависимости с использованием конструктора.
class Boltons @Inject constructor() : House {
    override fun prepareForWar() {
        //что-то происходит
        println("${this::class.simpleName} prepared for war");
    }

    override fun reportForWar() {
        //что-то происходит
        println("${this::class.simpleName} reporting..");
    }
}

// Зависимости Boltons и Starks используются в конструкторе класса War_WithDI, где мы должны это отметить.