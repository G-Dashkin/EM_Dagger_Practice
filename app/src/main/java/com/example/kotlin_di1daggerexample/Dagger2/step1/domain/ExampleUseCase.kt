package com.example.kotlin_di1daggerexample.Dagger2.step1.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}