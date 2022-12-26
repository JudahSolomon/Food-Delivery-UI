package com.example.food_edeliveryapp.onBoardingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White

@Preview(showBackground = true)
@Composable
fun OnBoardingScreen1() {

    Box(modifier = Modifier.fillMaxSize()) {


        Image(
            painterResource(id = R.drawable.serving_food),
            contentDescription = null,
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
                text = "AWESOME ",
                fontSize = MaterialTheme.typography.h4.fontSize,
                fontWeight = FontWeight.Bold,
                color = White,

                )
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Primary,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("LOCAL ")

                    }

                    withStyle(
                        style = SpanStyle(
                            color = White,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("FOOD")

                    }


                },
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = White,

                )


            Text(
                text = stringResource(id = R.string.delicious_food),
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                color = White,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 5.dp)
            )

            ButtonClick(buttonText = "NEXT")
        }
    }
}
