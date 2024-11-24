package com.example.home.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class HomeViewModel(
    private val someId: Int
): ViewModel() {

    private val _id = MutableLiveData(someId)
    val id: LiveData<Int> = _id

}

@AssistedFactory
interface HomeViewModelFactoryAssisted {
    fun  create(studentId: Int): HomeViewModelFactory
}

class HomeViewModelFactory @AssistedInject constructor(
    @Assisted private val someId: Int
):  ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(
        modelClass: Class<T>,
        extras: CreationExtras,
    ): T {
        return HomeViewModel(
            someId = someId
        ) as T
    }
}