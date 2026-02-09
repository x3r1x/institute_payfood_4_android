package com.pseleventy.payfood.presentation

import kotlin.time.Instant

class Spending(
    override val date: String,
    private val positons: Map<String, Map<String, Int>>
    //Первый String - дата, внутри Map: String - время, Int - стоимость
) : IAction {
    fun getPositions(): Map<String, Map<String, Int>> {
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