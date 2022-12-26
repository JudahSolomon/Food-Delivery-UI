package com.example.food_edeliveryapp.Order

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.Secondary

@Preview(showBackground = true)
@Composable
fun Checkout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 40.dp,
                start = 20.dp,
                end = 20.dp
            )
    ) {

        Icon(
            painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "Back arrow",
            modifier = Modifier.size(20.dp),
            tint = Black
        )

        Text(
            text = "CHECKOUT",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 70.dp,
                    bottom = 200.dp
                )
        )

        Text(
            text = "PRICE",
            fontSize = 12.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 60.dp,
                    bottom = 10.dp
                )
        )

        Text(
            text = "$65.00",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Primary,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 20.dp
                )
        )

        Text(
            text = "DELIVER TO",
            fontSize = 12.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 10.dp
                )
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Start
        ) {


            Text(
                text = "Home",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Color.Black,
                modifier = Modifier


            )

            Spacer(modifier = Modifier.width(260.dp))

            Text(
                text = "Change",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Secondary,
                modifier = Modifier


            )
        }

        Text(
            text = "PAYMENT METHOD",
            fontSize = 12.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = 0.dp, top = 50.dp
                )
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Start
        ) {


            Text(
                text = "XXXX XXXX XXXX 2538",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Color.Black,
                modifier = Modifier


            )

            Spacer(modifier = Modifier.width(160.dp))

            Text(
                text = "Change",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Secondary,
                modifier = Modifier
            
            )
        }
        
        ButtonClick(buttonText = "CONFIRM ORDER")

    }


}