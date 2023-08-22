package com.example.kotlin_di1daggerexample.Dagger3.step2.di

import com.example.kotlin_di1daggerexample.Dagger3.step2.presentation.DaggerActivity3Step2
import dagger.Component

// Dagger используем кодагенерацию т.е. в момент билдинга приложения это все у нас собирается и потом
// используется.  Преимущетсво в том, что если у нас где то выскачит ошибка, то мы увидим ее в момент
// компиляции приложения.

// В AppComponent  нужно добавлять методы с входящим аргументом того типа, где мы хотим делать inject
@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {

    // В AppComponent мы инжектим MainActivity
    fun inject(daggerActivity3Step2: DaggerActivity3Step2)
}