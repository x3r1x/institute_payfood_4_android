package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.pseleventy.payfood.R

@Composable
fun Background(isBalancePositive: Boolean) {
    Image(
        bitmap = ImageBitmap.imageResource(if (isBalancePositive) R.drawable.backgroung_positive else R.drawable.background_negative),
        contentDescription = "Gradient Background",
        modifier = Modifier.zIndex((-1).toFloat()).fillMaxWidth().height(600.dp),
        contentScale = ContentScale.FillWidth
    )
}