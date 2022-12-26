package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.food_edeliveryapp.ui.theme.White


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FoodDishes(
    mainDish: Painter,
    dishName: String,
    price: String,

    ) {
    Surface(
        modifier = Modifier
            .height(230.dp)
            .width(157.dp),
        elevation = 8.dp,
        onClick = {}) {
        Box(
            modifier = Modifier

                .background(White, RoundedCornerShape(20.dp)
                ).clip(RoundedCornerShape(20.dp))
        ) {

            Image(
                painter = mainDish,
                contentDescription = "",
                modifier = Modifier
                    .height(157.dp)
                    .width(157.dp),
                contentScale = ContentScale.Crop
            )

            Surface(
                shape = RoundedCornerShape(5.dp),
                color = White.copy(alpha = 0.5f),
                elevation = 5.dp,
                modifier = Modifier
                    .padding(start = 130.dp, top = 120.dp)
                    .size(18.dp)
                    .clip(RoundedCornerShape(5.dp))

            ) {
                Image(
                    painterResource(id = R.drawable.heart),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(2.dp)

                )
            }


        }




        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 150.dp)
        ) {
            Text(
                text = dishName,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                color = Black,
                modifier = Modifier
                    .padding(start = 10.dp, top = 20.dp, bottom = 0.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(top = 10.dp, start = 20.dp, end = 20.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = price.toString(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Black,
                    color = Primary,
                    modifier = Modifier

                )

                Surface(
                    shape = RoundedCornerShape(0.dp),
                    color = Primary,
                    modifier = Modifier
                        .size(22.dp)
                        .clip(RoundedCornerShape(5.dp))

                ) {
                    Image(
                        painterResource(id = R.drawable.add_basket),
                        contentDescription = "",
                        modifier = Modifier

                            .padding(2.dp)

                    )

                }

            }


        }


    }
}