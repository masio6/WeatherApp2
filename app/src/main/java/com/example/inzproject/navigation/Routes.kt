package com.example.inzproject.navigation

sealed class Routes(val route: String) {
    object Splash : Routes("splash_screen")
    object Main : Routes("main_screen")
}