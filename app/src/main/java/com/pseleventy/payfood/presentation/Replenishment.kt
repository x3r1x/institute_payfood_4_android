package com.pseleventy.payfood.presentation

import kotlin.time.Instant

class Replenishment(override val date: Instant, private val replenishmentAmount: String): IAction {
    fun getDate(): Instant {
        return date
    }

    fun getAmount(): String {
        return replenishmentAmount
    }
}