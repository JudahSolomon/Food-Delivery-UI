package com.example.food_edeliveryapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.food_edeliveryapp.AccountSetup.ProfileScreen
import com.example.food_edeliveryapp.AddedItems.BasketScreen
import com.example.food_edeliveryapp.AddedItems.LikedScreen
import com.example.food_edeliveryapp.MainPages.UserPage
import com.example.food_edeliveryapp.searchScreen.Searching

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            UserPage()
        }
        composable(route = BottomBarScreen.Search.route) {
            Searching()
        }
        composable(route = BottomBarScreen.Basket.route) {
            BasketScreen()
        }
        composable(route = BottomBarScreen.Like.route) {
            LikedScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}