package com.example.food_edeliveryapp.Order

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.LightGrey
import com.example.food_edeliveryapp.ui.theme.Primary


@Preview(showBackground = true)
@Composable
fun OrderDate() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp, horizontal = 30.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "Back arrow",
            modifier = Modifier.size(20.dp),
            tint = Black
        )



        Text(
            text = "08 July 2021",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 30.dp)
        )

        Text(
            text = "$65.00",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Primary,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 30.dp)
        )

        OrderDate(
            foodItem = "Egg Salad",
            amount = "$105.00",
            number = "2 pieces"
        )

        OrderDate(
            foodItem = "Egg Salad",
            amount = "$105.00",
            number = "2 pieces"
        )


    }
}

@Composable
fun OrderDate(
    foodItem: String,
    amount: String,
    number: String,

    ) {

    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 0.dp, top = 20.dp)
        ) {
            Text(
                text = foodItem,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Black,
                modifier = Modifier.padding(start = 0.dp)
            )

            Text(
                text = amount,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = LightGrey,
                modifier = Modifier.padding(bottom = 0.dp)
            )

        }

        Text(
            text = number,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = LightGrey,
            modifier = Modifier.padding(
                bottom = 50.dp
            )
        )


    }

}