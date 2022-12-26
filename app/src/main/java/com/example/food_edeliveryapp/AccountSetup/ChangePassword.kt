package com.example.food_edeliveryapp.AccountSetup

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.Components.PasswordField
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black


@Preview(showBackground = true)
@Composable
fun ChangePasswordScreen() {
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
            text = "CHANGE PASSWORD",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 160.dp)


        )// full name

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 0.dp)
        ) {

            PasswordField(password = "Old password", "OLD PASSWORD")
            PasswordField(password = "New password", "NEW PASSWORD")
            PasswordField(password = "Confirm password", "CONFIRM PASSWORD")

            ButtonClick(buttonText = "REGISTER")


        }


    }
}