package com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step3.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}