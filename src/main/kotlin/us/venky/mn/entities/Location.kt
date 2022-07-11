package us.venky.mn.entities

import java.util.UUID
import javax.persistence.*

@Entity(name="locations")
data class Location(
    @Id @GeneratedValue
    val id:UUID?,
    val building: String?,
    val room: String?,
    val shelf: String,
    val rack: String
)
