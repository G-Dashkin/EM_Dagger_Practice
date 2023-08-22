package com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.repository

import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleLocalDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleRemoteDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.mapper.ExampleMapper
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
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