package tyler.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
