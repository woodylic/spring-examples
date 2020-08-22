package io.example.caffeinedemo

import reactor.core.publisher.Mono

interface ResourceRepository {
  fun findById(id: Int): Mono<Map<Int, String>>
}
