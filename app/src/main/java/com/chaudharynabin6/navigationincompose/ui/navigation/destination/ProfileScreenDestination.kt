package com.chaudharynabin6.navigationincompose.ui.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.chaudharynabin6.navigationincompose.ui.navigation.core.ScreenSpec
import com.chaudharynabin6.navigationincompose.ui.screens.ProfileScreen

class ProfileScreenDestination : ScreenSpec {

    companion object {
        const val base_route = "profile_route"

        //        required args
        const val firstName = "firstname"

        //        optional args
        const val lastName = "lastname"
        const val isProfile = "isHome"

        fun withArgs(
            firstName: String,
            lastName: String = "",
            isProfile: Boolean = false,
        ): String {
            return "$base_route/$firstName?${Companion.isProfile}=$isProfile&${Companion.lastName}=$lastName"
        }
    }

    override val route: String
        get() = "$base_route/{$firstName}?$isProfile={$isProfile}&$lastName={$lastName}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(firstName) {
                type = NavType.StringType
            },
            navArgument(lastName) {
                type = NavType.StringType
                defaultValue = ""
            },
            navArgument(isProfile) {
                type = NavType.BoolType
                defaultValue = false
            }
        )

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
        ProfileScreen(
            navController,
            navBackStackEntry.arguments?.getString(firstName)
                ?: ("Unknown Name" + navBackStackEntry.arguments?.getString(
                    lastName)),
            isProfile = navBackStackEntry.arguments?.getBoolean(isProfile) ?: false
        )
    }




}