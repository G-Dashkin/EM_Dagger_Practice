package com.example.kotlin_di1daggerexample.Dagger1.step5

import javax.inject.Inject

class ComputerTower @Inject constructor (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor,
)