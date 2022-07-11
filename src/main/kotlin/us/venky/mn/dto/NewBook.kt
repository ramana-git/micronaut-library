package us.venky.mn.dto

import java.util.UUID

data class NewBook(
    val title: String,
    val year: Int,
    val authors: List<UUID>,
    val location: UUID?
)
