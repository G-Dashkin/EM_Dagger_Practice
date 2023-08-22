package com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.datasource

import com.example.kotlin_di1daggerexample.Dagger2.step4Add.data.database.ExampleDatabase
import javax.inject.Inject

// навешиваем аннотацию @Inject с конструктором принимающим базу данных ExampleDatabase
class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}