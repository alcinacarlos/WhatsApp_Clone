package com.carlosalcina.tareapmdm.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.carlosalcina.tareapmdm.R
import com.carlosalcina.tareapmdm.model.Mensaje
import com.carlosalcina.tareapmdm.model.Persona

@Composable
fun SecondScreen(navController: NavController, persona: Persona) {
    Column {
        HeaderEnChat(navController, persona)
        Chat(persona)
    }

}

@Composable
fun ChatBubble(
    mensaje: Mensaje
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp),
        horizontalArrangement = if (mensaje.emisor) Arrangement.End else Arrangement.Start
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = if (mensaje.emisor) colorResource(R.color.conversacion) else colorResource(
                        R.color.blanco
                    ), shape = RoundedCornerShape(16.dp)
                )
                .padding(10.dp)
                .widthIn(max = 300.dp, min = 100.dp)
        ) {
            Column {
                Text(
                    text = mensaje.texto, color = colorResource(R.color.black)
                )
                Text(
                    text = mensaje.hora,
                    color = colorResource(R.color.gris),
                    modifier = Modifier.align(Alignment.End)
                )
            }

        }
    }
}

@Composable
fun Chat(persona: Persona) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )
        val mensajes = persona.mensajes
        LazyColumn(
            modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(10.dp)
        ) {
            items(mensajes.size) { index ->
                val mensaje = mensajes[index]
                ChatBubble(mensaje)
            }
        }

    }
}

@Composable
fun HeaderEnChat(navController: NavController, persona: Persona) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(colorResource(id = R.color.verdeWhatsApp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
                .align(Alignment.TopStart),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                BackButton(navController)
                ImagenChat(persona)
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxHeight()
                ) {
                    Text(
                        text = persona.nombre,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.blanco)
                    )
                    Text(
                        text = "Ultima vez: ${persona.ultimaHoraConectado}",
                        color = colorResource(R.color.gris),
                        modifier = Modifier.padding(5.dp)
                    )
                }

            }

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(10.dp)
            ) {
                SearchIcon()
                CameraIcon()
            }
        }
    }
}

@Composable
fun ImagenChat(persona: Persona) {
    var isDialogOpen = remember { mutableStateOf(false) }

    Image(
        painter = painterResource(id = persona.image),
        contentDescription = "Foto de perfil",
        modifier = Modifier
            .size(75.dp)
            .clip(CircleShape)
            .border(2.dp, colorResource(id = R.color.gris), CircleShape)
            .clickable { isDialogOpen.value = true },
        contentScale = ContentScale.Crop
    )

    if (isDialogOpen.value) {
        FotoDePerfilPantallaCompleta(persona.image, onDismiss = { isDialogOpen.value = false })
    }
}

@Composable
fun BackButton(navController: NavController) {
    IconButton(onClick = { navController.popBackStack() }) {
        Icon(
            imageVector = Icons.AutoMirrored.Default.ArrowBack,
            contentDescription = "Atrás",
            tint = colorResource(id = R.color.blanco),
            modifier = Modifier.size(30.dp)
        )
    }
}