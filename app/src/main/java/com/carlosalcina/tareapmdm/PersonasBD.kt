package com.carlosalcina.tareapmdm

import com.carlosalcina.tareapmdm.model.EstadoMensaje
import com.carlosalcina.tareapmdm.model.Mensaje
import com.carlosalcina.tareapmdm.model.Persona

object PersonasBD {
    val personas = listOf(
        Persona(
            0,
            "Lucas",
            R.drawable.pfp1,
            "23:45",
            listOf(
                Mensaje("Hola, tío, ¿qué tal todo? Hace tiempo que no hablamos.", "22:45", EstadoMensaje.LEIDO, false),
                Mensaje("Me estoy preguntando si todo sigue bien contigo. Cuéntame algo nuevo.", "22:46", EstadoMensaje.LEIDO, false),
                Mensaje("La verdad es que mi vida últimamente ha sido un caos. Apenas duermo.", "23:00", EstadoMensaje.LEIDO, true),
                Mensaje("¿Recuerdas cuando solíamos salir cada fin de semana? Echo de menos esos días.", "23:05", EstadoMensaje.LEIDO, false),
                Mensaje("Por cierto, ¿cómo te va en el trabajo? ¿Sigues en la misma empresa?", "23:10", EstadoMensaje.LEIDO, false),
                Mensaje("Si tienes tiempo este fin de semana, podemos ponernos al día con unas cervezas.", "23:12", EstadoMensaje.LEIDO, true),
                Mensaje("También he estado pensando en hacer un viaje corto, algo para desconectar.", "23:14", EstadoMensaje.LEIDO, true),
                Mensaje("A veces pienso en mudarme a otra ciudad, pero me da miedo el cambio.", "23:16", EstadoMensaje.LEIDO, false),
                Mensaje("¿Te acuerdas del coche que me compré? Al final no era tan bueno como parecía.", "23:20", EstadoMensaje.LEIDO, false),
                Mensaje("Bueno, avísame cuando puedas. Tengo un par de cosas que me gustaría contarte.", "23:25", EstadoMensaje.LEIDO, true),
                Mensaje("Por cierto, ¿sabes algo de Juan? Hace meses que no sé nada de él.", "23:30", EstadoMensaje.LEIDO, false),
                Mensaje("Oye, ¿aún tienes contacto con Manolo? Sería genial reunirnos todos.", "23:35", EstadoMensaje.LEIDO, false),
                Mensaje("Estoy pensando en cambiar de móvil. ¿Alguna recomendación?", "23:40", EstadoMensaje.LEIDO, false),
                Mensaje("Últimamente estoy viendo muchas series. ¿Tienes alguna para recomendarme?", "23:42", EstadoMensaje.LEIDO, false),
                Mensaje("Bueno, te dejo, pero escribe cuando tengas tiempo. Cuídate mucho.", "23:45", EstadoMensaje.LEIDO, false),
                Mensaje("Ah, casi lo olvido, ¿sigues yendo al gimnasio? Necesito retomar.", "23:50", EstadoMensaje.LEIDO, false),
                Mensaje("Por cierto, ¿cómo están tus padres? Hace tiempo que no los veo.", "23:55", EstadoMensaje.LEIDO, false),
                Mensaje("Tengo una reunión importante mañana, pero no puedo concentrarme.", "00:00", EstadoMensaje.LEIDO, false),
                Mensaje("En fin, buenas noches. Espero que todo esté bien contigo.", "00:05", EstadoMensaje.LEIDO, false)
            )
        ),
        Persona(
            1,
            "Juan",
            R.drawable.pfp2,
            "22:30",
            listOf(
                Mensaje("Hola Lucas, hace tiempo que no sé de ti. ¿Cómo va todo?", "21:50", EstadoMensaje.ENVIADO, false),
                Mensaje("Últimamente he estado bastante ocupado con el trabajo.", "22:00", EstadoMensaje.ENVIADO, false),
                Mensaje("Aún así, me encantaría ponerme al día contigo.", "22:05", EstadoMensaje.ENVIADO, false),
                Mensaje("¿Recuerdas aquel viaje que hicimos hace años? Fue increíble.", "22:10", EstadoMensaje.ENVIADO, true),
                Mensaje("Si tienes tiempo, podríamos repetir algo similar. Sería genial.", "22:15", EstadoMensaje.ENVIADO, true),
                Mensaje("Por cierto, ¿sabes algo de Pepe? No he sabido de él en meses.", "22:20", EstadoMensaje.ENVIADO, false),
                Mensaje("También estuve hablando con Ana el otro día. Está bastante bien.", "22:25", EstadoMensaje.ENVIADO, false),
                Mensaje("Por cierto, ¿has visto la última película de Marvel? Me encantó.", "22:30", EstadoMensaje.ENVIADO, true),
                Mensaje("Bueno, espero que me respondas pronto. Cuídate mucho.", "22:35", EstadoMensaje.ENVIADO, false),
                Mensaje("Me encantaría saber cómo van tus proyectos personales.", "22:40", EstadoMensaje.ENVIADO, false),
                Mensaje("La verdad es que me he acordado mucho de nuestras conversaciones últimamente.", "22:45", EstadoMensaje.ENVIADO, true),
                Mensaje("He estado pensando en organizar una reunión con los chicos.", "22:50", EstadoMensaje.ENVIADO, false),
                Mensaje("¿Crees que Manolo podría venir? Sería genial tenerlo también.", "22:55", EstadoMensaje.ENVIADO, false),
                Mensaje("En fin, sigo esperando tu mensaje. Espero que estés bien.", "23:00", EstadoMensaje.ENVIADO, false),
                Mensaje("Por cierto, ¿cómo va el negocio? Espero que todo esté funcionando bien.", "23:05", EstadoMensaje.ENVIADO, false),
                Mensaje("Bueno, aquí me despido por ahora. Cuídate mucho, Lucas.", "23:10", EstadoMensaje.ENVIADO, false),
                Mensaje("Ah, y no olvides que tenemos que hablar de aquel tema pendiente.", "23:15", EstadoMensaje.ENVIADO, false),
                Mensaje("Espero que este mensaje te encuentre bien. Hablamos pronto.", "23:20", EstadoMensaje.ENVIADO, false),
                Mensaje("Nos vemos pronto, amigo. Un abrazo fuerte.", "23:25", EstadoMensaje.ENVIADO, false)
            )
        ),
        Persona(
            2,
            "Pepe",
            R.drawable.pfp3,
            "21:15",
            listOf(
                Mensaje("¡Hola! ¿Qué tal todo últimamente? Hace tiempo que no hablamos.", "21:00", EstadoMensaje.ENVIADO, false),
                Mensaje("Espero que estés bien. ¿Qué tal el trabajo?", "21:05", EstadoMensaje.ENVIADO, false),
                Mensaje("Por cierto, estuve viendo fotos antiguas y me encontré unas de aquella fiesta.", "21:10", EstadoMensaje.ENVIADO, true),
                Mensaje("¿Te acuerdas de la última vez que fuimos a la playa juntos? Fue un día genial.", "21:12", EstadoMensaje.ENVIADO, false),
                Mensaje("Sería bueno repetir algo así. ¿Tienes algún plan para el verano?", "21:15", EstadoMensaje.ENVIADO, true),
                Mensaje("He estado pensando en apuntarme a un curso de cocina. ¿Te animas?", "21:18", EstadoMensaje.ENVIADO, false),
                Mensaje("Por cierto, ¿sigues hablando con Ana? Hace tiempo que no la veo.", "21:20", EstadoMensaje.ENVIADO, true),
                Mensaje("¿Qué tal tus padres? Espero que estén bien.", "21:25", EstadoMensaje.ENVIADO, false),
                Mensaje("Estuve hablando con Manolo el otro día. Me dijo que ha cambiado de trabajo.", "21:30", EstadoMensaje.ENVIADO, false),
                Mensaje("Bueno, avísame si tienes tiempo para vernos esta semana.", "21:35", EstadoMensaje.ENVIADO, false),
                Mensaje("Tengo un proyecto en mente y me gustaría contar con tu opinión.", "21:40", EstadoMensaje.ENVIADO, false),
                Mensaje("También estuve revisando unas ideas de inversión, a ver si te interesan.", "21:45", EstadoMensaje.ENVIADO, true),
                Mensaje("¿Te has comprado algo últimamente? Estoy pensando en cambiar de portátil.", "21:50", EstadoMensaje.ENVIADO, false),
                Mensaje("Ah, casi lo olvido, ¿qué tal va tu hermano? Hace años que no lo veo.", "21:55", EstadoMensaje.ENVIADO, false),
                Mensaje("Bueno, sigo esperando tu respuesta. Cuídate mucho.", "22:00", EstadoMensaje.ENVIADO, false),
                Mensaje("Por cierto, ¿has visto la serie que te recomendé? Me encantaría saber tu opinión.", "22:05", EstadoMensaje.ENVIADO, false),
                Mensaje("En fin, no te quiero molestar mucho. Hablamos cuando puedas.", "22:10", EstadoMensaje.ENVIADO, false),
                Mensaje("Recuerda que siempre puedes contar conmigo para lo que necesites.", "22:15", EstadoMensaje.ENVIADO, false),
                Mensaje("Espero que estés disfrutando de tu día. Nos vemos pronto.", "22:20", EstadoMensaje.ENVIADO, false)
            )
        ),
        Persona(
            3,
            "Manolo",
            R.drawable.pfp4,
            "20:00",
            listOf(
                Mensaje("¡Eh, qué pasa! Hace siglos que no sé nada de ti.", "19:45", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Estuve viendo un partido ayer y me acordé de ti. ¡Increíble!", "19:50", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Por cierto, ¿sabes algo de Lucas? Me gustaría hablar con él también.", "19:55", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Estoy pensando en montar algo este fin de semana. ¿Te apuntas?", "20:00", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Por cierto, he estado entrenando bastante últimamente. ¿Sigues yendo al gimnasio?", "20:05", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Tengo unas entradas para un concierto la próxima semana. ¿Te interesa venir?", "20:10", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("Ah, y no olvides que te debo una cerveza. Te la pago cuando nos veamos.", "20:15", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("¿Qué tal van las cosas con tu familia? Espero que todo esté en orden.", "20:20", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("Bueno, me avisas cuando tengas tiempo. Estoy libre casi toda la semana.", "20:25", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("He estado viendo unas series increíbles últimamente. Te puedo pasar algunas recomendaciones.", "20:30", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Por cierto, ¿has pensado en lo que hablamos la última vez? Creo que tiene potencial.", "20:35", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("He estado aprendiendo a tocar la guitarra. ¿Sigues con la música?", "20:40", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Espero que podamos coincidir pronto. Me encantaría ponernos al día.", "20:45", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("En fin, no quiero quitarte más tiempo. Cuídate mucho.", "20:50", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("Por cierto, ¿sabes algo de Pepe? Hace tiempo que no sé de él.", "20:55", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Espero que estés teniendo una buena tarde. Hablamos pronto.", "21:00", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("Recuerda que tienes un amigo aquí para lo que necesites.", "21:05", EstadoMensaje.NO_ENVIADO, true),
                Mensaje("Bueno, me despido ya. ¡Nos vemos pronto!", "21:10", EstadoMensaje.NO_ENVIADO, false),
                Mensaje("Por cierto, ¿qué tal va el coche nuevo? Espero que esté funcionando bien.", "21:15", EstadoMensaje.NO_ENVIADO, false)
            )
        ),
        Persona(
            4,
            "Lucía",
            R.drawable.pfp5,
            "18:45",
            listOf(
                Mensaje("¡Nos vemos luego! Tengo muchas ganas de pasar un buen rato.", "18:30", EstadoMensaje.LEIDO, false),
                Mensaje("¿Recuerdas aquella vez que fuimos a la montaña? Fue increíble.", "18:35", EstadoMensaje.LEIDO, true),
                Mensaje("Por cierto, ¿te ha llegado el paquete que te envié?", "18:40", EstadoMensaje.LEIDO, true),
                Mensaje("Cuando tengas un hueco, avísame, tengo algo que contarte.", "18:42", EstadoMensaje.LEIDO, true),
                Mensaje("No olvides que te pedí que trajeras algunas cosas cuando vengas.", "18:45", EstadoMensaje.LEIDO, true),
                Mensaje("Estoy pensando en organizar una cena este fin de semana. ¿Te gustaría venir?", "18:50", EstadoMensaje.LEIDO, false),
                Mensaje("He estado probando algunas recetas nuevas, tal vez te guste alguna.", "18:55", EstadoMensaje.LEIDO, false),
                Mensaje("Por cierto, ¿cómo están tus padres? Espero que todo esté bien con ellos.", "19:00", EstadoMensaje.LEIDO, false),
                Mensaje("Me enteré de que tu hermano ha empezado un nuevo proyecto. ¡Qué bien!", "19:05", EstadoMensaje.LEIDO, false),
                Mensaje("Tengo algunas noticias interesantes, pero no quiero adelantarlas aún.", "19:10", EstadoMensaje.LEIDO, false),
                Mensaje("¿Qué tal tu nuevo trabajo? Me encantaría saber cómo te va.", "19:15", EstadoMensaje.LEIDO, false),
                Mensaje("Por cierto, estoy viendo unas series nuevas. Si quieres, te paso algunas recomendaciones.", "19:20", EstadoMensaje.LEIDO, false),
                Mensaje("Tengo unas ideas para un viaje, me gustaría saber tu opinión.", "19:25", EstadoMensaje.LEIDO, false),
                Mensaje("La verdad es que estoy un poco estresada con todo lo que tengo que hacer.", "19:30", EstadoMensaje.LEIDO, true),
                Mensaje("A veces pienso que necesito un descanso, ¿te apuntas?", "19:35", EstadoMensaje.LEIDO, false),
                Mensaje("Oye, ¿aún sigues con tu hobby de la fotografía? Estuve pensando en eso el otro día.", "19:40", EstadoMensaje.LEIDO, false),
                Mensaje("¿Tienes planes para el próximo mes? Tal vez podamos hacer algo juntas.", "19:45", EstadoMensaje.LEIDO, false),
                Mensaje("En fin, espero verte pronto. ¡Cuídate mucho!", "19:50", EstadoMensaje.LEIDO, false),
                Mensaje("Nos vemos pronto, ¡no me dejes esperando!", "19:55", EstadoMensaje.LEIDO, false)
            )
        ),
        Persona(
            5,
            "Ana",
            R.drawable.pfp6,
            "17:30",
            listOf(
                Mensaje("Luego hablamos, tengo que terminar unas cosas ahora.", "17:00", EstadoMensaje.ENVIADO, false),
                Mensaje("Tengo algo importante que contarte. ¿Podemos hablar más tarde?", "17:10", EstadoMensaje.ENVIADO, true),
                Mensaje("¿Te acuerdas de lo que te dije la otra vez? Pues eso aún sigue pasando.", "17:15", EstadoMensaje.ENVIADO, true),
                Mensaje("Si necesitas algún consejo, ya sabes que puedes contar conmigo.", "17:20", EstadoMensaje.ENVIADO, false),
                Mensaje("Este fin de semana estoy libre, ¿quieres hacer algo?", "17:25", EstadoMensaje.ENVIADO, false),
                Mensaje("Ah, y no olvides que la semana que viene tenemos una cita.", "17:30", EstadoMensaje.ENVIADO, true),
                Mensaje("Estuve pensando en cambiarme de look, ¿qué opinas?", "17:35", EstadoMensaje.ENVIADO, false),
                Mensaje("Estoy empezando a hacer ejercicio. ¿Tú qué tal con eso?", "17:40", EstadoMensaje.ENVIADO, false),
                Mensaje("Este mes ha sido una locura, pero tengo muchas ganas de descansar.", "17:45", EstadoMensaje.ENVIADO, true),
                Mensaje("Oye, ¿algún plan para la próxima semana? Me gustaría hacer algo diferente.", "17:50", EstadoMensaje.ENVIADO, false),
                Mensaje("Tengo que organizarme mejor, pero siempre me cuesta encontrar tiempo.", "17:55", EstadoMensaje.ENVIADO, false),
                Mensaje("He estado practicando yoga últimamente. Me está ayudando mucho.", "18:00", EstadoMensaje.ENVIADO, false),
                Mensaje("No me lo vas a creer, pero me encontré con alguien que no veía hace años.", "18:05", EstadoMensaje.ENVIADO, false),
                Mensaje("Estoy planeando un viaje largo para el próximo año. ¿Te gustaría acompañarme?", "18:10", EstadoMensaje.ENVIADO, false),
                Mensaje("Hace tiempo que no salimos, ¿por qué no organizamos algo pronto?", "18:15", EstadoMensaje.ENVIADO, false),
                Mensaje("Últimamente he estado viendo muchas películas antiguas, ¿te gustan?", "18:20", EstadoMensaje.ENVIADO, false),
                Mensaje("Tengo que hacer muchas cosas hoy, pero quiero saber cómo te va todo.", "18:25", EstadoMensaje.ENVIADO, false),
                Mensaje("Bueno, voy a seguir con mis cosas. Nos hablamos luego, ¿vale?", "18:30", EstadoMensaje.ENVIADO, false),
                Mensaje("Cuídate mucho, y recuerda que siempre estoy aquí para lo que necesites.", "18:35", EstadoMensaje.ENVIADO, false)
            )
        ),
        Persona(
            6,
            "María",
            R.drawable.pfp7,
            "16:00",
            listOf(
                Mensaje("Buenas tardes, ¿cómo estás hoy?", "15:30", EstadoMensaje.LEIDO, false),
                Mensaje("Espero que hayas tenido un buen día. Cuéntame, ¿qué tal te va?", "15:35", EstadoMensaje.LEIDO, false),
                Mensaje("Este fin de semana me gustaría salir a hacer algo. ¿Tienes planes?", "15:40", EstadoMensaje.LEIDO, true),
                Mensaje("¿Cómo te va en la universidad? Yo he estado bastante ocupada.", "15:45", EstadoMensaje.LEIDO, true),
                Mensaje("Oye, ¿te acuerdas de nuestra conversación sobre la música? Estuve pensando en eso.", "15:50", EstadoMensaje.LEIDO, false),
                Mensaje("¿Tienes alguna recomendación de libros? Estoy buscando algo nuevo para leer.", "15:55", EstadoMensaje.LEIDO, true),
                Mensaje("Por cierto, ¿te gustaría ir al cine este sábado?", "16:00", EstadoMensaje.LEIDO, true),
                Mensaje("También estuve pensando en empezar a hacer ejercicio, a ver si te animas conmigo.", "16:05", EstadoMensaje.LEIDO, false),
                Mensaje("Me encanta el clima de esta temporada. ¿Tienes algún plan para aprovecharlo?", "16:10", EstadoMensaje.LEIDO, false),
                Mensaje("He probado una receta nueva, y te aseguro que te encantaría. Te paso la receta pronto.", "16:15", EstadoMensaje.LEIDO, false),
                Mensaje("¿Te gustaría hacer una pequeña escapada el próximo mes? Sería genial.", "16:20", EstadoMensaje.LEIDO, false),
                Mensaje("Estuve organizando mi agenda y me di cuenta de que necesitamos ponernos al día.", "16:25", EstadoMensaje.LEIDO, false),
                Mensaje("Últimamente he estado tan ocupada que no he tenido tiempo para nada.", "16:30", EstadoMensaje.LEIDO, true),
                Mensaje("Hoy he tenido una reunión bastante interesante. Te cuento más luego.", "16:35", EstadoMensaje.LEIDO, true),
                Mensaje("He estado viendo series en la noche, pero nada me convence últimamente.", "16:40", EstadoMensaje.LEIDO, false),
                Mensaje("Este mes he estado probando cosas nuevas, me siento muy inspirada.", "16:45", EstadoMensaje.LEIDO, false),
                Mensaje("En fin, espero que estés teniendo una buena tarde. Nos vemos pronto.", "16:50", EstadoMensaje.LEIDO, false),
                Mensaje("Oye, ¿cómo va tu proyecto personal? Me gustaría saber más.", "16:55", EstadoMensaje.LEIDO, false),
                Mensaje("Bueno, me voy a descansar. Hablamos pronto.", "17:00", EstadoMensaje.LEIDO, false)
            )
        ),
        Persona(
            7,
            "Juan",
            R.drawable.pfp8,
            "15:20",
            listOf(
                Mensaje("¿A qué hora quedamos? Estoy libre a partir de las 5.", "15:00", EstadoMensaje.LEIDO, false),
                Mensaje("Por mí a las 7, ¿te parece bien?", "15:10", EstadoMensaje.LEIDO, false),
                Mensaje("Confírmame cuando puedas, así organizo mi agenda.", "15:15", EstadoMensaje.LEIDO, false),
                Mensaje("Si no, podemos quedar el domingo, también estoy libre.", "15:20", EstadoMensaje.LEIDO, false),
                Mensaje("Últimamente he estado muy ocupado, pero este fin de semana me viene bien.", "15:25", EstadoMensaje.LEIDO, true),
                Mensaje("Recuerda que tenemos que ir al centro a hacer unas compras.", "15:30", EstadoMensaje.LEIDO, true),
                Mensaje("Ah, y no olvides traer las llaves que te pedí.", "15:35", EstadoMensaje.LEIDO, false),
                Mensaje("¿Has visto el partido ayer? Fue increíble.", "15:40", EstadoMensaje.LEIDO, false),
                Mensaje("Ya sabes que te estoy esperando para hacer algo divertido este fin de semana.", "15:45", EstadoMensaje.LEIDO, true),
                Mensaje("Nos vemos dentro de poco. ¡Te echo de menos!", "15:50", EstadoMensaje.LEIDO, false),
                Mensaje("Nos ponemos al día pronto. ¡Hablamos luego!", "15:55", EstadoMensaje.LEIDO, false),
                Mensaje("¿Tienes alguna película que recomendar? Estoy buscando algo nuevo.", "16:00", EstadoMensaje.LEIDO, false),
                Mensaje("He estado pensando en lo que hablamos el otro día, tienes razón en lo que dijiste.", "16:05", EstadoMensaje.LEIDO, false),
                Mensaje("Este mes está siendo un poco complicado, pero me alegra saber que hablamos pronto.", "16:10", EstadoMensaje.LEIDO, true),
                Mensaje("Si no sabes qué hacer, podemos ir a la playa o al parque. Lo que te apetezca.", "16:15", EstadoMensaje.LEIDO, false),
                Mensaje("Recuerda que siempre podemos hacer algo divertido cuando quieras.", "16:20", EstadoMensaje.LEIDO, false),
                Mensaje("¡Nos vemos pronto!", "16:25", EstadoMensaje.LEIDO, false),
                Mensaje("Oye, no olvides que tenemos pendiente la quedada.", "16:30", EstadoMensaje.LEIDO, false),
                Mensaje("Cuídate mucho, ¡nos vemos pronto!", "16:35", EstadoMensaje.LEIDO, false)
            )
        )
    )
}


