package com.example.kotlin_di1daggerexample.Dagger1.step3

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower =
            ComputerTower(
                Storage(),
                Memory(),
                Processor(),
            )
        return Computer(
            monitor,
            computerTower,
            keyboard,
            mouse
        )
    }

    fun inject(activity: Activity) {
//        activity.computer = getComputer() Удаляем инъекцию из класса Component{}
//        activity.keyboard = Keyboard() и удаляем клавиатуру
    }
}