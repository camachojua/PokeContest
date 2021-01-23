package com.example.pokecontest.models

data class Pokemon(val fotoId: Int, val nombre: String, val tipo: String, val nivel: Int) {
    override fun toString(): String {
        return "${nombre} es un pokémon de tipo ${tipo}, este participante se encuentra en el nivel ${nivel}"
    }
}