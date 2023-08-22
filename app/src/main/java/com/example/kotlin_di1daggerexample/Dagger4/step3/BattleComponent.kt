package com.example.kotlin_di1daggerexample.Dagger4.step3

import dagger.Component

// @Component — это мост между генерируемым кодом и зависимостями. Также @Component говорит Dagger 2 @Module @Privides,
// как необходимо внедрять зависимость.
@Component
interface BattleComponent {
    fun getWar(): War_WithDagger
}

// Этот интерфейс будет реализован классом, который сгенерирует Dagger 2 @Module @Privides, а функция getWar() вернет
// экземпляр War, который мы сможем использовать в подходящем месте.

// Далее необходимо пересобрать (rebuild) проект!