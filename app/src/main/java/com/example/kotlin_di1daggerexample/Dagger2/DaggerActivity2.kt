package com.example.kotlin_di1daggerexample.Dagger2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger2.step1.presentation.ActivityStep1
import com.example.kotlin_di1daggerexample.Dagger2.step2.presentation.ActivityStep2
import com.example.kotlin_di1daggerexample.Dagger2.step3.presentation.ActivityStep3
import com.example.kotlin_di1daggerexample.Dagger2.step4Add.presentation.ActivityStep4
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger2Binding

class DaggerActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDagger2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDagger2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            step1.setOnClickListener {
                startActivity(Intent(this@DaggerActivity2, ActivityStep1::class.java))
            }
            step2.setOnClickListener {
                startActivity(Intent(this@DaggerActivity2, ActivityStep2::class.java))
            }
            step3.setOnClickListener {
                startActivity(Intent(this@DaggerActivity2, ActivityStep3::class.java))
            }
            step4.setOnClickListener {
                startActivity(Intent(this@DaggerActivity2, ActivityStep4::class.java))
            }
        }

    }
}