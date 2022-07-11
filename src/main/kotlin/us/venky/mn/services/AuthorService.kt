package us.venky.mn.services

import jakarta.inject.Singleton
import us.venky.mn.entities.Author
import us.venky.mn.repositories.AuthorRepository
import java.util.*

@Singleton
class AuthorService(private val repo: AuthorRepository) {
    fun get(): List<Author> {
        return repo.list()
    }
    fun get(id: UUID): Author? {
        return repo.findById(id).orElse(null)
    }
    fun create(author: Author):Author{
        return repo.save(author)
    }
    fun update(author: Author):Author{
        return repo.update(author)
    }
    fun delete(id:UUID): Author? {
        val author=get(id)
        author?.let { repo.deleteById(id) }
        return author;
    }
}