package com.example.kotlin_di1daggerexample.Dagger1.step1

import javax.inject.Inject

// Делаем инъекцию в конструктор класса, при помощи аннотации @Inject тем самым сообщаем даггеру,
// как нужно создавать объект keyboard. Это значит, что у класса keyboard есть пустой конструктор и
// мы можем сказать даггеру-“каждый раз, когда нам нужен будет объект класса keyboard, вызовается его конструктор”.
class Keyboard @Inject constructor(){
}

//Таким образом мы говорим даггеру, что если какому то компоненту необходима зависимость – клавиатура
// т.е. объект этого класса, то создай его вызвав конструктор.