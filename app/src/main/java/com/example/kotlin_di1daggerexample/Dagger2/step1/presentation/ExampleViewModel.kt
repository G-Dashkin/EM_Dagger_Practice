package com.example.kotlin_di1daggerexample.Dagger2.step1.presentation

import com.example.kotlin_di1daggerexample.Dagger2.step1.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase()
    }
}