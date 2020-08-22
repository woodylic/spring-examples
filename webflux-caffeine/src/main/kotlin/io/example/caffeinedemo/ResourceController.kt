package io.example.caffeinedemo

import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ResourceController @Autowired constructor(
  val resourceRepository: ResourceRepository
) {

  @GetMapping("/api/resource/{id}")
  suspend fun findById(@PathVariable id: Int): Map<Int, String> {
    return resourceRepository.findById(id).awaitSingle()
  }
}
