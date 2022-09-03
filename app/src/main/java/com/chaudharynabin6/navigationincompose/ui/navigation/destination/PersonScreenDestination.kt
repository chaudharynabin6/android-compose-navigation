package com.chaudharynabin6.navigationincompose.ui.navigation.destination

import androidx.compose.runtime.Composable
import androidx.navigation.*
import com.chaudharynabin6.navigationincompose.data.Person
import com.chaudharynabin6.navigationincompose.ui.navigation.core.ScreenSpec
import com.chaudharynabin6.navigationincompose.ui.screens.PersonScreen

class PersonScreenDestination : ScreenSpec {

    companion object {
        const val base_route = "person_screen"

        //        required args
        const val person = "user"

        fun withArgs(
            person: Person,
        ): String {
            val base32String = person.toBase32()
            return "$base_route/$base32String"
        }
    }

    override val route: String
        get() = "$base_route/{$person}"

    override val arguments: List<NamedNavArgument>
        get() = listOf(
            navArgument(person) {
                type = NavType.StringType
            }
        )

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
        val jsonString = navBackStackEntry.arguments?.getString(Companion.person)!!
        val person = Person.instance.toEntity(jsonString)
        PersonScreen(
            navController,
            person = person
        )
    }


}