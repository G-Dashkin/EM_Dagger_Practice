package com.example.kotlin_di1daggerexample.Dagger3.step3.di

import android.content.Context
import com.example.kotlin_di1daggerexample.Dagger3.step3.data.repository.UserRepositoryImpl
import com.example.kotlin_di1daggerexample.Dagger3.step3.data.storage.UserStorage
import com.example.kotlin_di1daggerexample.Dagger3.step3.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.repository.UserRepository
import dagger.Module
import dagger.Provides

// В DataModule предоставляется (провайдим) Storage и репозиторий
@Module
class DataModule {

    // Проставляем аннотации @Provides для provide-методов

    @Provides
    fun provideUserStorage(context: Context): UserStorage {
        return SharedPrefUserStorage(context = context)
    }

    @Provides
    fun provideUserRepositoryImpl(userStorage: UserStorage): UserRepository  {
        return UserRepositoryImpl(userStorage = userStorage)
    }

}