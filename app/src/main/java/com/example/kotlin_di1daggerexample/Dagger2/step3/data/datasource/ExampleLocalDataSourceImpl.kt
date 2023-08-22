package com.example.kotlin_di1daggerexample.Dagger2.step3.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step3.data.database.ExampleDatabase
import javax.inject.Inject

// навешиваем аннотацию @Inject с конструктором принимающим базу данных ExampleDatabase
class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}