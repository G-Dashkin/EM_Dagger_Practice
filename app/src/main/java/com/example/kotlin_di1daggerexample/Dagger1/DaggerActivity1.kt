package com.example.kotlin_di1daggerexample.Dagger1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_di1daggerexample.R

class DaggerActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger1)
        // Step 1
        // Создадим объект для проверки приложения.
        val activity = com.example.kotlin_di1daggerexample.Dagger1.step1.Activity()
        activity.keyboard.toString()

        // Step 3
        // Вызовем методы toString() у мыши и монитора
        val activityStep3 = com.example.kotlin_di1daggerexample.Dagger1.step3.Activity()
        activityStep3.mouse.toString()
        activityStep3.monitor.toString()

        // Здесь можно запустить приложение и если оно запускается, то значит переменным успешно были
        // присвоены значения и они не равны null

        // Step 5
        // В MainActivity мы будем обращаться к компьютеру. Обращения к остальным полям удалим.
        val activityStep5 = com.example.kotlin_di1daggerexample.Dagger1.step5.Activity()
        activityStep5.computer.toString()
    }
}