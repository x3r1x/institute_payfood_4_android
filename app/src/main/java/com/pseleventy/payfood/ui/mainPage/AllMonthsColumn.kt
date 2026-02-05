package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.presentation.MainPageVM
import com.pseleventy.payfood.storage.TestStorage
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun AllMonthsColumn(viewModel: MainPageVM) {
    val info = TestStorage.AllMonthsTestStorage

    for ((monthYearString, spending) in info) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(25.dp))
                .background(colorResource(R.color.white))
                .padding(horizontal = 20.dp, vertical = 20.dp)
        ) {
            Text(
                text = viewModel.validateMonthYearText(monthYearString),
                color = colorResource(R.color.light_black),
                fontSize = 16.sp,
                fontFamily = TextSnippets.manropeFont,
                fontWeight = FontWeight.SemiBold
            )

            Text(
                text = viewModel.validateBalanceText(spending),
                color = colorResource(R.color.light_black),
                fontSize = 16.sp,
                fontFamily = TextSnippets.manropeFont,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(Modifier.height(10.dp))
    }
}