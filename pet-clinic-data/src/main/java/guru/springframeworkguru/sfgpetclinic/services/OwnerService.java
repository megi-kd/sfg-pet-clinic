package guru.springframeworkguru.sfgpetclinic.services;

import guru.springframeworkguru.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
