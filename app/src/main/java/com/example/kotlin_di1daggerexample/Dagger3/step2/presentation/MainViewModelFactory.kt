package com.example.kotlin_di1daggerexample.Dagger3.step2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_di1daggerexample.Dagger3.step2.domain.usecases.GetUserNameUseCase
import com.example.kotlin_di1daggerexample.Dagger3.step2.domain.usecases.SaveUserNameUseCase

class MainViewModelFactory(
    val getUserNameUseCase: GetUserNameUseCase,
    val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            getUserNameUseCase = getUserNameUseCase,
            saveUserNameUseCase = saveUserNameUseCase
        ) as T
    }

}