package com.example.food_edeliveryapp.AddedItems

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.R
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar

@Composable
fun LikedScreenUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn{
            item{
                LikedScreen()
            }
        }

    }
}

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

    }
}