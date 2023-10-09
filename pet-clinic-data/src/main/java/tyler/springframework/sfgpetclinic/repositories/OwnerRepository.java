package tyler.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
