package com.iessanalberto.clubbaloncestojaca.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iessanalberto.clubbaloncestojaca.screens.AlevinesScreen
import com.iessanalberto.clubbaloncestojaca.screens.CadetesScreen
import com.iessanalberto.clubbaloncestojaca.screens.InfantilesScreen
import com.iessanalberto.clubbaloncestojaca.screens.MainScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.MainScreen.route
    ) {
        composable(route = AppScreens.MainScreen.route) { MainScreen(navController) }
        composable(route = AppScreens.AlevinesScreen.route) { AlevinesScreen(navController) }
        composable(route = AppScreens.InfantilScreen.route) { InfantilesScreen(navController) }
        composable(route = AppScreens.CadeteScreen.route) { CadetesScreen(navController) }
    }
}