package tyler.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.sfgpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
