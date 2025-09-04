package unimag.edu.co.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
