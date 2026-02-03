package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun HistorySection() {
    var currentSelection: HistorySelection by remember { mutableStateOf(HistorySelection.CURRENT_MONTH) }

    Text(
        text = stringResource(R.string.history),
        color = colorResource(R.color.white),
        fontSize = 16.sp,
        fontFamily = TextSnippets.manropeFont,
        fontWeight = FontWeight.Medium
    )

    Row {
        OutlinedButton(
            onClick = { currentSelection = HistorySelection.CURRENT_MONTH },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (currentSelection == HistorySelection.CURRENT_MONTH) colorResource(R.color.white) else colorResource(R.color.transparent_button_fill)
            ),
            border = if (currentSelection != HistorySelection.CURRENT_MONTH) BorderStroke(
                width = 0.5.dp,
                color = colorResource(R.color.white)
            ) else null,
            modifier = if (currentSelection != HistorySelection.CURRENT_MONTH) Modifier.clip(AbsoluteRoundedCornerShape(bottomLeft = 27.dp, topRight = 27.dp)) else Modifier,
            contentPadding = PaddingValues(
                horizontal = 15.dp,
                vertical = 10.dp
            ),
            content = {
                Text(
                    text = stringResource(R.string.current_month),
                    color = if (currentSelection == HistorySelection.CURRENT_MONTH) colorResource(R.color.light_black) else colorResource(R.color.light_text_white),
                    fontSize = 16.sp,
                    fontFamily = TextSnippets.manropeFont,
                    fontWeight = FontWeight.Medium
                )
            }
        )

        Spacer(Modifier.width(8.dp))

        OutlinedButton(
            onClick = { currentSelection = HistorySelection.ALL_MONTHS },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (currentSelection == HistorySelection.ALL_MONTHS) colorResource(R.color.white) else colorResource(R.color.transparent_button_fill)
            ),
            border = if (currentSelection != HistorySelection.ALL_MONTHS) BorderStroke(
                width = 0.5.dp,
                color = colorResource(R.color.white)
            ) else null,
            modifier = if (currentSelection != HistorySelection.ALL_MONTHS) Modifier.clip(AbsoluteRoundedCornerShape(bottomLeft = 26.5.dp, topRight = 26.5.dp)) else Modifier,
            contentPadding = PaddingValues(
                horizontal = 15.dp,
                vertical = 10.dp
            ),
            content = {
                Text(
                    text = stringResource(R.string.all_months),
                    color = if (currentSelection == HistorySelection.ALL_MONTHS) colorResource(R.color.light_black) else colorResource(R.color.light_text_white),
                    fontSize = 16.sp,
                    fontFamily = TextSnippets.manropeFont,
                    fontWeight = FontWeight.Medium
                )
            }
        )
    }
}

enum class HistorySelection {
    CURRENT_MONTH,
    ALL_MONTHS
}