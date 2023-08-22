package com.example.kotlin_di1daggerexample.Dagger3.step1.data.storage

import com.example.kotlin_di1daggerexample.Dagger3.step1.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}