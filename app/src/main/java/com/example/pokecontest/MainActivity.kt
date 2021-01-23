package com.example.pokecontest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokecontest.adapters.PokemonAdapter
import com.example.pokecontest.listeners.PokemonListener
import com.example.pokecontest.models.Pokemon

class MainActivity : AppCompatActivity(), PokemonListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val pokemones = arrayListOf<Pokemon>(
        Pokemon(1, "Mew","Psíquico","Kanto", 50),
        Pokemon(2,"Pichu", "Eléctrico", "Jhotto", 2),
        Pokemon(3,"Ponyta", "Hada", "Galar", 30),
        Pokemon(4,"Leafon","Planta","Jhotto", 24)
    )

    val adaptador = PokemonAdapter(pokemones)
    adaptador.setPokemonListener(this)
    recyclerView.adapter = adaptador

    val layoutManager = LinearLayoutManager(baseContext, RecyclerView.VERTICAL,false)
    recyclerView.layoutManager = layoutManager


    override fun onClickPokemon(pokemon: Pokemon) {
        Toast.makeText(this, "Le dio clic a la vista", Toast.LENGTH_LONG).show()
    }

    override fun onInfoPokemon(pokemon: Pokemon) {
        Toast.makeText(this, "Le dio clic al botón", Toast.LENGTH_LONG).show()
    }


}