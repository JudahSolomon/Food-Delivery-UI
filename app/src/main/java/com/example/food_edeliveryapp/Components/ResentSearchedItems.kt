package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R.drawable.close
import com.example.food_edeliveryapp.R.drawable.history
import com.example.food_edeliveryapp.ui.theme.LightGrey


@Composable
fun ResentSearchedItems(

    searchText: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.Start
    ) {

        Icon(
            painter = painterResource(id = history),
            contentDescription = "",
            tint = LightGrey,
            modifier = Modifier
                .size(20.dp)
                .weight(1f)

        )

        Text(
            text = searchText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Black,
            color = LightGrey,
            modifier = Modifier
                .padding(start = 0.dp)
                .weight(2f)

        )

        Spacer(modifier = Modifier.width(140.dp))

        Icon(
            painter = painterResource(id = close),
            contentDescription = "",
            tint = LightGrey,
            modifier = Modifier
                .size(18.dp)
                .padding(end = 20.dp)
                .weight(1f))

    }
}