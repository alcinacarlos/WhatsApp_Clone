package com.carlosalcina.tareapmdm.model


data class Persona(
    val id: Int,
    val nombre: String,
    val image: Int,
    val ultimoChat: String,
    val ultimaHoraConectado: String,
    val estadoConversacion: EstadoConversacion
)