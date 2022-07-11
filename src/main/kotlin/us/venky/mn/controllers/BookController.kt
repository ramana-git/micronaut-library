package us.venky.mn.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import us.venky.mn.dto.NewBook
import us.venky.mn.entities.Book
import us.venky.mn.services.BookService
import java.util.*

@Controller("/books")
class BookController(private val service:BookService) {
    @Get("/search")
    fun search(query:String): List<Book> {
        return service.search(query)
    }
    @Get
    fun get(): List<Book> {
        return service.get()
    }
    @Get("/{id}")
    fun get(id: UUID): Book? {
        return service.get(id)
    }
    @Post
    fun create(book:NewBook):Book{
        return service.create(book)
    }
}