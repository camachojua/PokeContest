package com.example.pokecontest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokecontest.R
import com.example.pokecontest.adapters.viewholders.PokemonViewHolder
import com.example.pokecontest.listeners.PokemonListener
import com.example.pokecontest.models.Pokemon

class PokemonAdapter(val pokemones: List<Pokemon>): RecyclerView.Adapter<PokemonViewHolder>() {
    private var pokemonListener: PokemonListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.poke_data, parent,false)
        val pokemonViewHolder = PokemonViewHolder(itemView)
        pokemonViewHolder.setPokemonListener(pokemonListener)
        return pokemonViewHolder
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bindPokemon(pokemones[position])
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    fun setPokemonListener(listener: PokemonListener?) {
        this.pokemonListener = listener
    }
}