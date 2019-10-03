package ru.ico.ltd.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.ico.ltd.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
