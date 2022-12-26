package com.example.food_edeliveryapp.MainPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.ButtonClick
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar

@Composable
fun SalmonDishUi() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomBar(navController = navController)
    }) {
        LazyColumn{
            item{
                SalmonDish()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SalmonDish() {

    Column(modifier = Modifier.fillMaxSize()) {
        val navController = rememberNavController()




        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.salmon_image),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )


            //Back Arrow Icon
            Surface(
                shape = RoundedCornerShape(0.dp),
                color = White.copy(alpha = 0.5f),
                elevation = 5.dp,
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp)
                    .size(25.dp)
                    .clip(RoundedCornerShape(5.dp))

            ) {
                Image(
                    painterResource(id = R.drawable.back_arrow),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(3.dp)

                )
            }
            //options icon

            //Back Arrow Icon
            Surface(
                shape = RoundedCornerShape(0.dp),
                color = White.copy(alpha = 0.5f),
                elevation = 5.dp,
                modifier = Modifier
                    .padding(start = 340.dp, top = 50.dp)
                    .size(25.dp)
                    .clip(RoundedCornerShape(5.dp))

            ) {
                Image(
                    painterResource(id = R.drawable.options),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(3.dp)

                )
            }


        }

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()

                .padding(
                    start = 20.dp, end = 20.dp,
                    top = 20.dp, bottom = 0.dp
                )
        ) {

            Column(verticalArrangement = Arrangement.Center)
            {
                Text(
                    text = "SALMON",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Black,
                    color = Black,
                    modifier = Modifier

                )

                Text(
                    text = "The Nautilus",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Secondary,
                    modifier = Modifier

                )


            }//

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 10.dp)
            )
            {
                Image(
                    painterResource(id = R.drawable.clock),
                    contentDescription = "",
                    modifier = Modifier
                        .size(20.dp)

                )

                Text(
                    text = "34 mins",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Secondary,
                    modifier = Modifier
                        .padding(end = 20.dp)

                )

            }
        }

        Column(
            modifier = Modifier.padding(
                start = 20.dp, end = 20.dp,
                top = 30.dp, bottom = 30.dp,
            )
        )
        {
            Text(
                text = "DESCRIPTION",
                fontSize = 12.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier

            )

            Text(
                text = stringResource(id = R.string.description),
                fontSize = 14.sp,
                fontWeight = FontWeight.Black,
                color = Color.Gray,
                modifier = Modifier

            )


            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(
                        start = 0.dp, end = 20.dp,
                        top = 20.dp, bottom = 0.dp
                    )
            ) {

                Column(verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "QUANTITY",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = Primary,
                        modifier = Modifier
                            .padding(start = 20.dp)

                    )

                    Surface(
                        shape = RoundedCornerShape(0.dp),
                        color = LightWhite,
                        elevation = 5.dp,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .size(width = 170.dp, height = 50.dp)
                            .clip(RoundedCornerShape(20.dp))

                    ) {

                        //add items here later
                        Text(
                            text = "1",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Black,
                            modifier = Modifier
                                .padding(start = 20.dp, top = 10.dp)

                        )

                        Spacer(modifier = Modifier.width(100.dp))

                        Image(
                            painterResource(id = R.drawable.subtract),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(start = 30.dp)

                        )

                        Image(
                            painterResource(id = R.drawable.add),
                            contentDescription = "",
                            modifier = Modifier

                                .padding(start = 110.dp, end = 0.dp)

                        )


                    }


                }

                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(top = 0.dp)
                )
                {
                    Text(
                        text = "SUB TOTAL",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Black,
                        color = Black,
                        modifier = Modifier
                            .padding(start = 20.dp)

                    )

                    Text(
                        text = "$15.00",
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Bold,
                        color = Primary,
                        modifier = Modifier
                            .padding(start = 20.dp)

                    )

                }
            }


        }

        ButtonClick(
            buttonText = "ADD TO BASKET",
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp)
        )

    }
}