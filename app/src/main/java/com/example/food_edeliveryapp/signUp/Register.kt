package com.example.food_edeliveryapp.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
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
fun RegisterScreen() {
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
            text = "REGISTER",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 50.dp)


        )// full name

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 0.dp)
        ) {


            FirstNameAndLastName(fieldName = "FULL NAMe", firstName = "John Doe")


            FirstNameAndLastName(fieldName = "EMAIL", firstName = "johndoe@email.com")
            FirstNameAndLastName(fieldName = "PHONE", firstName = "+00 123 456 7890")
            PasswordField(password = "password", "PASSWORD")

            ButtonClick(buttonText = "REGISTER")
            Text(
                text = "Already have an account? Login",
                fontSize = 14.sp,
                color = DarkGrey,
                fontWeight = MaterialTheme.typography.body2.fontWeight,
                modifier = Modifier.padding(start = 70.dp, top = 15.dp)
            )


        }


    }
}