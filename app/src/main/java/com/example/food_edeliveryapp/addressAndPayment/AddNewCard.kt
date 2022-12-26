package com.example.food_edeliveryapp.PaymentSetup

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.FirstNameAndLastName
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar


@Composable
fun AddNewCardScreenUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn {
            item {
                AddNewCardScreen()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun AddNewCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.17.dp, top = 55.17.dp, end = 20.dp)
    ) {

        Icon(
            painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "Back arrow",
            modifier = Modifier.size(20.dp),
            tint = Black
        )


        Text(
            text = "ADD NEW CARD",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 120.dp)


        )// full name

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 0.dp)
        ) {


            FirstNameAndLastName(
                fieldName = "CARD NUMBER",
                firstName = "XXXX - XXXX - XXXX"
            )

            Row(
                Modifier
                    .height(50.dp)
                    .padding(top = 0.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "EXPIRY DATE",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(start = 40.dp, top = 20.dp)
                )

                Text(
                    text = "CVV",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(start = 40.dp, top = 20.dp)
                )


            }

        }

        Row(
            Modifier
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {


            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "MM / YY",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                },
                singleLine = true,

                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = LightWhite,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(end = 20.dp)
            )

            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "X X X",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                },
                singleLine = true,

                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = LightWhite,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(end = 20.dp)
            )

        }


        // * Rounded corners button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp),

                colors = ButtonDefaults.buttonColors(Primary)

            ) {

                Text(
                    text = "ADD CARD",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = White,
                    modifier = Modifier.padding(5.dp)

                )
            }


        }


    }
}


