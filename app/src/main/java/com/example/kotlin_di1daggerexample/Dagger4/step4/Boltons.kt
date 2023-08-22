package com.example.kotlin_di1daggerexample.Dagger4.step4

import javax.inject.Inject

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
