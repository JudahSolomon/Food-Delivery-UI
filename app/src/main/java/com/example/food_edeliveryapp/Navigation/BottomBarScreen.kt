package com.example.food_edeliveryapp.Navigation

import com.example.food_edeliveryapp.R

sealed class BottomBarScreen(
    val route: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.home_icon
    )

    object Search : BottomBarScreen(
        route = "search",
        icon = R.drawable.search_icon
    )

    object Basket : BottomBarScreen(
        route = "basket",
        icon = R.drawable.basket_icon
    )

    object Like : BottomBarScreen(
        route = "like",
        icon = R.drawable.like_icon
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.profile_icon
    )
}
