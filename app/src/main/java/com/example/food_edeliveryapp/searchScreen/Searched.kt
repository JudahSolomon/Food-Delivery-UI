package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.FoodDishes
import com.example.food_edeliveryapp.Components.Search
import com.example.food_edeliveryapp.Components.SearchedItems
import com.example.food_edeliveryapp.MainPages.SalmonDish
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar


@Composable
fun SearchScreenUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn{
            item{
                SearchScreen()
            }
        }

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun SearchScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 30.dp, end = 20.dp)
    ) {

        // search bar goes here
        Search(
            text = "SEARCH", label = "Sal",
            // watch video and add a trailingIcon later
            trailingIcon =
            painterResource(id = R.drawable.delete)

        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Text(
                text = "CATEGORIES",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier

            )
            Spacer(modifier = Modifier.width(120.dp))

            Text(
                text = "VIEW ALL",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Primary,
                modifier = Modifier

            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 0.dp, bottom = 30.dp)
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                contentPadding = PaddingValues(start = 10.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    SearchedItems(
                        backgroundColor = Primary,
                        text = "Lunch",
                        textColor = White,
                        trailingIcon =
                    painterResource(id = R.drawable.close))

                }
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "Breakfast",
                        textColor = Black
                    )

                }
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "FastFood",
                        textColor = Black
                    )

                }
                item {
                    SearchedItems(
                        backgroundColor = Primary,
                        text = "Lunch", trailingIcon =
                        painterResource(id = R.drawable.close)
                    )

                }


            }



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




    }

}