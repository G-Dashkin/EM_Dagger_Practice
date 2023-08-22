package com.example.kotlin_di1daggerexample.Dagger4.step3

// План — внедрить зависимости Starks и Boltons в класс War с помощью Dagger 2 @Module @Privides. Мы должны ему явно
// сказать об этом. Для этого добавим аннотации @Inject в классы Starks и Boltons
fun main() {

    // После пересборки проекта вы увидите, что Dagger 2 @Module @Privides сгенерировал класс под названием
    // DaggerBattleComponent — он поможет нам внедрить класс War. Используем этот класс для получения
    // экземпляра War

    // Ручное внедрение зависимостей
    val starks = Starks()
    val boltons = Boltons()
    val war = War_WithDagger(starks, boltons)
    war.prepare()
    war.report()

    //Использование Dagger 2 @Module @Privides
    val component = DaggerBattleComponent.create()
    val warDagger = component.getWar()
    warDagger.prepare()
    warDagger.report()
}

//  Используя класс DaggerBattleComponent, мы можем вызвать метод getWar(), который возвращает экземпляр
//  War. В этом экземпляре уже будут внедрены зависимости Starks и Boltons.

// Поздравляю! Вы создали первый проект с использованием Dagger 2 @Module @Privides. Я очень ценю то, что вы нашли на это
// время и зашли так далеко. Время отпраздновать.

// Мы обсудили, как ручное использование DI усложняет работу и увеличивает количество шаблонного кода.
// Далее обсудили, как Dagger 2 @Module @Privides помогает нам избавиться от этой боли и сам генерирует шаблонный код.
// После разобрали информацию по обработчикам аннотаций и базовым аннотациям Dagger 2 @Module @Privides (@Inject и @Component).
// Затем применили аннотации в нашем примере и внедрили зависимости, используя Dagger 2 @Module @Privides.




