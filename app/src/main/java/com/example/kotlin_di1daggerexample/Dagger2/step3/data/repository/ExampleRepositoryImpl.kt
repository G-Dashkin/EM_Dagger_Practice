package com.example.kotlin_di1daggerexample.Dagger2.step3.data.repository
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleLocalDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleRemoteDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.mapper.ExampleMapper
import com.example.kotlin_di1daggerexample.Dagger2.step3.domain.ExampleRepository
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