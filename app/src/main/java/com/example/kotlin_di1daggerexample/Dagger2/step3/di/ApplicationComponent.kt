package com.example.kotlin_di1daggerexample.Dagger2.step3.di

import com.example.kotlin_di1daggerexample.Dagger2.step3.presentation.ActivityStep3
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: ActivityStep3)

}