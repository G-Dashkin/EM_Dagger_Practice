package com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases

import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.models.UserName
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.repository.UserRepository
import javax.inject.Inject

// Также добавляем @Inject с конструктором, и делаем userRepository не приватной
class GetUserNameUseCase @Inject constructor(val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}