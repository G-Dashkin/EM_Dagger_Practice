package com.example.kotlin_di1daggerexample.Dagger4.step3

import javax.inject.Inject

// План заключается в том, чтобы сделать зависимость или объект класса War доступным всем другим классам.
// Но для работы класса War необходимо предоставить ему два класса, от которых он зависит, — Starks и Boltons.

class War_WithDagger @Inject constructor(
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