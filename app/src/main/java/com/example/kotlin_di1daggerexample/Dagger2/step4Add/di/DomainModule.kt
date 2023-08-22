package com.example.kotlin_di1daggerexample.Dagger2.step4Add.di


import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.repository.ExampleRepositoryImpl
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.domain.ExampleRepository
import dagger.Binds
import dagger.Module

// Сделаем тоже самое в Domain – модуле.
@Module
interface DomainModule {

    @Binds
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}

// Запустим приложение и у нас так же в лог выводятся сообщения.