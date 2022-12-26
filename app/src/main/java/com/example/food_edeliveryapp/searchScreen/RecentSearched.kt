package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ResentSearchedItems
import com.example.food_edeliveryapp.Components.Search
import com.example.food_edeliveryapp.Components.SearchedItems
import com.example.food_edeliveryapp.Navigation.MainScreen
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.DarkGrey
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary


@Preview(showBackground = true)
@Composable
fun ResentSearchedScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 20.dp,
                end = 20.dp,
                top = 70.dp
            )
    ) {

        Search(
            text = "SEARCH", label = "Cuisine / Dish",
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
                color = DarkGrey,
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
        Column(modifier = Modifier.fillMaxWidth()) {


            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                contentPadding = PaddingValues(start = 0.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
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
                        backgroundColor = LightWhite,
                        text = "Lunch",
                        textColor = Black
                    )

                }
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, top = 30.dp),
                contentPadding = PaddingValues(start = 0.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "South Indian",
                        textColor = Black
                    )

                }
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "North Indian",
                        textColor = Black
                    )

                }

            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                contentPadding = PaddingValues(start = 0.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "Dinner",
                        textColor = Black
                    )

                }
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "Pure Veg",
                        textColor = Black
                    )

                }
                item {
                    SearchedItems(
                        backgroundColor = LightWhite,
                        text = "Non Veg",
                        textColor = Black
                    )

                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Text(
                    text = "RECENTS",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkGrey,
                    modifier = Modifier

                )
                Spacer(modifier = Modifier.width(200.dp))

                Text(
                    text = "CLEAR ALL",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Black,
                    color = Primary,
                    modifier = Modifier
                )

            }


        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.Start
        ) {

            ResentSearchedItems(searchText = "Biryani")
            ResentSearchedItems(searchText = "Dosa")
            ResentSearchedItems(searchText = "Veg Pakoda")
            ResentSearchedItems(searchText = "Chicken Tikka")
            ResentSearchedItems(searchText = "Tandoori")
            ResentSearchedItems(searchText = "Falooda")

        }

        // bottom navigation goes here
        MainScreen()
    }

}
