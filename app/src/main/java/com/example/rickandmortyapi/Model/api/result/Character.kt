package com.example.rickandmortyapi.Model.api.result

import com.example.rickandmortyapi.Model.api.result.location.Location
import com.example.rickandmortyapi.Model.api.result.origin.Origin

data class Character(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)