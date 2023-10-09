package tyler.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
