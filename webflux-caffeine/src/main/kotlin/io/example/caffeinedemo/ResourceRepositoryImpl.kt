package io.example.caffeinedemo

import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.time.Duration

@Repository
class ResourceRepositoryImpl : ResourceRepository {

  override fun findById(id: Int): Mono<Map<Int, String>> {
    return Mono
      .delay(Duration.ofMillis(500))
      .thenReturn(mapOf(id to "the value of ${id}"))
  }
}
