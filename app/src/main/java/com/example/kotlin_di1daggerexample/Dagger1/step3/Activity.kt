package com.example.kotlin_di1daggerexample.Dagger1.step3

import javax.inject.Inject

class Activity {
    // Теперь сделаем тоже самое для мыши и монитора
    // Чтобы несколько раз не создавать компонент, создадим его один раз и получаем у этого компонента
    // все необходимые зависимости, для клавиатуры, мыши и монитора.
    val component = DaggerNewComponent3.create()
    val keyboard = component.getKeyboard()
    val mouse = component.getMouse()
    val monitor = component.getMonitor()
}