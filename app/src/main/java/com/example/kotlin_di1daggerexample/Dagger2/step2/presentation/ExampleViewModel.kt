package com.example.kotlin_di1daggerexample.Dagger2.step2.presentation

import com.example.kotlin_di1daggerexample.Dagger2.step2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase()
    }
}