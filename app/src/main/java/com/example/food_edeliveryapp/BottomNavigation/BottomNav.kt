package com.example.jobfinder_app.Navigation.BottomNavigation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.food_edeliveryapp.ui.theme.Black
import com.example.food_edeliveryapp.ui.theme.Primary


@Composable
fun BottomNav() {
    val navController = rememberNavController()


}

@SuppressLint("SuspiciousIndentation")
@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Search,
        BottomBarScreen.Basket,
        BottomBarScreen.Like,
        BottomBarScreen.Profile,
    )


    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination



    BottomNavigation {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        modifier = Modifier.background(White),

        icon = {
            Icon(
                painterResource(id = screen.icon),
                contentDescription = "Navigation Icon",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(20.dp),
                tint = Black
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
//            navController.navigate(screen.route) {
//                popUpTo(navController.graph.findStartDestination().id)
//                launchSingleTop = true

            navController.graph.startDestinationRoute?.let {
                navController.popBackStack(it, true)
            }
            navController.navigate(screen.route) {
                launchSingleTop = true

            }
        },
        unselectedContentColor = LocalContentColor.current
            .copy(alpha = ContentAlpha.disabled),

        selectedContentColor = Primary,

        )
}













