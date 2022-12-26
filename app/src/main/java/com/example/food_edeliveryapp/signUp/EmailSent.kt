package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.Secondary


@Preview(showBackground = true)
@Composable
fun EmailSentScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.17.dp, top = 55.17.dp, end = 20.dp)
    ) {

        Image(
            painterResource(id = R.drawable.calcen_button),
            contentDescription = "",
            modifier = Modifier.size(20.dp)
        )


        Text(
            text = "EMAIL SENT",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 55.dp)
        )

        Text(
            text = stringResource(id = R.string.email_sent),
            fontSize = 14.sp,
            color = LightGray,
            fontWeight = MaterialTheme.typography.h1.fontWeight,
            modifier = Modifier.padding(top = 10.dp,
            )
        )


        Text(
            text = "00:38",
            fontSize = 18.sp,
            color = Secondary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                start = 20.dp,
                top = 330.dp,
                bottom = 30.dp
            )
        )

        Text(
            text = "Did not receive the email yet?",
            fontSize = 14.sp,
            color = LightGray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                start = 20.dp, top = 10.dp,
            )
        )

        Text(
            text = "Resend",
            fontSize = 18.sp,
            color = Primary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 10.dp,
                start = 20.dp,
                bottom = 20.dp
            )
        )

        ButtonClick(buttonText = "OPEN EMAIL APP")


    }
}