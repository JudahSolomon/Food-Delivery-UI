package com.example.food_edeliveryapp.PaymentSetup

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.addressAndPayment.ContactSupportScreen
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.Secondary
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar


@Composable
fun NewAddressUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn {
            item {
                NewAddress()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun NewAddress() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 40.dp,
                start = 20.dp,
                end = 20.dp
            )
    ) {

        Icon(
            painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "Back arrow",
            modifier = Modifier.size(20.dp),
            tint = Black
        )

        Text(
            text = "MY ADDRESSES",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 70.dp,
                    bottom = 150.dp
                )
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, start = 20.dp)
        ) {
            Text(
                text = "PARTY PLACE",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Secondary,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 10.dp
                    )
            )

            Text(
                text = stringResource(id = R.string.new_address),
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 20.dp
                    )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp, start = 20.dp, top = 30.dp)
        ) {
            Text(
                text = "OFFICE",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 10.dp
                    )
            )

            Text(
                text = stringResource(id = R.string.office),
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 20.dp
                    )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding( start = 20.dp, top = 30.dp)
        ) {
            Text(
                text = "HOME",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 0.dp
                    )
            )

            Text(
                text = stringResource(id = R.string.home),
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 0.dp
                    )
            )
        }



        ButtonClick(buttonText = "CONFIRM ORDER")

    }


}