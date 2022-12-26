package com.example.food_edeliveryapp.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.Components.FirstNameAndLastName
import com.example.food_edeliveryapp.Components.PasswordField
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.DarkGrey


@Preview(showBackground = true)
@Composable
fun LogInScreen() {
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
            text = "LOGIN",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 200.dp)


        )// full name

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 0.dp)
        ) {

            FirstNameAndLastName(fieldName = "EMAIL", firstName = "johndoe@email.com")
            
            PasswordField(password = "password", "PASSWORD")

            Text(
                text = "Forgot Password",
                fontSize = 14.sp,
                color = DarkGrey,
                fontWeight = MaterialTheme.typography.h2.fontWeight,
                modifier = Modifier.padding(start = 200.dp, top = 5.dp)
            )


           ButtonClick(buttonText = "LOGIN")

            Text(
                text = "Don’t have an account? Register",
                fontSize = 14.sp,
                color = DarkGrey,
                fontWeight = MaterialTheme.typography.h2.fontWeight,
                modifier = Modifier.padding(start = 70.dp, top = 30.dp)
            )


        }


    }
}