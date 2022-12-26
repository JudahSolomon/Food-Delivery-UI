package com.example.food_edeliveryapp.onBoardingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
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
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White

@Preview(showBackground = true)
@Composable
fun OnBoardingScreen2() {

    Box(modifier = Modifier.fillMaxSize()) {


        Image(
            painterResource(R.drawable.delivery_guy),
            contentDescription = "delivery guy",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.food_e_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(width = 60.dp, height = 70.dp)
                .padding(top = 10.dp, start = 20.dp)
        )





        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 500.dp)
        ) {

            Text(
                text = "DELIVERED AT",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = White,
            )

            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = White,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("YOUR ")

                    }

                    withStyle(
                        style = SpanStyle(
                            color = Primary,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("DOORSTEP")

                    }
                })


//

            Text(
                text = stringResource(id = R.string.deliver_booster),
                fontSize = 14.sp,
                color = White,

                )

            Box(
                contentAlignment = Alignment.Center
            ) {

                // * Rounded corners button
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(start = 20.dp, end = 20.dp, top = 50.dp),
                    colors = ButtonDefaults.buttonColors(Primary)

                ) {

                    Text(
                        text = "NEXT",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = White,

                        modifier = Modifier.padding(5.dp)

                    )
                }
            }
        }
    }
}


