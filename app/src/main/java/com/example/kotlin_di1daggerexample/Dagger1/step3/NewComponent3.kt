package com.example.kotlin_di1daggerexample.Dagger1.step3

import dagger.Component

@Component
interface NewComponent3 {
    // Сделаем тоже самое для мыши и монитора, создаем методы в интерфейсе
    fun getKeyboard(): Keyboard
    fun getMouse(): Mouse
    fun getMonitor(): Monitor
}
