package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.presentation.MainPageVM
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun BalanceSection(viewModel: MainPageVM, balance: String) {
    Column {
        Text(
            text = stringResource(R.string.card_balance),
            color = colorResource(R.color.text_white),
            fontSize = 16.sp,
            fontFamily = TextSnippets.manropeFont,
            fontWeight = FontWeight.Normal
        )

        Spacer(Modifier.height(6.dp))

        Text(
            text = viewModel.validateBalanceText(balance),
            color = if (balance.toFloat() > 0) colorResource(R.color.light_text_white) else colorResource(
                R.color.balance_text_red
            ),
            fontSize = 42.sp,
            fontFamily = TextSnippets.manropeFont,
            fontWeight = FontWeight.Bold
        )
    }
}