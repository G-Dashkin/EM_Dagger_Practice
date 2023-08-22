package com.example.kotlin_di1daggerexample.Dagger4.step2

class War_WithDI(
    private val starks: Starks,
    private val boltons: Boltons
) {
    fun prepare() {
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report() {
        starks.reportForWar()
        boltons.reportForWar()
    }
}