package com.example.kotlin_di1daggerexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.Dagger1.DaggerActivity1
import com.example.kotlin_di1daggerexample.Dagger2.DaggerActivity2
import com.example.kotlin_di1daggerexample.Dagger3.DaggerActivity3
import com.example.kotlin_di1daggerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            btnDagger1.setOnClickListener {
                startActivity(Intent(this@MainActivity, DaggerActivity1::class.java))
            }
            btnDagger2.setOnClickListener {
                startActivity(Intent(this@MainActivity, DaggerActivity2::class.java))
            }
            btnDagger3.setOnClickListener {
                startActivity(Intent(this@MainActivity, DaggerActivity3::class.java))
            }
        }
    }
}