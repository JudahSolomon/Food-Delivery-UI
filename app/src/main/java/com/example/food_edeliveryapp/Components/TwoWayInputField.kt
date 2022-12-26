package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary


@Composable
fun TwoWayInputField(
    modifier: Modifier = Modifier,
    title: String,
    label: String

) {
    Text(
        text = title,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Primary,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, top = 30.dp, bottom = 10.dp)
    )


    //first input field

    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = "CODE LINE 2",
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        },
        singleLine = true,

        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = LightWhite,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxHeight()
    )
}





