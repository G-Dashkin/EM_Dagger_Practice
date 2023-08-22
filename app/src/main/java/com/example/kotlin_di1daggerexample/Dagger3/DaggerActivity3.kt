package com.example.kotlin_di1daggerexample.Dagger3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger3.step1.presentation.DaggerActivity3Step1
import com.example.kotlin_di1daggerexample.Dagger3.step2.presentation.DaggerActivity3Step2
import com.example.kotlin_di1daggerexample.Dagger3.step3.presentation.DaggerActivity3Step3
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger3Binding

class DaggerActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityDagger3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDagger3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            step1.setOnClickListener {
                startActivity(Intent(this@DaggerActivity3, DaggerActivity3Step1::class.java))
            }

            step2.setOnClickListener {
                startActivity(Intent(this@DaggerActivity3, DaggerActivity3Step2::class.java))
            }

            step3.setOnClickListener {
                startActivity(Intent(this@DaggerActivity3, DaggerActivity3Step3::class.java))
            }
        }
    }
}