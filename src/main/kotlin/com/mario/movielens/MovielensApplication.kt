package com.mario.movielens

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovielensApplication

fun main(args: Array<String>) {
	runApplication<MovielensApplication>(*args)
}
