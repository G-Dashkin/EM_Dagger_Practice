package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import javax.inject.Inject

class Computer (
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse,
)