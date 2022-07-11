package us.venky.mn.services

import jakarta.inject.Singleton
import us.venky.mn.entities.Location
import us.venky.mn.repositories.LocationRepository
import java.util.*

@Singleton
class LocationService(private val repo: LocationRepository) {
    fun getLocations():List<Location>{
        return repo.list()
    }

    fun getLocation(id: UUID): Location? {
        return repo.findById(id).orElse(null)
    }
    fun create(location:Location) : Location{
        return repo.save(location)
    }
}