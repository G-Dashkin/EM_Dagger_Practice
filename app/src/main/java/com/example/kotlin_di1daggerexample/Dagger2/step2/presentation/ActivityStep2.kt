package com.example.kotlin_di1daggerexample.Dagger2.step2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.database.ExampleDatabase
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.datasource.ExampleLocalDataSourceImpl
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.mapper.ExampleMapper
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.network.ExampleApiService
import com.example.kotlin_di1daggerexample.Dagger2.step2.data.repository.ExampleRepositoryImpl
import com.example.kotlin_di1daggerexample.Dagger2.step2.domain.ExampleUseCase
import com.example.kotlin_di1daggerexample.databinding.ActivityStep2Binding

class ActivityStep2 : AppCompatActivity() {

    private lateinit var biding: ActivityStep2Binding
    private lateinit var viewModel: ExampleViewModel

    private lateinit var useCase: ExampleUseCase
    private lateinit var repositoryImpl: ExampleRepositoryImpl
    private lateinit var localDataSourceImpl: ExampleLocalDataSourceImpl
    private lateinit var remoteDataSourceImpl: ExampleRemoteDataSourceImpl
    private lateinit var mapper: ExampleMapper
    private lateinit var dataDatabase: ExampleDatabase
    private lateinit var apiService: ExampleApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityStep2Binding.inflate(layoutInflater)
        setContentView(biding.root)

        // Это  пример того как бы мы реализовывали это приложение без внедрения зевисимостей.
        // Если запустить это приложение, то оно будет работать, но мы получаем кучу лишнего кода

        dataDatabase = ExampleDatabase()
        apiService = ExampleApiService()
        localDataSourceImpl = ExampleLocalDataSourceImpl(dataDatabase)
        remoteDataSourceImpl = ExampleRemoteDataSourceImpl(apiService)

        mapper = ExampleMapper()
        repositoryImpl = ExampleRepositoryImpl(localDataSourceImpl, remoteDataSourceImpl, mapper)

        useCase = ExampleUseCase(repositoryImpl)
        viewModel = ExampleViewModel(useCase)

        viewModel.method()
    }
}