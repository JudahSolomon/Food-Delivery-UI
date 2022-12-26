package com.example.food_edeliveryapp.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food_edeliveryapp.R
import com.example.food_edeliveryapp.ui.theme.ErrorColor
import com.example.food_edeliveryapp.ui.theme.LightWhite
import com.example.food_edeliveryapp.ui.theme.Primary


@Composable
fun EmailAndPasswordField(
    modifier: Modifier = Modifier,
    label: String,
    fieldName: String,
    valueState: MutableState<String>,
    enabled: Boolean,
    isSingleLine: Boolean,
    email: String?,
    password: String?,
    confirmPassword: String?,
    phone: String?,
    address: String?,
    onAction: KeyboardActions = KeyboardActions.Default,
    imeiAction: ImeAction = ImeAction.Next


) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }

    Text(
        text = label,
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 5.dp)
    )
    //email Textfield

    OutlinedTextField(
        value = email,
        onValueChange = {
        },
        label = {
            Text(text = email, color = Primary)
        },

        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Primary,
            textColor = Primary

        ),
        keyboardOptions = KeyboardOptions(
            keyboardType =
            KeyboardType.Email
        ),
        singleLine = true,

        )


}


@Composable
fun FirstNameAndLastName(
    modifier: Modifier = Modifier,
    firstName: String,
    trailingIcon: Painter? = null,
    fieldName: String

) {

    Text(
        text = fieldName,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Primary,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, bottom = 10.dp, top = 20.dp)
    )

    //firstName  Textfield

    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = firstName,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start =20.dp, top = 10.dp)
                    .height(40.dp)
            )
        },
        placeholder ={
            Text(text = "Email Address")
        },
        singleLine = true,
        trailingIcon = {

            if (trailingIcon != null) {
                Icon(
                    painter = painterResource(id = R.drawable.trash),
                    contentDescription = "trailing",
                    modifier = Modifier
                        .size(20.dp),
                    tint = Primary

                )
            }
        },

        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = LightWhite,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
    )


}

@Composable
fun PasswordField(
    password: String,
    label: String
) {

    // PASSWORD FIELD

    Text(
        text = label,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = Primary,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, top = 30.dp, bottom = 10.dp)
    )

    TextField(
        value = "",
        onValueChange = {
        },
        label = {
            Text(
                text = password,
                color = Color.DarkGray,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 20.dp, top = 10.dp)
            )
        },

        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp)
            .padding(top = 0.dp)
            .background(
                color = LightWhite,
                shape = RoundedCornerShape(30.dp),

            )
            .clip(RoundedCornerShape(30.dp)),
        keyboardOptions = KeyboardOptions(
            keyboardType =
            KeyboardType.Text
        ),
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = LightWhite,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),

        trailingIcon = {

            Icon(
                painterResource(id = com.example.food_edeliveryapp.R.drawable.toggle_password),
                contentDescription = "Location Icon",
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(20.dp),
                tint = Primary
            )
        }

    )
}
