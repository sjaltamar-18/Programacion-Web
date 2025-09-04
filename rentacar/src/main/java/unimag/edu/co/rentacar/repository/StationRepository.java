package unimag.edu.co.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entidades.Station;

@Repository
public interface StationRepository extends CrudRepository<Station,Long> {
}
