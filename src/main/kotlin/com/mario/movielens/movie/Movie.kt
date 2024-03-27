package com.mario.movielens.movie

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("movies")
data class Movie (
    @Id val id: Long?,
    val title: String,
    val genres: String? = null,
    val ratingCount: Long = 0,
    val ratingTotal: Long = 0,
)