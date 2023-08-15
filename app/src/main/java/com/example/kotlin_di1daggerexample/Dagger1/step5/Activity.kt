package com.example.kotlin_di1daggerexample.Dagger1.step5

import javax.inject.Inject

class Activity {
    // Теперь заинжектим компьютер в эту активити.
    // Для этого нам нужно также добавить аннотацию @Inject на Storage, Memory, Processor, ComputerTower
    // и Computer, чтобы Dagger знал как создать все зависимости для компьютера.

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent5.create().inject(this)
    }

}