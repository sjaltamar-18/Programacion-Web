package unimag.edu.co.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,Long> {
}
