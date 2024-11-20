package com.carlosalcina.tareapmdm.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.carlosalcina.tareapmdm.R
import com.carlosalcina.tareapmdm.model.Persona
import com.carlosalcina.tareapmdm.screens.FirstScreen
import com.carlosalcina.tareapmdm.screens.SecondScreen


@Composable
fun AppNavigation(personas: List<Persona>){
    val navControlador = rememberNavController()
    
    NavHost(navController = navControlador, startDestination = AppScreen.FirstScreen.route) {
        composable(AppScreen.FirstScreen.route){
            FirstScreen(navControlador, personas)
        }
        composable(
            route = AppScreen.SecondScreen.route + "/{id}",
            arguments = listOf(navArgument(name = "id") {type=
                NavType.IntType})
        ) {

            val id = it.arguments?.getInt("id") ?: 1
            val persona = personas.find { it.id == id }!!

            SecondScreen(navControlador, persona)
        }
    }
}