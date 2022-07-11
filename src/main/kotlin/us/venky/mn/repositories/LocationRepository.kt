package us.venky.mn.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import us.venky.mn.entities.Location
import java.util.UUID

@Repository
interface LocationRepository : CrudRepository<Location,UUID>{
    //Custom methods - Auto implemented
    fun findOne(id:UUID): Location
    fun list():List<Location>
}