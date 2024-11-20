package com.carlosalcina.tareapmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.carlosalcina.tareapmdm.model.EstadoConversacion
import com.carlosalcina.tareapmdm.model.Persona
import com.carlosalcina.tareapmdm.navigations.AppNavigation



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation(PersonasBD.personas)
        }
    }
}





