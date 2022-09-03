package com.chaudharynabin6.navigationincompose.ui.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.chaudharynabin6.navigationincompose.data.User
import com.chaudharynabin6.navigationincompose.ui.navigation.core.ScreenSpec
import com.chaudharynabin6.navigationincompose.ui.screens.UserScreen

class UserScreenDestination : ScreenSpec {

    companion object {
        const val base_route = "user_screen"

        //        required args
        const val user = "user"

        fun withArgs(
            user: User,
        ): String {
            val jsonString = User.toJson(user)
            return "$base_route/$jsonString"
        }
    }

    override val route: String
        get() = "$base_route/{$user}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(user) {
                type = NavType.StringType
            }
        )

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
        val jsonString = navBackStackEntry.arguments?.getString(Companion.user)!!
        val user = User.toUser(jsonString)
        UserScreen(
            navController,
            user = user
        )
    }


}