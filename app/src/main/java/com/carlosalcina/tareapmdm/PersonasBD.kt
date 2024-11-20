package com.carlosalcina.tareapmdm

import com.carlosalcina.tareapmdm.model.EstadoConversacion
import com.carlosalcina.tareapmdm.model.Persona

object PersonasBD {
    val personas = listOf(
        Persona(
            0,
            "Lucas",
            R.drawable.pfp1,
            "Qué tal tio?",
            "23:45",
            EstadoConversacion.CONTESTADO
        ),
        Persona(
            1,
            "Juan",
            R.drawable.pfp2,
            "¿Cómo estás?",
            "22:30",
            EstadoConversacion.LEIDO
        ),
        Persona(
            2,
            "Pepe",
            R.drawable.pfp3,
            "¡Hola!",
            "21:15",
            EstadoConversacion.ENVIADO
        ),
        Persona(
            3,
            "Manolo",
            R.drawable.pfp4,
            "¿Qué pasa?",
            "20:00",
            EstadoConversacion.NO_ENVIADO
        ),
        Persona(
            4,
            "Lucia",
            R.drawable.pfp5,
            "¡Nos vemos luego!",
            "18:45",
            EstadoConversacion.LEIDO
        ),
        Persona(
            5,
            "Ana",
            R.drawable.pfp6,
            "Luego hablamos",
            "17:30",
            EstadoConversacion.ENVIADO
        ),
        Persona(
            6,
            "Maria",
            R.drawable.pfp7,
            "Buenas tardes",
            "16:00",
            EstadoConversacion.CONTESTADO
        ),
        Persona(
            7,
            "Juan",
            R.drawable.pfp8,
            "A qué hora quedam",
            "15:20",
            EstadoConversacion.LEIDO
        )
    )
}