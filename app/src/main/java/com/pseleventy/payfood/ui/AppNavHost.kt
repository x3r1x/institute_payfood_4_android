package com.pseleventy.payfood.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object MainPage

@Serializable
object TopUpPage

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = MainPage
    ) {
        composable<MainPage> {
            MainPageComponent { navController.navigate(TopUpPage) }
        }

        composable<TopUpPage> {
            TopUpPageComponent { navController.popBackStack() }
        }
    }
}