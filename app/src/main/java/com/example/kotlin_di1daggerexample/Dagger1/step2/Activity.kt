package com.example.kotlin_di1daggerexample.Dagger1.step2

import com.example.kotlin_di1daggerexample.Dagger1.step1.DaggerNewComponent
import javax.inject.Inject

class Activity {
// Здесь мы реализуем получение зависимостей при помощи геттера. Ранее мы просто создавали геттер и
// внутри писали его реализацию.
// Сделает тоже самое при помощи даггера. В интерфейсе создаем геттер на клавиатуру и он возвращает
// объект клавиатуры. Как и раньше, реализацию писать самим не нужно, ее за нас сделает даггер.

// Убираем аннотацию @Inject из поля keyboard и сразу присвоим здесь необходимое значение
//    @Inject
//    lateinit var keyboard: Keyboard
    val keyboard: Keyboard = DaggerNewComponent2.create().getKeyboard()


// а блок init {} можно удалить, так как мы сами вызываем геттер и даггер ничего не “инжектит” в
// данную переменную, мы это делаем внучную.
//    init {
//        DaggerNewComponent.create().inject(this)
//    }
}