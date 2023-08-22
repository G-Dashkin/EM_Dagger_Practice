package com.example.kotlin_di1daggerexample.Dagger4.step4

fun main() {

    // Здесь рассомтрим Аннотации @Module и @Provides, для примера возьмем два сервиса, предоставляемых
    // Браавосом, — деньги (Cash) и солдаты (Soldiers). Для этого созданы классы Cash() и Soldiers()

    // Далее создадим модуль и назовем его BraavosModule. Он будет снабжать нас двумя зависимостями
    // — Cash и Soldiers.

    val cash = Cash()
    val soldiers = Soldiers()

    // После всех изменений соберем проект заново. Видим ошибку в методе .create() класса
    // DaggerBattleComponent. Она возникла в связи с тем, что при добавлении модуля необходимо передать
    // эту зависимость Dagger 2. Выглядит это так:
    val component = DaggerBattleComponent
        .builder()
        .braavosModule(BraavosModule(cash, soldiers))
        .build()

    val warDagger = component.getWar()
    warDagger.prepare()
    warDagger.report()

    // После включения всех модулей мы можем начать использовать их методы через Component
    // используем деньги и солдат
    component.getCash()
    component.getSoldiers()
}





