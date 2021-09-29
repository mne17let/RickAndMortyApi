package com.example.rickandmortyapi.Model.api

import com.example.rickandmortyapi.Model.api.info.Info
import com.example.rickandmortyapi.Model.api.result.Character

data class Responce(
    val info: Info,
    val characters: List<Character>
)