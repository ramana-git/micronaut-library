package us.venky.mn.entities

import java.util.UUID
import javax.persistence.*

@Entity(name="books")
data class Book (
    @Id
    @GeneratedValue
    val id: UUID?,
    val title: String,
    val year: Int?,
    @ManyToMany(fetch = FetchType.EAGER) @JoinTable(name="books_authors")
    val authors: List<Author>,
    @ManyToOne(fetch = FetchType.EAGER) @JoinTable(name="books_location")
    val location: Location?
)