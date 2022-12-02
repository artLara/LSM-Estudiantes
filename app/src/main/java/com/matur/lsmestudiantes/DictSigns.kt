package com.matur.lsmestudiantes

class DictSigns {
    companion object{
        var colors = Topic(true, "Colores",
            listOf("Amarillo", "Azul", "Blanco", "Blanco más usado", "Café", "Carne", "Color", "Dorado",
                    "Gris", "Morado", "Naranja", "Negro", "Plateado", "Rojo", "Rojo más usado", "Rosa", "Verde"
            ),
            hashMapOf("Amarillo" to R.raw.colores_amarilo,
                "Azul" to R.raw.colores_azul,
                "Blanco" to R.raw.colores_blanco,
                "Blanco más usado" to R.raw.colores_blanco_habitual,
                "Café" to R.raw.colores_cafe,
                "Carne" to R.raw.colores_carne,
                "Color" to R.raw.colores_color,
                "Dorado" to R.raw.colores_dorado,
                "Gris" to R.raw.colores_gris,
                "Morado" to R.raw.colores_morado,
                "Naranja" to R.raw.colores_naranja,
                "Negro" to R.raw.colores_negro,
                "Plateado" to R.raw.colores_plateado,
                "Rojo" to R.raw.colores_rojo,
                "Rojo más usado" to R.raw.colores_rojo_habitual,
                "Rosa" to R.raw.colores_rosa,
                "Verde"  to R.raw.colores_verde
            ))

        var abecedario = Topic(true, "Abecedario",
            listOf("a", "h"),
            hashMapOf("a" to R.raw.a_izq, "h" to R.raw.h_izq))

        var numeros = Topic(true, "Números",
            listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                    "14", "15 más usado", "15", "16", "17", "18", "19", "20", "30","30 más usado", "40",
                    "50", "60", "70", "80", "90", "100", "1000", "2000", "1000000"
            ),
            hashMapOf("1" to R.raw.numeros_1,
                "2" to R.raw.numeros_2,
                "3" to R.raw.numeros_3,
                "4" to R.raw.numeros_4,
                "5" to R.raw.numeros_5,
                "6" to R.raw.numeros_6,
                "7" to R.raw.numeros_7,
                "8" to R.raw.numeros_8,
                "9" to R.raw.numeros_9,
                "10" to R.raw.numeros_10,
                "11" to R.raw.numeros_11,
                "12" to R.raw.numeros_12,
                "13" to R.raw.numeros_13,
                "14" to R.raw.numeros_14,
                "15 más usado" to R.raw.numeros_15_habitual,
                "15" to R.raw.numeros_15,
                "16" to R.raw.numeros_16,
                "17" to R.raw.numeros_17,
                "18" to R.raw.numeros_18,
                "19" to R.raw.numeros_19,
                "20" to R.raw.numeros_20,
                "30" to R.raw.numeros_30,
                "30 más usado" to R.raw.numeros_30_habitual,
                "40" to R.raw.numeros_40,
                "50" to R.raw.numeros_50_2,
                "60" to R.raw.numeros_60,
                "70" to R.raw.numeros_70,
                "80" to R.raw.numeros_80,
                "90" to R.raw.numeros_90,
                "100" to R.raw.numeros_100,
                "1000" to R.raw.numeros_1000,
                "2000" to R.raw.numeros_2000,
                "1000000" to R.raw.numeros_1000000
            ))

        var saludos = Topic(true, "Saludos",
            listOf("Adios", "Bien", "Buenas noches", "Buenas tardes", "Buenos días",
            "¿Cómo estas?", "¿Cómo te llamas?", "Cuidate", "De nada", "Excelente",
            "Gracias", "Hasta mañana", "Hasta pronto", "Hola", "Igualmente", "Mal", "Más o menos",
            "Mucho gusto", "Nos vemos", "Por favor"
            ),

            hashMapOf("Adios" to R.raw.saludos_adios,
                "Bien" to R.raw.saludos_bien,
                "Buenas noches" to R.raw.saludos_buenas_noches,
                "Buenas tardes" to R.raw.saludos_buenas_tardes,
                "Buenos días" to R.raw.saludos_buenos_dias,
                "¿Cómo estas?" to R.raw.saludos_como_estas,
                "¿Cómo te llamas?" to R.raw.saludos_como_te_llamas,
                "Cuidate" to R.raw.saludos_cuidate,
                "De nada" to R.raw.saludos_denada,
                "Excelente" to R.raw.saludos_excelente,
                "Gracias" to R.raw.saludos_gracias,
                "Hasta mañana" to R.raw.saludos_hasta_manana,
                "Hasta pronto" to R.raw.saludos_hasta_pronto,
                "Hola" to R.raw.saludos_hola,
                "Igualmente" to R.raw.saludos_igualmente,
                "Mal" to R.raw.saludos_mal,
                "Más o menos" to R.raw.saludos_mas_menos,
                "Mucho gusto" to R.raw.saludos_mucho_gusto,
                "Nos vemos" to R.raw.saludos_nosvemos,
                "Por favor" to R.raw.saludos_porfavor
                ))

        var diasMeses = Topic(true, "Días y meses",
            listOf("Abril", "Agosto", "Día", "Diciembre","Domingo", "Enero", "Febrero", "Jueves","Julio",
                    "Junio", "Lunes", "Martes", "Marzo", "Mayo", "Mes", "Miércoles", "Miércoles (más usado)",
                    "Noviembre", "Octubre", "Sábado", "Semana", "Septiembre"
                ),
            hashMapOf("Abril" to R.raw.dias_meses_abril,
                "Agosto" to R.raw.dias_meses_agosto,
                "Día" to R.raw.dias_meses_dia,
                "Diciembre" to R.raw.dias_meses_diciembre,
                "Domingo" to R.raw.dias_meses_domingo,
                "Enero" to R.raw.dias_meses_enero,
                "Febrero" to R.raw.dias_meses_febrero,
                "Jueves" to R.raw.dias_meses_jueves,
                "Julio" to R.raw.dias_meses_julio,
                "Junio" to R.raw.dias_meses_junio,
                "Lunes" to R.raw.dias_meses_lunes,
                "Martes" to R.raw.dias_meses_martes,
                "Marzo" to R.raw.dias_meses_marzo,
                "Mayo" to R.raw.dias_meses_mayo,
                "Mes" to R.raw.dias_meses_mes,
                "Miércoles" to R.raw.dias_meses_miercoles,
                "Miércoles (más usado)" to R.raw.dias_meses_miercoles_habitual,
                "Noviembre" to R.raw.dias_meses_noviembre,
                "Octubre" to R.raw.dias_meses_octubre,
                "Sábado" to R.raw.dias_meses_sabado,
                "Semana" to R.raw.dias_meses_semana,
                "Septiembre" to R.raw.dias_meses_septiembre
            ))

        var alimentos = Topic(true, "Alimentos",
            listOf("Aceite", "Alimentos","Arroz", "Azúcar", "Carne", "Chilaquiles", "Enchiladas", "Frijol",
                    "Fruta", "Huevo", "Leche", "Pizza 1", "Pizza 2", "Pizza 3", "Pollo", "Pozole",
                    "Puerco", "Quesadilla", "Res", "Sal", "Salsa", "Sopa", "Spaghetti 1", "Spaghetti 2", "Spaghetti 3",
                    "Sushi", "Taco", "Tamal", "Tortillas", "Verdura"
            ),
            hashMapOf("Aceite" to R.raw.alimentos_aceite,
                "Alimentos" to R.raw.alimentos_alimento,
                "Arroz" to R.raw.alimentos_arroz,
                "Azúcar" to R.raw.alimentos_azucar,
                "Carne" to R.raw.alimentos_carne,
                "Chilaquiles" to R.raw.video_compressing,
                "Enchiladas" to R.raw.alimentos_enchiladas,
                "Frijol" to R.raw.alimentos_frijol,
                "Fruta" to R.raw.alimentos_fruta,
                "Huevo" to R.raw.alimentos_huevo,
                "Leche" to R.raw.alimentos_leche,
                "Pizza 1" to R.raw.alimentos_pizza1,
                "Pizza 2" to R.raw.alimentos_pizza2,
                "Pizza 3" to R.raw.alimentos_pizza3,
                "Pollo" to R.raw.alimentos_pollo,
                "Pozole" to R.raw.alimentos_pozole,
                "Puerco" to R.raw.alimentos_puerco,
                "Quesadilla" to R.raw.alimentos_quesadilla,
                "Res" to R.raw.alimentos_res,
                "Sal" to R.raw.alimentos_sal,
                "Salsa" to R.raw.alimentos_salsa,
                "Sopa" to R.raw.alimentos_sopa,
                "Spaghetti 1" to R.raw.alimentos_spagatti1,
                "Spaghetti 2" to R.raw.alimentos_spaggeti2,
                "Spaghetti 3" to R.raw.alimentos_spaggeti3,
                "Sushi" to R.raw.alimentos_sushi,
                "Taco" to R.raw.alimentos_taco,
                "Tamal" to R.raw.alimentos_tamal,
                "Tortillas" to R.raw.alimentos_tortillas,
                "Verdura" to R.raw.alimentos_verdura
            ))

        var familia = Topic(true, "Familia",
            listOf("Abuelo", "Amante", "Amigo", "Cuñado", "Esposo", "Familia", "Femenino", "Hermano",
                    "Hijo", "Mamá", "Nieto opc. 1", "Nieto opc. 2", "Novio", "Nuera", "Papá",
                    "Primo", "Prometido", "Sobrino", "Tío opc. 1", "Tío opc. 2", "Yerno"
                ),
            hashMapOf("Abuelo" to R.raw.familia_abuelo,
                "Amante" to R.raw.familia_amante,
                "Amigo" to R.raw.familia_amigo,
                "Cuñado" to R.raw.familia_cunado,
                "Esposo" to R.raw.familia_esposo,
                "Familia" to R.raw.familia_familia,
                "Femenino" to R.raw.familia_femenino,
                "Hermano" to R.raw.familia_hermano,
                "Hijo" to R.raw.familia_hijo,
                "Mamá" to R.raw.familia_mama,
                "Nieto opc. 1" to R.raw.familia_nietos1,
                "Nieto opc. 2" to R.raw.familia_nietos2,
                "Novio" to R.raw.familia_novio,
                "Nuera" to R.raw.familia_nuera,
                "Papá" to R.raw.familia_papa,
                "Primo" to R.raw.familia_primo,
                "Prometido" to R.raw.familia_prometido,
                "Sobrino" to R.raw.familia_sobrino,
                "Tío opc. 1" to R.raw.familia_tios1,
                "Tío opc. 2" to R.raw.familia_tios2,
                "Yerno" to R.raw.familia_yerno
            ))

        var emociones = Topic(true, "Emociones",
            listOf("Aburrido", "Agotado", "Alegre", "Apenado", "Celoso", "Enamorado", "Enojado",
                    "Feliz", "Preocupado", "Sorprendido", "Tranquilo", "Triste"
                ),
            hashMapOf("Aburrido" to R.raw.emociones_aburrido,
                "Agotado" to R.raw.emociones_agotado,
                "Alegre" to R.raw.emociones_alegre,
                "Apenado" to R.raw.emociones_apenado,
                "Celoso" to R.raw.emociones_celoso,
                "Enamorado" to R.raw.emociones_enamorado,
                "Enojado" to R.raw.emociones_enojado,
                "Feliz" to R.raw.emociones_feliz,
                "Preocupado" to R.raw.emociones_preocupado,
                "Sorprendido" to R.raw.emociones_sorprendido,
                "Tranquilo" to R.raw.emociones_tranquilo,
                "Triste" to R.raw.emociones_triste
            ))


        var animales = Topic(true, "Animales",
            listOf("Abeja", "Águila", "Alacran", "Animales", "Araña", "Ballena", "Borrego", "Buho",
                    "Burro", "Caballo", "Camaron", "Caracol", "Cebra", "Cerdo", "Chango", "Cisne", "Cocodrilo",
                    "Conejo", "Delfin", "Elefante", "Elefante (trompa)", "Foca", "Gallina", "Gallo",
                    "Gato (1 dedo)", "Gato (3 dedos)", "Gorila", "Iguana", "Jirafa", "Lagarto", "León",
                    "Mapache", "Mariposa", "Oso", "Pajaro/ave", "Perro", "Pez", "Pingüino", "Pollo","Sapo",
                    "Tiburon 1", "Tiburon 2", "Tiburon 3", "Tigre", "Toro", "Vaca", "Venado", "Vibora",
                    "Zorrillo 1", "Zorrillo 2"
            ),
            hashMapOf("Abeja" to R.raw.animales_abeja,
                "Águila" to R.raw.animales_aguila,
                "Alacran" to R.raw.animales_alacran,
                "Animales" to R.raw.animales_animales,
                "Araña" to R.raw.animales_arania,
                "Ballena" to R.raw.animales_ballena,
                "Borrego" to R.raw.animales_borrego,
                "Buho" to R.raw.animales_buho,
                "Burro" to R.raw.animales_burro,
                "Caballo" to R.raw.animales_caballo,
                "Camaron" to R.raw.animales_camaron,
                "Caracol" to R.raw.animales_caracol,
                "Cebra" to R.raw.animales_cebra,
                "Cerdo" to R.raw.animales_cerdo,
                "Chango" to R.raw.animales_chango,
                "Cisne" to R.raw.animales_cisne,
                "Cocodrilo" to R.raw.animales_cocodrilo,
                "Conejo" to R.raw.animales_conejo,
                "Delfin" to R.raw.animales_delfin,
                "Elefante" to R.raw.animales_elefante,
                "Elefante (trompa)" to R.raw.animales_elefante_trompa,
                "Foca" to R.raw.animales_foca,
                "Gallina" to R.raw.animales_gallina,
                "Gallo" to R.raw.animales_gallo,
                "Gato (1 dedo)" to R.raw.animales_gato_1dedo,
                "Gato (3 dedos)" to R.raw.animales_gato_3dedos,
                "Gorila" to R.raw.animales_gorila,
                "Iguana" to R.raw.animales_iguana,
                "Jirafa" to R.raw.animales_jirafa,
                "Lagarto" to R.raw.animales_lagarto,
                "León" to R.raw.animales_leon,
                "Mapache" to R.raw.animales_mapache,
                "Mariposa" to R.raw.animales_mariposa,
                "Oso" to R.raw.animales_oso,
                "Pajaro/ave" to R.raw.animales_pajaro_ave,
                "Perro" to R.raw.animales_perro,
                "Pez" to R.raw.animales_pez,
                "Pingüino" to R.raw.animales_pinguino,
                "Pollo" to R.raw.animales_pollo,
                "Sapo" to R.raw.animales_sapo,
                "Tiburon 1" to R.raw.animales_tiburon1,
                "Tiburon 2" to R.raw.animales_tiburon2,
                "Tiburon 3" to R.raw.animales_tiburon3,
                "Tigre" to R.raw.animales_tigre,
                "Toro" to R.raw.animales_toro,
                "Vaca" to R.raw.animales_vaca,
                "Venado" to R.raw.animales_venado,
                "Vibora" to R.raw.animales_vibora,
                "Zorrillo 1" to R.raw.animales_zorrillo1,
                "Zorrillo 2" to R.raw.animales_zorrillo2
            ))

        var dict = hashMapOf("Saludos" to saludos, "Abecedario" to abecedario, "Días y meses" to diasMeses,
                            "Números" to numeros, "Colores" to colors, "Alimentos" to alimentos, "Familia" to familia,
                            "Emociones" to emociones, "Animales" to animales)

        fun getAllTopics():MutableList<Topic>{
            val topics: MutableList<Topic> = mutableListOf()
            for (key in dict.keys){
                topics.add(dict[key]!!)
            }

            return topics
        }

        fun getSpecificTopics(topicsSelected: List<String>): MutableList<Topic>{
            val topics: MutableList<Topic> = mutableListOf()
            for (key in topicsSelected){
                topics.add(dict[key]!!)
            }
            return topics
        }
        fun getSpecificTopic(topicSelected: String): Topic{
            return dict[topicSelected]!!
        }

        fun getSelectedTopics(): MutableList<Topic>{
            val topics: MutableList<Topic> = mutableListOf()
            for (key in dict.keys){
                if(dict[key]!!.use){
                    topics.add(dict[key]!!)
                }
            }

            return topics
        }
    }
}