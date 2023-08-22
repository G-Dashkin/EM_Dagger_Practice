package com.example.kotlin_di1daggerexample.Dagger2.step3.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger2.step3.di.DaggerApplicationComponent
import com.example.kotlin_di1daggerexample.databinding.ActivityStep3Binding
import javax.inject.Inject

class ActivityStep3 : AppCompatActivity() {

    // Используем инъекцию в поля ВьюМодели
    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component = DaggerApplicationComponent.create()
    private lateinit var biding: ActivityStep3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        biding = ActivityStep3Binding.inflate(layoutInflater)
        setContentView(biding.root)

        viewModel.method()

    }
}