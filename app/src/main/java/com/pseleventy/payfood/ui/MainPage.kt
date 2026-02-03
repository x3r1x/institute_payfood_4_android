package com.pseleventy.payfood.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.ui.mainPage.AvatarSection
import com.pseleventy.payfood.ui.mainPage.Background
import com.pseleventy.payfood.ui.mainPage.BalanceSection
import com.pseleventy.payfood.ui.mainPage.HistorySection
import com.pseleventy.payfood.ui.mainPage.MainPageHeader
import com.pseleventy.payfood.ui.mainPage.TopUpButton
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun MainPageComponent(
    onTopUp: () -> Unit
) {
    val currentBalance = stringResource(R.string.test_balance_string_2)

    MainPageHeader()

    Background(currentBalance.toFloat() >= 0)

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .offset(y = 95.dp)
    ) {
        Spacer(Modifier.height(35.dp))

        AvatarSection()

        Spacer(Modifier.height(24.dp))

        BalanceSection(currentBalance)

        Spacer(Modifier.height(24.dp))

        TopUpButton { onTopUp() }

        Spacer(Modifier.height(57.dp))

        HistorySection()
    }
}