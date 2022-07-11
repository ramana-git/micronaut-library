package us.venky.mn.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import us.venky.mn.entities.Location
import us.venky.mn.services.LocationService
import java.util.UUID

@Controller("/locations")
class LocationController(private val service:LocationService) {
    @Get
    fun getLocations(): List<Location> {
        return service.getLocations()
    }
    @Get("/{id}")
    fun getLocations(id:UUID): Location? {
        return service.getLocation(id)
    }
    @Post
    fun create(location:Location): Location {
        return service.create(location)
    }
}