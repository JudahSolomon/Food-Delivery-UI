package com.example.food_edeliveryapp.AddedItems

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Error
import com.example.food_edeliveryapp.ui.theme.Primary


@OptIn(ExperimentalMaterialApi::class)

@Composable
fun Like(

    titleText: String,
    amount: String,
    dishImage: Painter,
    number: Int? = null,
    addOrDelete: Painter,
    backgroundColor: Color? = null,
    dropDownIcon: Icon? = null,
    dishName: String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 50.dp, start = 20.dp, end = 20.dp
            )
    ) {

        Text(
            text = titleText,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.padding(bottom = 30.dp)


        )

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Surface(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(10.dp, 10.dp)),


                ) {
                Image(
                    painter = dishImage,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 0.dp),
                    contentScale = ContentScale.Crop
                )


            }

            Column(
                modifier = Modifier.padding(start = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = dishName,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Black,
                    modifier = Modifier.padding(bottom = 30.dp)

                )

                Text(
                    text = amount.toString(),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier

                )
            }

            Spacer(modifier = Modifier.width(120.dp))

            addAndDeleteIcons()


        }

    }


}


@Preview(showBackground = true)
@Composable
fun addToBasketIcon() {
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

@Preview(showBackground = true)
@Composable
fun deleteIcon() {
    Surface(
        shape = RoundedCornerShape(0.dp),
        color = Error,
        modifier = Modifier
            .size(20.dp)
            .clip(RoundedCornerShape(5.dp))

    ) {
        Image(
            painterResource(id = R.drawable.trash),
            contentDescription = "",
            modifier = Modifier

                .padding(2.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun addAndDeleteIcons() {

    Column(
        modifier = Modifier.padding(start = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        deleteIcon()
        Spacer(modifier = Modifier.heightIn(30.dp))

        addToBasketIcon()
    }
}