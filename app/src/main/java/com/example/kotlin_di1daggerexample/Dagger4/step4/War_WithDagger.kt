package com.example.kotlin_di1daggerexample.Dagger4.step4

import javax.inject.Inject

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