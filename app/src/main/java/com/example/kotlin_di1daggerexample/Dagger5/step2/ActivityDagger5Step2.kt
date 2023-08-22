package com.example.kotlin_di1daggerexample.Dagger5.step2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger5Step1Binding
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger5Step2Binding

class ActivityDagger5Step2 : AppCompatActivity() {
    private lateinit var binding: ActivityDagger5Step2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDagger5Step2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}