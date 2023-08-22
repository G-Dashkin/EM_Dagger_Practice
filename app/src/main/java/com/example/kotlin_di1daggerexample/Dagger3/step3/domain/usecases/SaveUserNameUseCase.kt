package com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases

import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.models.SaveUserNameParam
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.repository.UserRepository
import javax.inject.Inject

// добавляем @Inject с конструктором, но переменную userRepository нужно сделать не приватной
class SaveUserNameUseCase @Inject constructor(val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name) {
            return true
        }
        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }

}