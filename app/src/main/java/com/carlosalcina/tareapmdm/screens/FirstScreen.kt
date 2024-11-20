package com.carlosalcina.tareapmdm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.carlosalcina.tareapmdm.R
import com.carlosalcina.tareapmdm.model.EstadoConversacion
import com.carlosalcina.tareapmdm.model.Persona
import com.carlosalcina.tareapmdm.navigations.AppScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.window.Dialog

@Composable
fun FirstScreen(navController: NavController, personas: List<Persona>){
    ListaChats(navController, personas)
}


@Composable
fun ListaChats(navController: NavController, personas: List<Persona>) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Header()
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
        ) {
            items(personas.size) { index ->
                Chat(personas[index], navController)
            }
        }
    }

}

@Composable
fun EstadoMensaje(status: EstadoConversacion) {
    when (status) {
        EstadoConversacion.ENVIADO -> {
            Row {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Enviado",
                    tint = colorResource(id = R.color.gris),
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Enviado",
                    tint = colorResource(id = R.color.gris),
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        EstadoConversacion.LEIDO -> {
            Row {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "LEIDO",
                    tint = Color.Blue,
                    modifier = Modifier.size(20.dp)
                )
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "LEIDO",
                    tint = Color.Blue,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        EstadoConversacion.NO_ENVIADO -> {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = "No enviado",
                tint = colorResource(id = R.color.gris),
                modifier = Modifier.size(20.dp)
            )
        }

        EstadoConversacion.CONTESTADO -> {}
    }
}

@Composable
fun Chat(persona: Persona, navController: NavController) {
    HorizontalDivider(
        modifier = Modifier
            .background(colorResource(id = R.color.gris))
            .height(3.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .clickable(onClick = {navController.navigate(route = AppScreen.SecondScreen.route + "/${persona.id}")})
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            ImagenPerfil(persona)
            NombrePersona(persona)
        }
        HoraUltima(persona)

    }
}

@Composable
fun HoraUltima(persona: Persona) {
    Text(
        text = persona.ultimaHoraConectado,
        color = colorResource(id = R.color.grisClaro),
        fontSize = 18.sp,
        modifier = Modifier.padding(20.dp)
    )
}


@Composable
fun ImagenPerfil(persona: Persona) {
    var isDialogOpen = remember { mutableStateOf(false) }

    Image(
        painter = painterResource(id = persona.image),
        contentDescription = "Foto de perfil",
        modifier = Modifier
            .padding(10.dp)
            .size(85.dp)
            .clip(CircleShape)
            .border(2.dp, colorResource(id = R.color.gris), CircleShape)
            .clickable { isDialogOpen.value = true }, // al hacer clic, se abre el Dialog
        contentScale = ContentScale.Crop
    )

    if (isDialogOpen.value) {
        FullScreenImageDialog(persona.image, onDismiss = { isDialogOpen.value = false })
    }
}

@Composable
fun FullScreenImageDialog(imageId: Int, onDismiss: () -> Unit) {
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onDismiss() }, // Cerrar al hacer clic fuera de la imagen
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Foto de perfil a pantalla completa",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
    }
}




@Composable
fun NombrePersona(persona: Persona) {
    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Text(
            text = persona.nombre,
            color = colorResource(id = R.color.blanco),
            fontSize = 25.sp,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
        Row {
            EstadoMensaje(persona.estadoConversacion)
            Text(
                text = persona.ultimoChat,
                color = colorResource(id = R.color.grisClaro),
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 5.dp)
            )

        }

    }
}


@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .background(colorResource(id = R.color.verdeWhatsApp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
                .align(Alignment.TopStart),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(30.dp),
                text = stringResource(id = R.string.incio),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.blanco)
            )
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
fun SearchIcon() {
    IconButton(onClick = { }) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Buscar",
            tint = colorResource(id = R.color.blanco),
            modifier = Modifier.size(35.dp)
        )
    }
}

@Composable
fun CameraIcon() {
    IconButton(onClick = { }) {
        Icon(
            imageVector = Icons.Filled.Camera,
            contentDescription = "Cámara",
            tint = colorResource(id = R.color.blanco),
            modifier = Modifier.size(35.dp)
        )
    }
}