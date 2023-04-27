package com.iessanalberto.clubbaloncestojaca.navigation

sealed class AppScreens(val route: String) {
    object MainScreen : AppScreens(route = "main_screen")
    object AlevinesScreen : AppScreens(route = "alevines_screen")
    object InfantilScreen : AppScreens(route = "infantil_screen")
    object CadeteScreen : AppScreens(route = "cadete_screen")
}