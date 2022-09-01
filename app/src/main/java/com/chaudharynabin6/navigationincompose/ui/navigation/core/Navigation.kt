package com.chaudharynabin6.navigationincompose.ui.navigation.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.HomeScreenDestination


@Composable
fun Navigation() {

    val navController = rememberNavController()
//    https://www.anycodings.com/questions/compose-navigation-destination-is-not-a-direct-child-of-this-navgraph-when-start-destination-having-args
//    you cannot pass the navigation argument in first screen
    NavHost(navController = navController, startDestination = HomeScreenDestination.withArgs(
        name = "Navin",
        isHome = true
    )) {

        ScreenSpec.allScreens.forEach { screen ->
            composable(
                screen.route,
                screen.arguments,
                screen.deepLinks,
            ) {
                screen.Content(navController, it)
            }
        }
    }
}
