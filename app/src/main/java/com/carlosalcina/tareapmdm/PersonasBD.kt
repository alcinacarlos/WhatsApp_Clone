package com.carlosalcina.tareapmdm

import com.carlosalcina.tareapmdm.model.EstadoMensaje
import com.carlosalcina.tareapmdm.model.Mensaje
import com.carlosalcina.tareapmdm.model.Persona
import kotlin.random.Random

object PersonasBD {

    val nombres = listOf("Lucas", "Juan", "Pepe", "Manolo", "Lucía", "Ana", "Carlos", "María", "Elena", "David")
    val fotos = listOf(R.drawable.pfp1, R.drawable.pfp2, R.drawable.pfp3, R.drawable.pfp4, R.drawable.pfp5, R.drawable.pfp6, R.drawable.pfp7, R.drawable.pfp8)
    val contenidosMensajes = listOf(
        "Hola, ¿qué tal? Hace tiempo que no hablamos.",
        "Me preguntaba cómo te va todo. Cuéntame algo nuevo.",
        "La verdad es que últimamente he estado bastante ocupado.",
        "¿Recuerdas aquel viaje que hicimos? Qué buenos recuerdos.",
        "Estoy pensando en hacer algo este fin de semana, ¿te apuntas?",
        "Oye, ¿has visto la nueva serie de la que todo el mundo habla?",
        "¡Hace tanto que no nos vemos! ¿Cómo estás?",
        "¿Sigues en el mismo trabajo? Me gustaría saber cómo te va.",
        "He estado pensando en cambiar de móvil, ¿alguna recomendación?",
        "Hace mucho que no salgo, ¿te gustaría quedar este fin de semana?",
        "¡Te extraño! ¿Cuándo podemos ponernos al día?",
        "Estaba pensando en lo divertido que era salir los viernes por la noche, ¿te acuerdas?",
        "¿Has probado la comida tailandesa? ¡Deberíamos ir juntos!",
        "El otro día vi una película que creo que te gustaría mucho, te la tengo que contar.",
        "¿Aún sigues practicando deportes? Yo me apunté a un gimnasio nuevo.",
        "Hoy vi a un viejo amigo, me hizo pensar en lo rápido que pasa el tiempo.",
        "Recuerdo lo bien que la pasábamos en la playa, ¿te gustaría repetir?",
        "Estaba pensando en viajar a algún lugar, ¿tienes algún destino recomendado?",
        "Por cierto, ¿has estado haciendo algo nuevo últimamente?",
        "A veces me pregunto cómo sería nuestra vida si hubiéramos tomado otras decisiones."
    )
    val horas = listOf("08:30", "10:45", "12:00", "14:30", "16:15", "18:00", "19:45", "21:30", "23:05", "00:10")

    val personas = mutableListOf<Persona>()

    fun generarPersona(id: Int): Persona {
        val nombre = nombres.random()
        val imagen = fotos.random()
        val horaUltimoMensaje = horas.random()

        val mensajes = mutableListOf<Mensaje>()
        repeat(Random.nextInt(3,30)) {
            val mensaje = Mensaje(
                contenidosMensajes.random(),
                horas.random(),
                EstadoMensaje.values().random(),
                Random.nextBoolean()
            )
            mensajes.add(mensaje)
        }

        return Persona(id, nombre, imagen, horaUltimoMensaje, mensajes)
    }

    fun generarPersonas(cantidad: Int) {
        repeat(cantidad) { id ->
            personas.add(generarPersona(id))
        }
    }
}

