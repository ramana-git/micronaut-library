package us.venky.mn.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import us.venky.mn.entities.Author
import java.util.UUID

@Repository
interface AuthorRepository : CrudRepository<Author, UUID> {
    fun list(): List<Author>
}