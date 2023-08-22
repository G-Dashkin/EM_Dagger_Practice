package com.example.kotlin_di1daggerexample.Dagger2.step4Add.di

import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleLocalDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleLocalDataSourceImpl
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleRemoteDataSource
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

// Если класс содержит методы без реализации, то нам никто не мешает сделать его интерфейсом и ключевое
// слово abstract можно убрать. И в название метода исправим на bind
@Module
interface DataModule {

    // Если нам нужно сообщить даггеру, что при использовании определенного интерфейса, нужно брать
    // определенную реализацию, то можно вместо аннотации @Provides использовать аннотацию @Binds
    // Реализацию этого метода можно удалить.
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}

// Если нам нужно, чтобы даггер умел предоставлять реализацию интерфейса, то способ с @Binds предпочтительнее.
// Так как в случае с использованием @Provides даггер будет создавать экземпляр нашего модуля и будет
// вызывать созданные нами методы, а в случае с использованием @Binds этот метод вызван не будет

// В итоге мы сделали, тоже что и было, но теперь у нас меньше кода, а приложение будет собираться быстрее
// Этот метод связывает интерфейс с реализацией, поэтому мы используем в названии слово – bind, как и аннотация @Binds
