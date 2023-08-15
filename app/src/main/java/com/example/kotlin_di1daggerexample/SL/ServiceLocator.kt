package com.example.kotlin_di1daggerexample.SL

object ServiceLocator {
    fun getEngine(): Engine = Engine()
}