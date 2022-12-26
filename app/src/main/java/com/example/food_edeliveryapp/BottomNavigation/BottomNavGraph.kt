package com.example.jobfinder_app.Navigation.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.AccountSetup.ProfileScreen
import com.example.food_edeliveryapp.AddedItems.BasketScreen
import com.example.food_edeliveryapp.AddedItems.LikedScreen
import com.example.food_edeliveryapp.MainPages.UserPage
import com.example.food_edeliveryapp.searchScreen.Searching

@Composable
fun BottomNavGraph(navController: NavHostController) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {

        composable(route = BottomBarScreen.Home.route) {
            UserPage(navController = navController)
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

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }


}