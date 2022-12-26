package com.example.food_edeliveryapp.AddedItems

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.food_edeliveryapp.Navigation.MainScreen
import com.example.food_edeliveryapp.R


@Preview(showBackground = true)
@Composable
fun LikedScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, top = 30.dp, end = 20.dp)
    ) {


        Like(
            titleText = "BASKET",
            amount = "$10.00",
            dishImage =
            painterResource(id = R.drawable.egg_salad),
            addOrDelete =
            painterResource(id = R.drawable.delete),
            dishName = " Egg Salad",
            number = 2
        )


        Like(
            titleText = "",
            amount = "$45.00",
            dishImage =
            painterResource(id = R.drawable.grilled_salmon),
            addOrDelete =
            painterResource(id = R.drawable.delete),
            dishName = " Grilled Salmon",
            number = 3
        )

        // bottom navigation goes here
        MainScreen()
    }
}