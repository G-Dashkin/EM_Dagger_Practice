package com.example.kotlin_di1daggerexample.Dagger4.step4

import dagger.Component

// Укажем компоненту BattleComponent реализовывать методы getCash() и getSoldiers().
// Vодуль добавлен в объявление аннотации @Component. Это говорит о том, что компонент будет содержать
// внутри себя данный модуль
@Component(modules = [BraavosModule::class])
interface BattleComponent {
    fun getWar(): War_WithDagger
    // Доп.методы методы
    fun getCash(): Cash
    fun getSoldiers(): Soldiers
}

