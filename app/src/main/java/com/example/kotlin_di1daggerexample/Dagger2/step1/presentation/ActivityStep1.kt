package com.example.kotlin_di1daggerexample.Dagger2.step1.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.databinding.ActivityStep1Binding

class ActivityStep1 : AppCompatActivity() {

    private lateinit var binding : ActivityStep1Binding
    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStep1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // У вьюМодели вызывается ее метод, но сама вью Модель не проинициализирована
        // при запуске приложение упадет.
        // Чтобы проинициализировать вьюМодель нужно передать реализацию юзкейса, а чтобы
        // А чтобы создать юзкейс нужно передать реализацию репозитория и т.д.
        viewModel.method()
        // Если мы запустим приложение сейчас то оно упадет.
    }
}