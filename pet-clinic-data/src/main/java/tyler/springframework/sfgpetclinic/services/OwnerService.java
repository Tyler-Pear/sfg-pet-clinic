package tyler.springframework.sfgpetclinic.services;

import tyler.springframework.sfgpetclinic.model.Owner;
import java.util.Set;
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
