package com.example.kotlin_di1daggerexample.Dagger2.step3.di

import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleLocalDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleLocalDataSourceImpl
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleRemoteDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }


}