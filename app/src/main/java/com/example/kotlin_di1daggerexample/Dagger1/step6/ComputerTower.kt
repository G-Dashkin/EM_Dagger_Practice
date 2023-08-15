package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import javax.inject.Inject

class ComputerTower (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor,
)