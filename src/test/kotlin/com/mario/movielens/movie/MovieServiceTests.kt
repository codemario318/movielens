package com.mario.movielens.movie

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MovieServiceTests {
//    @Nested
//    inner class `영화 저장` {
//        @Test
//        fun `영화 등록은 운영자만 가능`() {}
//
//        @Test
//        fun `영화 제목은 중복 발생시 예외 발생`() {}
//
//        @Test
//        fun `장르 미입력시 빈 문자열로 처리`() {}
//
//        @Test
//        fun `장르 여러개 입력시 "|" 문자로 묶어 저장`() {}
//    }

    @Nested
    inner class `영화 목록 조회`() {
        @Test
        fun `평균 평점순으로 조회`() {}

        @Test
        fun `평점 많은순으로 조회`() {}

        @Test
        fun `제목으로 검색`() {}
    }
}