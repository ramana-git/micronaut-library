package us.venky.mn.services

import jakarta.inject.Singleton
import us.venky.mn.dto.NewBook
import us.venky.mn.entities.Book
import us.venky.mn.repositories.BookRepository
import java.util.*

@Singleton
class BookService (private val repo:BookRepository, private val authorService: AuthorService, private val locationService: LocationService) {
    fun search(query:String): List<Book> {
        //val list=repo.search(query)
        //if(list==null) list=listOf<Book>()
        return repo.list()
    }
    fun create(newBook: NewBook): Book {
        val authors = newBook.authors.map { authorService.get(it) ?: throw RuntimeException("Author Not Found $it")}
        val location = newBook.location?.let { locationService.getLocation(it) }
        val book = Book(null,newBook.title,newBook.year,authors,location)
        return repo.save(book);
    }
    fun get():List<Book>{
        return repo.list()
    }
    fun get(id: UUID): Book? {
        return repo.findById(id).orElse(null)
    }
}