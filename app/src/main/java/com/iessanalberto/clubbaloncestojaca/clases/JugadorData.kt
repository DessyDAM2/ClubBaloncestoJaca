package com.iessanalberto.clubbaloncestojaca.clases

val Juan: Jugador = Jugador("Juan", "Alevin", 14)
val Marcos: Jugador = Jugador("Marcos", "Infantil", 12)
val Jose: Jugador = Jugador("Jose", "Cadete", 17)

val listaAlevines = mutableListOf<Jugador>(Juan)
val listaCadetes = mutableListOf<Jugador>(Jose)
val listaInfantil = mutableListOf<Jugador>(Marcos)