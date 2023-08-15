package com.example.kotlin_di1daggerexample.Dagger1.step2

import dagger.Component

@Component
interface NewComponent2 {

    fun getKeyboard(): Keyboard

//    fun inject(activity: Activity) Метод inject() закомментируем
}
