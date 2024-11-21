package com.carlosalcina.tareapmdm.screens

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.sharp.Send
import androidx.compose.material.icons.rounded.AttachFile
import androidx.compose.material.icons.sharp.CameraAlt
import androidx.compose.material.icons.sharp.EmojiEmotions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.carlosalcina.tareapmdm.R
import com.carlosalcina.tareapmdm.model.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key

@Composable
fun SecondScreen(navController: NavController, persona: Persona) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
    ) {
        HeaderEnChat(navController, persona)

        Chat(persona)
    }
}
@Composable
fun MensajeEnChat(
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
                .widthIn(max = 300.dp, min = 50.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = mensaje.texto, color = colorResource(R.color.black)
                )
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = mensaje.hora,
                        color = colorResource(R.color.gris),
                        fontSize = 11.sp,
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .align(Alignment.Bottom)
                    )
                    EstadoMensaje(mensaje.estadoMensaje)
                }
            }

        }
    }
}

@Composable
fun Chat(persona: Persona) {
    val mensajes = remember { mutableStateListOf(*persona.mensajes.toTypedArray()) }
    val listState = rememberLazyListState()


    LaunchedEffect(mensajes.size) {
        listState.animateScrollToItem(mensajes.size - 1)
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(mensajes.size) { mensaje ->
                MensajeEnChat(mensajes[mensaje])
            }
        }

        MensajeEnviar(mensajes)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MensajeEnviar(mensajes: MutableList<Mensaje>) {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        OutlinedTextField(value = text,
            onValueChange = { text = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Sharp.EmojiEmotions,
                    contentDescription = "Emoji",
                    tint = colorResource(id = R.color.blanco)
                )
            },
            trailingIcon = {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Sharp.CameraAlt,
                        contentDescription = "Camara",
                        tint = colorResource(id = R.color.blanco)
                    )

                    Icon(
                        imageVector = Icons.Rounded.AttachFile,
                        contentDescription = "Adjuntar",
                        tint = colorResource(id = R.color.blanco)
                    )
                }
            },
            shape = RoundedCornerShape(30.dp),
            placeholder = { Text("Escribe tu mensaje...") },
            modifier = Modifier
                .width(300.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(colorResource(R.color.colorEnviarMensaje))
                .onKeyEvent { keyEvent ->
                    if (keyEvent.key == Key.Enter && text.isNotBlank()) {
                        val nuevoMensaje = Mensaje(
                            text, getFormattedTime(), EstadoMensaje.ENVIADO, true
                        )
                        mensajes.add(nuevoMensaje)
                        text = ""
                        true
                    } else {
                        false
                    }
                },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorResource(R.color.grisClaro),
                unfocusedBorderColor = colorResource(R.color.grisClaro),
            )
        )

        Button(
            modifier = Modifier.size(60.dp),
            shape = CircleShape,
            colors = ButtonColors(
                containerColor = colorResource(R.color.verdeWhatsApp),
                contentColor = colorResource(R.color.verdeWhatsApp),
                disabledContainerColor = colorResource(R.color.verdeWhatsApp),
                disabledContentColor = colorResource(R.color.verdeWhatsApp)
            ),
            onClick = {
                if (text.isNotBlank()){
                    val nuevoMensaje = Mensaje(
                        text, getFormattedTime(), EstadoMensaje.ENVIADO, true
                    )
                    mensajes.add(nuevoMensaje)
                    text = ""
                }
            },
        ) {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = Icons.AutoMirrored.Sharp.Send,
                contentDescription = "Adjuntar",
                tint = colorResource(id = R.color.blanco),
            )
        }
    }
}


fun getFormattedTime(): String {
    val time = LocalTime.now()
    val formatter = DateTimeFormatter.ofPattern("HH:mm")
    return time.format(formatter)
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