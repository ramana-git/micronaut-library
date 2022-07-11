package us.venky.mn.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import us.venky.mn.services.AuthorService

@Controller("/library")
class LibraryController {
    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}