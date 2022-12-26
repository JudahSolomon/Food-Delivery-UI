package com.example.food_edeliveryapp.addressAndPayment

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
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
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun ReferAFriendScreen() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, start = 20.dp, end = 20.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "Back arrow",
            modifier = Modifier.size(20.dp),
            tint = Black
        )

        Text(
            text = "REFER TO A FRIEND",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 30.dp)
        )

        FirstNameAndLastName(
            fieldName = "REFER CODE",
            firstName = "Q8F4-B6S2-S6B3-N6Z5",
            trailingIcon = 
                painterResource(id = R.drawable.back_arrow)
        )
        
        Spacer(modifier = Modifier.height(400.dp))
        
        ButtonClick(buttonText = "SHARE THIS APP")
    }
}