package com.pseleventy.payfood.presentation

class MainPageVM {
    fun validateBalanceText(moneyCount: String): String {
        val originalStringBackwards = moneyCount.reversed()
        var splitString = ""

        for (i in 1 until originalStringBackwards.length + 1) {
            splitString += originalStringBackwards[i - 1]

            if (i % 3 == 0 && originalStringBackwards.length > i && originalStringBackwards[i] != '-') {
                splitString += " "
            }
        }

        return "${splitString.reversed()} $CURRENCY_SYMBOL"
    }

    fun validateMonthYearText(monthYear: String): String {
        val month = MONTH_NUMBER_TO_STRING[monthYear.slice(0..1)]
        val year = monthYear.slice(3..monthYear.length - 1)

        return "$month $year"
    }

    companion object {
        const val CURRENCY_SYMBOL = "₽"

        val MONTH_NUMBER_TO_STRING = mapOf(
            "01" to "Январь",
            "02" to "Февраль",
            "03" to "Март",
            "04" to "Апрель",
            "05" to "Май",
            "06" to "Июнь",
            "07" to "Июль",
            "08" to "Август",
            "09" to "Сентябрь",
            "10" to "Октябрь",
            "11" to "Ноябрь",
            "12" to "Декабрь"
        )
    }
}