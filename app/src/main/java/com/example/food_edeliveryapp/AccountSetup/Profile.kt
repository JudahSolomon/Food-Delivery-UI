package com.example.food_edeliveryapp.AccountSetup

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.LightGrey
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar

@Composable
fun ProfileScreenUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn {
            item {
                ProfileScreen()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreen() {

    Column(


        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, start = 20.dp, end = 20.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Order Image",
            modifier = Modifier
                .size(157.dp)
                .clip(RoundedCornerShape(100))
                .border(
                    width = 3.dp,
                    color = Primary
                ),
            contentScale = ContentScale.Crop,


            )

        Text(
            text = "John Doe",
            fontSize = 14.sp,
            fontWeight = FontWeight.Black,
            color = Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 10.dp,
                    start = 150.dp
                )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
        ) {

            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.pen),
                searchText = "Account and Profile",
            )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.wallet),
                searchText = "Manage Payment Methods",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.profile_location),
                searchText = "Order History",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.history_clock),
                searchText = "Contact Supporte",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.support),
                searchText = "Refer to a Friend",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.gift),
                searchText = "Account and Profile",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.start),
                searchText = "Write a Review",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.terms),
                searchText = "Terms and Conditions",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.policy),
                searchText = "Privacy Policy",

                )


            ProfileSection(
                leadingIcon =
                painterResource(id = R.drawable.logout),
                searchText = "Logout",

                )

        }


    }
}

@Composable
fun ProfileSection(

    leadingIcon: Painter,
    searchText: String,

    ) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.dp),
        horizontalArrangement = Arrangement.Start
    ) {

        Icon(
            painter = leadingIcon,
            contentDescription = "",
            tint = if (isSystemInDarkTheme())
                White else Primary,
            modifier = Modifier
                .size(20.dp)
                .weight(1f)

        )

        Text(
            text = searchText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Black,
            color = LightGrey,
            modifier = Modifier
                .padding(start = 0.dp)
                .weight(4f)

        )

        Spacer(modifier = Modifier.width(100.dp))

        Icon(
            painter = painterResource(id = R.drawable.forward_arrow),
            contentDescription = "",
            tint = Black,
            modifier = Modifier
                .size(18.dp)
                .padding(end = 20.dp)
                .weight(1f)
        )

    }
}