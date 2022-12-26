package com.example.food_edeliveryapp.Order

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.food_edeliveryapp.Components.CheckOutButton
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Error
import com.example.food_edeliveryapp.ui.theme.White

@Preview(showBackground = true)
@Composable
fun TryOrderAgain() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Error)
    )
    {

        Text(
            text = "SOMETHING WENT WRONG!",
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Black,
            color = White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 40.dp,
                    top = 200.dp,
                    bottom = 30.dp
                )
        )

        Image(
            painter = painterResource(id = R.drawable.wrong_order),
            contentDescription = "Order Image",
            modifier = Modifier.size(157.dp)

        )

        Text(
            text = stringResource(id = R.string.something_went_wrong),
            fontWeight = FontWeight.Black,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            color = White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    bottom = 95.dp,
                    top = 50.dp
                )
        )

        CheckOutButton(buttonText = "TRY AGAIN")

    }
}