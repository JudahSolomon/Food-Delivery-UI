package com.example.food_edeliveryapp.onBoardingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun SplashScreen() {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (isSystemInDarkTheme())
                    Color.Black else Color.White
            )
    ) {

        Image(
            painter = painterResource(id = R.drawable.food_logo_black),
            contentDescription = "logo",
            modifier = Modifier
                .size(50.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.scooter),
            contentDescription = "logo",
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 30.dp),
            contentScale = ContentScale.Crop
        )


        Text(
            text = stringResource(id = R.string.delicious_food),
            color = Black,
//            fontFamily = poppins,
            fontSize = MaterialTheme.typography.h5.fontSize,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 20.dp)

        )

    }


}