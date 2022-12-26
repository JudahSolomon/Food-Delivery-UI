package com.example.food_edeliveryapp.AddedItems

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.MainPages.SalmonDish
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Secondary
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar


@Composable
fun BasketScreenUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn{
            item{
                BasketScreen()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BasketScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, top = 30.dp, end = 20.dp)
    ) {


        Like(
            titleText = "LIKED",
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

        Spacer(modifier = Modifier.height(100.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {

            Text(
                text = "TOTAL",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Black,
                modifier = Modifier

            )

            Text(
                text = "$65.00",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Secondary,
                modifier = Modifier
                    .padding(bottom = 40.dp)

            )
            
            ButtonClick(buttonText = "PROCEED TO CHECKOUT",
                modifier = Modifier.padding(bottom = 0.dp))


        }

    }
}