package unimag.edu.co.rentacar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.DriverLicense;

@Repository
public interface DriverLicenseRepository extends CrudRepository<DriverLicense,Long> {
}
