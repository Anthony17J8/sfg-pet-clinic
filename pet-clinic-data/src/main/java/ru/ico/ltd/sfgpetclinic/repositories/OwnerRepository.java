package ru.ico.ltd.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.ico.ltd.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
