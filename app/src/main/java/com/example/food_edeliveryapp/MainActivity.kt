package com.example.food_edeliveryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.AddedItems.BasketScreen
import com.example.food_edeliveryapp.AddedItems.BasketScreenUi
import com.example.food_edeliveryapp.MainPages.SalmonDishUi
import com.example.food_edeliveryapp.MainPages.UserPage
import com.example.food_edeliveryapp.ui.theme.FOODEDeliveryAppTheme
import com.example.food_edeliveryapp.ui.theme.Primary
import com.example.jobfinder_app.Navigation.BottomNavigation.BottomBar
import com.google.accompanist.systemuicontroller.rememberSystemUiController

// this is a Main Activity screen with an
// Onboard transition effect to the Get Started screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FOODEDeliveryAppTheme {
                // A surface container using the 'background' color from the theme
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = Primary,
                        darkIcons = false
                    )
//
                    systemUiController.setStatusBarColor(color = Primary)
                }
                val navController = rememberNavController()

                Scaffold(
                    content = {

//                        UserPage(navController = navController)
                              BasketScreenUi()

                    },
                    bottomBar = {
                        BottomBar(navController = navController)
                    })
            }
        }
    }

}

@Composable
fun Preview(navController: NavController) {

    UserPage(navController = navController)

}