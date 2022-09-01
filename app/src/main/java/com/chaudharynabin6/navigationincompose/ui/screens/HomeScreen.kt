package com.chaudharynabin6.navigationincompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.chaudharynabin6.navigationincompose.ui.navigation.destination.ProfileScreenDestination

@Composable
fun HomeScreen(
    navController: NavController,
    isHome : Boolean
) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Button(
            onClick = {
                navController.navigate(
                    ProfileScreenDestination.withArgs(
                        firstName = "Nabin",
                        lastName = "Chaudhary",
                        isProfile = true
                    )
                )
            },
        ) {
            Text(text = "Move to Profile Screen")
        }

    }
}