package com.mario.movielens.movie

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MovieControllerTests {
    @Nested
    inner class `영화 목록 조회` {
        @Test
        fun `정의하지 않은 정렬 조건 요청시 400 응답`() {}

        @Test
        fun `정렬 조건이 누락된 경우 평균 평점순으로 조회`() {}

        @Test
        fun `페이지 번호가 1보다 작은 경우 400 응답`() {}

        @Test
        fun `페이지 번호가 누락된 경우 첫 페이지로 조회`() {}

        @Test
        fun`키워드 문자열 길이가 100보다 큰 경우 400 응답`() {}

        @Test
        fun `키워드 누락시 전체 항목 대상 조회`() {}
    }
}