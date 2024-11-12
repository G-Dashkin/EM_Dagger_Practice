package com.example.em_dagger_practice.di

import com.example.core.di.CoreDeps
import com.example.home.di.HomeDeps
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent : HomeDeps, CoreDeps