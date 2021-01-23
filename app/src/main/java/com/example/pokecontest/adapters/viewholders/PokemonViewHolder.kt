package com.example.pokecontest.adapters.viewholders

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokecontest.R
import com.example.pokecontest.listeners.PokemonListener
import com.example.pokecontest.models.Pokemon

class PokemonViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    private var pokemonListener: PokemonListener? = null
    private var pokemon: Pokemon? = null

    private var pokemonNameTextView: TextView = itemView.findViewById(R.id.nombre)
    private var pokemonTypeTextView: TextView = itemView.findViewById(R.id.tipo)
    private var pokemonPhotoImageView: ImageView = itemView.findViewById(R.id.foto)
    private var infoPokemon: Button = itemView.findViewById(R.id.button_info)

    fun bindPokemon(pokemon: Pokemon) {
        this.pokemon = pokemon
        pokemonNameTextView.text = this.pokemon?.nombre
        pokemonTypeTextView.text = this.pokemon?.tipo
        pokemonPhotoImageView.id = this.pokemon?.fotoId!!

        itemView.setOnClickListener { view ->
            pokemonListener?.onClickPokemon(this.pokemon!!)
        }

        infoPokemon.setOnClickListener { view ->
            pokemonListener?.onInfoPokemon(this.pokemon!!)
        }
    }

    fun setPokemonListener(listener: PokemonListener?) {
        this.pokemonListener = listener
    }
}