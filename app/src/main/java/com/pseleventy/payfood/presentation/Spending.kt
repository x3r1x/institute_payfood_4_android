package com.pseleventy.payfood.presentation

import kotlin.time.Instant

class Spending(
    override val date: Instant,
    private val positons: Map<Instant, Map<String, Int>>
): IAction {
    fun getDate(): Instant {
        return date
    }

    fun getPositions(): Map<Instant, Map<String, Int>> {
        return positons
    }

    fun getTotalAmountOfSpending(): Int {
        var totalAmount: Int = 0

        for ((_, positionInfo) in positons) {
            for ((_, singularAmount) in positionInfo) {
                totalAmount += singularAmount
            }
        }

        return totalAmount
    }
}