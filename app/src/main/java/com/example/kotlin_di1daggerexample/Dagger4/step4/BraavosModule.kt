package com.example.kotlin_di1daggerexample.Dagger4.step4

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// Данный модуль будет снабжать нас двумя зависимостями — Cash и Soldiers.

// Все модули необходимо пометить аннотацией @Module, а методы, предоставляющие зависимости — @Provides.
@Module // Модуль
class BraavosModule(
    private val cash: Cash,
    private val soldiers: Soldiers
) {

    @Provides // Предоставляет зависимость Cash
    fun provideCash(): Cash {
        return cash
    }

    @Provides // Предоставляет зависимость Soldiers
    fun provideSoldiers(): Soldiers {
        return soldiers
    }
}