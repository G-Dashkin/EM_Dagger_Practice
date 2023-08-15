package com.example.kotlin_dependencyinjectionexample.Dagger1.step6

import dagger.Module
import dagger.Provides

//Компонент (класс Component) это класс который предоставляет реализацию зависимостей или “инжектит”
//их в поля какого то класса. Module – он позволяет предоставлять реализацию интерфейсов или экземпляры
// каких то классов если на них нельзя навесить аннотацию @Inject. Gометим класс аннотацией @Module
@Module
class ComputerModule {

//    Мы пишем аннотацию @Provides и создаем метод, который будет возвращать экземпляр класса монитор.
//    Обычно эти методы начинаются со слова provide. Указываем возвращаемый тип Monitor, чтобы даггер
//    знал, какую зависимость создает данный объект. В фигурных скобках мы сами пишем реализацию данного
//    метода через возврат Monitor()

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

//   Название метода роли не играет, главное указать возвращаемый тип, чтобы даггер знал, что если нам
//   потребуется объект данного типа – Monitor, то он посмотрит, что у него нет аннотации @Inject на
//   конструкторе и тогда будет искать реализацию в модулях.
//   Он найдет в модуле соответствующий метод, который возвращает реализацию монитора и вызовет его.

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideComputerTower(
        memory: Memory,
        processor: Processor,
        storage: Storage
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}