package us.venky.mn.repositories

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.model.query.Criteria
import io.micronaut.data.repository.CrudRepository
import us.venky.mn.entities.Book
import us.venky.mn.entities.Location
import java.util.UUID
import javax.persistence.EntityManager
import javax.persistence.criteria.CriteriaQuery

//@Repository
//abstract class BookRepository (val entityManager: EntityManager) : CrudRepository<Book, UUID> {
//    fun search(title:String):List<Book> {
//        return entityManager.createQuery("FROM Book b WHERE b.title = %$title%", Book::class.java).resultList
//    }
//    abstract fun list(): List<Book>
//}


@Repository
interface BookRepository : CrudRepository<Book,UUID>{
    //Custom methods - Auto implemented
    fun findOne(id:UUID): Book
    fun list():List<Book>
}