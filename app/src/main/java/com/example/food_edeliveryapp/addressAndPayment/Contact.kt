package com.example.food_edeliveryapp.addressAndPayment

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Primary

@Preview(showBackground = true)
@Composable
fun ContactSupportScreen() {
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
            text = "ORDER HISTORY",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 55.dp, bottom = 30.dp)
        )


            ContactInfo(
                icon =
                painterResource(id = R.drawable.back_arrow),
                info = " +00 123 456 7890"
            )

            ContactInfo(
                icon =
                painterResource(id = R.drawable.back_arrow),
                info = " support@foode.com"
            )

            ContactInfo(
                icon =
                painterResource(id = R.drawable.back_arrow),
                info = "chat on WhatsApp"
            )

        }
    }

@Composable
fun ContactInfo(
    icon: Painter,
    info: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = "Back arrow",
            modifier = Modifier
                .size(20.dp),
            tint = Primary

        )

        Text(
            text = info,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}