package com.example.kotlin_di1daggerexample.DI2.step3

class Component {

    fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor(),
        )
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}