package com.example.kotlin_di1daggerexample.Dagger2.step1.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step1.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}