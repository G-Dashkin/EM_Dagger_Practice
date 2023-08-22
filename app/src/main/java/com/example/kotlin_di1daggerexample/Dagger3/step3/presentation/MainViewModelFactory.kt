package com.example.kotlin_di1daggerexample.Dagger3.step3.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases.GetUserNameUseCase
import com.example.kotlin_di1daggerexample.Dagger3.step3.domain.usecases.SaveUserNameUseCase
import javax.inject.Inject

// в MainViewModelFactory добавим @Inject с конструктором.
class MainViewModelFactory @Inject constructor(
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