package com.mario.movielens

import com.mario.movielens.movie.Movie
import com.mario.movielens.movie.MovieRepository
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MovieRepositoryTests(
    @Autowired private val repository: MovieRepository
) {
    @Test
    fun `저장`() {
        runBlocking {
            repository.save(Movie(null, title = "test1"))
            val movie = repository.findAll().last()
            Assertions.assertNotNull(movie.id)
            Assertions.assertEquals(movie.title, "test1")
            Assertions.assertNull(movie.genres)
            Assertions.assertEquals(movie.ratingCount, 0)
            Assertions.assertEquals(movie.ratingTotal, 0)
        }
    }
}