package com.carlosalcina.tareapmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.carlosalcina.tareapmdm.navigations.AppNavigation



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        PersonasBD.generarPersonas(100)
        setContent {
            AppNavigation(PersonasBD.personas)
        }
    }
}





