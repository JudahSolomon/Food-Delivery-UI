package com.example.food_edeliveryapp.PaymentSetup

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
import com.example.food_edeliveryapp.ui.theme.LightGrey
import com.example.food_edeliveryapp.ui.theme.Secondary

@Preview(showBackground = true)
@Composable
fun NewPaymentMethod() {
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
            text = "MY PAYMENT METHODS",
            fontSize = 26.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 70.dp,
                    bottom = 150.dp
                )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, start = 20.dp)
        ) {
            Text(
                text = "CASH",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 10.dp
                    )
            )

            Text(
                text = "Pay using cash",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = LightGrey,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 20.dp
                    )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp, start = 20.dp, top = 30.dp)
        ) {
            Text(
                text = "MASTERCARD - 0164",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
            )

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = "XXXX XXXX XXXX 0164",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = LightGrey,
                    modifier = Modifier


                )

                Spacer(modifier = Modifier.width(130.dp))

                Text(
                    text = "09/21",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = LightGrey,
                    modifier = Modifier


                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 30.dp)
        ) {

            Text(
                text = "VISA - 3648",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Secondary,
                modifier = Modifier


            )

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = "XXXX XXXX XXXX 0164",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = Black,
                    modifier = Modifier


                )

                Spacer(modifier = Modifier.width(130.dp))

                Text(
                    text = "11/23",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Black,
                    color = Black,
                    modifier = Modifier


                )
            }
        }


        ButtonClick(buttonText = "ADD NEW PAYMENT METHOD")

        //button navigation goes here
    }


}