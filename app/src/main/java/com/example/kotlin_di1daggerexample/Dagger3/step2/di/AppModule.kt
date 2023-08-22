package com.example.kotlin_di1daggerexample.Dagger3.step2.di

import android.content.Context
import com.example.kotlin_di1daggerexample.Dagger3.step2.domain.usecases.GetUserNameUseCase
import com.example.kotlin_di1daggerexample.Dagger3.step2.domain.usecases.SaveUserNameUseCase
import com.example.kotlin_di1daggerexample.Dagger3.step2.presentation.MainViewModelFactory
import dagger.Module
import dagger.Provides

// В AppModule у нас предоставляется контекст и фэктори
// В AppModule у нас есть контекст и мы предоставляем ViewModelFactory
@Module
class AppModule(val context: Context) {

    // Проставляем аннотации @Provides для provide-методов

    // контекст
    @Provides
    fun provideContext(): Context {
        return context
    }

    // фэктори
    @Provides
    fun provideMainViewModelFactory(
        getUserNameUseCase: GetUserNameUseCase,
        saveUserNameUseCase: SaveUserNameUseCase
    ) : MainViewModelFactory {
        return MainViewModelFactory(
            getUserNameUseCase = getUserNameUseCase,
            saveUserNameUseCase = saveUserNameUseCase
        )
    }
}