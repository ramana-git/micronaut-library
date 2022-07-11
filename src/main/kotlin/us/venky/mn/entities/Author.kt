package us.venky.mn.entities

import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="authors")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID?,
    val name: String,
    val address: String?
)