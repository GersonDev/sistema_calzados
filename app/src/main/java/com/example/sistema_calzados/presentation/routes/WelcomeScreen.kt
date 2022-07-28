package com.example.sistema_calzados.presentation.routes

sealed class WelcomeScreen(val route:String) {
    object Bienvenida: WelcomeScreen("BienvenidaPantalla")
    object Registrar: WelcomeScreen("registrarPantalla")
    object Login: WelcomeScreen("loginPantalla")
}