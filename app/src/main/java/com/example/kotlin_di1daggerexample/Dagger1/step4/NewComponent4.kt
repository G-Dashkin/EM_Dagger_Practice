package com.example.kotlin_di1daggerexample.Dagger1.step4

import dagger.Component

@Component
interface NewComponent4 {
//    Теперь необходимо сказать даггеру, что в эту активити необходимо “заинжектить” все поля
//    fun getKeyboard(): Keyboard
//    fun getMouse(): Mouse
//    fun getMonitor(): Monitor

//    Возвращаем метод inject() и удаляем другие методы. И при создании этого объекта мы получаем
//    DaggerNewComponent и вызываем у него метод .inject() передав туда - this
    fun inject(activity: Activity)

}
