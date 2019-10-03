package ru.ico.ltd.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.ico.ltd.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
