package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.food_edeliveryapp.ui.theme.White


@Composable
fun Companies(
    companyLogo: Painter,
    modifier: Modifier = Modifier,
) {


    Card(
        shape = RoundedCornerShape(10.dp),
        contentColor = White,
        modifier = modifier
            .size(120.dp),
        elevation = 6.dp

    ) {
        Image(
            painter = (companyLogo),
            contentDescription = "",

            modifier = Modifier
                .size(100.dp)
                .padding(10.dp),
            contentScale = ContentScale.Crop


        )

    }
}