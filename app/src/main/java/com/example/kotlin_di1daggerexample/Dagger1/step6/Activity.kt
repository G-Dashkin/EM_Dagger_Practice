package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import javax.inject.Inject

class Activity {
    // Теперь заинжектим компьютер в эту активити.
    // Для этого нам нужно также добавить аннотацию @Inject на Storage, Memory, Processor, ComputerTower
    // и Computer, чтобы Dagger знал как создать все зависимости для компьютера.

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent6.create().inject(this)
    }

}