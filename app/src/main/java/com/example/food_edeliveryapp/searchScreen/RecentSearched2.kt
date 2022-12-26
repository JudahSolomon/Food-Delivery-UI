package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.food_edeliveryapp.Components.ResentSearchedItems
import com.example.food_edeliveryapp.Components.Search
import com.example.food_edeliveryapp.Navigation.MainScreen
import com.example.food_edeliveryapp.R


@Preview(showBackground = true)
@Composable
fun ResentSearched2Screen() {

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

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.Start
        ) {

            ResentSearchedItems(searchText = "Chicken Tikka")
            ResentSearchedItems(searchText = "Tandoori")
            ResentSearchedItems(searchText = "Aloo Tikki")

        }

        // bottom navigation goes here
        MainScreen()
    }



}
