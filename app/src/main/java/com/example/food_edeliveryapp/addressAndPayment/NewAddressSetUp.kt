package com.example.food_edeliveryapp.addressAndPayment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import com.example.food_edeliveryapp.Components.FirstNameAndLastName
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.DarkGrey
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White

@Preview(showBackground = true)
@Composable
fun NewAddressSetUpScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 25.17.dp, top = 55.17.dp, end = 20.dp)
    ) {

        Image(
            painterResource(id = R.drawable.calcen_button),
            contentDescription = "",
            modifier = Modifier.size(20.dp)
        )


        Text(
            text = "ADDRESS SETUP",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 60.dp)


        )// full name

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {

            FirstNameAndLastName(
                fieldName = "ADDRESS LINE 1",
                firstName = "address"
            )

            FirstNameAndLastName(
                fieldName = "ADDRESS LINE 2",
                firstName = "address"
            )

            Row(
                Modifier
                    .height(30.dp)
                    .padding(top = 10.dp, bottom =10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "ZIP CODE",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(start = 40.dp)
                )

                Text(
                    text = "CITY",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(start = 40.dp)
                )


            }

        }

        Row(
            Modifier
                .padding(top = 0.dp)
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {



            TextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = "000-000",
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
                        text = "City",
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

        FirstNameAndLastName(
            fieldName = "COUNTRY",
            firstName = "Country"
        )



    }


    // * Rounded corners button
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 700.dp)
    ) {
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 0.dp),

            colors = ButtonDefaults.buttonColors(Primary)

        ) {

            Text(
                text = "ADD NEW ADDRESS",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = White,
                modifier = Modifier.padding(5.dp)

            )
        }

        Text(
            text = "Skip for now",
            fontSize = 14.sp,
            color = DarkGrey,
            fontWeight = MaterialTheme.typography.h2.fontWeight,
            modifier = Modifier.padding(start = 150.dp, top = 10.dp)
        )

        // bottom navigation goes here
    }


}


