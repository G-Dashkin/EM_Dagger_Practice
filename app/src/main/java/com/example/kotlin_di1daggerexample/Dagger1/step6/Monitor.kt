package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import javax.inject.Inject

//  представим, что класс монитор, это не класс из нашего проекта, а мы получаем его какой то библиотеки
//  и у нас нет возможности навесить аннотацию @Inject на конструктор. Уберем @Inject и конструктор из класса
class Monitor  {
}