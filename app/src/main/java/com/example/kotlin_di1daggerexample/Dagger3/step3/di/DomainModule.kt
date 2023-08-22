package com.example.kotlin_di1daggerexample.Dagger3.step3.di

import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.repository.UserRepository
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases.GetUserNameUseCase
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases.SaveUserNameUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// В DomainModule предоставляются юзкейсы.
@Module
class DomainModule {

    // Проставляем аннотации @Provides для provide-методов

//    @Provides
//    fun provideGetUserNameUseCase(userRepository: UserRepository): GetUserNameUseCase {
//        return GetUserNameUseCase(userRepository = userRepository)
//    }
//
//    @Provides
//    fun provideSaveUserNameUserCase(userRepository: UserRepository): SaveUserNameUseCase {
//        return SaveUserNameUseCase(userRepository = userRepository)
//    }

}