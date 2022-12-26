package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.White



@Composable
fun Companies(
    companyLogo: Painter,
    modifier: Modifier = Modifier,
) {


    Surface(
        shape = RoundedCornerShape(0.dp),
        color = White,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(5.dp))

    ) {
        Image(
            painter = (companyLogo),
            contentDescription = "",

            modifier = Modifier.size(180.dp),
            contentScale = ContentScale.Crop


        )

    }
}