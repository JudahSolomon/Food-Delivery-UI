package com.example.food_edeliveryapp.getStarted

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.DarkGrey
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White

@Preview(showBackground = true)
@Composable
fun GetStartedScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 20.dp,
                vertical = 10.dp
            )
    ) {


        Image(
            painter = painterResource(id = R.drawable.food_logo_black),
            contentDescription = "Logo",
            modifier = Modifier
                .size(width = 60.dp, height = 70.dp)
                .padding(top = 10.dp, start = 20.dp, bottom = 0.dp)
        )
        
        Spacer(modifier = Modifier.height(50.dp))


        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Black,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Black,
                        
                    )
                ) {
                    append("GET ")

                }

                withStyle(
                    style = SpanStyle(
                        color = Primary,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Black
                    )
                ) {
                    append("STARTED")

                }
            })

        Text(
            text = stringResource(id = R.string.best_deal_around),
            fontSize = 14.sp,
            color = DarkGrey,
            modifier = Modifier.padding(top = 20.dp)
        )

        //Login Button

        Box(
            contentAlignment = Alignment.Center
        ) {

            // * Rounded corners button
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(start = 20.dp, end = 20.dp, top = 435.dp),
                colors = ButtonDefaults.buttonColors(Primary)

            ) {

                Text(
                    text = "LOGIN",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = White,
                    modifier = Modifier.padding(5.dp)

                )
            }
        }

        //Register Outlined Button

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {

            // * Rounded corners button
            OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(2.dp, color = Primary),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)

            ) {

                Text(
                    text = "REGISTER",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier.padding(5.dp)

                )
            }
        }

    }
}