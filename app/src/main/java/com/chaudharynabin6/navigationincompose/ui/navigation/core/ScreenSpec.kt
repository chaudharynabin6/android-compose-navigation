package com.chaudharynabin6.navigationincompose.ui.navigation.core

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.HomeScreenDestination
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.ProfileScreenDestination
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.SearchScreenDestination

//https://proandroiddev.com/compose-destinations-a-simpler-safer-way-to-navigate-in-jetpack-compose-5249ea384298
//https://www.droidcon.com/2021/11/18/compose-destinations-a-simpler-safer-way-to-navigate-in-jetpack-compose/

// you can convert the object to string and back to the object also that is possible
//https://betterprogramming.pub/navigation-with-jetpack-compose-in-android-ab84d0984ade

//https://wajahatkarim.com/2021/03/pass-parcelable-compose-navigation/
interface ScreenSpec {

    companion object {
        val allScreens = listOf<ScreenSpec>(
            HomeScreenDestination(),
            ProfileScreenDestination(),
            SearchScreenDestination()
        )
    }

    val route: String

    val arguments: List<NamedNavArgument> get() = emptyList()

    val deepLinks: List<NavDeepLink> get() = emptyList()

    @Composable
    fun Content(
        navController: NavController,
        navBackStackEntry: NavBackStackEntry
    )

}