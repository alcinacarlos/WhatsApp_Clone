package com.carlosalcina.tareapmdm.model


data class Persona(
    val id: Int,
    val nombre: String,
    val image: Int,
    val ultimaHoraConectado: String,
    val mensajes: List<Mensaje>
)