package com.chaudharynabin6.navigationincompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.chaudharynabin6.navigationincompose.data.Person
import com.chaudharynabin6.navigationincompose.data.User
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.PersonScreenDestination
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.UserScreenDestination

@Composable
fun SearchScreen(
    navController: NavController,
    query: String,
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = query)

        TextButton(onClick = {
            navController.navigate(
                UserScreenDestination.withArgs(User("Nabin Chaudahry#", 100))
            )

        }
        ) {
            Text(text = "Navigate to User Screen")
        }

        TextButton(onClick = {
            navController.navigate(
                PersonScreenDestination.withArgs(Person("Nabin Chaudahry# ?/.#$%^&@$^&*(!)_+~ œ", 100))
            )

        }
        ) {
            Text(text = "Navigate to Person Screen")
        }
    }
}