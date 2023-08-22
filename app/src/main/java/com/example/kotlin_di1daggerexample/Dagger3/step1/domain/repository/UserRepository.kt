package com.example.kotlin_di1daggerexample.Dagger3.step1.domain.repository

import com.example.kotlin_di1daggerexample.Dagger3.step1.domain.models.SaveUserNameParam
import com.example.kotlin_di1daggerexample.Dagger3.step1.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName

}