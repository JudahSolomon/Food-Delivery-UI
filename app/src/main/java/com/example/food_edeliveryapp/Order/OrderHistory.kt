package com.example.food_edeliveryapp.Order

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*


@Preview(showBackground = true)
@Composable
fun OrderHistory() {
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
            text = "ORDER HISTORY",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 30.dp)
        )

        Orders(
            date = "08 July 2021",
            amount = "$65.00",
            itemsOrdered = "5 items"
        )
        ButtonClick(buttonText = "TRACK ORDER")

        Orders(
            date = "05 July 2021",
            amount = "$105.00",
            itemsOrdered = "11 items"
        )
        OutlinedButton("VIEW DETAILS")

        Orders(
            date = "01 July 2021",
            amount = "$30.00",
            itemsOrdered = "2 items"
        )
        OutlinedButton("VIEW DETAILS")


    }
}

@Composable
fun Orders(
    date: String,
    amount: String,
    itemsOrdered: String,

    ) {

    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp, top = 20.dp)
        ) {
            Text(
                text = date,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Secondary,
                modifier = Modifier.padding(start = 0.dp)
            )

            Text(
                text = amount,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Secondary,
                modifier = Modifier.padding(bottom = 10.dp)
            )

        }

        Text(
            text = itemsOrdered,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = LightGrey,
            modifier = Modifier.padding(
                bottom = 20.dp
            )
        )


    }
}

@Composable
fun OutlinedButton(
    label: String
) {
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
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 80.dp)
                )
            },
            singleLine = true,

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