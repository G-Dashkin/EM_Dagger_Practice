package com.example.kotlin_di1daggerexample.Dagger4.step2

// Мы рассмотрели пример, как вручную внедрять зависимости через конструктор, создавая экземпляры
// классов в точке входа. Но если у нас будет множество классов, то у каждого из них есть различные
// зависимости, которые нужно удовлетворить. Для создания экземпляров и подключения всего вместе требуется
// большое количество кода. Ещё этот код может постоянно изменяться каждый раз при добавлении новых
// классов в приложение и при изменении существующих классов, для того чтобы внедрить новые зависимости
fun main() {
    // Ниже пример дополнительных классов с привлеченим союзников (Allies) и железного банка (IronBank), который
    // финансирует этих союзников и наши дома. Далее эти союзники присоединяются к Старкам и Болтонам
    val bank = IronBank()
    val allies = Allies(bank)
    val starks = Starks(allies)
    val boltons = Boltons(allies)

    val war = War_WithDI(starks, boltons)
    war.prepare()
    war.report()
}

// При таком подходе точка входа очень быстро будет наполнена огромным количеством кода для инициализации
// всех зависимостей. Для создания одного класса, с которым мы будем работать, нужно инициализировать
// несколько других. По мере роста приложения и добавления в него новых классов, точка входа в приложение
// будет раздуваться и в конечном итоге этот метод станет очень сложно поддерживать.



