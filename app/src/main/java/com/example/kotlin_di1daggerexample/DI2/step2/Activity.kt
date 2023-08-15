package com.example.kotlin_di1daggerexample.DI2.step2

class Activity {
    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
        Storage(),
        Memory(),
        Processor(),
    )
    val computer = Computer(
        monitor, computerTower, keyboard, mouse
    )
}