package com.example.rickandmortyapi.Model.api.info

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)