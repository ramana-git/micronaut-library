package us.venky.mn.dto

import io.micronaut.core.annotation.Introspected
import java.util.UUID

@Introspected
data class Location(
    val id:UUID?,
    val building: String?,
    val room: String?,
    val shelf: String,
    val rack: String
)
