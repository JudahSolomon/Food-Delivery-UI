package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.FoodDishes
import com.example.food_edeliveryapp.Components.Search
import com.example.food_edeliveryapp.Components.SearchedItems
import com.example.food_edeliveryapp.Navigation.MainScreen
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun Searching() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 30.dp, end = 20.dp)
    ) {

        // search bar goes here
        Search(
            text = "SEARCH", label = "Cuisine / Dish",
            // watch video and add a trailingIcon later
            trailingIcon =
            painterResource(id = R.drawable.delete)

        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, bottom = 30.dp)
        ) {

            SearchedItems(
                backgroundColor = Primary,
                text = "Lunch",
                textColor = White,
                trailingIcon =
                painterResource(id = R.drawable.close))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "SEARCH RESULTS",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    color = Black,
                    modifier = Modifier

                )
                Spacer(modifier = Modifier.width(120.dp))

                Icon(
                    painter =
                    painterResource(id = R.drawable.sort),
                    contentDescription = "sort",
                    tint = Secondary,
                    modifier = Modifier.size(30.dp)

                )
                Icon(
                    painter =
                    painterResource(id = R.drawable.filter),
                    contentDescription = "sort",
                    tint = Secondary,
                    modifier = Modifier.size(30.dp)

                )

            }

            Text(
                text = "Sorted: Price (Low - High)",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Secondary,
                modifier = Modifier
                    .padding(top = 10.dp)

            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 34.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                FoodDishes(
                    painterResource(id = R.drawable.egg_salad),
                    dishName = "Egg Salad ",
                    price = "$ 5.00"
                )

                FoodDishes(
                    painterResource(id = R.drawable.grilled_salmon),
                    dishName = "Egg Salad ",
                    price = "$ 5.00"
                )

            }

            Text(
                text = "You’ve reached the end of the list",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = LightGrey,
                modifier = Modifier
                    .padding(top = 50.dp, start = 70.dp)

            )


        }

        // bottom Navigation goes here
        MainScreen()


    }

}