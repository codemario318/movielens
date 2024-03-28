package com.mario.movielens.movie

import kotlinx.coroutines.flow.last
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.dao.DataIntegrityViolationException

@SpringBootTest
class MovieRepositoryTests(
    @Autowired private val repository: MovieRepository
) {
    @BeforeEach
    fun beforeEach() {
        runBlocking {
            repository.save(Movie(null, title = "test1", genres = ""))
            repository.save(Movie(null, title = "test2", genres = ""))
            repository.save(Movie(null, title = "test3", genres = ""))
            repository.save(Movie(null, title = "test4", genres = ""))
            repository.save(Movie(null, title = "test5", genres = ""))
        }
    }

    @AfterEach
    fun afterEach() {
        runBlocking {
            repository.deleteAll()
        }
    }

    @Test
    fun `저장 및 기본값 확인`() {
        runBlocking {
            repository.save(Movie(null, title = "test11", genres = ""))
            val movie = repository.findAll().last()
            assertNotNull(movie.id)
            assertEquals(movie.title, "test11")
            assertNull(movie.genres)
            assertEquals(movie.ratingCount, 0)
            assertEquals(movie.ratingTotal, 0)
        }
    }

    @Test
    fun `영화 저장시 제목은 중복 불가`() {
        assertThrows<DataIntegrityViolationException> {
            runBlocking {
                repository.save(Movie(null, "test1", ""))
            }
        }
    }

    @Test
    fun `제목으로 영화 조회 가능`() {
        runBlocking {
            val movie = repository.findByTitle("test1")
            assertEquals("test1", movie!!.title)
        }
    }

    @Test
    fun `제목으로 영화 목록 검색 가능`() {}

    @Test
    fun `평점 많은 순으로 조회 가능`() {}

    @Test
    fun `평균 평점 순으로 조회 가능`() {}
}