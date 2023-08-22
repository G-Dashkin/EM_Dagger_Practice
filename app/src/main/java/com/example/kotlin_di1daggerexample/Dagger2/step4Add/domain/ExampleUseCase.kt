package com.example.kotlin_di1daggerexample.Dagger2.step4Add.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}