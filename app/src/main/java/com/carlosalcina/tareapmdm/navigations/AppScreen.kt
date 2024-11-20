package com.carlosalcina.tareapmdm.navigations

sealed class AppScreen(val route: String) {
    object FirstScreen: AppScreen("FirstScreen")
    object SecondScreen : AppScreen("SecondScreen")
}