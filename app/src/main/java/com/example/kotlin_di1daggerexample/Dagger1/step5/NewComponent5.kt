package com.example.kotlin_di1daggerexample.Dagger1.step5

import dagger.Component

@Component
interface NewComponent5 {
    fun inject(activity: Activity)
}
