package com.example.kotlin_di1daggerexample.Dagger2.step1.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step1.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}