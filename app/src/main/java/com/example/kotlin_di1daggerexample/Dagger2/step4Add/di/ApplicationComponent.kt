package com.example.kotlin_di1daggerexample.Dagger2.step4Add.di


import com.example.kotlin_di1daggerexample.Dagger2.step4Add.presentation.ActivityStep4
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: ActivityStep4)

}