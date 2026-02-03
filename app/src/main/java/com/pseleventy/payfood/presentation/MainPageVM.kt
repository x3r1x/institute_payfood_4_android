package com.pseleventy.payfood.presentation

class MainPageVM {
    fun validateBalanceText(moneyCount: String): String {
        val originalStringBackwards = moneyCount.reversed()
        var splitString = ""

        for (i in 1 until originalStringBackwards.length + 1) {
            splitString += originalStringBackwards[i - 1]

            if (i % 3 == 0 && originalStringBackwards.length >= i && originalStringBackwards[i] != '-') {
                splitString += " "
            }
        }

        return "${splitString.reversed()} $CURRENCY_SYMBOL"
    }

    companion object {
        const val CURRENCY_SYMBOL = "₽"
    }
}