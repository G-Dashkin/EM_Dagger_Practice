package com.example.kotlin_di1daggerexample.Dagger4.step2

// Класс Старков реализовывает интерфейс House
// this::class.simpleName просто возвращает имя класса
class Starks(
    allies: Allies
) : House {
    override fun prepareForWar() {
        //что-то происходит
        println("${this::class.simpleName} prepared for war")
    }

    override fun reportForWar() {
        //что-то происходит
        println("${this::class.simpleName} reporting...")
    }
}