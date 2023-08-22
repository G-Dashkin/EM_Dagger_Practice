package com.example.kotlin_di1daggerexample.Dagger2.step2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}