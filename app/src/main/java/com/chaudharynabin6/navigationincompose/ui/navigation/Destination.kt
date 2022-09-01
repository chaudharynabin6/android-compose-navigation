package com.chaudharynabin6.navigationincompose.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Destination(val route: String, val navArgument: List<NamedNavArgument>) {

    object HomeScreen : Destination("home_screen", listOf())
    class ProfileScreen() : Destination("${route}/{${name}}", listOf(
        navArgument(name) {
            type = NavType.StringType
        }
    )) {
        //        names of args
        companion object {
            const val route = "profile_screen"
            const val name = "name"
        }

        fun withArgs(vararg args: String): String {
            return buildString {
                append(ProfileScreen.route)
                args.forEach { arg ->
                    append("/$arg")
                }
            }
        }
    }


    class SearchScreen() : Destination("${route}/{${query}}", listOf(
        navArgument(query) {
            type = NavType.StringType
        }

    )) {

        //        names of args
        companion object {
            const val route = "search_screen"
            const val query = "query"
        }

        fun withArgs(vararg args: String): String {
            return buildString {
                append(SearchScreen.route)
                args.forEach { arg ->
                    append("/$arg")
                }
            }
        }
    }


}