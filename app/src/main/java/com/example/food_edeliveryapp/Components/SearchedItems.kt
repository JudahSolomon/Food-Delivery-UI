package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SearchedItems(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    textColor: Color? = null,
    trailingIcon: Painter? = null,
    text: String
) {


    Surface(
        shape = RoundedCornerShape(0.dp),
        color = backgroundColor,
        elevation = 5.dp,
        modifier = Modifier
            .padding(top = 5.dp)
            .sizeIn(minWidth = 114.dp, minHeight = 40.dp)
            .clip(RoundedCornerShape(20.dp))
            .padding(bottom = 0.dp)

    ) {

        Row(horizontalArrangement = Arrangement.Center) {
            //add items here later
            if (textColor != null) {
                Text(
                    text = text,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = textColor,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 10.dp, end = 20.dp)

                )
            }


            if (trailingIcon != null) {
                Image(
                    trailingIcon,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 0.dp, top = 12.dp, end = 10.dp)
                        .size(12.dp),

                    )
            }
        }
    }
}