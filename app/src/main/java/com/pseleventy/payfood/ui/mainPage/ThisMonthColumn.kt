package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.presentation.MainPageVM
import com.pseleventy.payfood.presentation.Replenishment
import com.pseleventy.payfood.presentation.Spending
import com.pseleventy.payfood.storage.TestStorage
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun ThisMonthColumn(viewModel: MainPageVM) {
    val info = TestStorage.actionArray

    for (action in info) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(colorResource(R.color.white))
                .padding(vertical = 16.dp, horizontal = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            if (action is Spending) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = viewModel.validateDayMonthText(action.date),
                        color = colorResource(R.color.light_black),
                        fontFamily = TextSnippets.manropeFont,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )

                    Text(
                        text = if (action.getTotalAmountOfSpending() != 0) viewModel.validateBalanceText(
                            "-" + action.getTotalAmountOfSpending()
                        ) else viewModel.validateBalanceText(0.toString()),
                        color = colorResource(R.color.light_black),
                        fontSize = 16.sp,
                        fontFamily = TextSnippets.manropeFont,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(Modifier.height(26.dp))

                for ((time, purchaseInfo) in action.getPositions()) {
                    Text(
                        text = time,
                        color = colorResource(R.color.light_grey),
                        fontSize = 14.sp,
                        fontFamily = TextSnippets.manropeFont,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(Modifier.height(12.dp))

                    for ((name, price) in purchaseInfo) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = name,
                                color = colorResource(R.color.light_black),
                                fontSize = 14.sp,
                                fontFamily = TextSnippets.manropeFont,
                                fontWeight = FontWeight.Medium
                            )

                            Text(
                                text = if (price != 0) "-$price" else 0.toString(),
                                color = colorResource(R.color.light_black),
                                fontSize = 14.sp,
                                fontFamily = TextSnippets.manropeFont,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        Spacer(Modifier.height(18.dp))
                    }
                }
            }
            if (action is Replenishment) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = stringResource(R.string.replenishment),
                            fontSize = 16.sp,
                            fontFamily = TextSnippets.manropeFont,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.light_black)
                        )

                        Spacer(Modifier.width(5.dp))

                        Icon(
                            bitmap = ImageBitmap.imageResource(R.drawable.dot),
                            contentDescription = null,
                            modifier = Modifier.size(5.dp),
                            tint = colorResource(R.color.light_grey)
                        )

                        Spacer(Modifier.width(5.dp))

                        Text(
                            text = viewModel.validateDayMonthText(action.date),
                            fontSize = 16.sp,
                            fontFamily = TextSnippets.manropeFont,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.light_grey)
                        )
                    }

                    Text(
                        text = viewModel.validateBalanceText("+" + action.getAmount()),
                        color = colorResource(R.color.green),
                        fontFamily = TextSnippets.manropeFont,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(12.dp))
    }

    Spacer(Modifier.height(30.dp))
}