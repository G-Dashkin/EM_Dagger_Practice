package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import dagger.Component

// Модуль ComputerModule необходимо положить в компонент.
// в квадратные скобки передаем все модули.

@Component(modules = [ComputerModule::class])
interface NewComponent6 {
    fun inject(activity: Activity)
}

// Таким образом – Module предоставляет зависимости в том случае если у нас нет возможности навесить
// аннотацию @Inject на конструктор и нам нужно самим создавать экземпляр класса.
// Например, если мы получаем его из какой то библиотеки.

