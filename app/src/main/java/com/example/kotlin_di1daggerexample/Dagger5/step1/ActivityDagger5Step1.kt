package com.example.kotlin_di1daggerexample.Dagger5.step1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger5Step1Binding

class ActivityDagger5Step1 : AppCompatActivity() {

    private lateinit var binding: ActivityDagger5Step1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDagger5Step1Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}