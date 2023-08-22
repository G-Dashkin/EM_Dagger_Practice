package com.example.kotlin_di1daggerexample.Dagger3.step2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_di1daggerexample.Dagger3.step2.App
import com.example.kotlin_di1daggerexample.databinding.ActivityDagger3Step2Binding
import javax.inject.Inject

class DaggerActivity3Step2 : AppCompatActivity() {

    private lateinit var binding : ActivityDagger3Step2Binding

    // Теперь как только сраблотает эта строчка даггер пойдет по всем полям, которые помечаны как @Inject
    // в активити у нас инжектится фэктори.
    @Inject
    lateinit var viewModelFactory: MainViewModelFactory
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDagger3Step2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //  добавит сюда необходимый объект
        (applicationContext as App).appComponent.inject(this)

        Log.d("MyLog", "Activity created")

        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        viewModel.resultLiveData.observe(this, { text ->
            binding.dataTextView.text = text
        })

        binding.apply {

            sendButton.setOnClickListener {
                viewModel.save(dataEditText.text.toString())
            }

            receiveButton.setOnClickListener {
                viewModel.load()
            }

        }
    }
}