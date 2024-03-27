package com.mario.movielens.movie

import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MovieRepository: CoroutineCrudRepository<Movie, Long>
