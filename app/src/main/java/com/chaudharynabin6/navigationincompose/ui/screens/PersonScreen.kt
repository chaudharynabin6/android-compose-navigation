package com.chaudharynabin6.navigationincompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.chaudharynabin6.navigationincompose.data.Person
import com.chaudharynabin6.navigationincompose.data.User

@Composable
fun PersonScreen(
    navController: NavController,
    person: Person,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "${person.toString()}")
    }
}