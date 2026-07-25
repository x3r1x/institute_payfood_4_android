package com.pseleventy.payfood.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.presentation.MainPageVM
import com.pseleventy.payfood.ui.mainPage.AvatarSection
import com.pseleventy.payfood.ui.mainPage.Background
import com.pseleventy.payfood.ui.mainPage.BalanceSection
import com.pseleventy.payfood.ui.mainPage.HistorySection
import com.pseleventy.payfood.ui.mainPage.MainPageHeader
import com.pseleventy.payfood.ui.mainPage.TopUpButton

@Composable
fun MainPageComponent(
    onTopUp: () -> Unit
) {
    val viewModel = MainPageVM()
    val currentBalance = stringResource(R.string.test_balance_string_1)

    MainPageHeader()

    Background(currentBalance.toFloat() >= 0)

    LazyColumn(
        horizontalAlignment = Alignment.Start,
        contentPadding = PaddingValues(top = 95.dp),
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        item { Spacer(Modifier.height(35.dp)) }
        item { AvatarSection() }
        item { Spacer(Modifier.height(24.dp)) }
        item { BalanceSection(viewModel, currentBalance) }
        item { Spacer(Modifier.height(24.dp)) }
        item { TopUpButton { onTopUp() } }
        item { Spacer(Modifier.height(57.dp)) }
        item { HistorySection(viewModel) }
    }
}