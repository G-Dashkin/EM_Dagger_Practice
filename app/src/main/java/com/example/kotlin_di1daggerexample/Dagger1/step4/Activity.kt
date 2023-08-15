package com.example.kotlin_di1daggerexample.Dagger1.step4

import javax.inject.Inject

class Activity {
    // Теперь сделаем тоже самое при помощи инъекции в поля.
    // Сделаем переменные типа lateinit полученные от соответствующих классов.
    // Добавляем аннотацию @Inject к каждому полю

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

//    При создании объекта DaggerNewComponent мы вызываем у него метод .inject() передав туда - this
    init {
        DaggerNewComponent4.create().inject(this)
    }
// Запускаем приложение и у нас так же все работает.
}