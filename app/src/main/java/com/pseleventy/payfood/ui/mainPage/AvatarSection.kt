package com.pseleventy.payfood.ui.mainPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pseleventy.payfood.R
import com.pseleventy.payfood.util.TextSnippets

@Composable
fun AvatarSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.test_avatar_2),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(38.dp),
            contentScale = ContentScale.FillBounds
        )

        Spacer(Modifier.width(10.dp))

        Text(
            text = stringResource(R.string.test_name_string_2),
            color = colorResource(R.color.text_white),
            fontFamily = TextSnippets.manropeFont,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}