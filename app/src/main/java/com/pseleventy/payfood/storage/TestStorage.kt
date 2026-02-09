package com.pseleventy.payfood.storage

import com.pseleventy.payfood.presentation.IAction
import com.pseleventy.payfood.presentation.Replenishment
import com.pseleventy.payfood.presentation.Spending

object TestStorage {
    val AllMonthsTestStorage: Map<String, String> = mapOf(
        "01.2026" to "1191",
        "12.2025" to "1005",
        "11.2025" to "782",
        "10.2025" to "1678",
        "09.2025" to "544",
        "06.2025" to "10245",
        "05.2025" to "15500"
    )

    val firstSpending = Spending(
        date = "23.01",
        positons = mapOf(
            "12:01" to mapOf(
                "Обед 2-4 курс" to 0,
                "Пирожок с яблоками" to 33,
                "Пирожок с  капустой и яйцом" to 27
            ),
            "08:05" to mapOf(
                "Завтрак" to 100
            )
        )
    )

    val secondSpending = Spending(
        date = "24.01",
        positons = mapOf(
            "16:32" to mapOf(
                "Картофельное пюре" to 40,
                "Макароны отварные" to 46
            ),
            "12:01" to mapOf(
                "Обед 2-4 курс" to 0
            )
        )
    )

    val thirdSpending = Spending(
        date = "25.01",
        positons = mapOf(
            "12:23" to mapOf(
                "Обед 2-4 курс" to 0
            )
        )
    )

    val fourthSpending = Spending(
        date = "26.01",
        positons = mapOf(
            "15:08" to mapOf(
                "Шарлотка с яблоками" to 110
            ),
            "12:08" to mapOf(
                "Филе куриное под сыром" to 114,
                "Каша гречневая рассыпчатая" to 30,
                "Салат греческий" to 100,
                "Обед 2-4 курс" to 0,
                "Шарлотка с яблоками" to 110
            ),
            "08:12" to mapOf(
                "Завтрак" to 100
            )
        )
    )

    val fifthSpending = Spending(
        date = "27.01",
        positons = mapOf(
            "15:34" to mapOf(
                "Манник со сгущёнкой" to 28,
                "Сок порционный" to 35,
                "Cок порционный" to 35
            ),
            "11:58" to mapOf(
                "Обед 2-4 курс" to 0
            )
        )
    )

    val sixthSpending = Spending(
        date = "28.01",
        positons = mapOf(
            "12:01" to mapOf(
                "Картофель запечёный" to 35,
                "Обед 2-4 курс" to 0
            )
        )
    )

    val replenishment = Replenishment(
        date = "29.01",
        replenishmentAmount = "6000"
    )

    val seventhSpending = Spending(
        date = "29.01",
        positons = mapOf(
            "13:28" to mapOf(
                "Пицца с варёной колбасой" to 59,
                "Обед 2-4 курс" to 0
            ),
            "08:10" to mapOf(
                "Завтрак" to 100,
                "Яблоко" to 30
            )
        )
    )

    val actionArray: Array<IAction> = arrayOf(
        firstSpending,
        secondSpending,
        thirdSpending,
        fourthSpending,
        fifthSpending,
        sixthSpending,
        replenishment,
        seventhSpending
    ).reversedArray()
}