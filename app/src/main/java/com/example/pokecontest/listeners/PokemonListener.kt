package com.example.pokecontest.listeners

import com.example.pokecontest.models.Pokemon

interface PokemonListener {
    fun onClickPokemon(pokemon: Pokemon)

    fun onInfoPokemon(pokemon: Pokemon)
}