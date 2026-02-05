package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun TopUpButton(onTopUp: () -> Unit) {
    OutlinedIconButton(
        onClick = onTopUp,
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp)
            .clip(AbsoluteRoundedCornerShape(bottomLeft = 29.dp, topRight = 30.dp)),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = colorResource(R.color.transparent_button_fill)
        ),
        border = BorderStroke(
            width = 0.5.dp,
            color = colorResource(R.color.white)
        ),
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    bitmap = ImageBitmap.imageResource(R.drawable.top_up_button),
                    contentDescription = null,
                    tint = colorResource(R.color.white),
                    modifier = Modifier.size(17.dp)
                )

                Spacer(Modifier.width(8.dp))

                Text(
                    text = stringResource(R.string.top_up),
                    color = colorResource(R.color.white),
                    fontSize = 16.sp,
                    fontFamily = TextSnippets.manropeFont,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    )
}