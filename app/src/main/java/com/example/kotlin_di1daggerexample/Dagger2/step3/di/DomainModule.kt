package com.example.kotlin_di1daggerexample.Dagger2.step3.di

import com.example.kotlin_di1daggerexample.Dagger2.step3.data.repository.ExampleRepositoryImpl
import com.example.kotlin_di1daggerexample.Dagger2.step3.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}