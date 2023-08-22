package com.example.kotlin_di1daggerexample.Dagger2.step4Add.presentation

import com.example.kotlin_di1daggerexample.Dagger2.step4Add.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase()
    }
}