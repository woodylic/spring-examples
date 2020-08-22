package io.example.caffeinedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaffeineApplication

fun main(args: Array<String>) {
    runApplication<CaffeineApplication>(*args)
}
