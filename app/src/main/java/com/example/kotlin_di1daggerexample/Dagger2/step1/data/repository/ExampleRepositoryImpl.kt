package com.example.kotlin_di1daggerexample.Dagger2.step1.data.repository

import com.example.kotlin_di1daggerexample.Dagger2.step1.data.datasource.ExampleLocalDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step1.data.datasource.ExampleRemoteDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step1.data.mapper.ExampleMapper
import com.example.kotlin_di1daggerexample.Dagger2.step1.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}