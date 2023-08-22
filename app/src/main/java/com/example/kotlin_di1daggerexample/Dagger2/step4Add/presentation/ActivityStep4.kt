package com.example.kotlin_di1daggerexample.Dagger2.step4Add.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.di.DaggerApplicationComponent
import com.example.kotlin_di1daggerexample.databinding.ActivityStep4Binding
import javax.inject.Inject

class ActivityStep4 : AppCompatActivity() {

    // Используем инъекцию в поля ВьюМодели
    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component = DaggerApplicationComponent.create()
    private lateinit var biding: ActivityStep4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        biding = ActivityStep4Binding.inflate(layoutInflater)
        setContentView(biding.root)

        viewModel.method()
    }
}