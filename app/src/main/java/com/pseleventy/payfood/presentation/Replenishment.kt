package com.pseleventy.payfood.presentation

class Replenishment(override val date: String, private val replenishmentAmount: String) : IAction {
    fun getAmount(): String {
        return replenishmentAmount
    }
}