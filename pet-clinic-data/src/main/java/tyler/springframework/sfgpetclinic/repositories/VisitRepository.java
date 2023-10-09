package tyler.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tyler.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
