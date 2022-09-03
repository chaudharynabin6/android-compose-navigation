package com.chaudharynabin6.navigationincompose.ui.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.chaudharynabin6.navigationincompose.ui.navigation.core.ScreenSpec
import com.chaudharynabin6.navigationincompose.ui.screens.HomeScreen

class HomeScreenDestination : ScreenSpec {

    companion object {
        const val base_route = "home_route"

        //        required args
        const val name = "name"

        fun withArgs(
            name: String,
            isHome: Boolean = false,
        ): String {
            return "$base_route"
        }
    }

    override val route: String
        get() = "$base_route"

    override val arguments: List<NamedNavArgument>
        get() = listOf()

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
        HomeScreen(
            navController,
            isHome = true
        )
    }




}