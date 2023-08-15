package com.example.kotlin_di1daggerexample.Dagger1.step1

import javax.inject.Inject

class Activity {

//    lateinit var computer: Computer убираем класс компьютер

//   Помечаем поле аннотацией @Inject, чтобы сделать инъекцию – по этой аннотации даггер понимает,
//   что в реализации метода inject() нужно взять все поля помеченные аннотацией @Inject и вставить
//   им значения. т.е. реализация будет примерно такая же.
    @Inject
    lateinit var keyboard: Keyboard

    init {
        // Вместо нашего компонента, мы получаем экземпляр класса DaggerNewComponent
        // Чтобы его создать необходимо вызвать метод .create() и мы у этого классы вызываем метод
        // inject() и передаем сюда это объект Activity – this
        DaggerNewComponent.create().inject(this)
    }
}