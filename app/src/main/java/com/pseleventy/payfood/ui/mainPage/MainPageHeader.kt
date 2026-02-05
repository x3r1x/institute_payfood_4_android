package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.pseleventy.payfood.R

@Composable
fun MainPageHeader() {
    Column(
        modifier = Modifier
            .background(
                color = colorResource(
                    R.color.white
                )
            )
            .fillMaxWidth()
    ) {
        Spacer(Modifier.height(40.dp))

        Image(
            painter = painterResource(R.drawable.instituteispring),
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 17.dp)
        )
    }
}