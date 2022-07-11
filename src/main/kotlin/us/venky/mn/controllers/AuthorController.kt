package us.venky.mn.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import us.venky.mn.entities.Author
import us.venky.mn.services.AuthorService
import java.util.*

@Controller("/authors")
class AuthorController(private val service: AuthorService)  {
    @Get
    fun authors(): List<Author> {
        return service.get()
    }
    @Post
    fun newAuthor(author: Author):Author{
        return service.create(author)
    }
    @Get("/{id}")
    fun author(id: UUID): Author? {
        return service.get(id)
    }
    @Put
    fun update(author: Author):Author{
        return service.update(author)
    }
    @Delete("/{id}")
    fun delete(id: UUID): Author? {
        return service.delete(id)
    }
}