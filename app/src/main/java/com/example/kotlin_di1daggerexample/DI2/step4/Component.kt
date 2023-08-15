package com.example.kotlin_dependencyinjectionexample.DI2.step4

class Component {

    private fun getComputer(): Computer {
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

    fun inject(activity: Activity) {
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }
}