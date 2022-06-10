package com.example.splashscreenjetpackcompose

sealed class Pantallas (val route: String) {
    object SplashScreen: Pantallas("splash_screen")
    object PantallaPrincipal: Pantallas("pantalla_principal")
}