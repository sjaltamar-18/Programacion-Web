package unimag.edu.co.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entidades.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
