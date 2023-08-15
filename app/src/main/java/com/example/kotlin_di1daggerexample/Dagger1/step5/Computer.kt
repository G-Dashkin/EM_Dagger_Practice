package com.example.kotlin_di1daggerexample.Dagger1.step5

import javax.inject.Inject

class Computer @Inject constructor (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse,
)