//package com.chaudharynabin6.navigationincompose.ui.navigation
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.chaudharynabin6.navigationincompose.ui.screens.HomeScreen
//import com.chaudharynabin6.navigationincompose.ui.screens.ProfileScreen
//import com.chaudharynabin6.navigationincompose.ui.screens.SearchScreen
//
//@Composable
//fun Navigation() {
//
//    val navController = rememberNavController()
//
//    NavHost(navController = navController, startDestination = Destination.HomeScreen.route) {
//
////         HomeScreen
//        composable(
//            route = Destination.HomeScreen.route,
//        ) {
//            HomeScreen(navController)
//        }
//
//
//        //ProfileScreen
//        composable(
//            route = Destination.ProfileScreen().route,
//            arguments = Destination.ProfileScreen().navArgument
//        )
//        { entry ->
//            ProfileScreen(
//                navController = navController,
//                name = entry.arguments?.getString(Destination.ProfileScreen.name) ?: "Unknown Name"
//            )
//        }
//
//        //SearchScreen
//        composable(
//            route = Destination.SearchScreen().route,
//            arguments = Destination.SearchScreen().navArgument
//        ) { entry ->
//            SearchScreen(
//                navController = navController,
//                query = entry.arguments?.getString(Destination.SearchScreen.query) ?: ""
//            )
//        }
//
//    }
//}