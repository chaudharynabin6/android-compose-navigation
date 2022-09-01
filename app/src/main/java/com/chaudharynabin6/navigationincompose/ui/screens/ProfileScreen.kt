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
import com.chaudharynabin6.navigationincompose.ui.navigation.Destination

@Composable
fun ProfileScreen(
    navController: NavController,
    name: String,
    isProfile: Boolean,
) {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Button(
            onClick = {
                navController.navigate(
                    Destination.SearchScreen().withArgs(
                        "Navigation"
                    )
                )
            },
        ) {
            Text(text = "Move to Search Screen")
        }

        Text(text = name)

        if (isProfile) {
            Text(text = "This is Profile Screen")
        }

    }
}