package com.example.pokecontest.adapters.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.pokecontest.listeners.PokemonListener
import com.example.pokecontest.models.Pokemon

class PokemonViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    private var pokemonListener: PokemonListener? = null
    private var pokemon: Pokemon? = null

    fun bindPokemon(pokemon: Pokemon) {
        this.pokemon = pokemon
    }

    fun setPokemonListener(listener: PokemonListener?) {
        this.pokemonListener = listener
    }
}