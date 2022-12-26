package com.example.food_edeliveryapp.searchScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
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
import com.example.food_edeliveryapp.Components.Search
import com.example.food_edeliveryapp.Components.SearchedItems
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar


@Composable
fun InvalidSearchUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn {
            item {
                InvalidSearch()
            }
        }

    }
}

@OptIn(ExperimentalMaterialApi::class)
@Preview(showBackground = true)
@Composable
fun InvalidSearch() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 30.dp, end = 20.dp)
    ) {

        // search bar goes here
        Search(
            text = "SEARCH", label = "Sdg",
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
                painterResource(id = R.drawable.close)
            )

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
                Spacer(modifier = Modifier.width(100.dp))

//

                Icon(
                    painter =
                    painterResource(id = R.drawable.sort),
                    contentDescription = "sort",
                    tint = LightGrey,
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
                text = "Sorry, there is nothing to sho for the search.",
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = LightGrey,
                modifier = Modifier
                    .padding(top = 322.dp, start = 50.dp)

            )


        }


    }

}