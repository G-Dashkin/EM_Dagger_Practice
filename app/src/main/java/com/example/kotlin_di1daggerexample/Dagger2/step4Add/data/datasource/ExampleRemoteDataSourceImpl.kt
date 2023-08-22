package com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}