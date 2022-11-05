package guru.springframeworkguru.sfgpetclinic.services;

import guru.springframeworkguru.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
