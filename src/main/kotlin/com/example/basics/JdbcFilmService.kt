package com.example.basics

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class JdbcFilmService(private val jdbcTemplate: JdbcTemplate) : FilmService {
    override fun all(): Collection<Film>  =
            this.jdbcTemplate.query("SELECT * from Film")
            { rs, _ -> Film(rs.getInt("film_id"), rs.getString("title"))}

}