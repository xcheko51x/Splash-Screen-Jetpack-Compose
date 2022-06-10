package com.example.splashscreenjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import androidx.navigation.compose.rememberNavController

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Pantallas.SplashScreen.route
    ) {
        composable(Pantallas.SplashScreen.route) {
            SplashScreen(navController)
        }

        composable(Pantallas.PantallaPrincipal.route) {
            PantallaPrincipal()
        }
    }
}