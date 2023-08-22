package com.example.kotlin_di1daggerexample.Dagger2.step2.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}