package com.example.food_edeliveryapp.MainPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.Components.Companies
import com.example.food_edeliveryapp.Components.FoodDishes
import com.example.food_edeliveryapp.Navigation.MainScreen
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)

@Preview(showBackground = true)
@Composable
fun UserPage(
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, top = 30.dp, end = 0.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp,)
                .padding(top = 17.dp, start = 20.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {

            // later use stringAnnotation here
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Black,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("Hello ")

                    }

                    withStyle(
                        style = SpanStyle(
                            color = Primary,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Black
                        )
                    ) {
                        append("John!")

                    }
                },
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = White,

                )

            Spacer(modifier = Modifier.width(160.dp))

            Text(
                text = "HOME",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Secondary,
                modifier = Modifier
                    .padding(end = 10.dp)

            )


            Image(
                painterResource(id = R.drawable.location),
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)

            )


        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(top = 30.dp, end = 20.dp, start = 20.dp),
            onClick = {}) {

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .fillMaxWidth()
                    .background(PrimaryLight, RoundedCornerShape(20.dp))
            ) {


                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = White,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append("   GET ")

                        }

                        withStyle(
                            style = SpanStyle(
                                color = Black,
                                fontSize = 26.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                        ) {
                            append("50% ")

                        }

                        withStyle(
                            style = SpanStyle(
                                color = White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                        ) {
                            append("AS A JOINING BONUS")

                        }


                    },
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = White,

                    )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 50.dp)
                ) {


                    Column(
                    ) {

                        Text(
                            text = "use code on checkout",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = White,
                            modifier = Modifier
                                .padding(top = 20.dp)


                        )

                        Text(
                            text = "NEW50",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Black,
                            color = Black,
                            modifier = Modifier


                        )


                    }

                    Image(
                        painter = painterResource(id = R.drawable.thumbs_up),
                        contentDescription = "",
                        modifier = Modifier
                            .size(900.dp)
                            .padding(bottom = 10.dp)
                            .weight(1f),
                        contentScale = ContentScale.Crop
                    )

                }


            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, bottom = 30.dp)
        ) {

            Text(
                text = "RECOMMENDED FOR YOU",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .padding(start = 20.dp, top = 30.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 17.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                FoodDishes(
                    painterResource(id = R.drawable.egg_salad),
                    dishName = "Egg Salad ",
                    price = "$ 5.00"
                )

                FoodDishes(
                    painterResource(id = R.drawable.grilled_salmon),
                    dishName = "Egg Salad ",
                    price = "$ 5.00"
                )

            }

            Text(
                text = "RESTAURANTS",
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .padding(start = 20.dp, top = 30.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {

            LazyRow(
                contentPadding = PaddingValues(horizontal = 0.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp)
            ) {
                item {
                    Companies(

                        painterResource(id = R.drawable.restaurant1)
                    )
                }
                item {
                    Companies(
                        painterResource(id = R.drawable.company_logo2)
                    )
                }
                item {
                    Companies(
                        painterResource(id = R.drawable.restaurant1)

                    )
                }
                item {
                    Companies(

                        painterResource(id = R.drawable.company_logo2)
                    )
                }
            }

        }

        MainScreen()
    }

}
