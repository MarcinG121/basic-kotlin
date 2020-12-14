package com.example.basics

data class Film(val filmId: Int, val title: String)

interface FilmService {
    fun all(): Collection<Film>
}


