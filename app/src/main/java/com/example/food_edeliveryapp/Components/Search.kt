package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary


@Composable
fun Search(
    text: String,
    label: String,
    trailingIcon: Painter? = null,

) {

    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Primary,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, bottom = 10.dp, top = 20.dp)
    )

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .border(
                width = 2.dp, color = Primary,
                shape = RoundedCornerShape(30.dp)
            )
            .clip(RoundedCornerShape(30.dp))
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = label,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black
                )
            },
            singleLine = true,
            trailingIcon = {

                if (trailingIcon != null) {
                    Image(
                        painter = trailingIcon,
                        contentDescription = "clear",
                        modifier = Modifier.size(20.dp)
                    )
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = LightWhite,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier

                .fillMaxHeight()
        )
    }
}