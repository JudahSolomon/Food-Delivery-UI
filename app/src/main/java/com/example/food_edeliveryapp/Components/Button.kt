package com.example.food_edeliveryapp.Components

import android.widget.Button
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White

@Composable
fun ButtonClick(
    modifier: Modifier = Modifier,
    buttonText: String
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier

    ) {

        // * Rounded corners button
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()

                .padding(start = 20.dp, end = 20.dp, top = 50.dp),

            colors = ButtonDefaults.buttonColors(Primary)

        ) {

            Text(
                text = buttonText,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = White,
                modifier = Modifier.padding(5.dp)

            )
        }
    }
}