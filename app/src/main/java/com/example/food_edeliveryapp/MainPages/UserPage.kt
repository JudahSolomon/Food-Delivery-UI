package com.example.food_edeliveryapp.MainPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.Components.Companies
import com.example.food_edeliveryapp.Components.FoodDishes
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)


@Composable
fun UserPage(
    navController: NavController
) {

    val navController = rememberNavController()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, top = 0.dp,
                end = 0.dp,bottom = 40.dp)

    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(top = 5.dp, start = 20.dp),
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
                modifier = Modifier.padding(end = 10.dp)

            )


            Image(
                painterResource(id = R.drawable.location),
                contentDescription = "",
                modifier = Modifier.size(20.dp)

            )


        }

        Surface(modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(
                top = 30.dp,
                end = 20.dp,
                start = 20.dp
            ), onClick = {}) {

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .fillMaxWidth()
                    .background(
                        PrimaryLight,
                        RoundedCornerShape(20.dp)
                    )
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
                            modifier = Modifier.padding(top = 20.dp)


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

        Text(
            text = "RECOMMENDED",
            fontSize = 20.sp,
            fontWeight = FontWeight.Black,
            color = Black,
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp, bottom = 30.dp)
        )

        Text(
            text = "POPULAR IN YOUR AREA",
            fontSize = 20.sp,
            fontWeight = FontWeight.Black,
            color = Black,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 30.dp)
        )

    }

    UserPageScrollSection()


}

@Preview(showBackground = true)
@Composable
fun UserPageScrollSection() {

    LazyColumn {
        item {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 290.dp)
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
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
                fontSize = 20.sp,
                fontWeight = FontWeight.Black,
                color = Black,
                modifier = Modifier
                    .padding(start = 30.dp, top = 30.dp, bottom = 30.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    contentPadding = PaddingValues(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    item {
                        Companies(
                            companyLogo =
                            painterResource(id = R.drawable.company_logo1)
                        )
                    }

                    item {
                        Companies(
                            companyLogo =
                            painterResource(id = R.drawable.company_logo2)
                        )
                    }

                    item {
                        Companies(
                            companyLogo =
                            painterResource(id = R.drawable.company_logo3)
                        )
                    }

                    item {
                        Companies(
                            companyLogo =
                            painterResource(id = R.drawable.company_logo4)
                        )


                    }
                }

                Text(
                    text = "RESTAURANTS",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    color = Black,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 20.dp, bottom = 30.dp)
                )
            }
        }
    }
}



