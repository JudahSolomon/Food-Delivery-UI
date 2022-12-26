package com.example.food_edeliveryapp.PaymentSetup

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
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
import com.example.food_edeliveryapp.ui.theme.*

@Preview(showBackground = true)
@Composable
fun AccountAndProfileScreen() {
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
            text = "ACCOUNT AND PROFILE",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 30.dp)

        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 250.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.trash),
                contentDescription = "Back arrow",
                modifier = Modifier
                    .size(20.dp),
                tint = ErrorColor

            )

            Text(
                text = "Delete Account",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 20.dp)
            )
        }


        Row(
            Modifier
                .height(30.dp)
                .padding(top = 0.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "FIRST NAME",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Primary,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(start = 40.dp)
            )

            Text(
                text = "LAST NAME",
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
            .padding(top = 500.dp, start = 20.dp)
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {


        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = "John",
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
                    text = "Doe",
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

    Row(modifier = Modifier.fillMaxWidth()
        .padding(top = 600.dp)) {
        FirstNameAndLastName(
            fieldName = "EMAIL",
            firstName = "johndoe@email.com"
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Icon(
                painter = painterResource(id = R.drawable.trash),
                contentDescription = "Back arrow",
                modifier = Modifier
                    .size(20.dp),
                tint = Success
            )

            Text(
                text = "Delete Account",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

    }

}


