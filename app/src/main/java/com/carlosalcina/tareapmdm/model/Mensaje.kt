package com.carlosalcina.tareapmdm.model

data class Mensaje (
    val texto: String,
    val hora: String,
    val estadoMensaje: EstadoMensaje,
    val emisor: Boolean
)