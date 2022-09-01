package com.chaudharynabin6.navigationincompose.ui.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.chaudharynabin6.navigationincompose.ui.navigation.core.ScreenSpec
import com.chaudharynabin6.navigationincompose.ui.screens.SearchScreen

class SearchScreenDestination : ScreenSpec {

    companion object {
        const val base_route = "search_screen"

        //        required args
        const val query = "firstname"

        fun withArgs(
            query: String,
        ): String {
            return "$base_route/$query"
        }
    }

    override val route: String
        get() = "$base_route/{$query}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(query) {
                type = NavType.StringType
            }
        )

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
        SearchScreen(
            navController,
            query = navBackStackEntry.arguments?.getString(query) ?: ""
        )
    }




}