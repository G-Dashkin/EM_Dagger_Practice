package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

class Component {

//    private fun getComputer(): Computer {
//        val monitor = Monitor()
//        val keyboard = Keyboard()
//        val mouse = Mouse()
//        val computerTower =
//            ComputerTower(
//                Storage(),
//                Memory(),
//                Processor(),
//            )
//        return Computer(
//            monitor,
//            computerTower,
//            keyboard,
//            mouse
//        )
//    }

    fun inject(activity: Activity) {
//        activity.computer = getComputer() Удаляем инъекцию из класса Component{}
//        activity.keyboard = Keyboard() и удаляем клавиатуру
    }
}